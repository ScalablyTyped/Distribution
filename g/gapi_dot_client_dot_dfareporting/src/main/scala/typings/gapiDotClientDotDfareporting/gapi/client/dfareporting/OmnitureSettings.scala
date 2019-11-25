package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OmnitureSettings extends js.Object {
  /** Whether placement cost data will be sent to Omniture. This property can be enabled only if omnitureIntegrationEnabled is true. */
  var omnitureCostDataEnabled: js.UndefOr[Boolean] = js.undefined
  /** Whether Omniture integration is enabled. This property can be enabled only when the "Advanced Ad Serving" account setting is enabled. */
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

