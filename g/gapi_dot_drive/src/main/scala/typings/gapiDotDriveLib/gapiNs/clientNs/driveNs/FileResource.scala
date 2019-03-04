package typings
package gapiDotDriveLib.gapiNs.clientNs.driveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileResource extends js.Object {
  var alternateLink: java.lang.String
  var appDataContents: scala.Boolean
  var canComment: scala.Boolean
  var canReadRevisions: scala.Boolean
  var capabilities: gapiDotDriveLib.Anon_CanAddChildren
  var copyable: scala.Boolean
  var createdDate: stdLib.Date
  // openWithLinks
  var defaultOpenWithLink: java.lang.String
  var description: java.lang.String
  var downloadUrl: java.lang.String
  var editable: scala.Boolean
  var embedLink: java.lang.String
  var etag: java.lang.String
  var explicitlyTrashed: scala.Boolean
  var fileExtension: java.lang.String
  var fileSize: scala.Double
  var folderColorRgb: java.lang.String
  var fullFileExtension: java.lang.String
  var hasAugmentedPermissions: scala.Boolean
  var hasThumbnail: scala.Boolean
  var headRevisionId: java.lang.String
  var iconLink: java.lang.String
  var id: java.lang.String
  var imageMediaMetadata: gapiDotDriveLib.Anon_Aperture
  // exportLinks
  var indexableText: gapiDotDriveLib.Anon_Text
  var isAppAuthorized: scala.Boolean
  var kind: gapiDotDriveLib.gapiDotDriveLibStrings.`drive#file`
  var labels: gapiDotDriveLib.Anon_Hidden
  var lastModifyingUser: gapiDotDriveLib.Anon_DisplayName
  var lastModifyingUserName: java.lang.String
  var lastViewedByMeDate: stdLib.Date
  var markedViewedByMeDate: stdLib.Date
  var md5Checksum: java.lang.String
  var mimeType: java.lang.String
  var modifiedByMeDate: stdLib.Date
  var modifiedDate: stdLib.Date
  var originalFilename: java.lang.String
  var ownedByMe: scala.Boolean
  var ownerNames: js.Array[java.lang.String]
  var owners: js.Array[gapiDotDriveLib.Anon_DisplayName]
  var parents: js.Array[ParentResource]
  var permissions: js.Array[PermissionResource]
  var properties: js.Array[PropertiesResource]
  var quotaBytesUsed: scala.Double
  var selfLink: java.lang.String
  var shareable: scala.Boolean
  var shared: scala.Boolean
  var sharedWithMeDate: stdLib.Date
  var sharingUser: gapiDotDriveLib.Anon_DisplayName
  var spaces: js.Array[java.lang.String]
  var teamDriveId: java.lang.String
  var thumbnail: gapiDotDriveLib.Anon_Image
  var thumbnailLink: java.lang.String
  var title: java.lang.String
  var trashedDate: stdLib.Date
  var trashingUser: gapiDotDriveLib.Anon_DisplayName
  var userPermission: PermissionResource
  var version: scala.Double
  var videoMediaMetadata: gapiDotDriveLib.Anon_DurationMillis
  var webContentLink: java.lang.String
  var webViewLink: java.lang.String
  var writersCanShare: scala.Boolean
}

object FileResource {
  @scala.inline
  def apply(
    alternateLink: java.lang.String,
    appDataContents: scala.Boolean,
    canComment: scala.Boolean,
    canReadRevisions: scala.Boolean,
    capabilities: gapiDotDriveLib.Anon_CanAddChildren,
    copyable: scala.Boolean,
    createdDate: stdLib.Date,
    defaultOpenWithLink: java.lang.String,
    description: java.lang.String,
    downloadUrl: java.lang.String,
    editable: scala.Boolean,
    embedLink: java.lang.String,
    etag: java.lang.String,
    explicitlyTrashed: scala.Boolean,
    fileExtension: java.lang.String,
    fileSize: scala.Double,
    folderColorRgb: java.lang.String,
    fullFileExtension: java.lang.String,
    hasAugmentedPermissions: scala.Boolean,
    hasThumbnail: scala.Boolean,
    headRevisionId: java.lang.String,
    iconLink: java.lang.String,
    id: java.lang.String,
    imageMediaMetadata: gapiDotDriveLib.Anon_Aperture,
    indexableText: gapiDotDriveLib.Anon_Text,
    isAppAuthorized: scala.Boolean,
    kind: gapiDotDriveLib.gapiDotDriveLibStrings.`drive#file`,
    labels: gapiDotDriveLib.Anon_Hidden,
    lastModifyingUser: gapiDotDriveLib.Anon_DisplayName,
    lastModifyingUserName: java.lang.String,
    lastViewedByMeDate: stdLib.Date,
    markedViewedByMeDate: stdLib.Date,
    md5Checksum: java.lang.String,
    mimeType: java.lang.String,
    modifiedByMeDate: stdLib.Date,
    modifiedDate: stdLib.Date,
    originalFilename: java.lang.String,
    ownedByMe: scala.Boolean,
    ownerNames: js.Array[java.lang.String],
    owners: js.Array[gapiDotDriveLib.Anon_DisplayName],
    parents: js.Array[ParentResource],
    permissions: js.Array[PermissionResource],
    properties: js.Array[PropertiesResource],
    quotaBytesUsed: scala.Double,
    selfLink: java.lang.String,
    shareable: scala.Boolean,
    shared: scala.Boolean,
    sharedWithMeDate: stdLib.Date,
    sharingUser: gapiDotDriveLib.Anon_DisplayName,
    spaces: js.Array[java.lang.String],
    teamDriveId: java.lang.String,
    thumbnail: gapiDotDriveLib.Anon_Image,
    thumbnailLink: java.lang.String,
    title: java.lang.String,
    trashedDate: stdLib.Date,
    trashingUser: gapiDotDriveLib.Anon_DisplayName,
    userPermission: PermissionResource,
    version: scala.Double,
    videoMediaMetadata: gapiDotDriveLib.Anon_DurationMillis,
    webContentLink: java.lang.String,
    webViewLink: java.lang.String,
    writersCanShare: scala.Boolean
  ): FileResource = {
    val __obj = js.Dynamic.literal(alternateLink = alternateLink, appDataContents = appDataContents, canComment = canComment, canReadRevisions = canReadRevisions, capabilities = capabilities, copyable = copyable, createdDate = createdDate, defaultOpenWithLink = defaultOpenWithLink, description = description, downloadUrl = downloadUrl, editable = editable, embedLink = embedLink, etag = etag, explicitlyTrashed = explicitlyTrashed, fileExtension = fileExtension, fileSize = fileSize, folderColorRgb = folderColorRgb, fullFileExtension = fullFileExtension, hasAugmentedPermissions = hasAugmentedPermissions, hasThumbnail = hasThumbnail, headRevisionId = headRevisionId, iconLink = iconLink, id = id, imageMediaMetadata = imageMediaMetadata, indexableText = indexableText, isAppAuthorized = isAppAuthorized, kind = kind, labels = labels, lastModifyingUser = lastModifyingUser, lastModifyingUserName = lastModifyingUserName, lastViewedByMeDate = lastViewedByMeDate, markedViewedByMeDate = markedViewedByMeDate, md5Checksum = md5Checksum, mimeType = mimeType, modifiedByMeDate = modifiedByMeDate, modifiedDate = modifiedDate, originalFilename = originalFilename, ownedByMe = ownedByMe, ownerNames = ownerNames, owners = owners, parents = parents, permissions = permissions, properties = properties, quotaBytesUsed = quotaBytesUsed, selfLink = selfLink, shareable = shareable, shared = shared, sharedWithMeDate = sharedWithMeDate, sharingUser = sharingUser, spaces = spaces, teamDriveId = teamDriveId, thumbnail = thumbnail, thumbnailLink = thumbnailLink, title = title, trashedDate = trashedDate, trashingUser = trashingUser, userPermission = userPermission, version = version, videoMediaMetadata = videoMediaMetadata, webContentLink = webContentLink, webViewLink = webViewLink, writersCanShare = writersCanShare)
  
    __obj.asInstanceOf[FileResource]
  }
}

