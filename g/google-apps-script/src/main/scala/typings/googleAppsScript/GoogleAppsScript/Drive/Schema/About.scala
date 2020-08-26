package typings.googleAppsScript.GoogleAppsScript.Drive.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait About extends js.Object {
  var additionalRoleInfo: js.UndefOr[js.Array[AboutAdditionalRoleInfo]] = js.native
  var canCreateDrives: js.UndefOr[Boolean] = js.native
  var canCreateTeamDrives: js.UndefOr[Boolean] = js.native
  var domainSharingPolicy: js.UndefOr[String] = js.native
  var driveThemes: js.UndefOr[js.Array[AboutDriveThemes]] = js.native
  var etag: js.UndefOr[String] = js.native
  var exportFormats: js.UndefOr[js.Array[AboutExportFormats]] = js.native
  var features: js.UndefOr[js.Array[AboutFeatures]] = js.native
  var folderColorPalette: js.UndefOr[js.Array[String]] = js.native
  var importFormats: js.UndefOr[js.Array[AboutImportFormats]] = js.native
  var isCurrentAppInstalled: js.UndefOr[Boolean] = js.native
  var kind: js.UndefOr[String] = js.native
  var languageCode: js.UndefOr[String] = js.native
  var largestChangeId: js.UndefOr[String] = js.native
  var maxUploadSizes: js.UndefOr[js.Array[AboutMaxUploadSizes]] = js.native
  var name: js.UndefOr[String] = js.native
  var permissionId: js.UndefOr[String] = js.native
  var quotaBytesByService: js.UndefOr[js.Array[AboutQuotaBytesByService]] = js.native
  var quotaBytesTotal: js.UndefOr[String] = js.native
  var quotaBytesUsed: js.UndefOr[String] = js.native
  var quotaBytesUsedAggregate: js.UndefOr[String] = js.native
  var quotaBytesUsedInTrash: js.UndefOr[String] = js.native
  var quotaType: js.UndefOr[String] = js.native
  var remainingChangeIds: js.UndefOr[String] = js.native
  var rootFolderId: js.UndefOr[String] = js.native
  var selfLink: js.UndefOr[String] = js.native
  var teamDriveThemes: js.UndefOr[js.Array[AboutTeamDriveThemes]] = js.native
  var user: js.UndefOr[User] = js.native
}

object About {
  @scala.inline
  def apply(): About = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[About]
  }
  @scala.inline
  implicit class AboutOps[Self <: About] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdditionalRoleInfoVarargs(value: AboutAdditionalRoleInfo*): Self = this.set("additionalRoleInfo", js.Array(value :_*))
    @scala.inline
    def setAdditionalRoleInfo(value: js.Array[AboutAdditionalRoleInfo]): Self = this.set("additionalRoleInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalRoleInfo: Self = this.set("additionalRoleInfo", js.undefined)
    @scala.inline
    def setCanCreateDrives(value: Boolean): Self = this.set("canCreateDrives", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanCreateDrives: Self = this.set("canCreateDrives", js.undefined)
    @scala.inline
    def setCanCreateTeamDrives(value: Boolean): Self = this.set("canCreateTeamDrives", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanCreateTeamDrives: Self = this.set("canCreateTeamDrives", js.undefined)
    @scala.inline
    def setDomainSharingPolicy(value: String): Self = this.set("domainSharingPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainSharingPolicy: Self = this.set("domainSharingPolicy", js.undefined)
    @scala.inline
    def setDriveThemesVarargs(value: AboutDriveThemes*): Self = this.set("driveThemes", js.Array(value :_*))
    @scala.inline
    def setDriveThemes(value: js.Array[AboutDriveThemes]): Self = this.set("driveThemes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDriveThemes: Self = this.set("driveThemes", js.undefined)
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setExportFormatsVarargs(value: AboutExportFormats*): Self = this.set("exportFormats", js.Array(value :_*))
    @scala.inline
    def setExportFormats(value: js.Array[AboutExportFormats]): Self = this.set("exportFormats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExportFormats: Self = this.set("exportFormats", js.undefined)
    @scala.inline
    def setFeaturesVarargs(value: AboutFeatures*): Self = this.set("features", js.Array(value :_*))
    @scala.inline
    def setFeatures(value: js.Array[AboutFeatures]): Self = this.set("features", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatures: Self = this.set("features", js.undefined)
    @scala.inline
    def setFolderColorPaletteVarargs(value: String*): Self = this.set("folderColorPalette", js.Array(value :_*))
    @scala.inline
    def setFolderColorPalette(value: js.Array[String]): Self = this.set("folderColorPalette", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFolderColorPalette: Self = this.set("folderColorPalette", js.undefined)
    @scala.inline
    def setImportFormatsVarargs(value: AboutImportFormats*): Self = this.set("importFormats", js.Array(value :_*))
    @scala.inline
    def setImportFormats(value: js.Array[AboutImportFormats]): Self = this.set("importFormats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImportFormats: Self = this.set("importFormats", js.undefined)
    @scala.inline
    def setIsCurrentAppInstalled(value: Boolean): Self = this.set("isCurrentAppInstalled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsCurrentAppInstalled: Self = this.set("isCurrentAppInstalled", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLanguageCode(value: String): Self = this.set("languageCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguageCode: Self = this.set("languageCode", js.undefined)
    @scala.inline
    def setLargestChangeId(value: String): Self = this.set("largestChangeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLargestChangeId: Self = this.set("largestChangeId", js.undefined)
    @scala.inline
    def setMaxUploadSizesVarargs(value: AboutMaxUploadSizes*): Self = this.set("maxUploadSizes", js.Array(value :_*))
    @scala.inline
    def setMaxUploadSizes(value: js.Array[AboutMaxUploadSizes]): Self = this.set("maxUploadSizes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxUploadSizes: Self = this.set("maxUploadSizes", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPermissionId(value: String): Self = this.set("permissionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermissionId: Self = this.set("permissionId", js.undefined)
    @scala.inline
    def setQuotaBytesByServiceVarargs(value: AboutQuotaBytesByService*): Self = this.set("quotaBytesByService", js.Array(value :_*))
    @scala.inline
    def setQuotaBytesByService(value: js.Array[AboutQuotaBytesByService]): Self = this.set("quotaBytesByService", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuotaBytesByService: Self = this.set("quotaBytesByService", js.undefined)
    @scala.inline
    def setQuotaBytesTotal(value: String): Self = this.set("quotaBytesTotal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuotaBytesTotal: Self = this.set("quotaBytesTotal", js.undefined)
    @scala.inline
    def setQuotaBytesUsed(value: String): Self = this.set("quotaBytesUsed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuotaBytesUsed: Self = this.set("quotaBytesUsed", js.undefined)
    @scala.inline
    def setQuotaBytesUsedAggregate(value: String): Self = this.set("quotaBytesUsedAggregate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuotaBytesUsedAggregate: Self = this.set("quotaBytesUsedAggregate", js.undefined)
    @scala.inline
    def setQuotaBytesUsedInTrash(value: String): Self = this.set("quotaBytesUsedInTrash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuotaBytesUsedInTrash: Self = this.set("quotaBytesUsedInTrash", js.undefined)
    @scala.inline
    def setQuotaType(value: String): Self = this.set("quotaType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuotaType: Self = this.set("quotaType", js.undefined)
    @scala.inline
    def setRemainingChangeIds(value: String): Self = this.set("remainingChangeIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemainingChangeIds: Self = this.set("remainingChangeIds", js.undefined)
    @scala.inline
    def setRootFolderId(value: String): Self = this.set("rootFolderId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootFolderId: Self = this.set("rootFolderId", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    @scala.inline
    def setTeamDriveThemesVarargs(value: AboutTeamDriveThemes*): Self = this.set("teamDriveThemes", js.Array(value :_*))
    @scala.inline
    def setTeamDriveThemes(value: js.Array[AboutTeamDriveThemes]): Self = this.set("teamDriveThemes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTeamDriveThemes: Self = this.set("teamDriveThemes", js.undefined)
    @scala.inline
    def setUser(value: User): Self = this.set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
  
}

