package typings.googleapis.buildSrcApisContainerV1beta1Mod.container_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NodeManagement defines the set of node management services turned on for
  * the node pool.
  */
@js.native
trait Schema$NodeManagement extends js.Object {
  /**
    * Whether the nodes will be automatically repaired.
    */
  var autoRepair: js.UndefOr[Boolean] = js.native
  /**
    * Whether the nodes will be automatically upgraded.
    */
  var autoUpgrade: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the Auto Upgrade knobs for the node pool.
    */
  var upgradeOptions: js.UndefOr[Schema$AutoUpgradeOptions] = js.native
}

object Schema$NodeManagement {
  @scala.inline
  def apply(
    autoRepair: js.UndefOr[Boolean] = js.undefined,
    autoUpgrade: js.UndefOr[Boolean] = js.undefined,
    upgradeOptions: Schema$AutoUpgradeOptions = null
  ): Schema$NodeManagement = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoRepair)) __obj.updateDynamic("autoRepair")(autoRepair.asInstanceOf[js.Any])
    if (!js.isUndefined(autoUpgrade)) __obj.updateDynamic("autoUpgrade")(autoUpgrade.asInstanceOf[js.Any])
    if (upgradeOptions != null) __obj.updateDynamic("upgradeOptions")(upgradeOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$NodeManagement]
  }
}

