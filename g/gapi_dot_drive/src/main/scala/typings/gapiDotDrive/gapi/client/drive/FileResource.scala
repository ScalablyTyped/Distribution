package typings.gapiDotDrive.gapi.client.drive

import typings.gapiDotDrive.Anon_Aperture
import typings.gapiDotDrive.Anon_CanAddChildren
import typings.gapiDotDrive.Anon_DisplayName
import typings.gapiDotDrive.Anon_DurationMillis
import typings.gapiDotDrive.Anon_Hidden
import typings.gapiDotDrive.Anon_Image
import typings.gapiDotDrive.Anon_Text
import typings.gapiDotDrive.gapiDotDriveStrings.`drive#file`
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileResource extends js.Object {
  var alternateLink: String
  var appDataContents: Boolean
  var canComment: Boolean
  var canReadRevisions: Boolean
  var capabilities: Anon_CanAddChildren
  var copyable: Boolean
  var createdDate: Date
  // openWithLinks
  var defaultOpenWithLink: String
  var description: String
  var downloadUrl: String
  var editable: Boolean
  var embedLink: String
  var etag: String
  var explicitlyTrashed: Boolean
  var fileExtension: String
  var fileSize: Double
  var folderColorRgb: String
  var fullFileExtension: String
  var hasAugmentedPermissions: Boolean
  var hasThumbnail: Boolean
  var headRevisionId: String
  var iconLink: String
  var id: String
  var imageMediaMetadata: Anon_Aperture
  // exportLinks
  var indexableText: Anon_Text
  var isAppAuthorized: Boolean
  var kind: `drive#file`
  var labels: Anon_Hidden
  var lastModifyingUser: Anon_DisplayName
  var lastModifyingUserName: String
  var lastViewedByMeDate: Date
  var markedViewedByMeDate: Date
  var md5Checksum: String
  var mimeType: String
  var modifiedByMeDate: Date
  var modifiedDate: Date
  var originalFilename: String
  var ownedByMe: Boolean
  var ownerNames: js.Array[String]
  var owners: js.Array[Anon_DisplayName]
  var parents: js.Array[ParentResource]
  var permissions: js.Array[PermissionResource]
  var properties: js.Array[PropertiesResource]
  var quotaBytesUsed: Double
  var selfLink: String
  var shareable: Boolean
  var shared: Boolean
  var sharedWithMeDate: Date
  var sharingUser: Anon_DisplayName
  var spaces: js.Array[String]
  var teamDriveId: String
  var thumbnail: Anon_Image
  var thumbnailLink: String
  var title: String
  var trashedDate: Date
  var trashingUser: Anon_DisplayName
  var userPermission: PermissionResource
  var version: Double
  var videoMediaMetadata: Anon_DurationMillis
  var webContentLink: String
  var webViewLink: String
  var writersCanShare: Boolean
}

object FileResource {
  @scala.inline
  def apply(
    alternateLink: String,
    appDataContents: Boolean,
    canComment: Boolean,
    canReadRevisions: Boolean,
    capabilities: Anon_CanAddChildren,
    copyable: Boolean,
    createdDate: Date,
    defaultOpenWithLink: String,
    description: String,
    downloadUrl: String,
    editable: Boolean,
    embedLink: String,
    etag: String,
    explicitlyTrashed: Boolean,
    fileExtension: String,
    fileSize: Double,
    folderColorRgb: String,
    fullFileExtension: String,
    hasAugmentedPermissions: Boolean,
    hasThumbnail: Boolean,
    headRevisionId: String,
    iconLink: String,
    id: String,
    imageMediaMetadata: Anon_Aperture,
    indexableText: Anon_Text,
    isAppAuthorized: Boolean,
    kind: `drive#file`,
    labels: Anon_Hidden,
    lastModifyingUser: Anon_DisplayName,
    lastModifyingUserName: String,
    lastViewedByMeDate: Date,
    markedViewedByMeDate: Date,
    md5Checksum: String,
    mimeType: String,
    modifiedByMeDate: Date,
    modifiedDate: Date,
    originalFilename: String,
    ownedByMe: Boolean,
    ownerNames: js.Array[String],
    owners: js.Array[Anon_DisplayName],
    parents: js.Array[ParentResource],
    permissions: js.Array[PermissionResource],
    properties: js.Array[PropertiesResource],
    quotaBytesUsed: Double,
    selfLink: String,
    shareable: Boolean,
    shared: Boolean,
    sharedWithMeDate: Date,
    sharingUser: Anon_DisplayName,
    spaces: js.Array[String],
    teamDriveId: String,
    thumbnail: Anon_Image,
    thumbnailLink: String,
    title: String,
    trashedDate: Date,
    trashingUser: Anon_DisplayName,
    userPermission: PermissionResource,
    version: Double,
    videoMediaMetadata: Anon_DurationMillis,
    webContentLink: String,
    webViewLink: String,
    writersCanShare: Boolean
  ): FileResource = {
    val __obj = js.Dynamic.literal(alternateLink = alternateLink, appDataContents = appDataContents, canComment = canComment, canReadRevisions = canReadRevisions, capabilities = capabilities, copyable = copyable, createdDate = createdDate, defaultOpenWithLink = defaultOpenWithLink, description = description, downloadUrl = downloadUrl, editable = editable, embedLink = embedLink, etag = etag, explicitlyTrashed = explicitlyTrashed, fileExtension = fileExtension, fileSize = fileSize, folderColorRgb = folderColorRgb, fullFileExtension = fullFileExtension, hasAugmentedPermissions = hasAugmentedPermissions, hasThumbnail = hasThumbnail, headRevisionId = headRevisionId, iconLink = iconLink, id = id, imageMediaMetadata = imageMediaMetadata, indexableText = indexableText, isAppAuthorized = isAppAuthorized, kind = kind, labels = labels, lastModifyingUser = lastModifyingUser, lastModifyingUserName = lastModifyingUserName, lastViewedByMeDate = lastViewedByMeDate, markedViewedByMeDate = markedViewedByMeDate, md5Checksum = md5Checksum, mimeType = mimeType, modifiedByMeDate = modifiedByMeDate, modifiedDate = modifiedDate, originalFilename = originalFilename, ownedByMe = ownedByMe, ownerNames = ownerNames, owners = owners, parents = parents, permissions = permissions, properties = properties, quotaBytesUsed = quotaBytesUsed, selfLink = selfLink, shareable = shareable, shared = shared, sharedWithMeDate = sharedWithMeDate, sharingUser = sharingUser, spaces = spaces, teamDriveId = teamDriveId, thumbnail = thumbnail, thumbnailLink = thumbnailLink, title = title, trashedDate = trashedDate, trashingUser = trashingUser, userPermission = userPermission, version = version, videoMediaMetadata = videoMediaMetadata, webContentLink = webContentLink, webViewLink = webViewLink, writersCanShare = writersCanShare)
  
    __obj.asInstanceOf[FileResource]
  }
}

