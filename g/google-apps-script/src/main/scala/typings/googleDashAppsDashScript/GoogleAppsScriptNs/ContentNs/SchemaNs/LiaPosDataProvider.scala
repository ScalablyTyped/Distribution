package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiaPosDataProvider extends js.Object {
  var posDataProviderId: js.UndefOr[String] = js.undefined
  var posExternalAccountId: js.UndefOr[String] = js.undefined
}

object LiaPosDataProvider {
  @scala.inline
  def apply(posDataProviderId: String = null, posExternalAccountId: String = null): LiaPosDataProvider = {
    val __obj = js.Dynamic.literal()
    if (posDataProviderId != null) __obj.updateDynamic("posDataProviderId")(posDataProviderId)
    if (posExternalAccountId != null) __obj.updateDynamic("posExternalAccountId")(posExternalAccountId)
    __obj.asInstanceOf[LiaPosDataProvider]
  }
}

