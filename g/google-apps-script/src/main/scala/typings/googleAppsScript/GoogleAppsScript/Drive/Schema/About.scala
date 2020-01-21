package typings.googleAppsScript.GoogleAppsScript.Drive.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait About extends js.Object {
  var additionalRoleInfo: js.UndefOr[js.Array[AboutAdditionalRoleInfo]] = js.undefined
  var canCreateDrives: js.UndefOr[Boolean] = js.undefined
  var canCreateTeamDrives: js.UndefOr[Boolean] = js.undefined
  var domainSharingPolicy: js.UndefOr[String] = js.undefined
  var driveThemes: js.UndefOr[js.Array[AboutDriveThemes]] = js.undefined
  var etag: js.UndefOr[String] = js.undefined
  var exportFormats: js.UndefOr[js.Array[AboutExportFormats]] = js.undefined
  var features: js.UndefOr[js.Array[AboutFeatures]] = js.undefined
  var folderColorPalette: js.UndefOr[js.Array[String]] = js.undefined
  var importFormats: js.UndefOr[js.Array[AboutImportFormats]] = js.undefined
  var isCurrentAppInstalled: js.UndefOr[Boolean] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var languageCode: js.UndefOr[String] = js.undefined
  var largestChangeId: js.UndefOr[String] = js.undefined
  var maxUploadSizes: js.UndefOr[js.Array[AboutMaxUploadSizes]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var permissionId: js.UndefOr[String] = js.undefined
  var quotaBytesByService: js.UndefOr[js.Array[AboutQuotaBytesByService]] = js.undefined
  var quotaBytesTotal: js.UndefOr[String] = js.undefined
  var quotaBytesUsed: js.UndefOr[String] = js.undefined
  var quotaBytesUsedAggregate: js.UndefOr[String] = js.undefined
  var quotaBytesUsedInTrash: js.UndefOr[String] = js.undefined
  var quotaType: js.UndefOr[String] = js.undefined
  var remainingChangeIds: js.UndefOr[String] = js.undefined
  var rootFolderId: js.UndefOr[String] = js.undefined
  var selfLink: js.UndefOr[String] = js.undefined
  var teamDriveThemes: js.UndefOr[js.Array[AboutTeamDriveThemes]] = js.undefined
  var user: js.UndefOr[User] = js.undefined
}

object About {
  @scala.inline
  def apply(
    additionalRoleInfo: js.Array[AboutAdditionalRoleInfo] = null,
    canCreateDrives: js.UndefOr[Boolean] = js.undefined,
    canCreateTeamDrives: js.UndefOr[Boolean] = js.undefined,
    domainSharingPolicy: String = null,
    driveThemes: js.Array[AboutDriveThemes] = null,
    etag: String = null,
    exportFormats: js.Array[AboutExportFormats] = null,
    features: js.Array[AboutFeatures] = null,
    folderColorPalette: js.Array[String] = null,
    importFormats: js.Array[AboutImportFormats] = null,
    isCurrentAppInstalled: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    languageCode: String = null,
    largestChangeId: String = null,
    maxUploadSizes: js.Array[AboutMaxUploadSizes] = null,
    name: String = null,
    permissionId: String = null,
    quotaBytesByService: js.Array[AboutQuotaBytesByService] = null,
    quotaBytesTotal: String = null,
    quotaBytesUsed: String = null,
    quotaBytesUsedAggregate: String = null,
    quotaBytesUsedInTrash: String = null,
    quotaType: String = null,
    remainingChangeIds: String = null,
    rootFolderId: String = null,
    selfLink: String = null,
    teamDriveThemes: js.Array[AboutTeamDriveThemes] = null,
    user: User = null
  ): About = {
    val __obj = js.Dynamic.literal()
    if (additionalRoleInfo != null) __obj.updateDynamic("additionalRoleInfo")(additionalRoleInfo.asInstanceOf[js.Any])
    if (!js.isUndefined(canCreateDrives)) __obj.updateDynamic("canCreateDrives")(canCreateDrives.asInstanceOf[js.Any])
    if (!js.isUndefined(canCreateTeamDrives)) __obj.updateDynamic("canCreateTeamDrives")(canCreateTeamDrives.asInstanceOf[js.Any])
    if (domainSharingPolicy != null) __obj.updateDynamic("domainSharingPolicy")(domainSharingPolicy.asInstanceOf[js.Any])
    if (driveThemes != null) __obj.updateDynamic("driveThemes")(driveThemes.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (exportFormats != null) __obj.updateDynamic("exportFormats")(exportFormats.asInstanceOf[js.Any])
    if (features != null) __obj.updateDynamic("features")(features.asInstanceOf[js.Any])
    if (folderColorPalette != null) __obj.updateDynamic("folderColorPalette")(folderColorPalette.asInstanceOf[js.Any])
    if (importFormats != null) __obj.updateDynamic("importFormats")(importFormats.asInstanceOf[js.Any])
    if (!js.isUndefined(isCurrentAppInstalled)) __obj.updateDynamic("isCurrentAppInstalled")(isCurrentAppInstalled.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    if (largestChangeId != null) __obj.updateDynamic("largestChangeId")(largestChangeId.asInstanceOf[js.Any])
    if (maxUploadSizes != null) __obj.updateDynamic("maxUploadSizes")(maxUploadSizes.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (permissionId != null) __obj.updateDynamic("permissionId")(permissionId.asInstanceOf[js.Any])
    if (quotaBytesByService != null) __obj.updateDynamic("quotaBytesByService")(quotaBytesByService.asInstanceOf[js.Any])
    if (quotaBytesTotal != null) __obj.updateDynamic("quotaBytesTotal")(quotaBytesTotal.asInstanceOf[js.Any])
    if (quotaBytesUsed != null) __obj.updateDynamic("quotaBytesUsed")(quotaBytesUsed.asInstanceOf[js.Any])
    if (quotaBytesUsedAggregate != null) __obj.updateDynamic("quotaBytesUsedAggregate")(quotaBytesUsedAggregate.asInstanceOf[js.Any])
    if (quotaBytesUsedInTrash != null) __obj.updateDynamic("quotaBytesUsedInTrash")(quotaBytesUsedInTrash.asInstanceOf[js.Any])
    if (quotaType != null) __obj.updateDynamic("quotaType")(quotaType.asInstanceOf[js.Any])
    if (remainingChangeIds != null) __obj.updateDynamic("remainingChangeIds")(remainingChangeIds.asInstanceOf[js.Any])
    if (rootFolderId != null) __obj.updateDynamic("rootFolderId")(rootFolderId.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (teamDriveThemes != null) __obj.updateDynamic("teamDriveThemes")(teamDriveThemes.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[About]
  }
}

