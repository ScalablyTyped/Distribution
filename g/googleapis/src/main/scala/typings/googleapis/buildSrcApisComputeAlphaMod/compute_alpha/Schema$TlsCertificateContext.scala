package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the mechanism to obtain the client or server certificate.
  */
@js.native
trait Schema$TlsCertificateContext extends js.Object {
  /**
    * Specifies the certificate and private key paths. This field is applicable
    * only if tlsCertificateSource is set to USE_PATH.
    */
  var certificatePaths: js.UndefOr[Schema$TlsCertificatePaths] = js.native
  /**
    * Defines how TLS certificates are obtained.
    */
  var certificateSource: js.UndefOr[String] = js.native
  /**
    * Specifies the config to retrieve certificates through SDS. This field is
    * applicable only if tlsCertificateSource is set to USE_SDS.
    */
  var sdsConfig: js.UndefOr[Schema$SdsConfig] = js.native
}

object Schema$TlsCertificateContext {
  @scala.inline
  def apply(
    certificatePaths: Schema$TlsCertificatePaths = null,
    certificateSource: String = null,
    sdsConfig: Schema$SdsConfig = null
  ): Schema$TlsCertificateContext = {
    val __obj = js.Dynamic.literal()
    if (certificatePaths != null) __obj.updateDynamic("certificatePaths")(certificatePaths.asInstanceOf[js.Any])
    if (certificateSource != null) __obj.updateDynamic("certificateSource")(certificateSource.asInstanceOf[js.Any])
    if (sdsConfig != null) __obj.updateDynamic("sdsConfig")(sdsConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TlsCertificateContext]
  }
}

