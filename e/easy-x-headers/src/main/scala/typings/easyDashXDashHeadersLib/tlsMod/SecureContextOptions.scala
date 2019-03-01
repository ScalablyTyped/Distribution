package typings
package easyDashXDashHeadersLib.tlsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecureContextOptions extends js.Object {
    // string | buffer
  var ca: js.UndefOr[js.Any] = js.undefined
  var cert: js.UndefOr[js.Any] = js.undefined
     // string | string[]
  var ciphers: js.UndefOr[java.lang.String] = js.undefined
      // string | buffer
  var crl: js.UndefOr[js.Any] = js.undefined
  var honorCipherOrder: js.UndefOr[scala.Boolean] = js.undefined
     //string | buffer
  var key: js.UndefOr[js.Any] = js.undefined
     //string | buffer
  var passphrase: js.UndefOr[java.lang.String] = js.undefined
  var pfx: js.UndefOr[js.Any] = js.undefined
}

object SecureContextOptions {
  @scala.inline
  def apply(
    ca: js.Any = null,
    cert: js.Any = null,
    ciphers: java.lang.String = null,
    crl: js.Any = null,
    honorCipherOrder: js.UndefOr[scala.Boolean] = js.undefined,
    key: js.Any = null,
    passphrase: java.lang.String = null,
    pfx: js.Any = null
  ): SecureContextOptions = {
    val __obj = js.Dynamic.literal()
    if (ca != null) __obj.updateDynamic("ca")(ca)
    if (cert != null) __obj.updateDynamic("cert")(cert)
    if (ciphers != null) __obj.updateDynamic("ciphers")(ciphers)
    if (crl != null) __obj.updateDynamic("crl")(crl)
    if (!js.isUndefined(honorCipherOrder)) __obj.updateDynamic("honorCipherOrder")(honorCipherOrder)
    if (key != null) __obj.updateDynamic("key")(key)
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase)
    if (pfx != null) __obj.updateDynamic("pfx")(pfx)
    __obj.asInstanceOf[SecureContextOptions]
  }
}

