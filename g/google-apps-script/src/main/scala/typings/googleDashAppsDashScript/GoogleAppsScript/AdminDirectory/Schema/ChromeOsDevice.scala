package typings.googleDashAppsDashScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChromeOsDevice extends js.Object {
  var activeTimeRanges: js.UndefOr[js.Array[ChromeOsDeviceActiveTimeRanges]] = js.undefined
  var annotatedAssetId: js.UndefOr[String] = js.undefined
  var annotatedLocation: js.UndefOr[String] = js.undefined
  var annotatedUser: js.UndefOr[String] = js.undefined
  var bootMode: js.UndefOr[String] = js.undefined
  var cpuStatusReports: js.UndefOr[js.Array[ChromeOsDeviceCpuStatusReports]] = js.undefined
  var deviceFiles: js.UndefOr[js.Array[ChromeOsDeviceDeviceFiles]] = js.undefined
  var deviceId: js.UndefOr[String] = js.undefined
  var diskVolumeReports: js.UndefOr[js.Array[ChromeOsDeviceDiskVolumeReports]] = js.undefined
  var etag: js.UndefOr[String] = js.undefined
  var ethernetMacAddress: js.UndefOr[String] = js.undefined
  var firmwareVersion: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var lastEnrollmentTime: js.UndefOr[String] = js.undefined
  var lastSync: js.UndefOr[String] = js.undefined
  var macAddress: js.UndefOr[String] = js.undefined
  var meid: js.UndefOr[String] = js.undefined
  var model: js.UndefOr[String] = js.undefined
  var notes: js.UndefOr[String] = js.undefined
  var orderNumber: js.UndefOr[String] = js.undefined
  var orgUnitPath: js.UndefOr[String] = js.undefined
  var osVersion: js.UndefOr[String] = js.undefined
  var platformVersion: js.UndefOr[String] = js.undefined
  var recentUsers: js.UndefOr[js.Array[ChromeOsDeviceRecentUsers]] = js.undefined
  var serialNumber: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[String] = js.undefined
  var supportEndDate: js.UndefOr[String] = js.undefined
  var systemRamFreeReports: js.UndefOr[js.Array[ChromeOsDeviceSystemRamFreeReports]] = js.undefined
  var systemRamTotal: js.UndefOr[String] = js.undefined
  var tpmVersionInfo: js.UndefOr[ChromeOsDeviceTpmVersionInfo] = js.undefined
  var willAutoRenew: js.UndefOr[Boolean] = js.undefined
}

object ChromeOsDevice {
  @scala.inline
  def apply(
    activeTimeRanges: js.Array[ChromeOsDeviceActiveTimeRanges] = null,
    annotatedAssetId: String = null,
    annotatedLocation: String = null,
    annotatedUser: String = null,
    bootMode: String = null,
    cpuStatusReports: js.Array[ChromeOsDeviceCpuStatusReports] = null,
    deviceFiles: js.Array[ChromeOsDeviceDeviceFiles] = null,
    deviceId: String = null,
    diskVolumeReports: js.Array[ChromeOsDeviceDiskVolumeReports] = null,
    etag: String = null,
    ethernetMacAddress: String = null,
    firmwareVersion: String = null,
    kind: String = null,
    lastEnrollmentTime: String = null,
    lastSync: String = null,
    macAddress: String = null,
    meid: String = null,
    model: String = null,
    notes: String = null,
    orderNumber: String = null,
    orgUnitPath: String = null,
    osVersion: String = null,
    platformVersion: String = null,
    recentUsers: js.Array[ChromeOsDeviceRecentUsers] = null,
    serialNumber: String = null,
    status: String = null,
    supportEndDate: String = null,
    systemRamFreeReports: js.Array[ChromeOsDeviceSystemRamFreeReports] = null,
    systemRamTotal: String = null,
    tpmVersionInfo: ChromeOsDeviceTpmVersionInfo = null,
    willAutoRenew: js.UndefOr[Boolean] = js.undefined
  ): ChromeOsDevice = {
    val __obj = js.Dynamic.literal()
    if (activeTimeRanges != null) __obj.updateDynamic("activeTimeRanges")(activeTimeRanges.asInstanceOf[js.Any])
    if (annotatedAssetId != null) __obj.updateDynamic("annotatedAssetId")(annotatedAssetId.asInstanceOf[js.Any])
    if (annotatedLocation != null) __obj.updateDynamic("annotatedLocation")(annotatedLocation.asInstanceOf[js.Any])
    if (annotatedUser != null) __obj.updateDynamic("annotatedUser")(annotatedUser.asInstanceOf[js.Any])
    if (bootMode != null) __obj.updateDynamic("bootMode")(bootMode.asInstanceOf[js.Any])
    if (cpuStatusReports != null) __obj.updateDynamic("cpuStatusReports")(cpuStatusReports.asInstanceOf[js.Any])
    if (deviceFiles != null) __obj.updateDynamic("deviceFiles")(deviceFiles.asInstanceOf[js.Any])
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId.asInstanceOf[js.Any])
    if (diskVolumeReports != null) __obj.updateDynamic("diskVolumeReports")(diskVolumeReports.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (ethernetMacAddress != null) __obj.updateDynamic("ethernetMacAddress")(ethernetMacAddress.asInstanceOf[js.Any])
    if (firmwareVersion != null) __obj.updateDynamic("firmwareVersion")(firmwareVersion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (lastEnrollmentTime != null) __obj.updateDynamic("lastEnrollmentTime")(lastEnrollmentTime.asInstanceOf[js.Any])
    if (lastSync != null) __obj.updateDynamic("lastSync")(lastSync.asInstanceOf[js.Any])
    if (macAddress != null) __obj.updateDynamic("macAddress")(macAddress.asInstanceOf[js.Any])
    if (meid != null) __obj.updateDynamic("meid")(meid.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    if (orderNumber != null) __obj.updateDynamic("orderNumber")(orderNumber.asInstanceOf[js.Any])
    if (orgUnitPath != null) __obj.updateDynamic("orgUnitPath")(orgUnitPath.asInstanceOf[js.Any])
    if (osVersion != null) __obj.updateDynamic("osVersion")(osVersion.asInstanceOf[js.Any])
    if (platformVersion != null) __obj.updateDynamic("platformVersion")(platformVersion.asInstanceOf[js.Any])
    if (recentUsers != null) __obj.updateDynamic("recentUsers")(recentUsers.asInstanceOf[js.Any])
    if (serialNumber != null) __obj.updateDynamic("serialNumber")(serialNumber.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (supportEndDate != null) __obj.updateDynamic("supportEndDate")(supportEndDate.asInstanceOf[js.Any])
    if (systemRamFreeReports != null) __obj.updateDynamic("systemRamFreeReports")(systemRamFreeReports.asInstanceOf[js.Any])
    if (systemRamTotal != null) __obj.updateDynamic("systemRamTotal")(systemRamTotal.asInstanceOf[js.Any])
    if (tpmVersionInfo != null) __obj.updateDynamic("tpmVersionInfo")(tpmVersionInfo.asInstanceOf[js.Any])
    if (!js.isUndefined(willAutoRenew)) __obj.updateDynamic("willAutoRenew")(willAutoRenew.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChromeOsDevice]
  }
}

