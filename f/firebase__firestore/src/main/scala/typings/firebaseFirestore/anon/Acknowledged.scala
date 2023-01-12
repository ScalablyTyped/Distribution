package typings.firebaseFirestore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Acknowledged extends StObject {
  
  var acknowledged: js.UndefOr[js.Array[String]] = js.undefined
  
  var rejected: js.UndefOr[js.Array[String]] = js.undefined
}
object Acknowledged {
  
  inline def apply(): Acknowledged = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Acknowledged]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Acknowledged] (val x: Self) extends AnyVal {
    
    inline def setAcknowledged(value: js.Array[String]): Self = StObject.set(x, "acknowledged", value.asInstanceOf[js.Any])
    
    inline def setAcknowledgedUndefined: Self = StObject.set(x, "acknowledged", js.undefined)
    
    inline def setAcknowledgedVarargs(value: String*): Self = StObject.set(x, "acknowledged", js.Array(value*))
    
    inline def setRejected(value: js.Array[String]): Self = StObject.set(x, "rejected", value.asInstanceOf[js.Any])
    
    inline def setRejectedUndefined: Self = StObject.set(x, "rejected", js.undefined)
    
    inline def setRejectedVarargs(value: String*): Self = StObject.set(x, "rejected", js.Array(value*))
  }
}
