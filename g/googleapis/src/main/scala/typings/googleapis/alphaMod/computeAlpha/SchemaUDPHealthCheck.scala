package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaUDPHealthCheck extends js.Object {
  
  /**
    * The UDP port number for the health check request. Valid values are 1
    * through 65535.
    */
  var port: js.UndefOr[Double] = js.native
  
  /**
    * Port name as defined in InstanceGroup#NamedPort#name. If both port and
    * port_name are defined, port takes precedence.
    */
  var portName: js.UndefOr[String] = js.native
  
  /**
    * Raw data of request to send in payload of UDP packet. It is an error if
    * this is empty. The request data can only be ASCII.
    */
  var request: js.UndefOr[String] = js.native
  
  /**
    * The bytes to match against the beginning of the response data. It is an
    * error if this is empty. The response data can only be ASCII.
    */
  var response: js.UndefOr[String] = js.native
}
object SchemaUDPHealthCheck {
  
  @scala.inline
  def apply(): SchemaUDPHealthCheck = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUDPHealthCheck]
  }
  
  @scala.inline
  implicit class SchemaUDPHealthCheckOps[Self <: SchemaUDPHealthCheck] (val x: Self) extends AnyVal {
    
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
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setPortName(value: String): Self = this.set("portName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePortName: Self = this.set("portName", js.undefined)
    
    @scala.inline
    def setRequest(value: String): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
    
    @scala.inline
    def setResponse(value: String): Self = this.set("response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponse: Self = this.set("response", js.undefined)
  }
}
