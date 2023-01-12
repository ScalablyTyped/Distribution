package typings.dockerode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndpointsConfig extends StObject {
  
  var EndpointsConfig: js.UndefOr[typings.dockerode.mod.EndpointsConfig] = js.undefined
}
object EndpointsConfig {
  
  inline def apply(): EndpointsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointsConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EndpointsConfig] (val x: Self) extends AnyVal {
    
    inline def setEndpointsConfig(value: typings.dockerode.mod.EndpointsConfig): Self = StObject.set(x, "EndpointsConfig", value.asInstanceOf[js.Any])
    
    inline def setEndpointsConfigUndefined: Self = StObject.set(x, "EndpointsConfig", js.undefined)
  }
}
