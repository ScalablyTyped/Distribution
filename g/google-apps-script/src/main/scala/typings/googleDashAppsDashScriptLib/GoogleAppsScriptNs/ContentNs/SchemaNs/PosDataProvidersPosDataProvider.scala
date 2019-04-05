package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PosDataProvidersPosDataProvider extends js.Object {
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  var fullName: js.UndefOr[java.lang.String] = js.undefined
  var providerId: js.UndefOr[java.lang.String] = js.undefined
}

object PosDataProvidersPosDataProvider {
  @scala.inline
  def apply(
    displayName: java.lang.String = null,
    fullName: java.lang.String = null,
    providerId: java.lang.String = null
  ): PosDataProvidersPosDataProvider = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (fullName != null) __obj.updateDynamic("fullName")(fullName)
    if (providerId != null) __obj.updateDynamic("providerId")(providerId)
    __obj.asInstanceOf[PosDataProvidersPosDataProvider]
  }
}

