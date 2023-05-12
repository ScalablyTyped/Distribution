package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Holds the state of a mutation batch, including its user ID, batch ID and
  * whether the batch is 'pending', 'acknowledged' or 'rejected'.
  */
trait Tu extends StObject {
  
  def ar(): String
  
  var batchId: Any
  
  var error: Any
  
  var state: Any
  
  var user: Any
}
object Tu {
  
  inline def apply(ar: () => String, batchId: Any, error: Any, state: Any, user: Any): Tu = {
    val __obj = js.Dynamic.literal(ar = js.Any.fromFunction0(ar), batchId = batchId.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tu]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Tu] (val x: Self) extends AnyVal {
    
    inline def setAr(value: () => String): Self = StObject.set(x, "ar", js.Any.fromFunction0(value))
    
    inline def setBatchId(value: Any): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
    
    inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setState(value: Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setUser(value: Any): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
