package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaHTTP2HealthCheck extends StObject {
  
  /**
    * The value of the host header in the HTTP/2 health check request. If left
    * empty (default value), the IP on behalf of which this health check is
    * performed will be used.
    */
  var host: js.UndefOr[String] = js.native
  
  /**
    * The TCP port number for the health check request. The default value is
    * 443. Valid values are 1 through 65535.
    */
  var port: js.UndefOr[Double] = js.native
  
  /**
    * Port name as defined in InstanceGroup#NamedPort#name. If both port and
    * port_name are defined, port takes precedence.
    */
  var portName: js.UndefOr[String] = js.native
  
  /**
    * Specifies how port is selected for health checking, can be one of
    * following values: USE_FIXED_PORT: The port number in port is used for
    * health checking. USE_NAMED_PORT: The portName is used for health
    * checking. USE_SERVING_PORT: For NetworkEndpointGroup, the port specified
    * for each network endpoint is used for health checking. For other
    * backends, the port or named port specified in the Backend Service is used
    * for health checking.   If not specified, HTTP2 health check follows
    * behavior specified in port and portName fields.
    */
  var portSpecification: js.UndefOr[String] = js.native
  
  /**
    * Specifies the type of proxy header to append before sending data to the
    * backend, either NONE or PROXY_V1. The default is NONE.
    */
  var proxyHeader: js.UndefOr[String] = js.native
  
  /**
    * The request path of the HTTP/2 health check request. The default value is
    * /.
    */
  var requestPath: js.UndefOr[String] = js.native
  
  /**
    * The string to match anywhere in the first 1024 bytes of the response
    * body. If left empty (the default value), the status code determines
    * health. The response data can only be ASCII.
    */
  var response: js.UndefOr[String] = js.native
}
object SchemaHTTP2HealthCheck {
  
  @scala.inline
  def apply(): SchemaHTTP2HealthCheck = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHTTP2HealthCheck]
  }
  
  @scala.inline
  implicit class SchemaHTTP2HealthCheckMutableBuilder[Self <: SchemaHTTP2HealthCheck] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortName(value: String): Self = StObject.set(x, "portName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortNameUndefined: Self = StObject.set(x, "portName", js.undefined)
    
    @scala.inline
    def setPortSpecification(value: String): Self = StObject.set(x, "portSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortSpecificationUndefined: Self = StObject.set(x, "portSpecification", js.undefined)
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    @scala.inline
    def setProxyHeader(value: String): Self = StObject.set(x, "proxyHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyHeaderUndefined: Self = StObject.set(x, "proxyHeader", js.undefined)
    
    @scala.inline
    def setRequestPath(value: String): Self = StObject.set(x, "requestPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestPathUndefined: Self = StObject.set(x, "requestPath", js.undefined)
    
    @scala.inline
    def setResponse(value: String): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
  }
}
