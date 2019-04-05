package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File extends js.Object {
  var alternateLink: js.UndefOr[java.lang.String] = js.undefined
  var appDataContents: js.UndefOr[scala.Boolean] = js.undefined
  var canComment: js.UndefOr[scala.Boolean] = js.undefined
  var canReadRevisions: js.UndefOr[scala.Boolean] = js.undefined
  var capabilities: js.UndefOr[FileCapabilities] = js.undefined
  var copyRequiresWriterPermission: js.UndefOr[scala.Boolean] = js.undefined
  var copyable: js.UndefOr[scala.Boolean] = js.undefined
  var createdDate: js.UndefOr[java.lang.String] = js.undefined
  var defaultOpenWithLink: js.UndefOr[java.lang.String] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var downloadUrl: js.UndefOr[java.lang.String] = js.undefined
  var editable: js.UndefOr[scala.Boolean] = js.undefined
  var embedLink: js.UndefOr[java.lang.String] = js.undefined
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var explicitlyTrashed: js.UndefOr[scala.Boolean] = js.undefined
  var exportLinks: js.UndefOr[js.Object] = js.undefined
  var fileExtension: js.UndefOr[java.lang.String] = js.undefined
  var fileSize: js.UndefOr[java.lang.String] = js.undefined
  var folderColorRgb: js.UndefOr[java.lang.String] = js.undefined
  var fullFileExtension: js.UndefOr[java.lang.String] = js.undefined
  var hasAugmentedPermissions: js.UndefOr[scala.Boolean] = js.undefined
  var hasThumbnail: js.UndefOr[scala.Boolean] = js.undefined
  var headRevisionId: js.UndefOr[java.lang.String] = js.undefined
  var iconLink: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var imageMediaMetadata: js.UndefOr[FileImageMediaMetadata] = js.undefined
  var indexableText: js.UndefOr[FileIndexableText] = js.undefined
  var isAppAuthorized: js.UndefOr[scala.Boolean] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var labels: js.UndefOr[FileLabels] = js.undefined
  var lastModifyingUser: js.UndefOr[User] = js.undefined
  var lastModifyingUserName: js.UndefOr[java.lang.String] = js.undefined
  var lastViewedByMeDate: js.UndefOr[java.lang.String] = js.undefined
  var markedViewedByMeDate: js.UndefOr[java.lang.String] = js.undefined
  var md5Checksum: js.UndefOr[java.lang.String] = js.undefined
  var mimeType: js.UndefOr[java.lang.String] = js.undefined
  var modifiedByMeDate: js.UndefOr[java.lang.String] = js.undefined
  var modifiedDate: js.UndefOr[java.lang.String] = js.undefined
  var openWithLinks: js.UndefOr[js.Object] = js.undefined
  var originalFilename: js.UndefOr[java.lang.String] = js.undefined
  var ownedByMe: js.UndefOr[scala.Boolean] = js.undefined
  var ownerNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var owners: js.UndefOr[js.Array[User]] = js.undefined
  var parents: js.UndefOr[js.Array[ParentReference]] = js.undefined
  var permissionIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var permissions: js.UndefOr[js.Array[Permission]] = js.undefined
  var properties: js.UndefOr[js.Array[Property]] = js.undefined
  var quotaBytesUsed: js.UndefOr[java.lang.String] = js.undefined
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  var shareable: js.UndefOr[scala.Boolean] = js.undefined
  var shared: js.UndefOr[scala.Boolean] = js.undefined
  var sharedWithMeDate: js.UndefOr[java.lang.String] = js.undefined
  var sharingUser: js.UndefOr[User] = js.undefined
  var spaces: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var teamDriveId: js.UndefOr[java.lang.String] = js.undefined
  var thumbnail: js.UndefOr[FileThumbnail] = js.undefined
  var thumbnailLink: js.UndefOr[java.lang.String] = js.undefined
  var thumbnailVersion: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var trashedDate: js.UndefOr[java.lang.String] = js.undefined
  var trashingUser: js.UndefOr[User] = js.undefined
  var userPermission: js.UndefOr[Permission] = js.undefined
  var version: js.UndefOr[java.lang.String] = js.undefined
  var videoMediaMetadata: js.UndefOr[FileVideoMediaMetadata] = js.undefined
  var webContentLink: js.UndefOr[java.lang.String] = js.undefined
  var webViewLink: js.UndefOr[java.lang.String] = js.undefined
  var writersCanShare: js.UndefOr[scala.Boolean] = js.undefined
}

object File {
  @scala.inline
  def apply(
    alternateLink: java.lang.String = null,
    appDataContents: js.UndefOr[scala.Boolean] = js.undefined,
    canComment: js.UndefOr[scala.Boolean] = js.undefined,
    canReadRevisions: js.UndefOr[scala.Boolean] = js.undefined,
    capabilities: FileCapabilities = null,
    copyRequiresWriterPermission: js.UndefOr[scala.Boolean] = js.undefined,
    copyable: js.UndefOr[scala.Boolean] = js.undefined,
    createdDate: java.lang.String = null,
    defaultOpenWithLink: java.lang.String = null,
    description: java.lang.String = null,
    downloadUrl: java.lang.String = null,
    editable: js.UndefOr[scala.Boolean] = js.undefined,
    embedLink: java.lang.String = null,
    etag: java.lang.String = null,
    explicitlyTrashed: js.UndefOr[scala.Boolean] = js.undefined,
    exportLinks: js.Object = null,
    fileExtension: java.lang.String = null,
    fileSize: java.lang.String = null,
    folderColorRgb: java.lang.String = null,
    fullFileExtension: java.lang.String = null,
    hasAugmentedPermissions: js.UndefOr[scala.Boolean] = js.undefined,
    hasThumbnail: js.UndefOr[scala.Boolean] = js.undefined,
    headRevisionId: java.lang.String = null,
    iconLink: java.lang.String = null,
    id: java.lang.String = null,
    imageMediaMetadata: FileImageMediaMetadata = null,
    indexableText: FileIndexableText = null,
    isAppAuthorized: js.UndefOr[scala.Boolean] = js.undefined,
    kind: java.lang.String = null,
    labels: FileLabels = null,
    lastModifyingUser: User = null,
    lastModifyingUserName: java.lang.String = null,
    lastViewedByMeDate: java.lang.String = null,
    markedViewedByMeDate: java.lang.String = null,
    md5Checksum: java.lang.String = null,
    mimeType: java.lang.String = null,
    modifiedByMeDate: java.lang.String = null,
    modifiedDate: java.lang.String = null,
    openWithLinks: js.Object = null,
    originalFilename: java.lang.String = null,
    ownedByMe: js.UndefOr[scala.Boolean] = js.undefined,
    ownerNames: js.Array[java.lang.String] = null,
    owners: js.Array[User] = null,
    parents: js.Array[ParentReference] = null,
    permissionIds: js.Array[java.lang.String] = null,
    permissions: js.Array[Permission] = null,
    properties: js.Array[Property] = null,
    quotaBytesUsed: java.lang.String = null,
    selfLink: java.lang.String = null,
    shareable: js.UndefOr[scala.Boolean] = js.undefined,
    shared: js.UndefOr[scala.Boolean] = js.undefined,
    sharedWithMeDate: java.lang.String = null,
    sharingUser: User = null,
    spaces: js.Array[java.lang.String] = null,
    teamDriveId: java.lang.String = null,
    thumbnail: FileThumbnail = null,
    thumbnailLink: java.lang.String = null,
    thumbnailVersion: java.lang.String = null,
    title: java.lang.String = null,
    trashedDate: java.lang.String = null,
    trashingUser: User = null,
    userPermission: Permission = null,
    version: java.lang.String = null,
    videoMediaMetadata: FileVideoMediaMetadata = null,
    webContentLink: java.lang.String = null,
    webViewLink: java.lang.String = null,
    writersCanShare: js.UndefOr[scala.Boolean] = js.undefined
  ): File = {
    val __obj = js.Dynamic.literal()
    if (alternateLink != null) __obj.updateDynamic("alternateLink")(alternateLink)
    if (!js.isUndefined(appDataContents)) __obj.updateDynamic("appDataContents")(appDataContents)
    if (!js.isUndefined(canComment)) __obj.updateDynamic("canComment")(canComment)
    if (!js.isUndefined(canReadRevisions)) __obj.updateDynamic("canReadRevisions")(canReadRevisions)
    if (capabilities != null) __obj.updateDynamic("capabilities")(capabilities)
    if (!js.isUndefined(copyRequiresWriterPermission)) __obj.updateDynamic("copyRequiresWriterPermission")(copyRequiresWriterPermission)
    if (!js.isUndefined(copyable)) __obj.updateDynamic("copyable")(copyable)
    if (createdDate != null) __obj.updateDynamic("createdDate")(createdDate)
    if (defaultOpenWithLink != null) __obj.updateDynamic("defaultOpenWithLink")(defaultOpenWithLink)
    if (description != null) __obj.updateDynamic("description")(description)
    if (downloadUrl != null) __obj.updateDynamic("downloadUrl")(downloadUrl)
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable)
    if (embedLink != null) __obj.updateDynamic("embedLink")(embedLink)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (!js.isUndefined(explicitlyTrashed)) __obj.updateDynamic("explicitlyTrashed")(explicitlyTrashed)
    if (exportLinks != null) __obj.updateDynamic("exportLinks")(exportLinks)
    if (fileExtension != null) __obj.updateDynamic("fileExtension")(fileExtension)
    if (fileSize != null) __obj.updateDynamic("fileSize")(fileSize)
    if (folderColorRgb != null) __obj.updateDynamic("folderColorRgb")(folderColorRgb)
    if (fullFileExtension != null) __obj.updateDynamic("fullFileExtension")(fullFileExtension)
    if (!js.isUndefined(hasAugmentedPermissions)) __obj.updateDynamic("hasAugmentedPermissions")(hasAugmentedPermissions)
    if (!js.isUndefined(hasThumbnail)) __obj.updateDynamic("hasThumbnail")(hasThumbnail)
    if (headRevisionId != null) __obj.updateDynamic("headRevisionId")(headRevisionId)
    if (iconLink != null) __obj.updateDynamic("iconLink")(iconLink)
    if (id != null) __obj.updateDynamic("id")(id)
    if (imageMediaMetadata != null) __obj.updateDynamic("imageMediaMetadata")(imageMediaMetadata)
    if (indexableText != null) __obj.updateDynamic("indexableText")(indexableText)
    if (!js.isUndefined(isAppAuthorized)) __obj.updateDynamic("isAppAuthorized")(isAppAuthorized)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (lastModifyingUser != null) __obj.updateDynamic("lastModifyingUser")(lastModifyingUser)
    if (lastModifyingUserName != null) __obj.updateDynamic("lastModifyingUserName")(lastModifyingUserName)
    if (lastViewedByMeDate != null) __obj.updateDynamic("lastViewedByMeDate")(lastViewedByMeDate)
    if (markedViewedByMeDate != null) __obj.updateDynamic("markedViewedByMeDate")(markedViewedByMeDate)
    if (md5Checksum != null) __obj.updateDynamic("md5Checksum")(md5Checksum)
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType)
    if (modifiedByMeDate != null) __obj.updateDynamic("modifiedByMeDate")(modifiedByMeDate)
    if (modifiedDate != null) __obj.updateDynamic("modifiedDate")(modifiedDate)
    if (openWithLinks != null) __obj.updateDynamic("openWithLinks")(openWithLinks)
    if (originalFilename != null) __obj.updateDynamic("originalFilename")(originalFilename)
    if (!js.isUndefined(ownedByMe)) __obj.updateDynamic("ownedByMe")(ownedByMe)
    if (ownerNames != null) __obj.updateDynamic("ownerNames")(ownerNames)
    if (owners != null) __obj.updateDynamic("owners")(owners)
    if (parents != null) __obj.updateDynamic("parents")(parents)
    if (permissionIds != null) __obj.updateDynamic("permissionIds")(permissionIds)
    if (permissions != null) __obj.updateDynamic("permissions")(permissions)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (quotaBytesUsed != null) __obj.updateDynamic("quotaBytesUsed")(quotaBytesUsed)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (!js.isUndefined(shareable)) __obj.updateDynamic("shareable")(shareable)
    if (!js.isUndefined(shared)) __obj.updateDynamic("shared")(shared)
    if (sharedWithMeDate != null) __obj.updateDynamic("sharedWithMeDate")(sharedWithMeDate)
    if (sharingUser != null) __obj.updateDynamic("sharingUser")(sharingUser)
    if (spaces != null) __obj.updateDynamic("spaces")(spaces)
    if (teamDriveId != null) __obj.updateDynamic("teamDriveId")(teamDriveId)
    if (thumbnail != null) __obj.updateDynamic("thumbnail")(thumbnail)
    if (thumbnailLink != null) __obj.updateDynamic("thumbnailLink")(thumbnailLink)
    if (thumbnailVersion != null) __obj.updateDynamic("thumbnailVersion")(thumbnailVersion)
    if (title != null) __obj.updateDynamic("title")(title)
    if (trashedDate != null) __obj.updateDynamic("trashedDate")(trashedDate)
    if (trashingUser != null) __obj.updateDynamic("trashingUser")(trashingUser)
    if (userPermission != null) __obj.updateDynamic("userPermission")(userPermission)
    if (version != null) __obj.updateDynamic("version")(version)
    if (videoMediaMetadata != null) __obj.updateDynamic("videoMediaMetadata")(videoMediaMetadata)
    if (webContentLink != null) __obj.updateDynamic("webContentLink")(webContentLink)
    if (webViewLink != null) __obj.updateDynamic("webViewLink")(webViewLink)
    if (!js.isUndefined(writersCanShare)) __obj.updateDynamic("writersCanShare")(writersCanShare)
    __obj.asInstanceOf[File]
  }
}

