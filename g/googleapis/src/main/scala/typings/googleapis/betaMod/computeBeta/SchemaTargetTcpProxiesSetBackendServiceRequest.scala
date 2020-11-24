package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaTargetTcpProxiesSetBackendServiceRequest extends js.Object {
  
  /**
    * The URL of the new BackendService resource for the targetTcpProxy.
    */
  var service: js.UndefOr[String] = js.native
}
object SchemaTargetTcpProxiesSetBackendServiceRequest {
  
  @scala.inline
  def apply(): SchemaTargetTcpProxiesSetBackendServiceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetTcpProxiesSetBackendServiceRequest]
  }
  
  @scala.inline
  implicit class SchemaTargetTcpProxiesSetBackendServiceRequestOps[Self <: SchemaTargetTcpProxiesSetBackendServiceRequest] (val x: Self) extends AnyVal {
    
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
    def setService(value: String): Self = this.set("service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteService: Self = this.set("service", js.undefined)
  }
}
