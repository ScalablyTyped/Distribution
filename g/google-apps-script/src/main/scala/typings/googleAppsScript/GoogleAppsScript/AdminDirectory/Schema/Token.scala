package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Token extends js.Object {
  var anonymous: js.UndefOr[Boolean] = js.undefined
  var clientId: js.UndefOr[String] = js.undefined
  var displayText: js.UndefOr[String] = js.undefined
  var etag: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var nativeApp: js.UndefOr[Boolean] = js.undefined
  var scopes: js.UndefOr[js.Array[String]] = js.undefined
  var userKey: js.UndefOr[String] = js.undefined
}

object Token {
  @scala.inline
  def apply(
    anonymous: js.UndefOr[Boolean] = js.undefined,
    clientId: String = null,
    displayText: String = null,
    etag: String = null,
    kind: String = null,
    nativeApp: js.UndefOr[Boolean] = js.undefined,
    scopes: js.Array[String] = null,
    userKey: String = null
  ): Token = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(anonymous)) __obj.updateDynamic("anonymous")(anonymous.get.asInstanceOf[js.Any])
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (displayText != null) __obj.updateDynamic("displayText")(displayText.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (!js.isUndefined(nativeApp)) __obj.updateDynamic("nativeApp")(nativeApp.get.asInstanceOf[js.Any])
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    if (userKey != null) __obj.updateDynamic("userKey")(userKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
}

