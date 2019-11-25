package typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema

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
  var lastModifyingUser: js.UndefOr[typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.User] = js.undefined
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
  var owners: js.UndefOr[js.Array[typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.User]] = js.undefined
  var parents: js.UndefOr[js.Array[ParentReference]] = js.undefined
  var permissionIds: js.UndefOr[js.Array[String]] = js.undefined
  var permissions: js.UndefOr[
    js.Array[typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.Permission]
  ] = js.undefined
  var properties: js.UndefOr[js.Array[Property]] = js.undefined
  var quotaBytesUsed: js.UndefOr[String] = js.undefined
  var selfLink: js.UndefOr[String] = js.undefined
  var shareable: js.UndefOr[Boolean] = js.undefined
  var shared: js.UndefOr[Boolean] = js.undefined
  var sharedWithMeDate: js.UndefOr[String] = js.undefined
  var sharingUser: js.UndefOr[typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.User] = js.undefined
  var spaces: js.UndefOr[js.Array[String]] = js.undefined
  var teamDriveId: js.UndefOr[String] = js.undefined
  var thumbnail: js.UndefOr[FileThumbnail] = js.undefined
  var thumbnailLink: js.UndefOr[String] = js.undefined
  var thumbnailVersion: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var trashedDate: js.UndefOr[String] = js.undefined
  var trashingUser: js.UndefOr[typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.User] = js.undefined
  var userPermission: js.UndefOr[typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.Permission] = js.undefined
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
    lastModifyingUser: typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.User = null,
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
    owners: js.Array[typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.User] = null,
    parents: js.Array[ParentReference] = null,
    permissionIds: js.Array[String] = null,
    permissions: js.Array[typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.Permission] = null,
    properties: js.Array[Property] = null,
    quotaBytesUsed: String = null,
    selfLink: String = null,
    shareable: js.UndefOr[Boolean] = js.undefined,
    shared: js.UndefOr[Boolean] = js.undefined,
    sharedWithMeDate: String = null,
    sharingUser: typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.User = null,
    spaces: js.Array[String] = null,
    teamDriveId: String = null,
    thumbnail: FileThumbnail = null,
    thumbnailLink: String = null,
    thumbnailVersion: String = null,
    title: String = null,
    trashedDate: String = null,
    trashingUser: typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.User = null,
    userPermission: typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.Permission = null,
    version: String = null,
    videoMediaMetadata: FileVideoMediaMetadata = null,
    webContentLink: String = null,
    webViewLink: String = null,
    writersCanShare: js.UndefOr[Boolean] = js.undefined
  ): File = {
    val __obj = js.Dynamic.literal()
    if (alternateLink != null) __obj.updateDynamic("alternateLink")(alternateLink.asInstanceOf[js.Any])
    if (!js.isUndefined(appDataContents)) __obj.updateDynamic("appDataContents")(appDataContents.asInstanceOf[js.Any])
    if (!js.isUndefined(canComment)) __obj.updateDynamic("canComment")(canComment.asInstanceOf[js.Any])
    if (!js.isUndefined(canReadRevisions)) __obj.updateDynamic("canReadRevisions")(canReadRevisions.asInstanceOf[js.Any])
    if (capabilities != null) __obj.updateDynamic("capabilities")(capabilities.asInstanceOf[js.Any])
    if (!js.isUndefined(copyRequiresWriterPermission)) __obj.updateDynamic("copyRequiresWriterPermission")(copyRequiresWriterPermission.asInstanceOf[js.Any])
    if (!js.isUndefined(copyable)) __obj.updateDynamic("copyable")(copyable.asInstanceOf[js.Any])
    if (createdDate != null) __obj.updateDynamic("createdDate")(createdDate.asInstanceOf[js.Any])
    if (defaultOpenWithLink != null) __obj.updateDynamic("defaultOpenWithLink")(defaultOpenWithLink.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (downloadUrl != null) __obj.updateDynamic("downloadUrl")(downloadUrl.asInstanceOf[js.Any])
    if (driveId != null) __obj.updateDynamic("driveId")(driveId.asInstanceOf[js.Any])
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    if (embedLink != null) __obj.updateDynamic("embedLink")(embedLink.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (!js.isUndefined(explicitlyTrashed)) __obj.updateDynamic("explicitlyTrashed")(explicitlyTrashed.asInstanceOf[js.Any])
    if (exportLinks != null) __obj.updateDynamic("exportLinks")(exportLinks.asInstanceOf[js.Any])
    if (fileExtension != null) __obj.updateDynamic("fileExtension")(fileExtension.asInstanceOf[js.Any])
    if (fileSize != null) __obj.updateDynamic("fileSize")(fileSize.asInstanceOf[js.Any])
    if (folderColorRgb != null) __obj.updateDynamic("folderColorRgb")(folderColorRgb.asInstanceOf[js.Any])
    if (fullFileExtension != null) __obj.updateDynamic("fullFileExtension")(fullFileExtension.asInstanceOf[js.Any])
    if (!js.isUndefined(hasAugmentedPermissions)) __obj.updateDynamic("hasAugmentedPermissions")(hasAugmentedPermissions.asInstanceOf[js.Any])
    if (!js.isUndefined(hasThumbnail)) __obj.updateDynamic("hasThumbnail")(hasThumbnail.asInstanceOf[js.Any])
    if (headRevisionId != null) __obj.updateDynamic("headRevisionId")(headRevisionId.asInstanceOf[js.Any])
    if (iconLink != null) __obj.updateDynamic("iconLink")(iconLink.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (imageMediaMetadata != null) __obj.updateDynamic("imageMediaMetadata")(imageMediaMetadata.asInstanceOf[js.Any])
    if (indexableText != null) __obj.updateDynamic("indexableText")(indexableText.asInstanceOf[js.Any])
    if (!js.isUndefined(isAppAuthorized)) __obj.updateDynamic("isAppAuthorized")(isAppAuthorized.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (lastModifyingUser != null) __obj.updateDynamic("lastModifyingUser")(lastModifyingUser.asInstanceOf[js.Any])
    if (lastModifyingUserName != null) __obj.updateDynamic("lastModifyingUserName")(lastModifyingUserName.asInstanceOf[js.Any])
    if (lastViewedByMeDate != null) __obj.updateDynamic("lastViewedByMeDate")(lastViewedByMeDate.asInstanceOf[js.Any])
    if (markedViewedByMeDate != null) __obj.updateDynamic("markedViewedByMeDate")(markedViewedByMeDate.asInstanceOf[js.Any])
    if (md5Checksum != null) __obj.updateDynamic("md5Checksum")(md5Checksum.asInstanceOf[js.Any])
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    if (modifiedByMeDate != null) __obj.updateDynamic("modifiedByMeDate")(modifiedByMeDate.asInstanceOf[js.Any])
    if (modifiedDate != null) __obj.updateDynamic("modifiedDate")(modifiedDate.asInstanceOf[js.Any])
    if (openWithLinks != null) __obj.updateDynamic("openWithLinks")(openWithLinks.asInstanceOf[js.Any])
    if (originalFilename != null) __obj.updateDynamic("originalFilename")(originalFilename.asInstanceOf[js.Any])
    if (!js.isUndefined(ownedByMe)) __obj.updateDynamic("ownedByMe")(ownedByMe.asInstanceOf[js.Any])
    if (ownerNames != null) __obj.updateDynamic("ownerNames")(ownerNames.asInstanceOf[js.Any])
    if (owners != null) __obj.updateDynamic("owners")(owners.asInstanceOf[js.Any])
    if (parents != null) __obj.updateDynamic("parents")(parents.asInstanceOf[js.Any])
    if (permissionIds != null) __obj.updateDynamic("permissionIds")(permissionIds.asInstanceOf[js.Any])
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (quotaBytesUsed != null) __obj.updateDynamic("quotaBytesUsed")(quotaBytesUsed.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (!js.isUndefined(shareable)) __obj.updateDynamic("shareable")(shareable.asInstanceOf[js.Any])
    if (!js.isUndefined(shared)) __obj.updateDynamic("shared")(shared.asInstanceOf[js.Any])
    if (sharedWithMeDate != null) __obj.updateDynamic("sharedWithMeDate")(sharedWithMeDate.asInstanceOf[js.Any])
    if (sharingUser != null) __obj.updateDynamic("sharingUser")(sharingUser.asInstanceOf[js.Any])
    if (spaces != null) __obj.updateDynamic("spaces")(spaces.asInstanceOf[js.Any])
    if (teamDriveId != null) __obj.updateDynamic("teamDriveId")(teamDriveId.asInstanceOf[js.Any])
    if (thumbnail != null) __obj.updateDynamic("thumbnail")(thumbnail.asInstanceOf[js.Any])
    if (thumbnailLink != null) __obj.updateDynamic("thumbnailLink")(thumbnailLink.asInstanceOf[js.Any])
    if (thumbnailVersion != null) __obj.updateDynamic("thumbnailVersion")(thumbnailVersion.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (trashedDate != null) __obj.updateDynamic("trashedDate")(trashedDate.asInstanceOf[js.Any])
    if (trashingUser != null) __obj.updateDynamic("trashingUser")(trashingUser.asInstanceOf[js.Any])
    if (userPermission != null) __obj.updateDynamic("userPermission")(userPermission.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (videoMediaMetadata != null) __obj.updateDynamic("videoMediaMetadata")(videoMediaMetadata.asInstanceOf[js.Any])
    if (webContentLink != null) __obj.updateDynamic("webContentLink")(webContentLink.asInstanceOf[js.Any])
    if (webViewLink != null) __obj.updateDynamic("webViewLink")(webViewLink.asInstanceOf[js.Any])
    if (!js.isUndefined(writersCanShare)) __obj.updateDynamic("writersCanShare")(writersCanShare.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
}

