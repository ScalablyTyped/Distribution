package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkConnectOptions extends StObject {
  
  var Container: js.UndefOr[String] = js.undefined
  
  var EndpointConfig: js.UndefOr[EndpointSettings] = js.undefined
}
object NetworkConnectOptions {
  
  inline def apply(): NetworkConnectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkConnectOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NetworkConnectOptions] (val x: Self) extends AnyVal {
    
    inline def setContainer(value: String): Self = StObject.set(x, "Container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "Container", js.undefined)
    
    inline def setEndpointConfig(value: EndpointSettings): Self = StObject.set(x, "EndpointConfig", value.asInstanceOf[js.Any])
    
    inline def setEndpointConfigUndefined: Self = StObject.set(x, "EndpointConfig", js.undefined)
  }
}
