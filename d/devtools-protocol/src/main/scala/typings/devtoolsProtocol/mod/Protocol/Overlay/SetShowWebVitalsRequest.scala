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
  
  extension [Self <: SetShowWebVitalsRequest](x: Self) {
    
    inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
  }
}
