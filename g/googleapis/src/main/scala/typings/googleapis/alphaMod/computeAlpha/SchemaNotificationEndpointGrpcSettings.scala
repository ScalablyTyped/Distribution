package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a gRPC setting that describes one gRPC notification endpoint and
  * the retry duration attempting to send notification to this endpoint.
  */
trait SchemaNotificationEndpointGrpcSettings extends StObject {
  
  /**
    * Optional. If specified, this field is used to set the authority header by
    * the sender of notifications. See
    * https://tools.ietf.org/html/rfc7540#section-8.1.2.3
    */
  var authority: js.UndefOr[String] = js.undefined
  
  /**
    * Endpoint to which gRPC notifications are sent. This must be a valid
    * gRPCLB DNS name.
    */
  var endpoint: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. If specified, this field is used to populate the ?name? field
    * in gRPC requests.
    */
  var payloadName: js.UndefOr[String] = js.undefined
  
  /**
    * How much time (in seconds) is spent attempting notification retries until
    * a successful response is received. Default is 30s. Limit is 20m (1200s).
    * Must be a positive number.
    */
  var retryDurationSec: js.UndefOr[Double] = js.undefined
}
object SchemaNotificationEndpointGrpcSettings {
  
  @scala.inline
  def apply(): SchemaNotificationEndpointGrpcSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNotificationEndpointGrpcSettings]
  }
  
  @scala.inline
  implicit class SchemaNotificationEndpointGrpcSettingsMutableBuilder[Self <: SchemaNotificationEndpointGrpcSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthority(value: String): Self = StObject.set(x, "authority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorityUndefined: Self = StObject.set(x, "authority", js.undefined)
    
    @scala.inline
    def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    @scala.inline
    def setPayloadName(value: String): Self = StObject.set(x, "payloadName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadNameUndefined: Self = StObject.set(x, "payloadName", js.undefined)
    
    @scala.inline
    def setRetryDurationSec(value: Double): Self = StObject.set(x, "retryDurationSec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryDurationSecUndefined: Self = StObject.set(x, "retryDurationSec", js.undefined)
  }
}
