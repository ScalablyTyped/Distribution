package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmimeInfo extends js.Object {
  var encryptedKeyPassword: js.UndefOr[java.lang.String] = js.undefined
  var expiration: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var isDefault: js.UndefOr[scala.Boolean] = js.undefined
  var issuerCn: js.UndefOr[java.lang.String] = js.undefined
  var pem: js.UndefOr[java.lang.String] = js.undefined
  var pkcs12: js.UndefOr[java.lang.String] = js.undefined
}

object SmimeInfo {
  @scala.inline
  def apply(
    encryptedKeyPassword: java.lang.String = null,
    expiration: java.lang.String = null,
    id: java.lang.String = null,
    isDefault: js.UndefOr[scala.Boolean] = js.undefined,
    issuerCn: java.lang.String = null,
    pem: java.lang.String = null,
    pkcs12: java.lang.String = null
  ): SmimeInfo = {
    val __obj = js.Dynamic.literal()
    if (encryptedKeyPassword != null) __obj.updateDynamic("encryptedKeyPassword")(encryptedKeyPassword)
    if (expiration != null) __obj.updateDynamic("expiration")(expiration)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(isDefault)) __obj.updateDynamic("isDefault")(isDefault)
    if (issuerCn != null) __obj.updateDynamic("issuerCn")(issuerCn)
    if (pem != null) __obj.updateDynamic("pem")(pem)
    if (pkcs12 != null) __obj.updateDynamic("pkcs12")(pkcs12)
    __obj.asInstanceOf[SmimeInfo]
  }
}

