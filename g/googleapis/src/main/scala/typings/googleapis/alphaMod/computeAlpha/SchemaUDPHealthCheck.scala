package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaUDPHealthCheck extends StObject {
  
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
  implicit class SchemaUDPHealthCheckMutableBuilder[Self <: SchemaUDPHealthCheck] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortName(value: String): Self = StObject.set(x, "portName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortNameUndefined: Self = StObject.set(x, "portName", js.undefined)
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    @scala.inline
    def setRequest(value: String): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    @scala.inline
    def setResponse(value: String): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
  }
}
