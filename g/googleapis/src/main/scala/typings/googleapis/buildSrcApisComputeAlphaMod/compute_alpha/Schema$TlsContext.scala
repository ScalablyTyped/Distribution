package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The TLS settings for the client or server.
  */
@js.native
trait Schema$TlsContext extends js.Object {
  /**
    * Defines the mechanism to obtain the client or server certificate.
    */
  var certificateContext: js.UndefOr[Schema$TlsCertificateContext] = js.native
  /**
    * Defines the mechanism to obtain the Certificate Authority certificate to
    * validate the client/server certificate. If omitted, the proxy will not
    * validate the server or client certificate.
    */
  var validationContext: js.UndefOr[Schema$TlsValidationContext] = js.native
}

object Schema$TlsContext {
  @scala.inline
  def apply(
    certificateContext: Schema$TlsCertificateContext = null,
    validationContext: Schema$TlsValidationContext = null
  ): Schema$TlsContext = {
    val __obj = js.Dynamic.literal()
    if (certificateContext != null) __obj.updateDynamic("certificateContext")(certificateContext.asInstanceOf[js.Any])
    if (validationContext != null) __obj.updateDynamic("validationContext")(validationContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TlsContext]
  }
}

