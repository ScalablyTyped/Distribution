package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The TLS settings for the client or server.
  */
@js.native
trait SchemaTlsContext extends js.Object {
  /**
    * Defines the mechanism to obtain the client or server certificate.
    */
  var certificateContext: js.UndefOr[SchemaTlsCertificateContext] = js.native
  /**
    * Defines the mechanism to obtain the Certificate Authority certificate to
    * validate the client/server certificate. If omitted, the proxy will not
    * validate the server or client certificate.
    */
  var validationContext: js.UndefOr[SchemaTlsValidationContext] = js.native
}

object SchemaTlsContext {
  @scala.inline
  def apply(
    certificateContext: SchemaTlsCertificateContext = null,
    validationContext: SchemaTlsValidationContext = null
  ): SchemaTlsContext = {
    val __obj = js.Dynamic.literal()
    if (certificateContext != null) __obj.updateDynamic("certificateContext")(certificateContext.asInstanceOf[js.Any])
    if (validationContext != null) __obj.updateDynamic("validationContext")(validationContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTlsContext]
  }
}

