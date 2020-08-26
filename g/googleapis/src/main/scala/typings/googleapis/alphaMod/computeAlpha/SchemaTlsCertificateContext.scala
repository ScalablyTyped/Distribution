package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the mechanism to obtain the client or server certificate.
  */
@js.native
trait SchemaTlsCertificateContext extends js.Object {
  /**
    * Specifies the certificate and private key paths. This field is applicable
    * only if tlsCertificateSource is set to USE_PATH.
    */
  var certificatePaths: js.UndefOr[SchemaTlsCertificatePaths] = js.native
  /**
    * Defines how TLS certificates are obtained.
    */
  var certificateSource: js.UndefOr[String] = js.native
  /**
    * Specifies the config to retrieve certificates through SDS. This field is
    * applicable only if tlsCertificateSource is set to USE_SDS.
    */
  var sdsConfig: js.UndefOr[SchemaSdsConfig] = js.native
}

object SchemaTlsCertificateContext {
  @scala.inline
  def apply(): SchemaTlsCertificateContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTlsCertificateContext]
  }
  @scala.inline
  implicit class SchemaTlsCertificateContextOps[Self <: SchemaTlsCertificateContext] (val x: Self) extends AnyVal {
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
    def setCertificatePaths(value: SchemaTlsCertificatePaths): Self = this.set("certificatePaths", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificatePaths: Self = this.set("certificatePaths", js.undefined)
    @scala.inline
    def setCertificateSource(value: String): Self = this.set("certificateSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificateSource: Self = this.set("certificateSource", js.undefined)
    @scala.inline
    def setSdsConfig(value: SchemaSdsConfig): Self = this.set("sdsConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSdsConfig: Self = this.set("sdsConfig", js.undefined)
  }
  
}

