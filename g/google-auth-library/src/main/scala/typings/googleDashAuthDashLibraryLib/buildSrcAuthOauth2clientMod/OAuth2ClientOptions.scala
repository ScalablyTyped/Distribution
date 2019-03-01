package typings
package googleDashAuthDashLibraryLib.buildSrcAuthOauth2clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OAuth2ClientOptions extends RefreshOptions {
  var clientId: js.UndefOr[java.lang.String] = js.undefined
  var clientSecret: js.UndefOr[java.lang.String] = js.undefined
  var redirectUri: js.UndefOr[java.lang.String] = js.undefined
}

object OAuth2ClientOptions {
  @scala.inline
  def apply(
    clientId: java.lang.String = null,
    clientSecret: java.lang.String = null,
    eagerRefreshThresholdMillis: scala.Int | scala.Double = null,
    redirectUri: java.lang.String = null
  ): OAuth2ClientOptions = {
    val __obj = js.Dynamic.literal()
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (clientSecret != null) __obj.updateDynamic("clientSecret")(clientSecret)
    if (eagerRefreshThresholdMillis != null) __obj.updateDynamic("eagerRefreshThresholdMillis")(eagerRefreshThresholdMillis.asInstanceOf[js.Any])
    if (redirectUri != null) __obj.updateDynamic("redirectUri")(redirectUri)
    __obj.asInstanceOf[OAuth2ClientOptions]
  }
}

