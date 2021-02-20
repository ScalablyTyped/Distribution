package typings.dockerode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndpointsConfig extends StObject {
  
  var EndpointsConfig: js.UndefOr[typings.dockerode.mod.EndpointsConfig] = js.native
}
object EndpointsConfig {
  
  @scala.inline
  def apply(): EndpointsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointsConfig]
  }
  
  @scala.inline
  implicit class EndpointsConfigMutableBuilder[Self <: EndpointsConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpointsConfig(value: typings.dockerode.mod.EndpointsConfig): Self = StObject.set(x, "EndpointsConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointsConfigUndefined: Self = StObject.set(x, "EndpointsConfig", js.undefined)
  }
}
