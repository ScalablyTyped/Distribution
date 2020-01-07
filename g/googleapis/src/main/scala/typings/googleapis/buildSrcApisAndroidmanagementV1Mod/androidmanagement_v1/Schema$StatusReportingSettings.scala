package typings.googleapis.buildSrcApisAndroidmanagementV1Mod.androidmanagement_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Settings controlling the behavior of status reports.
  */
@js.native
trait Schema$StatusReportingSettings extends js.Object {
  /**
    * Whether app reports are enabled.
    */
  var applicationReportsEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether device settings reporting is enabled.
    */
  var deviceSettingsEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether displays reporting is enabled.
    */
  var displayInfoEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether hardware status reporting is enabled.
    */
  var hardwareStatusEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether memory reporting is enabled.
    */
  var memoryInfoEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether network info reporting is enabled.
    */
  var networkInfoEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether power management event reporting is enabled.
    */
  var powerManagementEventsEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether software info reporting is enabled.
    */
  var softwareInfoEnabled: js.UndefOr[Boolean] = js.native
}

object Schema$StatusReportingSettings {
  @scala.inline
  def apply(
    applicationReportsEnabled: js.UndefOr[Boolean] = js.undefined,
    deviceSettingsEnabled: js.UndefOr[Boolean] = js.undefined,
    displayInfoEnabled: js.UndefOr[Boolean] = js.undefined,
    hardwareStatusEnabled: js.UndefOr[Boolean] = js.undefined,
    memoryInfoEnabled: js.UndefOr[Boolean] = js.undefined,
    networkInfoEnabled: js.UndefOr[Boolean] = js.undefined,
    powerManagementEventsEnabled: js.UndefOr[Boolean] = js.undefined,
    softwareInfoEnabled: js.UndefOr[Boolean] = js.undefined
  ): Schema$StatusReportingSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(applicationReportsEnabled)) __obj.updateDynamic("applicationReportsEnabled")(applicationReportsEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(deviceSettingsEnabled)) __obj.updateDynamic("deviceSettingsEnabled")(deviceSettingsEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(displayInfoEnabled)) __obj.updateDynamic("displayInfoEnabled")(displayInfoEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(hardwareStatusEnabled)) __obj.updateDynamic("hardwareStatusEnabled")(hardwareStatusEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(memoryInfoEnabled)) __obj.updateDynamic("memoryInfoEnabled")(memoryInfoEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(networkInfoEnabled)) __obj.updateDynamic("networkInfoEnabled")(networkInfoEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(powerManagementEventsEnabled)) __obj.updateDynamic("powerManagementEventsEnabled")(powerManagementEventsEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(softwareInfoEnabled)) __obj.updateDynamic("softwareInfoEnabled")(softwareInfoEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$StatusReportingSettings]
  }
}

