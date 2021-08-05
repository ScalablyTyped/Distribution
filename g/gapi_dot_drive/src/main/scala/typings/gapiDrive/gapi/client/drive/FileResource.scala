package typings.gapiDrive.gapi.client.drive

import typings.gapiDrive.anon.Aperture
import typings.gapiDrive.anon.CanAddChildren
import typings.gapiDrive.anon.DisplayName
import typings.gapiDrive.anon.DurationMillis
import typings.gapiDrive.anon.Hidden
import typings.gapiDrive.anon.Image
import typings.gapiDrive.anon.Text
import typings.gapiDrive.gapiDriveStrings.driveNumbersignfile
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileResource extends StObject {
  
  var alternateLink: String
  
  var appDataContents: Boolean
  
  var canComment: Boolean
  
  var canReadRevisions: Boolean
  
  var capabilities: CanAddChildren
  
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
  
  var imageMediaMetadata: Aperture
  
  // exportLinks
  var indexableText: Text
  
  var isAppAuthorized: Boolean
  
  var kind: driveNumbersignfile
  
  var labels: Hidden
  
  var lastModifyingUser: DisplayName
  
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
  
  var owners: js.Array[DisplayName]
  
  var parents: js.Array[ParentResource]
  
  var permissions: js.Array[PermissionResource]
  
  var properties: js.Array[PropertiesResource]
  
  var quotaBytesUsed: Double
  
  var selfLink: String
  
  var shareable: Boolean
  
  var shared: Boolean
  
  var sharedWithMeDate: Date
  
  var sharingUser: DisplayName
  
  var spaces: js.Array[String]
  
  var teamDriveId: String
  
  var thumbnail: Image
  
  var thumbnailLink: String
  
  var title: String
  
  var trashedDate: Date
  
  var trashingUser: DisplayName
  
  var userPermission: PermissionResource
  
  var version: Double
  
  var videoMediaMetadata: DurationMillis
  
  var webContentLink: String
  
  var webViewLink: String
  
  var writersCanShare: Boolean
}
object FileResource {
  
  inline def apply(
    alternateLink: String,
    appDataContents: Boolean,
    canComment: Boolean,
    canReadRevisions: Boolean,
    capabilities: CanAddChildren,
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
    imageMediaMetadata: Aperture,
    indexableText: Text,
    isAppAuthorized: Boolean,
    labels: Hidden,
    lastModifyingUser: DisplayName,
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
    owners: js.Array[DisplayName],
    parents: js.Array[ParentResource],
    permissions: js.Array[PermissionResource],
    properties: js.Array[PropertiesResource],
    quotaBytesUsed: Double,
    selfLink: String,
    shareable: Boolean,
    shared: Boolean,
    sharedWithMeDate: Date,
    sharingUser: DisplayName,
    spaces: js.Array[String],
    teamDriveId: String,
    thumbnail: Image,
    thumbnailLink: String,
    title: String,
    trashedDate: Date,
    trashingUser: DisplayName,
    userPermission: PermissionResource,
    version: Double,
    videoMediaMetadata: DurationMillis,
    webContentLink: String,
    webViewLink: String,
    writersCanShare: Boolean
  ): FileResource = {
    val __obj = js.Dynamic.literal(alternateLink = alternateLink.asInstanceOf[js.Any], appDataContents = appDataContents.asInstanceOf[js.Any], canComment = canComment.asInstanceOf[js.Any], canReadRevisions = canReadRevisions.asInstanceOf[js.Any], capabilities = capabilities.asInstanceOf[js.Any], copyable = copyable.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], defaultOpenWithLink = defaultOpenWithLink.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], downloadUrl = downloadUrl.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any], embedLink = embedLink.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], explicitlyTrashed = explicitlyTrashed.asInstanceOf[js.Any], fileExtension = fileExtension.asInstanceOf[js.Any], fileSize = fileSize.asInstanceOf[js.Any], folderColorRgb = folderColorRgb.asInstanceOf[js.Any], fullFileExtension = fullFileExtension.asInstanceOf[js.Any], hasAugmentedPermissions = hasAugmentedPermissions.asInstanceOf[js.Any], hasThumbnail = hasThumbnail.asInstanceOf[js.Any], headRevisionId = headRevisionId.asInstanceOf[js.Any], iconLink = iconLink.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], imageMediaMetadata = imageMediaMetadata.asInstanceOf[js.Any], indexableText = indexableText.asInstanceOf[js.Any], isAppAuthorized = isAppAuthorized.asInstanceOf[js.Any], kind = "drive#file", labels = labels.asInstanceOf[js.Any], lastModifyingUser = lastModifyingUser.asInstanceOf[js.Any], lastModifyingUserName = lastModifyingUserName.asInstanceOf[js.Any], lastViewedByMeDate = lastViewedByMeDate.asInstanceOf[js.Any], markedViewedByMeDate = markedViewedByMeDate.asInstanceOf[js.Any], md5Checksum = md5Checksum.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], modifiedByMeDate = modifiedByMeDate.asInstanceOf[js.Any], modifiedDate = modifiedDate.asInstanceOf[js.Any], originalFilename = originalFilename.asInstanceOf[js.Any], ownedByMe = ownedByMe.asInstanceOf[js.Any], ownerNames = ownerNames.asInstanceOf[js.Any], owners = owners.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], quotaBytesUsed = quotaBytesUsed.asInstanceOf[js.Any], selfLink = selfLink.asInstanceOf[js.Any], shareable = shareable.asInstanceOf[js.Any], shared = shared.asInstanceOf[js.Any], sharedWithMeDate = sharedWithMeDate.asInstanceOf[js.Any], sharingUser = sharingUser.asInstanceOf[js.Any], spaces = spaces.asInstanceOf[js.Any], teamDriveId = teamDriveId.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], thumbnailLink = thumbnailLink.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], trashedDate = trashedDate.asInstanceOf[js.Any], trashingUser = trashingUser.asInstanceOf[js.Any], userPermission = userPermission.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], videoMediaMetadata = videoMediaMetadata.asInstanceOf[js.Any], webContentLink = webContentLink.asInstanceOf[js.Any], webViewLink = webViewLink.asInstanceOf[js.Any], writersCanShare = writersCanShare.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileResource]
  }
  
  extension [Self <: FileResource](x: Self) {
    
    inline def setAlternateLink(value: String): Self = StObject.set(x, "alternateLink", value.asInstanceOf[js.Any])
    
    inline def setAppDataContents(value: Boolean): Self = StObject.set(x, "appDataContents", value.asInstanceOf[js.Any])
    
    inline def setCanComment(value: Boolean): Self = StObject.set(x, "canComment", value.asInstanceOf[js.Any])
    
    inline def setCanReadRevisions(value: Boolean): Self = StObject.set(x, "canReadRevisions", value.asInstanceOf[js.Any])
    
    inline def setCapabilities(value: CanAddChildren): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    inline def setCopyable(value: Boolean): Self = StObject.set(x, "copyable", value.asInstanceOf[js.Any])
    
    inline def setCreatedDate(value: Date): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    inline def setDefaultOpenWithLink(value: String): Self = StObject.set(x, "defaultOpenWithLink", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDownloadUrl(value: String): Self = StObject.set(x, "downloadUrl", value.asInstanceOf[js.Any])
    
    inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setEmbedLink(value: String): Self = StObject.set(x, "embedLink", value.asInstanceOf[js.Any])
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setExplicitlyTrashed(value: Boolean): Self = StObject.set(x, "explicitlyTrashed", value.asInstanceOf[js.Any])
    
    inline def setFileExtension(value: String): Self = StObject.set(x, "fileExtension", value.asInstanceOf[js.Any])
    
    inline def setFileSize(value: Double): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
    
    inline def setFolderColorRgb(value: String): Self = StObject.set(x, "folderColorRgb", value.asInstanceOf[js.Any])
    
    inline def setFullFileExtension(value: String): Self = StObject.set(x, "fullFileExtension", value.asInstanceOf[js.Any])
    
    inline def setHasAugmentedPermissions(value: Boolean): Self = StObject.set(x, "hasAugmentedPermissions", value.asInstanceOf[js.Any])
    
    inline def setHasThumbnail(value: Boolean): Self = StObject.set(x, "hasThumbnail", value.asInstanceOf[js.Any])
    
    inline def setHeadRevisionId(value: String): Self = StObject.set(x, "headRevisionId", value.asInstanceOf[js.Any])
    
    inline def setIconLink(value: String): Self = StObject.set(x, "iconLink", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setImageMediaMetadata(value: Aperture): Self = StObject.set(x, "imageMediaMetadata", value.asInstanceOf[js.Any])
    
    inline def setIndexableText(value: Text): Self = StObject.set(x, "indexableText", value.asInstanceOf[js.Any])
    
    inline def setIsAppAuthorized(value: Boolean): Self = StObject.set(x, "isAppAuthorized", value.asInstanceOf[js.Any])
    
    inline def setKind(value: driveNumbersignfile): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setLabels(value: Hidden): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLastModifyingUser(value: DisplayName): Self = StObject.set(x, "lastModifyingUser", value.asInstanceOf[js.Any])
    
    inline def setLastModifyingUserName(value: String): Self = StObject.set(x, "lastModifyingUserName", value.asInstanceOf[js.Any])
    
    inline def setLastViewedByMeDate(value: Date): Self = StObject.set(x, "lastViewedByMeDate", value.asInstanceOf[js.Any])
    
    inline def setMarkedViewedByMeDate(value: Date): Self = StObject.set(x, "markedViewedByMeDate", value.asInstanceOf[js.Any])
    
    inline def setMd5Checksum(value: String): Self = StObject.set(x, "md5Checksum", value.asInstanceOf[js.Any])
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setModifiedByMeDate(value: Date): Self = StObject.set(x, "modifiedByMeDate", value.asInstanceOf[js.Any])
    
    inline def setModifiedDate(value: Date): Self = StObject.set(x, "modifiedDate", value.asInstanceOf[js.Any])
    
    inline def setOriginalFilename(value: String): Self = StObject.set(x, "originalFilename", value.asInstanceOf[js.Any])
    
    inline def setOwnedByMe(value: Boolean): Self = StObject.set(x, "ownedByMe", value.asInstanceOf[js.Any])
    
    inline def setOwnerNames(value: js.Array[String]): Self = StObject.set(x, "ownerNames", value.asInstanceOf[js.Any])
    
    inline def setOwnerNamesVarargs(value: String*): Self = StObject.set(x, "ownerNames", js.Array(value :_*))
    
    inline def setOwners(value: js.Array[DisplayName]): Self = StObject.set(x, "owners", value.asInstanceOf[js.Any])
    
    inline def setOwnersVarargs(value: DisplayName*): Self = StObject.set(x, "owners", js.Array(value :_*))
    
    inline def setParents(value: js.Array[ParentResource]): Self = StObject.set(x, "parents", value.asInstanceOf[js.Any])
    
    inline def setParentsVarargs(value: ParentResource*): Self = StObject.set(x, "parents", js.Array(value :_*))
    
    inline def setPermissions(value: js.Array[PermissionResource]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsVarargs(value: PermissionResource*): Self = StObject.set(x, "permissions", js.Array(value :_*))
    
    inline def setProperties(value: js.Array[PropertiesResource]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesVarargs(value: PropertiesResource*): Self = StObject.set(x, "properties", js.Array(value :_*))
    
    inline def setQuotaBytesUsed(value: Double): Self = StObject.set(x, "quotaBytesUsed", value.asInstanceOf[js.Any])
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setShareable(value: Boolean): Self = StObject.set(x, "shareable", value.asInstanceOf[js.Any])
    
    inline def setShared(value: Boolean): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
    
    inline def setSharedWithMeDate(value: Date): Self = StObject.set(x, "sharedWithMeDate", value.asInstanceOf[js.Any])
    
    inline def setSharingUser(value: DisplayName): Self = StObject.set(x, "sharingUser", value.asInstanceOf[js.Any])
    
    inline def setSpaces(value: js.Array[String]): Self = StObject.set(x, "spaces", value.asInstanceOf[js.Any])
    
    inline def setSpacesVarargs(value: String*): Self = StObject.set(x, "spaces", js.Array(value :_*))
    
    inline def setTeamDriveId(value: String): Self = StObject.set(x, "teamDriveId", value.asInstanceOf[js.Any])
    
    inline def setThumbnail(value: Image): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    inline def setThumbnailLink(value: String): Self = StObject.set(x, "thumbnailLink", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTrashedDate(value: Date): Self = StObject.set(x, "trashedDate", value.asInstanceOf[js.Any])
    
    inline def setTrashingUser(value: DisplayName): Self = StObject.set(x, "trashingUser", value.asInstanceOf[js.Any])
    
    inline def setUserPermission(value: PermissionResource): Self = StObject.set(x, "userPermission", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVideoMediaMetadata(value: DurationMillis): Self = StObject.set(x, "videoMediaMetadata", value.asInstanceOf[js.Any])
    
    inline def setWebContentLink(value: String): Self = StObject.set(x, "webContentLink", value.asInstanceOf[js.Any])
    
    inline def setWebViewLink(value: String): Self = StObject.set(x, "webViewLink", value.asInstanceOf[js.Any])
    
    inline def setWritersCanShare(value: Boolean): Self = StObject.set(x, "writersCanShare", value.asInstanceOf[js.Any])
  }
}
