package typings.googleAuthLibrary.oauth2clientMod

import typings.gaxios.commonMod.GaxiosResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FederatedSignonCertsResponse extends js.Object {
  
  var certs: Certificates = js.native
  
  var format: CertificateFormat = js.native
  
  var res: js.UndefOr[GaxiosResponse[Unit] | Null] = js.native
}
object FederatedSignonCertsResponse {
  
  @scala.inline
  def apply(certs: Certificates, format: CertificateFormat): FederatedSignonCertsResponse = {
    val __obj = js.Dynamic.literal(certs = certs.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[FederatedSignonCertsResponse]
  }
  
  @scala.inline
  implicit class FederatedSignonCertsResponseOps[Self <: FederatedSignonCertsResponse] (val x: Self) extends AnyVal {
    
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
    def setCerts(value: Certificates): Self = this.set("certs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: CertificateFormat): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRes(value: GaxiosResponse[Unit]): Self = this.set("res", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRes: Self = this.set("res", js.undefined)
    
    @scala.inline
    def setResNull: Self = this.set("res", null)
  }
}
