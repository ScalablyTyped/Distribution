package typings.dkimSigner.mod

import typings.node.cryptoMod.KeyLike
import typings.node.cryptoMod.SignPrivateKeyInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DKIMSignOptions extends js.Object {
  
  /** Domain name to use for signing (ie: 'domain.com') */
  var domainName: String = js.native
  
  /** Header fields to sign (ie: 'from:to:cc:subject') */
  var headerFieldNames: js.UndefOr[String] = js.native
  
  /** Selector for the DKMI public key (ie. 'dkim' if you have set up a TXT record for 'dkim._domainkey.domain.com') */
  var keySelector: String = js.native
  
  /** DKIM private key */
  var privateKey: SignPrivateKeyInput | KeyLike = js.native
}
object DKIMSignOptions {
  
  @scala.inline
  def apply(domainName: String, keySelector: String, privateKey: SignPrivateKeyInput | KeyLike): DKIMSignOptions = {
    val __obj = js.Dynamic.literal(domainName = domainName.asInstanceOf[js.Any], keySelector = keySelector.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DKIMSignOptions]
  }
  
  @scala.inline
  implicit class DKIMSignOptionsOps[Self <: DKIMSignOptions] (val x: Self) extends AnyVal {
    
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
    def setDomainName(value: String): Self = this.set("domainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeySelector(value: String): Self = this.set("keySelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateKey(value: SignPrivateKeyInput | KeyLike): Self = this.set("privateKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderFieldNames(value: String): Self = this.set("headerFieldNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderFieldNames: Self = this.set("headerFieldNames", js.undefined)
  }
}
