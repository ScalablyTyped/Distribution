package typings.dkimDashSigner.dkimDashSignerMod

import typings.node.cryptoMod.KeyLike
import typings.node.cryptoMod.SignPrivateKeyInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DKIMSignOptions extends js.Object {
  /** Domain name to use for signing (ie: 'domain.com') */
  var domainName: String
  /** Header fields to sign (ie: 'from:to:cc:subject') */
  var headerFieldNames: js.UndefOr[String] = js.undefined
  /** Selector for the DKMI public key (ie. 'dkim' if you have set up a TXT record for 'dkim._domainkey.domain.com') */
  var keySelector: String
  /** DKIM private key */
  var privateKey: SignPrivateKeyInput | KeyLike
}

object DKIMSignOptions {
  @scala.inline
  def apply(
    domainName: String,
    keySelector: String,
    privateKey: SignPrivateKeyInput | KeyLike,
    headerFieldNames: String = null
  ): DKIMSignOptions = {
    val __obj = js.Dynamic.literal(domainName = domainName, keySelector = keySelector, privateKey = privateKey.asInstanceOf[js.Any])
    if (headerFieldNames != null) __obj.updateDynamic("headerFieldNames")(headerFieldNames)
    __obj.asInstanceOf[DKIMSignOptions]
  }
}

