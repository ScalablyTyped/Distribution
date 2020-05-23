package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MobileDevice extends js.Object {
  var adbStatus: js.UndefOr[Boolean] = js.undefined
  var applications: js.UndefOr[js.Array[MobileDeviceApplications]] = js.undefined
  var basebandVersion: js.UndefOr[String] = js.undefined
  var bootloaderVersion: js.UndefOr[String] = js.undefined
  var brand: js.UndefOr[String] = js.undefined
  var buildNumber: js.UndefOr[String] = js.undefined
  var defaultLanguage: js.UndefOr[String] = js.undefined
  var developerOptionsStatus: js.UndefOr[Boolean] = js.undefined
  var deviceCompromisedStatus: js.UndefOr[String] = js.undefined
  var deviceId: js.UndefOr[String] = js.undefined
  var devicePasswordStatus: js.UndefOr[String] = js.undefined
  var email: js.UndefOr[js.Array[String]] = js.undefined
  var encryptionStatus: js.UndefOr[String] = js.undefined
  var etag: js.UndefOr[String] = js.undefined
  var firstSync: js.UndefOr[String] = js.undefined
  var hardware: js.UndefOr[String] = js.undefined
  var hardwareId: js.UndefOr[String] = js.undefined
  var imei: js.UndefOr[String] = js.undefined
  var kernelVersion: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var lastSync: js.UndefOr[String] = js.undefined
  var managedAccountIsOnOwnerProfile: js.UndefOr[Boolean] = js.undefined
  var manufacturer: js.UndefOr[String] = js.undefined
  var meid: js.UndefOr[String] = js.undefined
  var model: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[js.Array[String]] = js.undefined
  var networkOperator: js.UndefOr[String] = js.undefined
  var os: js.UndefOr[String] = js.undefined
  var otherAccountsInfo: js.UndefOr[js.Array[String]] = js.undefined
  var privilege: js.UndefOr[String] = js.undefined
  var releaseVersion: js.UndefOr[String] = js.undefined
  var resourceId: js.UndefOr[String] = js.undefined
  var securityPatchLevel: js.UndefOr[String] = js.undefined
  var serialNumber: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[String] = js.undefined
  var supportsWorkProfile: js.UndefOr[Boolean] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var unknownSourcesStatus: js.UndefOr[Boolean] = js.undefined
  var userAgent: js.UndefOr[String] = js.undefined
  var wifiMacAddress: js.UndefOr[String] = js.undefined
}

object MobileDevice {
  @scala.inline
  def apply(
    adbStatus: js.UndefOr[Boolean] = js.undefined,
    applications: js.Array[MobileDeviceApplications] = null,
    basebandVersion: String = null,
    bootloaderVersion: String = null,
    brand: String = null,
    buildNumber: String = null,
    defaultLanguage: String = null,
    developerOptionsStatus: js.UndefOr[Boolean] = js.undefined,
    deviceCompromisedStatus: String = null,
    deviceId: String = null,
    devicePasswordStatus: String = null,
    email: js.Array[String] = null,
    encryptionStatus: String = null,
    etag: String = null,
    firstSync: String = null,
    hardware: String = null,
    hardwareId: String = null,
    imei: String = null,
    kernelVersion: String = null,
    kind: String = null,
    lastSync: String = null,
    managedAccountIsOnOwnerProfile: js.UndefOr[Boolean] = js.undefined,
    manufacturer: String = null,
    meid: String = null,
    model: String = null,
    name: js.Array[String] = null,
    networkOperator: String = null,
    os: String = null,
    otherAccountsInfo: js.Array[String] = null,
    privilege: String = null,
    releaseVersion: String = null,
    resourceId: String = null,
    securityPatchLevel: String = null,
    serialNumber: String = null,
    status: String = null,
    supportsWorkProfile: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null,
    unknownSourcesStatus: js.UndefOr[Boolean] = js.undefined,
    userAgent: String = null,
    wifiMacAddress: String = null
  ): MobileDevice = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(adbStatus)) __obj.updateDynamic("adbStatus")(adbStatus.get.asInstanceOf[js.Any])
    if (applications != null) __obj.updateDynamic("applications")(applications.asInstanceOf[js.Any])
    if (basebandVersion != null) __obj.updateDynamic("basebandVersion")(basebandVersion.asInstanceOf[js.Any])
    if (bootloaderVersion != null) __obj.updateDynamic("bootloaderVersion")(bootloaderVersion.asInstanceOf[js.Any])
    if (brand != null) __obj.updateDynamic("brand")(brand.asInstanceOf[js.Any])
    if (buildNumber != null) __obj.updateDynamic("buildNumber")(buildNumber.asInstanceOf[js.Any])
    if (defaultLanguage != null) __obj.updateDynamic("defaultLanguage")(defaultLanguage.asInstanceOf[js.Any])
    if (!js.isUndefined(developerOptionsStatus)) __obj.updateDynamic("developerOptionsStatus")(developerOptionsStatus.get.asInstanceOf[js.Any])
    if (deviceCompromisedStatus != null) __obj.updateDynamic("deviceCompromisedStatus")(deviceCompromisedStatus.asInstanceOf[js.Any])
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId.asInstanceOf[js.Any])
    if (devicePasswordStatus != null) __obj.updateDynamic("devicePasswordStatus")(devicePasswordStatus.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (encryptionStatus != null) __obj.updateDynamic("encryptionStatus")(encryptionStatus.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (firstSync != null) __obj.updateDynamic("firstSync")(firstSync.asInstanceOf[js.Any])
    if (hardware != null) __obj.updateDynamic("hardware")(hardware.asInstanceOf[js.Any])
    if (hardwareId != null) __obj.updateDynamic("hardwareId")(hardwareId.asInstanceOf[js.Any])
    if (imei != null) __obj.updateDynamic("imei")(imei.asInstanceOf[js.Any])
    if (kernelVersion != null) __obj.updateDynamic("kernelVersion")(kernelVersion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (lastSync != null) __obj.updateDynamic("lastSync")(lastSync.asInstanceOf[js.Any])
    if (!js.isUndefined(managedAccountIsOnOwnerProfile)) __obj.updateDynamic("managedAccountIsOnOwnerProfile")(managedAccountIsOnOwnerProfile.get.asInstanceOf[js.Any])
    if (manufacturer != null) __obj.updateDynamic("manufacturer")(manufacturer.asInstanceOf[js.Any])
    if (meid != null) __obj.updateDynamic("meid")(meid.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (networkOperator != null) __obj.updateDynamic("networkOperator")(networkOperator.asInstanceOf[js.Any])
    if (os != null) __obj.updateDynamic("os")(os.asInstanceOf[js.Any])
    if (otherAccountsInfo != null) __obj.updateDynamic("otherAccountsInfo")(otherAccountsInfo.asInstanceOf[js.Any])
    if (privilege != null) __obj.updateDynamic("privilege")(privilege.asInstanceOf[js.Any])
    if (releaseVersion != null) __obj.updateDynamic("releaseVersion")(releaseVersion.asInstanceOf[js.Any])
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId.asInstanceOf[js.Any])
    if (securityPatchLevel != null) __obj.updateDynamic("securityPatchLevel")(securityPatchLevel.asInstanceOf[js.Any])
    if (serialNumber != null) __obj.updateDynamic("serialNumber")(serialNumber.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (!js.isUndefined(supportsWorkProfile)) __obj.updateDynamic("supportsWorkProfile")(supportsWorkProfile.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(unknownSourcesStatus)) __obj.updateDynamic("unknownSourcesStatus")(unknownSourcesStatus.get.asInstanceOf[js.Any])
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent.asInstanceOf[js.Any])
    if (wifiMacAddress != null) __obj.updateDynamic("wifiMacAddress")(wifiMacAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileDevice]
  }
}

