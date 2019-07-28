package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File extends js.Object {
  var alternateLink: js.UndefOr[String] = js.undefined
  var appDataContents: js.UndefOr[Boolean] = js.undefined
  var canComment: js.UndefOr[Boolean] = js.undefined
  var canReadRevisions: js.UndefOr[Boolean] = js.undefined
  var capabilities: js.UndefOr[FileCapabilities] = js.undefined
  var copyRequiresWriterPermission: js.UndefOr[Boolean] = js.undefined
  var copyable: js.UndefOr[Boolean] = js.undefined
  var createdDate: js.UndefOr[String] = js.undefined
  var defaultOpenWithLink: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var downloadUrl: js.UndefOr[String] = js.undefined
  var driveId: js.UndefOr[String] = js.undefined
  var editable: js.UndefOr[Boolean] = js.undefined
  var embedLink: js.UndefOr[String] = js.undefined
  var etag: js.UndefOr[String] = js.undefined
  var explicitlyTrashed: js.UndefOr[Boolean] = js.undefined
  var exportLinks: js.UndefOr[js.Object] = js.undefined
  var fileExtension: js.UndefOr[String] = js.undefined
  var fileSize: js.UndefOr[String] = js.undefined
  var folderColorRgb: js.UndefOr[String] = js.undefined
  var fullFileExtension: js.UndefOr[String] = js.undefined
  var hasAugmentedPermissions: js.UndefOr[Boolean] = js.undefined
  var hasThumbnail: js.UndefOr[Boolean] = js.undefined
  var headRevisionId: js.UndefOr[String] = js.undefined
  var iconLink: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var imageMediaMetadata: js.UndefOr[FileImageMediaMetadata] = js.undefined
  var indexableText: js.UndefOr[FileIndexableText] = js.undefined
  var isAppAuthorized: js.UndefOr[Boolean] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var labels: js.UndefOr[FileLabels] = js.undefined
  var lastModifyingUser: js.UndefOr[typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.SchemaNs.User] = js.undefined
  var lastModifyingUserName: js.UndefOr[String] = js.undefined
  var lastViewedByMeDate: js.UndefOr[String] = js.undefined
  var markedViewedByMeDate: js.UndefOr[String] = js.undefined
  var md5Checksum: js.UndefOr[String] = js.undefined
  var mimeType: js.UndefOr[String] = js.undefined
  var modifiedByMeDate: js.UndefOr[String] = js.undefined
  var modifiedDate: js.UndefOr[String] = js.undefined
  var openWithLinks: js.UndefOr[js.Object] = js.undefined
  var originalFilename: js.UndefOr[String] = js.undefined
  var ownedByMe: js.UndefOr[Boolean] = js.undefined
  var ownerNames: js.UndefOr[js.Array[String]] = js.undefined
  var owners: js.UndefOr[
    js.Array[typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.SchemaNs.User]
  ] = js.undefined
  var parents: js.UndefOr[js.Array[ParentReference]] = js.undefined
  var permissionIds: js.UndefOr[js.Array[String]] = js.undefined
  var permissions: js.UndefOr[
    js.Array[typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.SchemaNs.Permission]
  ] = js.undefined
  var properties: js.UndefOr[js.Array[Property]] = js.undefined
  var quotaBytesUsed: js.UndefOr[String] = js.undefined
  var selfLink: js.UndefOr[String] = js.undefined
  var shareable: js.UndefOr[Boolean] = js.undefined
  var shared: js.UndefOr[Boolean] = js.undefined
  var sharedWithMeDate: js.UndefOr[String] = js.undefined
  var sharingUser: js.UndefOr[typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.SchemaNs.User] = js.undefined
  var spaces: js.UndefOr[js.Array[String]] = js.undefined
  var teamDriveId: js.UndefOr[String] = js.undefined
  var thumbnail: js.UndefOr[FileThumbnail] = js.undefined
  var thumbnailLink: js.UndefOr[String] = js.undefined
  var thumbnailVersion: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var trashedDate: js.UndefOr[String] = js.undefined
  var trashingUser: js.UndefOr[typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.SchemaNs.User] = js.undefined
  var userPermission: js.UndefOr[typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.SchemaNs.Permission] = js.undefined
  var version: js.UndefOr[String] = js.undefined
  var videoMediaMetadata: js.UndefOr[FileVideoMediaMetadata] = js.undefined
  var webContentLink: js.UndefOr[String] = js.undefined
  var webViewLink: js.UndefOr[String] = js.undefined
  var writersCanShare: js.UndefOr[Boolean] = js.undefined
}

object File {
  @scala.inline
  def apply(
    alternateLink: String = null,
    appDataContents: js.UndefOr[Boolean] = js.undefined,
    canComment: js.UndefOr[Boolean] = js.undefined,
    canReadRevisions: js.UndefOr[Boolean] = js.undefined,
    capabilities: FileCapabilities = null,
    copyRequiresWriterPermission: js.UndefOr[Boolean] = js.undefined,
    copyable: js.UndefOr[Boolean] = js.undefined,
    createdDate: String = null,
    defaultOpenWithLink: String = null,
    description: String = null,
    downloadUrl: String = null,
    driveId: String = null,
    editable: js.UndefOr[Boolean] = js.undefined,
    embedLink: String = null,
    etag: String = null,
    explicitlyTrashed: js.UndefOr[Boolean] = js.undefined,
    exportLinks: js.Object = null,
    fileExtension: String = null,
    fileSize: String = null,
    folderColorRgb: String = null,
    fullFileExtension: String = null,
    hasAugmentedPermissions: js.UndefOr[Boolean] = js.undefined,
    hasThumbnail: js.UndefOr[Boolean] = js.undefined,
    headRevisionId: String = null,
    iconLink: String = null,
    id: String = null,
    imageMediaMetadata: FileImageMediaMetadata = null,
    indexableText: FileIndexableText = null,
    isAppAuthorized: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    labels: FileLabels = null,
    lastModifyingUser: typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.SchemaNs.User = null,
    lastModifyingUserName: String = null,
    lastViewedByMeDate: String = null,
    markedViewedByMeDate: String = null,
    md5Checksum: String = null,
    mimeType: String = null,
    modifiedByMeDate: String = null,
    modifiedDate: String = null,
    openWithLinks: js.Object = null,
    originalFilename: String = null,
    ownedByMe: js.UndefOr[Boolean] = js.undefined,
    ownerNames: js.Array[String] = null,
    owners: js.Array[typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.SchemaNs.User] = null,
    parents: js.Array[ParentReference] = null,
    permissionIds: js.Array[String] = null,
    permissions: js.Array[typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.SchemaNs.Permission] = null,
    properties: js.Array[Property] = null,
    quotaBytesUsed: String = null,
    selfLink: String = null,
    shareable: js.UndefOr[Boolean] = js.undefined,
    shared: js.UndefOr[Boolean] = js.undefined,
    sharedWithMeDate: String = null,
    sharingUser: typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.SchemaNs.User = null,
    spaces: js.Array[String] = null,
    teamDriveId: String = null,
    thumbnail: FileThumbnail = null,
    thumbnailLink: String = null,
    thumbnailVersion: String = null,
    title: String = null,
    trashedDate: String = null,
    trashingUser: typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.SchemaNs.User = null,
    userPermission: typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.SchemaNs.Permission = null,
    version: String = null,
    videoMediaMetadata: FileVideoMediaMetadata = null,
    webContentLink: String = null,
    webViewLink: String = null,
    writersCanShare: js.UndefOr[Boolean] = js.undefined
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
    if (driveId != null) __obj.updateDynamic("driveId")(driveId)
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

