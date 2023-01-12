package typings.devtoolsProtocol.mod.Protocol.Overlay

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetShowWebVitalsRequest extends StObject {
  
  var show: Boolean
}
object SetShowWebVitalsRequest {
  
  inline def apply(show: Boolean): SetShowWebVitalsRequest = {
    val __obj = js.Dynamic.literal(show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetShowWebVitalsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetShowWebVitalsRequest] (val x: Self) extends AnyVal {
    
    inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
  }
}
