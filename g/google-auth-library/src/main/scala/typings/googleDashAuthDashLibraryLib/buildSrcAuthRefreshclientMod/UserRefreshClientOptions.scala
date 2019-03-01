package typings
package googleDashAuthDashLibraryLib.buildSrcAuthRefreshclientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserRefreshClientOptions
  extends googleDashAuthDashLibraryLib.buildSrcAuthOauth2clientMod.RefreshOptions {
  var clientId: js.UndefOr[java.lang.String] = js.undefined
  var clientSecret: js.UndefOr[java.lang.String] = js.undefined
  var refreshToken: js.UndefOr[java.lang.String] = js.undefined
}

object UserRefreshClientOptions {
  @scala.inline
  def apply(
    clientId: java.lang.String = null,
    clientSecret: java.lang.String = null,
    eagerRefreshThresholdMillis: scala.Int | scala.Double = null,
    refreshToken: java.lang.String = null
  ): UserRefreshClientOptions = {
    val __obj = js.Dynamic.literal()
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (clientSecret != null) __obj.updateDynamic("clientSecret")(clientSecret)
    if (eagerRefreshThresholdMillis != null) __obj.updateDynamic("eagerRefreshThresholdMillis")(eagerRefreshThresholdMillis.asInstanceOf[js.Any])
    if (refreshToken != null) __obj.updateDynamic("refreshToken")(refreshToken)
    __obj.asInstanceOf[UserRefreshClientOptions]
  }
}

