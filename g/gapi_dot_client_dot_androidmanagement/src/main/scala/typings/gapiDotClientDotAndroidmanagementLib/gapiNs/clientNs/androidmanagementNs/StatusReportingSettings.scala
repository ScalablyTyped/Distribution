package typings
package gapiDotClientDotAndroidmanagementLib.gapiNs.clientNs.androidmanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatusReportingSettings extends js.Object {
  /** Whether displays reporting is enabled. */
  var displayInfoEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether hardware status reporting is enabled. */
  var hardwareStatusEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether memory info reporting is enabled. */
  var memoryInfoEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether network info reporting is enabled. */
  var networkInfoEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether power management event reporting is enabled. */
  var powerManagementEventsEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether software info reporting is enabled. */
  var softwareInfoEnabled: js.UndefOr[scala.Boolean] = js.undefined
}

object StatusReportingSettings {
  @scala.inline
  def apply(
    displayInfoEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    hardwareStatusEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    memoryInfoEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    networkInfoEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    powerManagementEventsEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    softwareInfoEnabled: js.UndefOr[scala.Boolean] = js.undefined
  ): StatusReportingSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(displayInfoEnabled)) __obj.updateDynamic("displayInfoEnabled")(displayInfoEnabled)
    if (!js.isUndefined(hardwareStatusEnabled)) __obj.updateDynamic("hardwareStatusEnabled")(hardwareStatusEnabled)
    if (!js.isUndefined(memoryInfoEnabled)) __obj.updateDynamic("memoryInfoEnabled")(memoryInfoEnabled)
    if (!js.isUndefined(networkInfoEnabled)) __obj.updateDynamic("networkInfoEnabled")(networkInfoEnabled)
    if (!js.isUndefined(powerManagementEventsEnabled)) __obj.updateDynamic("powerManagementEventsEnabled")(powerManagementEventsEnabled)
    if (!js.isUndefined(softwareInfoEnabled)) __obj.updateDynamic("softwareInfoEnabled")(softwareInfoEnabled)
    __obj.asInstanceOf[StatusReportingSettings]
  }
}

