package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSSLHealthCheck extends StObject {
  
  /**
    * The TCP port number for the health check request. The default value is
    * 443. Valid values are 1 through 65535.
    */
  var port: js.UndefOr[Double] = js.undefined
  
  /**
    * Port name as defined in InstanceGroup#NamedPort#name. If both port and
    * port_name are defined, port takes precedence.
    */
  var portName: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies how port is selected for health checking, can be one of
    * following values: USE_FIXED_PORT: The port number in port is used for
    * health checking. USE_NAMED_PORT: The portName is used for health
    * checking. USE_SERVING_PORT: For NetworkEndpointGroup, the port specified
    * for each network endpoint is used for health checking. For other
    * backends, the port or named port specified in the Backend Service is used
    * for health checking.   If not specified, SSL health check follows
    * behavior specified in port and portName fields.
    */
  var portSpecification: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the type of proxy header to append before sending data to the
    * backend, either NONE or PROXY_V1. The default is NONE.
    */
  var proxyHeader: js.UndefOr[String] = js.undefined
  
  /**
    * The application data to send once the SSL connection has been established
    * (default value is empty). If both request and response are empty, the
    * connection establishment alone will indicate health. The request data can
    * only be ASCII.
    */
  var request: js.UndefOr[String] = js.undefined
  
  /**
    * The bytes to match against the beginning of the response data. If left
    * empty (the default value), any response will indicate health. The
    * response data can only be ASCII.
    */
  var response: js.UndefOr[String] = js.undefined
}
object SchemaSSLHealthCheck {
  
  @scala.inline
  def apply(): SchemaSSLHealthCheck = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSSLHealthCheck]
  }
  
  @scala.inline
  implicit class SchemaSSLHealthCheckMutableBuilder[Self <: SchemaSSLHealthCheck] (val x: Self) extends AnyVal {
    
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
    def setRequest(value: String): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    @scala.inline
    def setResponse(value: String): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
  }
}
