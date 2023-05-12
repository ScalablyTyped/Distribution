package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Holds the state of a query target, including its target ID and whether the
  * target is 'not-current', 'current' or 'rejected'.
  */
trait Eu extends StObject {
  
  def ar(): String
  
  var error: Any
  
  var state: Any
  
  var targetId: Any
}
object Eu {
  
  inline def apply(ar: () => String, error: Any, state: Any, targetId: Any): Eu = {
    val __obj = js.Dynamic.literal(ar = js.Any.fromFunction0(ar), error = error.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Eu]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Eu] (val x: Self) extends AnyVal {
    
    inline def setAr(value: () => String): Self = StObject.set(x, "ar", js.Any.fromFunction0(value))
    
    inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setState(value: Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setTargetId(value: Any): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
  }
}
