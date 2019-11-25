package typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmimeInfo extends js.Object {
  var encryptedKeyPassword: js.UndefOr[String] = js.undefined
  var expiration: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var isDefault: js.UndefOr[Boolean] = js.undefined
  var issuerCn: js.UndefOr[String] = js.undefined
  var pem: js.UndefOr[String] = js.undefined
  var pkcs12: js.UndefOr[String] = js.undefined
}

object SmimeInfo {
  @scala.inline
  def apply(
    encryptedKeyPassword: String = null,
    expiration: String = null,
    id: String = null,
    isDefault: js.UndefOr[Boolean] = js.undefined,
    issuerCn: String = null,
    pem: String = null,
    pkcs12: String = null
  ): SmimeInfo = {
    val __obj = js.Dynamic.literal()
    if (encryptedKeyPassword != null) __obj.updateDynamic("encryptedKeyPassword")(encryptedKeyPassword.asInstanceOf[js.Any])
    if (expiration != null) __obj.updateDynamic("expiration")(expiration.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isDefault)) __obj.updateDynamic("isDefault")(isDefault.asInstanceOf[js.Any])
    if (issuerCn != null) __obj.updateDynamic("issuerCn")(issuerCn.asInstanceOf[js.Any])
    if (pem != null) __obj.updateDynamic("pem")(pem.asInstanceOf[js.Any])
    if (pkcs12 != null) __obj.updateDynamic("pkcs12")(pkcs12.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmimeInfo]
  }
}

