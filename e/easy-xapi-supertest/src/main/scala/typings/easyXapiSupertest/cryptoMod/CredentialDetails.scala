package typings.easyXapiSupertest.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CredentialDetails extends js.Object {
  var ca: js.Any
  var cert: String
     //string | string array
  var ciphers: String
      //string | string array
  var crl: js.Any
  var key: String
  var passphrase: String
  var pfx: String
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
}

