package typings.googleAppsScript.GoogleAppsScript.Drive.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait File extends js.Object {
  var alternateLink: js.UndefOr[String] = js.native
  var appDataContents: js.UndefOr[Boolean] = js.native
  var canComment: js.UndefOr[Boolean] = js.native
  var canReadRevisions: js.UndefOr[Boolean] = js.native
  var capabilities: js.UndefOr[FileCapabilities] = js.native
  var copyRequiresWriterPermission: js.UndefOr[Boolean] = js.native
  var copyable: js.UndefOr[Boolean] = js.native
  var createdDate: js.UndefOr[String] = js.native
  var defaultOpenWithLink: js.UndefOr[String] = js.native
  var description: js.UndefOr[String] = js.native
  var downloadUrl: js.UndefOr[String] = js.native
  var driveId: js.UndefOr[String] = js.native
  var editable: js.UndefOr[Boolean] = js.native
  var embedLink: js.UndefOr[String] = js.native
  var etag: js.UndefOr[String] = js.native
  var explicitlyTrashed: js.UndefOr[Boolean] = js.native
  var exportLinks: js.UndefOr[js.Object] = js.native
  var fileExtension: js.UndefOr[String] = js.native
  var fileSize: js.UndefOr[String] = js.native
  var folderColorRgb: js.UndefOr[String] = js.native
  var fullFileExtension: js.UndefOr[String] = js.native
  var hasAugmentedPermissions: js.UndefOr[Boolean] = js.native
  var hasThumbnail: js.UndefOr[Boolean] = js.native
  var headRevisionId: js.UndefOr[String] = js.native
  var iconLink: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var imageMediaMetadata: js.UndefOr[FileImageMediaMetadata] = js.native
  var indexableText: js.UndefOr[FileIndexableText] = js.native
  var isAppAuthorized: js.UndefOr[Boolean] = js.native
  var kind: js.UndefOr[String] = js.native
  var labels: js.UndefOr[FileLabels] = js.native
  var lastModifyingUser: js.UndefOr[User] = js.native
  var lastModifyingUserName: js.UndefOr[String] = js.native
  var lastViewedByMeDate: js.UndefOr[String] = js.native
  var markedViewedByMeDate: js.UndefOr[String] = js.native
  var md5Checksum: js.UndefOr[String] = js.native
  var mimeType: js.UndefOr[String] = js.native
  var modifiedByMeDate: js.UndefOr[String] = js.native
  var modifiedDate: js.UndefOr[String] = js.native
  var openWithLinks: js.UndefOr[js.Object] = js.native
  var originalFilename: js.UndefOr[String] = js.native
  var ownedByMe: js.UndefOr[Boolean] = js.native
  var ownerNames: js.UndefOr[js.Array[String]] = js.native
  var owners: js.UndefOr[js.Array[User]] = js.native
  var parents: js.UndefOr[js.Array[ParentReference]] = js.native
  var permissionIds: js.UndefOr[js.Array[String]] = js.native
  var permissions: js.UndefOr[js.Array[Permission]] = js.native
  var properties: js.UndefOr[js.Array[Property]] = js.native
  var quotaBytesUsed: js.UndefOr[String] = js.native
  var selfLink: js.UndefOr[String] = js.native
  var shareable: js.UndefOr[Boolean] = js.native
  var shared: js.UndefOr[Boolean] = js.native
  var sharedWithMeDate: js.UndefOr[String] = js.native
  var sharingUser: js.UndefOr[User] = js.native
  var spaces: js.UndefOr[js.Array[String]] = js.native
  var teamDriveId: js.UndefOr[String] = js.native
  var thumbnail: js.UndefOr[FileThumbnail] = js.native
  var thumbnailLink: js.UndefOr[String] = js.native
  var thumbnailVersion: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  var trashedDate: js.UndefOr[String] = js.native
  var trashingUser: js.UndefOr[User] = js.native
  var userPermission: js.UndefOr[Permission] = js.native
  var version: js.UndefOr[String] = js.native
  var videoMediaMetadata: js.UndefOr[FileVideoMediaMetadata] = js.native
  var webContentLink: js.UndefOr[String] = js.native
  var webViewLink: js.UndefOr[String] = js.native
  var writersCanShare: js.UndefOr[Boolean] = js.native
}

object File {
  @scala.inline
  def apply(): File = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[File]
  }
  @scala.inline
  implicit class FileOps[Self <: File] (val x: Self) extends AnyVal {
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
    def setAlternateLink(value: String): Self = this.set("alternateLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlternateLink: Self = this.set("alternateLink", js.undefined)
    @scala.inline
    def setAppDataContents(value: Boolean): Self = this.set("appDataContents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppDataContents: Self = this.set("appDataContents", js.undefined)
    @scala.inline
    def setCanComment(value: Boolean): Self = this.set("canComment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanComment: Self = this.set("canComment", js.undefined)
    @scala.inline
    def setCanReadRevisions(value: Boolean): Self = this.set("canReadRevisions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanReadRevisions: Self = this.set("canReadRevisions", js.undefined)
    @scala.inline
    def setCapabilities(value: FileCapabilities): Self = this.set("capabilities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapabilities: Self = this.set("capabilities", js.undefined)
    @scala.inline
    def setCopyRequiresWriterPermission(value: Boolean): Self = this.set("copyRequiresWriterPermission", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopyRequiresWriterPermission: Self = this.set("copyRequiresWriterPermission", js.undefined)
    @scala.inline
    def setCopyable(value: Boolean): Self = this.set("copyable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopyable: Self = this.set("copyable", js.undefined)
    @scala.inline
    def setCreatedDate(value: String): Self = this.set("createdDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedDate: Self = this.set("createdDate", js.undefined)
    @scala.inline
    def setDefaultOpenWithLink(value: String): Self = this.set("defaultOpenWithLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultOpenWithLink: Self = this.set("defaultOpenWithLink", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDownloadUrl(value: String): Self = this.set("downloadUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDownloadUrl: Self = this.set("downloadUrl", js.undefined)
    @scala.inline
    def setDriveId(value: String): Self = this.set("driveId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDriveId: Self = this.set("driveId", js.undefined)
    @scala.inline
    def setEditable(value: Boolean): Self = this.set("editable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditable: Self = this.set("editable", js.undefined)
    @scala.inline
    def setEmbedLink(value: String): Self = this.set("embedLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmbedLink: Self = this.set("embedLink", js.undefined)
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setExplicitlyTrashed(value: Boolean): Self = this.set("explicitlyTrashed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExplicitlyTrashed: Self = this.set("explicitlyTrashed", js.undefined)
    @scala.inline
    def setExportLinks(value: js.Object): Self = this.set("exportLinks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExportLinks: Self = this.set("exportLinks", js.undefined)
    @scala.inline
    def setFileExtension(value: String): Self = this.set("fileExtension", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileExtension: Self = this.set("fileExtension", js.undefined)
    @scala.inline
    def setFileSize(value: String): Self = this.set("fileSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileSize: Self = this.set("fileSize", js.undefined)
    @scala.inline
    def setFolderColorRgb(value: String): Self = this.set("folderColorRgb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFolderColorRgb: Self = this.set("folderColorRgb", js.undefined)
    @scala.inline
    def setFullFileExtension(value: String): Self = this.set("fullFileExtension", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullFileExtension: Self = this.set("fullFileExtension", js.undefined)
    @scala.inline
    def setHasAugmentedPermissions(value: Boolean): Self = this.set("hasAugmentedPermissions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasAugmentedPermissions: Self = this.set("hasAugmentedPermissions", js.undefined)
    @scala.inline
    def setHasThumbnail(value: Boolean): Self = this.set("hasThumbnail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasThumbnail: Self = this.set("hasThumbnail", js.undefined)
    @scala.inline
    def setHeadRevisionId(value: String): Self = this.set("headRevisionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeadRevisionId: Self = this.set("headRevisionId", js.undefined)
    @scala.inline
    def setIconLink(value: String): Self = this.set("iconLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconLink: Self = this.set("iconLink", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setImageMediaMetadata(value: FileImageMediaMetadata): Self = this.set("imageMediaMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageMediaMetadata: Self = this.set("imageMediaMetadata", js.undefined)
    @scala.inline
    def setIndexableText(value: FileIndexableText): Self = this.set("indexableText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndexableText: Self = this.set("indexableText", js.undefined)
    @scala.inline
    def setIsAppAuthorized(value: Boolean): Self = this.set("isAppAuthorized", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsAppAuthorized: Self = this.set("isAppAuthorized", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLabels(value: FileLabels): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setLastModifyingUser(value: User): Self = this.set("lastModifyingUser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifyingUser: Self = this.set("lastModifyingUser", js.undefined)
    @scala.inline
    def setLastModifyingUserName(value: String): Self = this.set("lastModifyingUserName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifyingUserName: Self = this.set("lastModifyingUserName", js.undefined)
    @scala.inline
    def setLastViewedByMeDate(value: String): Self = this.set("lastViewedByMeDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastViewedByMeDate: Self = this.set("lastViewedByMeDate", js.undefined)
    @scala.inline
    def setMarkedViewedByMeDate(value: String): Self = this.set("markedViewedByMeDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkedViewedByMeDate: Self = this.set("markedViewedByMeDate", js.undefined)
    @scala.inline
    def setMd5Checksum(value: String): Self = this.set("md5Checksum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMd5Checksum: Self = this.set("md5Checksum", js.undefined)
    @scala.inline
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMimeType: Self = this.set("mimeType", js.undefined)
    @scala.inline
    def setModifiedByMeDate(value: String): Self = this.set("modifiedByMeDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifiedByMeDate: Self = this.set("modifiedByMeDate", js.undefined)
    @scala.inline
    def setModifiedDate(value: String): Self = this.set("modifiedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifiedDate: Self = this.set("modifiedDate", js.undefined)
    @scala.inline
    def setOpenWithLinks(value: js.Object): Self = this.set("openWithLinks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenWithLinks: Self = this.set("openWithLinks", js.undefined)
    @scala.inline
    def setOriginalFilename(value: String): Self = this.set("originalFilename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalFilename: Self = this.set("originalFilename", js.undefined)
    @scala.inline
    def setOwnedByMe(value: Boolean): Self = this.set("ownedByMe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwnedByMe: Self = this.set("ownedByMe", js.undefined)
    @scala.inline
    def setOwnerNamesVarargs(value: String*): Self = this.set("ownerNames", js.Array(value :_*))
    @scala.inline
    def setOwnerNames(value: js.Array[String]): Self = this.set("ownerNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwnerNames: Self = this.set("ownerNames", js.undefined)
    @scala.inline
    def setOwnersVarargs(value: User*): Self = this.set("owners", js.Array(value :_*))
    @scala.inline
    def setOwners(value: js.Array[User]): Self = this.set("owners", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwners: Self = this.set("owners", js.undefined)
    @scala.inline
    def setParentsVarargs(value: ParentReference*): Self = this.set("parents", js.Array(value :_*))
    @scala.inline
    def setParents(value: js.Array[ParentReference]): Self = this.set("parents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParents: Self = this.set("parents", js.undefined)
    @scala.inline
    def setPermissionIdsVarargs(value: String*): Self = this.set("permissionIds", js.Array(value :_*))
    @scala.inline
    def setPermissionIds(value: js.Array[String]): Self = this.set("permissionIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermissionIds: Self = this.set("permissionIds", js.undefined)
    @scala.inline
    def setPermissionsVarargs(value: Permission*): Self = this.set("permissions", js.Array(value :_*))
    @scala.inline
    def setPermissions(value: js.Array[Permission]): Self = this.set("permissions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermissions: Self = this.set("permissions", js.undefined)
    @scala.inline
    def setPropertiesVarargs(value: Property*): Self = this.set("properties", js.Array(value :_*))
    @scala.inline
    def setProperties(value: js.Array[Property]): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    @scala.inline
    def setQuotaBytesUsed(value: String): Self = this.set("quotaBytesUsed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuotaBytesUsed: Self = this.set("quotaBytesUsed", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    @scala.inline
    def setShareable(value: Boolean): Self = this.set("shareable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShareable: Self = this.set("shareable", js.undefined)
    @scala.inline
    def setShared(value: Boolean): Self = this.set("shared", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShared: Self = this.set("shared", js.undefined)
    @scala.inline
    def setSharedWithMeDate(value: String): Self = this.set("sharedWithMeDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSharedWithMeDate: Self = this.set("sharedWithMeDate", js.undefined)
    @scala.inline
    def setSharingUser(value: User): Self = this.set("sharingUser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSharingUser: Self = this.set("sharingUser", js.undefined)
    @scala.inline
    def setSpacesVarargs(value: String*): Self = this.set("spaces", js.Array(value :_*))
    @scala.inline
    def setSpaces(value: js.Array[String]): Self = this.set("spaces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpaces: Self = this.set("spaces", js.undefined)
    @scala.inline
    def setTeamDriveId(value: String): Self = this.set("teamDriveId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTeamDriveId: Self = this.set("teamDriveId", js.undefined)
    @scala.inline
    def setThumbnail(value: FileThumbnail): Self = this.set("thumbnail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbnail: Self = this.set("thumbnail", js.undefined)
    @scala.inline
    def setThumbnailLink(value: String): Self = this.set("thumbnailLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbnailLink: Self = this.set("thumbnailLink", js.undefined)
    @scala.inline
    def setThumbnailVersion(value: String): Self = this.set("thumbnailVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbnailVersion: Self = this.set("thumbnailVersion", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTrashedDate(value: String): Self = this.set("trashedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrashedDate: Self = this.set("trashedDate", js.undefined)
    @scala.inline
    def setTrashingUser(value: User): Self = this.set("trashingUser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrashingUser: Self = this.set("trashingUser", js.undefined)
    @scala.inline
    def setUserPermission(value: Permission): Self = this.set("userPermission", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserPermission: Self = this.set("userPermission", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    @scala.inline
    def setVideoMediaMetadata(value: FileVideoMediaMetadata): Self = this.set("videoMediaMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoMediaMetadata: Self = this.set("videoMediaMetadata", js.undefined)
    @scala.inline
    def setWebContentLink(value: String): Self = this.set("webContentLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebContentLink: Self = this.set("webContentLink", js.undefined)
    @scala.inline
    def setWebViewLink(value: String): Self = this.set("webViewLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebViewLink: Self = this.set("webViewLink", js.undefined)
    @scala.inline
    def setWritersCanShare(value: Boolean): Self = this.set("writersCanShare", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWritersCanShare: Self = this.set("writersCanShare", js.undefined)
  }
  
}

