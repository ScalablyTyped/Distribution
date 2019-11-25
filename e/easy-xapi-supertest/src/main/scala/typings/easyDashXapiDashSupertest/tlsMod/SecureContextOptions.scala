package typings.easyDashXapiDashSupertest.tlsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecureContextOptions extends js.Object {
    // string | buffer
  var ca: js.UndefOr[js.Any] = js.undefined
  var cert: js.UndefOr[js.Any] = js.undefined
     // string | string[]
  var ciphers: js.UndefOr[String] = js.undefined
      // string | buffer
  var crl: js.UndefOr[js.Any] = js.undefined
  var honorCipherOrder: js.UndefOr[Boolean] = js.undefined
     //string | buffer
  var key: js.UndefOr[js.Any] = js.undefined
     //string | buffer
  var passphrase: js.UndefOr[String] = js.undefined
  var pfx: js.UndefOr[js.Any] = js.undefined
}

object SecureContextOptions {
  @scala.inline
  def apply(
    ca: js.Any = null,
    cert: js.Any = null,
    ciphers: String = null,
    crl: js.Any = null,
    honorCipherOrder: js.UndefOr[Boolean] = js.undefined,
    key: js.Any = null,
    passphrase: String = null,
    pfx: js.Any = null
  ): SecureContextOptions = {
    val __obj = js.Dynamic.literal()
    if (ca != null) __obj.updateDynamic("ca")(ca.asInstanceOf[js.Any])
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (ciphers != null) __obj.updateDynamic("ciphers")(ciphers.asInstanceOf[js.Any])
    if (crl != null) __obj.updateDynamic("crl")(crl.asInstanceOf[js.Any])
    if (!js.isUndefined(honorCipherOrder)) __obj.updateDynamic("honorCipherOrder")(honorCipherOrder.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase.asInstanceOf[js.Any])
    if (pfx != null) __obj.updateDynamic("pfx")(pfx.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecureContextOptions]
  }
}

