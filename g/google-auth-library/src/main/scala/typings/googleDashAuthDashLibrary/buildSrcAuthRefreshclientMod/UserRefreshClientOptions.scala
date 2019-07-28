package typings.googleDashAuthDashLibrary.buildSrcAuthRefreshclientMod

import typings.googleDashAuthDashLibrary.buildSrcAuthOauth2clientMod.RefreshOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserRefreshClientOptions extends RefreshOptions {
  var clientId: js.UndefOr[String] = js.undefined
  var clientSecret: js.UndefOr[String] = js.undefined
  var refreshToken: js.UndefOr[String] = js.undefined
}

object UserRefreshClientOptions {
  @scala.inline
  def apply(
    clientId: String = null,
    clientSecret: String = null,
    eagerRefreshThresholdMillis: Int | Double = null,
    refreshToken: String = null
  ): UserRefreshClientOptions = {
    val __obj = js.Dynamic.literal()
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (clientSecret != null) __obj.updateDynamic("clientSecret")(clientSecret)
    if (eagerRefreshThresholdMillis != null) __obj.updateDynamic("eagerRefreshThresholdMillis")(eagerRefreshThresholdMillis.asInstanceOf[js.Any])
    if (refreshToken != null) __obj.updateDynamic("refreshToken")(refreshToken)
    __obj.asInstanceOf[UserRefreshClientOptions]
  }
}

