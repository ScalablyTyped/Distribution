package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagSettings extends js.Object {
  var dynamicTagEnabled: js.UndefOr[Boolean] = js.undefined
  var imageTagEnabled: js.UndefOr[Boolean] = js.undefined
}

object TagSettings {
  @scala.inline
  def apply(
    dynamicTagEnabled: js.UndefOr[Boolean] = js.undefined,
    imageTagEnabled: js.UndefOr[Boolean] = js.undefined
  ): TagSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dynamicTagEnabled)) __obj.updateDynamic("dynamicTagEnabled")(dynamicTagEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(imageTagEnabled)) __obj.updateDynamic("imageTagEnabled")(imageTagEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagSettings]
  }
}

