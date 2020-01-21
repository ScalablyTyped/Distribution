package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OmnitureSettings extends js.Object {
  var omnitureCostDataEnabled: js.UndefOr[Boolean] = js.undefined
  var omnitureIntegrationEnabled: js.UndefOr[Boolean] = js.undefined
}

object OmnitureSettings {
  @scala.inline
  def apply(
    omnitureCostDataEnabled: js.UndefOr[Boolean] = js.undefined,
    omnitureIntegrationEnabled: js.UndefOr[Boolean] = js.undefined
  ): OmnitureSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(omnitureCostDataEnabled)) __obj.updateDynamic("omnitureCostDataEnabled")(omnitureCostDataEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(omnitureIntegrationEnabled)) __obj.updateDynamic("omnitureIntegrationEnabled")(omnitureIntegrationEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmnitureSettings]
  }
}

