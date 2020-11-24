package typings.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndpointSpec extends js.Object {
  
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
  implicit class EndpointSpecOps[Self <: EndpointSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMode(value: String): Self = this.set("Mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("Mode", js.undefined)
    
    @scala.inline
    def setPortsVarargs(value: PortConfig*): Self = this.set("Ports", js.Array(value :_*))
    
    @scala.inline
    def setPorts(value: js.Array[PortConfig]): Self = this.set("Ports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePorts: Self = this.set("Ports", js.undefined)
  }
}
