package typings
package easyDashXDashHeadersLib.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CredentialDetails extends js.Object {
  var ca: js.Any
  var cert: java.lang.String
     //string | string array
  var ciphers: java.lang.String
      //string | string array
  var crl: js.Any
  var key: java.lang.String
  var passphrase: java.lang.String
  var pfx: java.lang.String
}

object CredentialDetails {
  @scala.inline
  def apply(
    ca: js.Any,
    cert: java.lang.String,
    ciphers: java.lang.String,
    crl: js.Any,
    key: java.lang.String,
    passphrase: java.lang.String,
    pfx: java.lang.String
  ): CredentialDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ca")(ca)
    __obj.updateDynamic("cert")(cert)
    __obj.updateDynamic("ciphers")(ciphers)
    __obj.updateDynamic("crl")(crl)
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("passphrase")(passphrase)
    __obj.updateDynamic("pfx")(pfx)
    __obj.asInstanceOf[CredentialDetails]
  }
}

