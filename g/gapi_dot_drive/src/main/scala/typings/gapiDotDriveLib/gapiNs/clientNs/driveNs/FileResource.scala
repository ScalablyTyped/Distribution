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
  var capabilities: gapiDotDriveLib.Anon_CanUntrash
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
  var imageMediaMetadata: gapiDotDriveLib.Anon_MaxApertureValue
  // exportLinks
  var indexableText: gapiDotDriveLib.Anon_Text
  var isAppAuthorized: scala.Boolean
  var kind: gapiDotDriveLib.gapiDotDriveLibStrings.`drive#file`
  var labels: gapiDotDriveLib.Anon_Trashed
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
  var thumbnail: gapiDotDriveLib.Anon_MimType
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

