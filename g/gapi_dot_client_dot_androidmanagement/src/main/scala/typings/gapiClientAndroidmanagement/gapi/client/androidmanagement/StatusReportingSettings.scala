package typings.gapiClientAndroidmanagement.gapi.client.androidmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatusReportingSettings extends js.Object {
  /** Whether displays reporting is enabled. */
  var displayInfoEnabled: js.UndefOr[Boolean] = js.undefined
  /** Whether hardware status reporting is enabled. */
  var hardwareStatusEnabled: js.UndefOr[Boolean] = js.undefined
  /** Whether memory info reporting is enabled. */
  var memoryInfoEnabled: js.UndefOr[Boolean] = js.undefined
  /** Whether network info reporting is enabled. */
  var networkInfoEnabled: js.UndefOr[Boolean] = js.undefined
  /** Whether power management event reporting is enabled. */
  var powerManagementEventsEnabled: js.UndefOr[Boolean] = js.undefined
  /** Whether software info reporting is enabled. */
  var softwareInfoEnabled: js.UndefOr[Boolean] = js.undefined
}

object StatusReportingSettings {
  @scala.inline
  def apply(
    displayInfoEnabled: js.UndefOr[Boolean] = js.undefined,
    hardwareStatusEnabled: js.UndefOr[Boolean] = js.undefined,
    memoryInfoEnabled: js.UndefOr[Boolean] = js.undefined,
    networkInfoEnabled: js.UndefOr[Boolean] = js.undefined,
    powerManagementEventsEnabled: js.UndefOr[Boolean] = js.undefined,
    softwareInfoEnabled: js.UndefOr[Boolean] = js.undefined
  ): StatusReportingSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(displayInfoEnabled)) __obj.updateDynamic("displayInfoEnabled")(displayInfoEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(hardwareStatusEnabled)) __obj.updateDynamic("hardwareStatusEnabled")(hardwareStatusEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(memoryInfoEnabled)) __obj.updateDynamic("memoryInfoEnabled")(memoryInfoEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(networkInfoEnabled)) __obj.updateDynamic("networkInfoEnabled")(networkInfoEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(powerManagementEventsEnabled)) __obj.updateDynamic("powerManagementEventsEnabled")(powerManagementEventsEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(softwareInfoEnabled)) __obj.updateDynamic("softwareInfoEnabled")(softwareInfoEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusReportingSettings]
  }
}

