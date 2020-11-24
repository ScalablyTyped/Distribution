package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a gRPC setting that describes one gRPC notification endpoint and
  * the retry duration attempting to send notification to this endpoint.
  */
@js.native
trait SchemaNotificationEndpointGrpcSettings extends js.Object {
  
  /**
    * Optional. If specified, this field is used to set the authority header by
    * the sender of notifications. See
    * https://tools.ietf.org/html/rfc7540#section-8.1.2.3
    */
  var authority: js.UndefOr[String] = js.native
  
  /**
    * Endpoint to which gRPC notifications are sent. This must be a valid
    * gRPCLB DNS name.
    */
  var endpoint: js.UndefOr[String] = js.native
  
  /**
    * Optional. If specified, this field is used to populate the ?name? field
    * in gRPC requests.
    */
  var payloadName: js.UndefOr[String] = js.native
  
  /**
    * How much time (in seconds) is spent attempting notification retries until
    * a successful response is received. Default is 30s. Limit is 20m (1200s).
    * Must be a positive number.
    */
  var retryDurationSec: js.UndefOr[Double] = js.native
}
object SchemaNotificationEndpointGrpcSettings {
  
  @scala.inline
  def apply(): SchemaNotificationEndpointGrpcSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNotificationEndpointGrpcSettings]
  }
  
  @scala.inline
  implicit class SchemaNotificationEndpointGrpcSettingsOps[Self <: SchemaNotificationEndpointGrpcSettings] (val x: Self) extends AnyVal {
    
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
    def setAuthority(value: String): Self = this.set("authority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthority: Self = this.set("authority", js.undefined)
    
    @scala.inline
    def setEndpoint(value: String): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpoint: Self = this.set("endpoint", js.undefined)
    
    @scala.inline
    def setPayloadName(value: String): Self = this.set("payloadName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayloadName: Self = this.set("payloadName", js.undefined)
    
    @scala.inline
    def setRetryDurationSec(value: Double): Self = this.set("retryDurationSec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetryDurationSec: Self = this.set("retryDurationSec", js.undefined)
  }
}
