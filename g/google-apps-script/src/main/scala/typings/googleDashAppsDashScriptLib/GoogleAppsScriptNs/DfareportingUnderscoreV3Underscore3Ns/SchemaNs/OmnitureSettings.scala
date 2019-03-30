package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OmnitureSettings extends js.Object {
  var omnitureCostDataEnabled: js.UndefOr[scala.Boolean] = js.undefined
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

