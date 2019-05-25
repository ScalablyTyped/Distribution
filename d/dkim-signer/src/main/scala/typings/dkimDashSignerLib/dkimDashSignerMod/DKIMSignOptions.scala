package typings
package dkimDashSignerLib.dkimDashSignerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DKIMSignOptions extends js.Object {
  /** Domain name to use for signing (ie: 'domain.com') */
  var domainName: java.lang.String
  /** Header fields to sign (ie: 'from:to:cc:subject') */
  var headerFieldNames: js.UndefOr[java.lang.String] = js.undefined
  /** Selector for the DKMI public key (ie. 'dkim' if you have set up a TXT record for 'dkim._domainkey.domain.com') */
  var keySelector: java.lang.String
  /** DKIM private key */
  var privateKey: nodeLib.cryptoMod.SignPrivateKeyInput | nodeLib.cryptoMod.KeyLike
}

object DKIMSignOptions {
  @scala.inline
  def apply(
    domainName: java.lang.String,
    keySelector: java.lang.String,
    privateKey: nodeLib.cryptoMod.SignPrivateKeyInput | nodeLib.cryptoMod.KeyLike,
    headerFieldNames: java.lang.String = null
  ): DKIMSignOptions = {
    val __obj = js.Dynamic.literal(domainName = domainName, keySelector = keySelector, privateKey = privateKey.asInstanceOf[js.Any])
    if (headerFieldNames != null) __obj.updateDynamic("headerFieldNames")(headerFieldNames)
    __obj.asInstanceOf[DKIMSignOptions]
  }
}

