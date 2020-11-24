package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): SchemaTlsValidationContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTlsValidationContext]
  }
  
  @scala.inline
  implicit class SchemaTlsValidationContextOps[Self <: SchemaTlsValidationContext] (val x: Self) extends AnyVal {
    
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
    def setCertificatePath(value: String): Self = this.set("certificatePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificatePath: Self = this.set("certificatePath", js.undefined)
    
    @scala.inline
    def setSdsConfig(value: SchemaSdsConfig): Self = this.set("sdsConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSdsConfig: Self = this.set("sdsConfig", js.undefined)
    
    @scala.inline
    def setValidationSource(value: String): Self = this.set("validationSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationSource: Self = this.set("validationSource", js.undefined)
  }
}
