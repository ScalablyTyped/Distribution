package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): SchemaTlsContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTlsContext]
  }
  
  @scala.inline
  implicit class SchemaTlsContextOps[Self <: SchemaTlsContext] (val x: Self) extends AnyVal {
    
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
    def setCertificateContext(value: SchemaTlsCertificateContext): Self = this.set("certificateContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificateContext: Self = this.set("certificateContext", js.undefined)
    
    @scala.inline
    def setValidationContext(value: SchemaTlsValidationContext): Self = this.set("validationContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationContext: Self = this.set("validationContext", js.undefined)
  }
}
