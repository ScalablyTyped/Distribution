package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Token extends js.Object {
  var anonymous: js.UndefOr[scala.Boolean] = js.undefined
  var clientId: js.UndefOr[java.lang.String] = js.undefined
  var displayText: js.UndefOr[java.lang.String] = js.undefined
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var nativeApp: js.UndefOr[scala.Boolean] = js.undefined
  var scopes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var userKey: js.UndefOr[java.lang.String] = js.undefined
}

object Token {
  @scala.inline
  def apply(
    anonymous: js.UndefOr[scala.Boolean] = js.undefined,
    clientId: java.lang.String = null,
    displayText: java.lang.String = null,
    etag: java.lang.String = null,
    kind: java.lang.String = null,
    nativeApp: js.UndefOr[scala.Boolean] = js.undefined,
    scopes: js.Array[java.lang.String] = null,
    userKey: java.lang.String = null
  ): Token = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(anonymous)) __obj.updateDynamic("anonymous")(anonymous)
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (displayText != null) __obj.updateDynamic("displayText")(displayText)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (!js.isUndefined(nativeApp)) __obj.updateDynamic("nativeApp")(nativeApp)
    if (scopes != null) __obj.updateDynamic("scopes")(scopes)
    if (userKey != null) __obj.updateDynamic("userKey")(userKey)
    __obj.asInstanceOf[Token]
  }
}

