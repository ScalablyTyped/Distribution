package typings.firebaseFirestore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpectUserCallback extends StObject {
  
  var expectUserCallback: js.UndefOr[Boolean] = js.undefined
  
  var keepInQueue: js.UndefOr[Boolean] = js.undefined
}
object ExpectUserCallback {
  
  inline def apply(): ExpectUserCallback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpectUserCallback]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExpectUserCallback] (val x: Self) extends AnyVal {
    
    inline def setExpectUserCallback(value: Boolean): Self = StObject.set(x, "expectUserCallback", value.asInstanceOf[js.Any])
    
    inline def setExpectUserCallbackUndefined: Self = StObject.set(x, "expectUserCallback", js.undefined)
    
    inline def setKeepInQueue(value: Boolean): Self = StObject.set(x, "keepInQueue", value.asInstanceOf[js.Any])
    
    inline def setKeepInQueueUndefined: Self = StObject.set(x, "keepInQueue", js.undefined)
  }
}
