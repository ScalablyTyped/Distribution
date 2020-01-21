package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the mechanism to obtain the Certificate Authority certificate to
  * validate the client/server certificate.
  */
@js.native
trait SchemaTlsValidationContext extends js.Object {
  /**
    * The path to the file holding the CA certificate to validate the client or
    * server certificate.
    */
  var certificatePath: js.UndefOr[String] = js.native
  /**
    * Specifies the config to retrieve certificates through SDS. This field is
    * applicable only if tlsCertificateSource is set to USE_SDS.
    */
  var sdsConfig: js.UndefOr[SchemaSdsConfig] = js.native
  /**
    * Defines how TLS certificates are obtained.
    */
  var validationSource: js.UndefOr[String] = js.native
}

object SchemaTlsValidationContext {
  @scala.inline
  def apply(certificatePath: String = null, sdsConfig: SchemaSdsConfig = null, validationSource: String = null): SchemaTlsValidationContext = {
    val __obj = js.Dynamic.literal()
    if (certificatePath != null) __obj.updateDynamic("certificatePath")(certificatePath.asInstanceOf[js.Any])
    if (sdsConfig != null) __obj.updateDynamic("sdsConfig")(sdsConfig.asInstanceOf[js.Any])
    if (validationSource != null) __obj.updateDynamic("validationSource")(validationSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTlsValidationContext]
  }
}

