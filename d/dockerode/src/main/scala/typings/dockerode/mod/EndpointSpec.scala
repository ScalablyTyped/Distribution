package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndpointSpec extends StObject {
  
  var Mode: js.UndefOr[String] = js.native
  
  var Ports: js.UndefOr[js.Array[PortConfig]] = js.native
}
object EndpointSpec {
  
  @scala.inline
  def apply(): EndpointSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointSpec]
  }
  
  @scala.inline
  implicit class EndpointSpecMutableBuilder[Self <: EndpointSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMode(value: String): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "Mode", js.undefined)
    
    @scala.inline
    def setPorts(value: js.Array[PortConfig]): Self = StObject.set(x, "Ports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortsUndefined: Self = StObject.set(x, "Ports", js.undefined)
    
    @scala.inline
    def setPortsVarargs(value: PortConfig*): Self = StObject.set(x, "Ports", js.Array(value :_*))
  }
}
