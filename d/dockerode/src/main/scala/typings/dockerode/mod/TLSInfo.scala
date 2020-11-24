package typings.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TLSInfo extends js.Object {
  
  var CertIssuerPublicKey: js.UndefOr[String] = js.native
  
  var CertIssuerSubject: js.UndefOr[String] = js.native
  
  var TrustRoot: js.UndefOr[String] = js.native
}
object TLSInfo {
  
  @scala.inline
  def apply(): TLSInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TLSInfo]
  }
  
  @scala.inline
  implicit class TLSInfoOps[Self <: TLSInfo] (val x: Self) extends AnyVal {
    
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
    def setCertIssuerPublicKey(value: String): Self = this.set("CertIssuerPublicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertIssuerPublicKey: Self = this.set("CertIssuerPublicKey", js.undefined)
    
    @scala.inline
    def setCertIssuerSubject(value: String): Self = this.set("CertIssuerSubject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertIssuerSubject: Self = this.set("CertIssuerSubject", js.undefined)
    
    @scala.inline
    def setTrustRoot(value: String): Self = this.set("TrustRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrustRoot: Self = this.set("TrustRoot", js.undefined)
  }
}
