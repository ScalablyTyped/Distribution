package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminUnderscoreDirectoryUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MobileDevice extends js.Object {
  var adbStatus: js.UndefOr[scala.Boolean] = js.undefined
  var applications: js.UndefOr[js.Array[MobileDeviceApplications]] = js.undefined
  var basebandVersion: js.UndefOr[java.lang.String] = js.undefined
  var bootloaderVersion: js.UndefOr[java.lang.String] = js.undefined
  var brand: js.UndefOr[java.lang.String] = js.undefined
  var buildNumber: js.UndefOr[java.lang.String] = js.undefined
  var defaultLanguage: js.UndefOr[java.lang.String] = js.undefined
  var developerOptionsStatus: js.UndefOr[scala.Boolean] = js.undefined
  var deviceCompromisedStatus: js.UndefOr[java.lang.String] = js.undefined
  var deviceId: js.UndefOr[java.lang.String] = js.undefined
  var devicePasswordStatus: js.UndefOr[java.lang.String] = js.undefined
  var email: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var encryptionStatus: js.UndefOr[java.lang.String] = js.undefined
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var firstSync: js.UndefOr[java.lang.String] = js.undefined
  var hardware: js.UndefOr[java.lang.String] = js.undefined
  var hardwareId: js.UndefOr[java.lang.String] = js.undefined
  var imei: js.UndefOr[java.lang.String] = js.undefined
  var kernelVersion: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var lastSync: js.UndefOr[java.lang.String] = js.undefined
  var managedAccountIsOnOwnerProfile: js.UndefOr[scala.Boolean] = js.undefined
  var manufacturer: js.UndefOr[java.lang.String] = js.undefined
  var meid: js.UndefOr[java.lang.String] = js.undefined
  var model: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var networkOperator: js.UndefOr[java.lang.String] = js.undefined
  var os: js.UndefOr[java.lang.String] = js.undefined
  var otherAccountsInfo: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var privilege: js.UndefOr[java.lang.String] = js.undefined
  var releaseVersion: js.UndefOr[java.lang.String] = js.undefined
  var resourceId: js.UndefOr[java.lang.String] = js.undefined
  var securityPatchLevel: js.UndefOr[java.lang.String] = js.undefined
  var serialNumber: js.UndefOr[java.lang.String] = js.undefined
  var status: js.UndefOr[java.lang.String] = js.undefined
  var supportsWorkProfile: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var unknownSourcesStatus: js.UndefOr[scala.Boolean] = js.undefined
  var userAgent: js.UndefOr[java.lang.String] = js.undefined
  var wifiMacAddress: js.UndefOr[java.lang.String] = js.undefined
}

object MobileDevice {
  @scala.inline
  def apply(
    adbStatus: js.UndefOr[scala.Boolean] = js.undefined,
    applications: js.Array[MobileDeviceApplications] = null,
    basebandVersion: java.lang.String = null,
    bootloaderVersion: java.lang.String = null,
    brand: java.lang.String = null,
    buildNumber: java.lang.String = null,
    defaultLanguage: java.lang.String = null,
    developerOptionsStatus: js.UndefOr[scala.Boolean] = js.undefined,
    deviceCompromisedStatus: java.lang.String = null,
    deviceId: java.lang.String = null,
    devicePasswordStatus: java.lang.String = null,
    email: js.Array[java.lang.String] = null,
    encryptionStatus: java.lang.String = null,
    etag: java.lang.String = null,
    firstSync: java.lang.String = null,
    hardware: java.lang.String = null,
    hardwareId: java.lang.String = null,
    imei: java.lang.String = null,
    kernelVersion: java.lang.String = null,
    kind: java.lang.String = null,
    lastSync: java.lang.String = null,
    managedAccountIsOnOwnerProfile: js.UndefOr[scala.Boolean] = js.undefined,
    manufacturer: java.lang.String = null,
    meid: java.lang.String = null,
    model: java.lang.String = null,
    name: js.Array[java.lang.String] = null,
    networkOperator: java.lang.String = null,
    os: java.lang.String = null,
    otherAccountsInfo: js.Array[java.lang.String] = null,
    privilege: java.lang.String = null,
    releaseVersion: java.lang.String = null,
    resourceId: java.lang.String = null,
    securityPatchLevel: java.lang.String = null,
    serialNumber: java.lang.String = null,
    status: java.lang.String = null,
    supportsWorkProfile: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: java.lang.String = null,
    unknownSourcesStatus: js.UndefOr[scala.Boolean] = js.undefined,
    userAgent: java.lang.String = null,
    wifiMacAddress: java.lang.String = null
  ): MobileDevice = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(adbStatus)) __obj.updateDynamic("adbStatus")(adbStatus)
    if (applications != null) __obj.updateDynamic("applications")(applications)
    if (basebandVersion != null) __obj.updateDynamic("basebandVersion")(basebandVersion)
    if (bootloaderVersion != null) __obj.updateDynamic("bootloaderVersion")(bootloaderVersion)
    if (brand != null) __obj.updateDynamic("brand")(brand)
    if (buildNumber != null) __obj.updateDynamic("buildNumber")(buildNumber)
    if (defaultLanguage != null) __obj.updateDynamic("defaultLanguage")(defaultLanguage)
    if (!js.isUndefined(developerOptionsStatus)) __obj.updateDynamic("developerOptionsStatus")(developerOptionsStatus)
    if (deviceCompromisedStatus != null) __obj.updateDynamic("deviceCompromisedStatus")(deviceCompromisedStatus)
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId)
    if (devicePasswordStatus != null) __obj.updateDynamic("devicePasswordStatus")(devicePasswordStatus)
    if (email != null) __obj.updateDynamic("email")(email)
    if (encryptionStatus != null) __obj.updateDynamic("encryptionStatus")(encryptionStatus)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (firstSync != null) __obj.updateDynamic("firstSync")(firstSync)
    if (hardware != null) __obj.updateDynamic("hardware")(hardware)
    if (hardwareId != null) __obj.updateDynamic("hardwareId")(hardwareId)
    if (imei != null) __obj.updateDynamic("imei")(imei)
    if (kernelVersion != null) __obj.updateDynamic("kernelVersion")(kernelVersion)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (lastSync != null) __obj.updateDynamic("lastSync")(lastSync)
    if (!js.isUndefined(managedAccountIsOnOwnerProfile)) __obj.updateDynamic("managedAccountIsOnOwnerProfile")(managedAccountIsOnOwnerProfile)
    if (manufacturer != null) __obj.updateDynamic("manufacturer")(manufacturer)
    if (meid != null) __obj.updateDynamic("meid")(meid)
    if (model != null) __obj.updateDynamic("model")(model)
    if (name != null) __obj.updateDynamic("name")(name)
    if (networkOperator != null) __obj.updateDynamic("networkOperator")(networkOperator)
    if (os != null) __obj.updateDynamic("os")(os)
    if (otherAccountsInfo != null) __obj.updateDynamic("otherAccountsInfo")(otherAccountsInfo)
    if (privilege != null) __obj.updateDynamic("privilege")(privilege)
    if (releaseVersion != null) __obj.updateDynamic("releaseVersion")(releaseVersion)
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId)
    if (securityPatchLevel != null) __obj.updateDynamic("securityPatchLevel")(securityPatchLevel)
    if (serialNumber != null) __obj.updateDynamic("serialNumber")(serialNumber)
    if (status != null) __obj.updateDynamic("status")(status)
    if (!js.isUndefined(supportsWorkProfile)) __obj.updateDynamic("supportsWorkProfile")(supportsWorkProfile)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(unknownSourcesStatus)) __obj.updateDynamic("unknownSourcesStatus")(unknownSourcesStatus)
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent)
    if (wifiMacAddress != null) __obj.updateDynamic("wifiMacAddress")(wifiMacAddress)
    __obj.asInstanceOf[MobileDevice]
  }
}

