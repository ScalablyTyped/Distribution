package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait About extends js.Object {
  var additionalRoleInfo: js.UndefOr[js.Array[AboutAdditionalRoleInfo]] = js.undefined
  var canCreateTeamDrives: js.UndefOr[scala.Boolean] = js.undefined
  var domainSharingPolicy: js.UndefOr[java.lang.String] = js.undefined
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var exportFormats: js.UndefOr[js.Array[AboutExportFormats]] = js.undefined
  var features: js.UndefOr[js.Array[AboutFeatures]] = js.undefined
  var folderColorPalette: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var importFormats: js.UndefOr[js.Array[AboutImportFormats]] = js.undefined
  var isCurrentAppInstalled: js.UndefOr[scala.Boolean] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var languageCode: js.UndefOr[java.lang.String] = js.undefined
  var largestChangeId: js.UndefOr[java.lang.String] = js.undefined
  var maxUploadSizes: js.UndefOr[js.Array[AboutMaxUploadSizes]] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var permissionId: js.UndefOr[java.lang.String] = js.undefined
  var quotaBytesByService: js.UndefOr[js.Array[AboutQuotaBytesByService]] = js.undefined
  var quotaBytesTotal: js.UndefOr[java.lang.String] = js.undefined
  var quotaBytesUsed: js.UndefOr[java.lang.String] = js.undefined
  var quotaBytesUsedAggregate: js.UndefOr[java.lang.String] = js.undefined
  var quotaBytesUsedInTrash: js.UndefOr[java.lang.String] = js.undefined
  var quotaType: js.UndefOr[java.lang.String] = js.undefined
  var remainingChangeIds: js.UndefOr[java.lang.String] = js.undefined
  var rootFolderId: js.UndefOr[java.lang.String] = js.undefined
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  var teamDriveThemes: js.UndefOr[js.Array[AboutTeamDriveThemes]] = js.undefined
  var user: js.UndefOr[User] = js.undefined
}

object About {
  @scala.inline
  def apply(
    additionalRoleInfo: js.Array[AboutAdditionalRoleInfo] = null,
    canCreateTeamDrives: js.UndefOr[scala.Boolean] = js.undefined,
    domainSharingPolicy: java.lang.String = null,
    etag: java.lang.String = null,
    exportFormats: js.Array[AboutExportFormats] = null,
    features: js.Array[AboutFeatures] = null,
    folderColorPalette: js.Array[java.lang.String] = null,
    importFormats: js.Array[AboutImportFormats] = null,
    isCurrentAppInstalled: js.UndefOr[scala.Boolean] = js.undefined,
    kind: java.lang.String = null,
    languageCode: java.lang.String = null,
    largestChangeId: java.lang.String = null,
    maxUploadSizes: js.Array[AboutMaxUploadSizes] = null,
    name: java.lang.String = null,
    permissionId: java.lang.String = null,
    quotaBytesByService: js.Array[AboutQuotaBytesByService] = null,
    quotaBytesTotal: java.lang.String = null,
    quotaBytesUsed: java.lang.String = null,
    quotaBytesUsedAggregate: java.lang.String = null,
    quotaBytesUsedInTrash: java.lang.String = null,
    quotaType: java.lang.String = null,
    remainingChangeIds: java.lang.String = null,
    rootFolderId: java.lang.String = null,
    selfLink: java.lang.String = null,
    teamDriveThemes: js.Array[AboutTeamDriveThemes] = null,
    user: User = null
  ): About = {
    val __obj = js.Dynamic.literal()
    if (additionalRoleInfo != null) __obj.updateDynamic("additionalRoleInfo")(additionalRoleInfo)
    if (!js.isUndefined(canCreateTeamDrives)) __obj.updateDynamic("canCreateTeamDrives")(canCreateTeamDrives)
    if (domainSharingPolicy != null) __obj.updateDynamic("domainSharingPolicy")(domainSharingPolicy)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (exportFormats != null) __obj.updateDynamic("exportFormats")(exportFormats)
    if (features != null) __obj.updateDynamic("features")(features)
    if (folderColorPalette != null) __obj.updateDynamic("folderColorPalette")(folderColorPalette)
    if (importFormats != null) __obj.updateDynamic("importFormats")(importFormats)
    if (!js.isUndefined(isCurrentAppInstalled)) __obj.updateDynamic("isCurrentAppInstalled")(isCurrentAppInstalled)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode)
    if (largestChangeId != null) __obj.updateDynamic("largestChangeId")(largestChangeId)
    if (maxUploadSizes != null) __obj.updateDynamic("maxUploadSizes")(maxUploadSizes)
    if (name != null) __obj.updateDynamic("name")(name)
    if (permissionId != null) __obj.updateDynamic("permissionId")(permissionId)
    if (quotaBytesByService != null) __obj.updateDynamic("quotaBytesByService")(quotaBytesByService)
    if (quotaBytesTotal != null) __obj.updateDynamic("quotaBytesTotal")(quotaBytesTotal)
    if (quotaBytesUsed != null) __obj.updateDynamic("quotaBytesUsed")(quotaBytesUsed)
    if (quotaBytesUsedAggregate != null) __obj.updateDynamic("quotaBytesUsedAggregate")(quotaBytesUsedAggregate)
    if (quotaBytesUsedInTrash != null) __obj.updateDynamic("quotaBytesUsedInTrash")(quotaBytesUsedInTrash)
    if (quotaType != null) __obj.updateDynamic("quotaType")(quotaType)
    if (remainingChangeIds != null) __obj.updateDynamic("remainingChangeIds")(remainingChangeIds)
    if (rootFolderId != null) __obj.updateDynamic("rootFolderId")(rootFolderId)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (teamDriveThemes != null) __obj.updateDynamic("teamDriveThemes")(teamDriveThemes)
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[About]
  }
}

