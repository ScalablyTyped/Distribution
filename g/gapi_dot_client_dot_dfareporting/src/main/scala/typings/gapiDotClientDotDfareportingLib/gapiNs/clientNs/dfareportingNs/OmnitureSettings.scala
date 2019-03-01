package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OmnitureSettings extends js.Object {
  /** Whether placement cost data will be sent to Omniture. This property can be enabled only if omnitureIntegrationEnabled is true. */
  var omnitureCostDataEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether Omniture integration is enabled. This property can be enabled only when the "Advanced Ad Serving" account setting is enabled. */
  var omnitureIntegrationEnabled: js.UndefOr[scala.Boolean] = js.undefined
}

object OmnitureSettings {
  @scala.inline
  def apply(
    omnitureCostDataEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    omnitureIntegrationEnabled: js.UndefOr[scala.Boolean] = js.undefined
  ): OmnitureSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(omnitureCostDataEnabled)) __obj.updateDynamic("omnitureCostDataEnabled")(omnitureCostDataEnabled)
    if (!js.isUndefined(omnitureIntegrationEnabled)) __obj.updateDynamic("omnitureIntegrationEnabled")(omnitureIntegrationEnabled)
    __obj.asInstanceOf[OmnitureSettings]
  }
}

