package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An HealthCheck resource. This resource defines a template for how
  * individual virtual machines should be checked for health, via one of the
  * supported protocols.
  */
trait SchemaHealthCheck extends StObject {
  
  /**
    * How often (in seconds) to send a health check. The default value is 5
    * seconds.
    */
  var checkIntervalSec: js.UndefOr[Double] = js.undefined
  
  /**
    * [Output Only] Creation timestamp in 3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.undefined
  
  /**
    * An optional description of this resource. Provide this property when you
    * create the resource.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * A so-far unhealthy instance will be marked healthy after this many
    * consecutive successes. The default value is 2.
    */
  var healthyThreshold: js.UndefOr[Double] = js.undefined
  
  var http2HealthCheck: js.UndefOr[SchemaHTTP2HealthCheck] = js.undefined
  
  var httpHealthCheck: js.UndefOr[Schema$HTTPHealthCheck] = js.undefined
  
  var httpsHealthCheck: js.UndefOr[Schema$HTTPSHealthCheck] = js.undefined
  
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Type of the resource.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the resource. Provided by the client when the resource is
    * created. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular
    * expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character
    * must be a lowercase letter, and all following characters must be a dash,
    * lowercase letter, or digit, except the last character, which cannot be a
    * dash.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] Region where the health check resides. Not applicable to
    * global health checks.
    */
  var region: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] Server-defined URL for this resource with the resource id.
    */
  var selfLinkWithId: js.UndefOr[String] = js.undefined
  
  var sslHealthCheck: js.UndefOr[SchemaSSLHealthCheck] = js.undefined
  
  var tcpHealthCheck: js.UndefOr[SchemaTCPHealthCheck] = js.undefined
  
  /**
    * How long (in seconds) to wait before claiming failure. The default value
    * is 5 seconds. It is invalid for timeoutSec to have greater value than
    * checkIntervalSec.
    */
  var timeoutSec: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the type of the healthCheck, either TCP, SSL, HTTP or HTTPS. If
    * not specified, the default is TCP. Exactly one of the protocol-specific
    * health check field must be specified, which must match type field.
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  var udpHealthCheck: js.UndefOr[SchemaUDPHealthCheck] = js.undefined
  
  /**
    * A so-far healthy instance will be marked unhealthy after this many
    * consecutive failures. The default value is 2.
    */
  var unhealthyThreshold: js.UndefOr[Double] = js.undefined
}
object SchemaHealthCheck {
  
  @scala.inline
  def apply(): SchemaHealthCheck = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHealthCheck]
  }
  
  @scala.inline
  implicit class SchemaHealthCheckMutableBuilder[Self <: SchemaHealthCheck] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckIntervalSec(value: Double): Self = StObject.set(x, "checkIntervalSec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckIntervalSecUndefined: Self = StObject.set(x, "checkIntervalSec", js.undefined)
    
    @scala.inline
    def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setHealthyThreshold(value: Double): Self = StObject.set(x, "healthyThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthyThresholdUndefined: Self = StObject.set(x, "healthyThreshold", js.undefined)
    
    @scala.inline
    def setHttp2HealthCheck(value: SchemaHTTP2HealthCheck): Self = StObject.set(x, "http2HealthCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttp2HealthCheckUndefined: Self = StObject.set(x, "http2HealthCheck", js.undefined)
    
    @scala.inline
    def setHttpHealthCheck(value: Schema$HTTPHealthCheck): Self = StObject.set(x, "httpHealthCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpHealthCheckUndefined: Self = StObject.set(x, "httpHealthCheck", js.undefined)
    
    @scala.inline
    def setHttpsHealthCheck(value: Schema$HTTPSHealthCheck): Self = StObject.set(x, "httpsHealthCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpsHealthCheckUndefined: Self = StObject.set(x, "httpsHealthCheck", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setSelfLinkWithId(value: String): Self = StObject.set(x, "selfLinkWithId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkWithIdUndefined: Self = StObject.set(x, "selfLinkWithId", js.undefined)
    
    @scala.inline
    def setSslHealthCheck(value: SchemaSSLHealthCheck): Self = StObject.set(x, "sslHealthCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslHealthCheckUndefined: Self = StObject.set(x, "sslHealthCheck", js.undefined)
    
    @scala.inline
    def setTcpHealthCheck(value: SchemaTCPHealthCheck): Self = StObject.set(x, "tcpHealthCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTcpHealthCheckUndefined: Self = StObject.set(x, "tcpHealthCheck", js.undefined)
    
    @scala.inline
    def setTimeoutSec(value: Double): Self = StObject.set(x, "timeoutSec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutSecUndefined: Self = StObject.set(x, "timeoutSec", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUdpHealthCheck(value: SchemaUDPHealthCheck): Self = StObject.set(x, "udpHealthCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUdpHealthCheckUndefined: Self = StObject.set(x, "udpHealthCheck", js.undefined)
    
    @scala.inline
    def setUnhealthyThreshold(value: Double): Self = StObject.set(x, "unhealthyThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnhealthyThresholdUndefined: Self = StObject.set(x, "unhealthyThreshold", js.undefined)
  }
}
