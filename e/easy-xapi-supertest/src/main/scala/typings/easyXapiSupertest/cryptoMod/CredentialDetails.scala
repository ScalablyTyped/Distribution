package typings.easyXapiSupertest.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CredentialDetails extends js.Object {
  
  var ca: js.Any = js.native
  
  var cert: String = js.native
  
     //string | string array
  var ciphers: String = js.native
  
      //string | string array
  var crl: js.Any = js.native
  
  var key: String = js.native
  
  var passphrase: String = js.native
  
  var pfx: String = js.native
}
object CredentialDetails {
  
  @scala.inline
  def apply(
    ca: js.Any,
    cert: String,
    ciphers: String,
    crl: js.Any,
    key: String,
    passphrase: String,
    pfx: String
  ): CredentialDetails = {
    val __obj = js.Dynamic.literal(ca = ca.asInstanceOf[js.Any], cert = cert.asInstanceOf[js.Any], ciphers = ciphers.asInstanceOf[js.Any], crl = crl.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], passphrase = passphrase.asInstanceOf[js.Any], pfx = pfx.asInstanceOf[js.Any])
    __obj.asInstanceOf[CredentialDetails]
  }
  
  @scala.inline
  implicit class CredentialDetailsOps[Self <: CredentialDetails] (val x: Self) extends AnyVal {
    
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
    def setCa(value: js.Any): Self = this.set("ca", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCert(value: String): Self = this.set("cert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCiphers(value: String): Self = this.set("ciphers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrl(value: js.Any): Self = this.set("crl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassphrase(value: String): Self = this.set("passphrase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPfx(value: String): Self = this.set("pfx", value.asInstanceOf[js.Any])
  }
}
