package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminUnderscoreDirectoryUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChromeOsDevice extends js.Object {
  var activeTimeRanges: js.UndefOr[js.Array[ChromeOsDeviceActiveTimeRanges]] = js.undefined
  var annotatedAssetId: js.UndefOr[java.lang.String] = js.undefined
  var annotatedLocation: js.UndefOr[java.lang.String] = js.undefined
  var annotatedUser: js.UndefOr[java.lang.String] = js.undefined
  var bootMode: js.UndefOr[java.lang.String] = js.undefined
  var cpuStatusReports: js.UndefOr[js.Array[ChromeOsDeviceCpuStatusReports]] = js.undefined
  var deviceFiles: js.UndefOr[js.Array[ChromeOsDeviceDeviceFiles]] = js.undefined
  var deviceId: js.UndefOr[java.lang.String] = js.undefined
  var diskVolumeReports: js.UndefOr[js.Array[ChromeOsDeviceDiskVolumeReports]] = js.undefined
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var ethernetMacAddress: js.UndefOr[java.lang.String] = js.undefined
  var firmwareVersion: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var lastEnrollmentTime: js.UndefOr[java.lang.String] = js.undefined
  var lastSync: js.UndefOr[java.lang.String] = js.undefined
  var macAddress: js.UndefOr[java.lang.String] = js.undefined
  var meid: js.UndefOr[java.lang.String] = js.undefined
  var model: js.UndefOr[java.lang.String] = js.undefined
  var notes: js.UndefOr[java.lang.String] = js.undefined
  var orderNumber: js.UndefOr[java.lang.String] = js.undefined
  var orgUnitPath: js.UndefOr[java.lang.String] = js.undefined
  var osVersion: js.UndefOr[java.lang.String] = js.undefined
  var platformVersion: js.UndefOr[java.lang.String] = js.undefined
  var recentUsers: js.UndefOr[js.Array[ChromeOsDeviceRecentUsers]] = js.undefined
  var serialNumber: js.UndefOr[java.lang.String] = js.undefined
  var status: js.UndefOr[java.lang.String] = js.undefined
  var supportEndDate: js.UndefOr[java.lang.String] = js.undefined
  var systemRamFreeReports: js.UndefOr[js.Array[ChromeOsDeviceSystemRamFreeReports]] = js.undefined
  var systemRamTotal: js.UndefOr[java.lang.String] = js.undefined
  var tpmVersionInfo: js.UndefOr[ChromeOsDeviceTpmVersionInfo] = js.undefined
  var willAutoRenew: js.UndefOr[scala.Boolean] = js.undefined
}

object ChromeOsDevice {
  @scala.inline
  def apply(
    activeTimeRanges: js.Array[ChromeOsDeviceActiveTimeRanges] = null,
    annotatedAssetId: java.lang.String = null,
    annotatedLocation: java.lang.String = null,
    annotatedUser: java.lang.String = null,
    bootMode: java.lang.String = null,
    cpuStatusReports: js.Array[ChromeOsDeviceCpuStatusReports] = null,
    deviceFiles: js.Array[ChromeOsDeviceDeviceFiles] = null,
    deviceId: java.lang.String = null,
    diskVolumeReports: js.Array[ChromeOsDeviceDiskVolumeReports] = null,
    etag: java.lang.String = null,
    ethernetMacAddress: java.lang.String = null,
    firmwareVersion: java.lang.String = null,
    kind: java.lang.String = null,
    lastEnrollmentTime: java.lang.String = null,
    lastSync: java.lang.String = null,
    macAddress: java.lang.String = null,
    meid: java.lang.String = null,
    model: java.lang.String = null,
    notes: java.lang.String = null,
    orderNumber: java.lang.String = null,
    orgUnitPath: java.lang.String = null,
    osVersion: java.lang.String = null,
    platformVersion: java.lang.String = null,
    recentUsers: js.Array[ChromeOsDeviceRecentUsers] = null,
    serialNumber: java.lang.String = null,
    status: java.lang.String = null,
    supportEndDate: java.lang.String = null,
    systemRamFreeReports: js.Array[ChromeOsDeviceSystemRamFreeReports] = null,
    systemRamTotal: java.lang.String = null,
    tpmVersionInfo: ChromeOsDeviceTpmVersionInfo = null,
    willAutoRenew: js.UndefOr[scala.Boolean] = js.undefined
  ): ChromeOsDevice = {
    val __obj = js.Dynamic.literal()
    if (activeTimeRanges != null) __obj.updateDynamic("activeTimeRanges")(activeTimeRanges)
    if (annotatedAssetId != null) __obj.updateDynamic("annotatedAssetId")(annotatedAssetId)
    if (annotatedLocation != null) __obj.updateDynamic("annotatedLocation")(annotatedLocation)
    if (annotatedUser != null) __obj.updateDynamic("annotatedUser")(annotatedUser)
    if (bootMode != null) __obj.updateDynamic("bootMode")(bootMode)
    if (cpuStatusReports != null) __obj.updateDynamic("cpuStatusReports")(cpuStatusReports)
    if (deviceFiles != null) __obj.updateDynamic("deviceFiles")(deviceFiles)
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId)
    if (diskVolumeReports != null) __obj.updateDynamic("diskVolumeReports")(diskVolumeReports)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (ethernetMacAddress != null) __obj.updateDynamic("ethernetMacAddress")(ethernetMacAddress)
    if (firmwareVersion != null) __obj.updateDynamic("firmwareVersion")(firmwareVersion)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (lastEnrollmentTime != null) __obj.updateDynamic("lastEnrollmentTime")(lastEnrollmentTime)
    if (lastSync != null) __obj.updateDynamic("lastSync")(lastSync)
    if (macAddress != null) __obj.updateDynamic("macAddress")(macAddress)
    if (meid != null) __obj.updateDynamic("meid")(meid)
    if (model != null) __obj.updateDynamic("model")(model)
    if (notes != null) __obj.updateDynamic("notes")(notes)
    if (orderNumber != null) __obj.updateDynamic("orderNumber")(orderNumber)
    if (orgUnitPath != null) __obj.updateDynamic("orgUnitPath")(orgUnitPath)
    if (osVersion != null) __obj.updateDynamic("osVersion")(osVersion)
    if (platformVersion != null) __obj.updateDynamic("platformVersion")(platformVersion)
    if (recentUsers != null) __obj.updateDynamic("recentUsers")(recentUsers)
    if (serialNumber != null) __obj.updateDynamic("serialNumber")(serialNumber)
    if (status != null) __obj.updateDynamic("status")(status)
    if (supportEndDate != null) __obj.updateDynamic("supportEndDate")(supportEndDate)
    if (systemRamFreeReports != null) __obj.updateDynamic("systemRamFreeReports")(systemRamFreeReports)
    if (systemRamTotal != null) __obj.updateDynamic("systemRamTotal")(systemRamTotal)
    if (tpmVersionInfo != null) __obj.updateDynamic("tpmVersionInfo")(tpmVersionInfo)
    if (!js.isUndefined(willAutoRenew)) __obj.updateDynamic("willAutoRenew")(willAutoRenew)
    __obj.asInstanceOf[ChromeOsDevice]
  }
}

