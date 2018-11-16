package typings
package easyDashXapiDashSupertestLib.tlsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TlsOptions extends js.Object {
  var NPNProtocols: js.UndefOr[js.Any] = js.undefined
    //array or Buffer;
  var SNICallback: js.UndefOr[js.Function1[/* servername */ java.lang.String, _]] = js.undefined
  var ca: js.UndefOr[js.Any] = js.undefined
  var cert: js.UndefOr[js.Any] = js.undefined
     //string or string array
  var ciphers: js.UndefOr[java.lang.String] = js.undefined
      //string or buffer
  var crl: js.UndefOr[js.Any] = js.undefined
  var honorCipherOrder: js.UndefOr[js.Any] = js.undefined
     //string or buffer
  var key: js.UndefOr[js.Any] = js.undefined
     //string or buffer
  var passphrase: js.UndefOr[java.lang.String] = js.undefined
  var pfx: js.UndefOr[js.Any] = js.undefined
  var rejectUnauthorized: js.UndefOr[scala.Boolean] = js.undefined
  var requestCert: js.UndefOr[scala.Boolean] = js.undefined
}

