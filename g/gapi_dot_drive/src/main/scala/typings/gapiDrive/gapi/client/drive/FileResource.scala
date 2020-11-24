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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileResource extends js.Object {
  
  var alternateLink: String = js.native
  
  var appDataContents: Boolean = js.native
  
  var canComment: Boolean = js.native
  
  var canReadRevisions: Boolean = js.native
  
  var capabilities: CanAddChildren = js.native
  
  var copyable: Boolean = js.native
  
  var createdDate: Date = js.native
  
  // openWithLinks
  var defaultOpenWithLink: String = js.native
  
  var description: String = js.native
  
  var downloadUrl: String = js.native
  
  var editable: Boolean = js.native
  
  var embedLink: String = js.native
  
  var etag: String = js.native
  
  var explicitlyTrashed: Boolean = js.native
  
  var fileExtension: String = js.native
  
  var fileSize: Double = js.native
  
  var folderColorRgb: String = js.native
  
  var fullFileExtension: String = js.native
  
  var hasAugmentedPermissions: Boolean = js.native
  
  var hasThumbnail: Boolean = js.native
  
  var headRevisionId: String = js.native
  
  var iconLink: String = js.native
  
  var id: String = js.native
  
  var imageMediaMetadata: Aperture = js.native
  
  // exportLinks
  var indexableText: Text = js.native
  
  var isAppAuthorized: Boolean = js.native
  
  var kind: driveNumbersignfile = js.native
  
  var labels: Hidden = js.native
  
  var lastModifyingUser: DisplayName = js.native
  
  var lastModifyingUserName: String = js.native
  
  var lastViewedByMeDate: Date = js.native
  
  var markedViewedByMeDate: Date = js.native
  
  var md5Checksum: String = js.native
  
  var mimeType: String = js.native
  
  var modifiedByMeDate: Date = js.native
  
  var modifiedDate: Date = js.native
  
  var originalFilename: String = js.native
  
  var ownedByMe: Boolean = js.native
  
  var ownerNames: js.Array[String] = js.native
  
  var owners: js.Array[DisplayName] = js.native
  
  var parents: js.Array[ParentResource] = js.native
  
  var permissions: js.Array[PermissionResource] = js.native
  
  var properties: js.Array[PropertiesResource] = js.native
  
  var quotaBytesUsed: Double = js.native
  
  var selfLink: String = js.native
  
  var shareable: Boolean = js.native
  
  var shared: Boolean = js.native
  
  var sharedWithMeDate: Date = js.native
  
  var sharingUser: DisplayName = js.native
  
  var spaces: js.Array[String] = js.native
  
  var teamDriveId: String = js.native
  
  var thumbnail: Image = js.native
  
  var thumbnailLink: String = js.native
  
  var title: String = js.native
  
  var trashedDate: Date = js.native
  
  var trashingUser: DisplayName = js.native
  
  var userPermission: PermissionResource = js.native
  
  var version: Double = js.native
  
  var videoMediaMetadata: DurationMillis = js.native
  
  var webContentLink: String = js.native
  
  var webViewLink: String = js.native
  
  var writersCanShare: Boolean = js.native
}
object FileResource {
  
  @scala.inline
  def apply(
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
    kind: driveNumbersignfile,
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
    val __obj = js.Dynamic.literal(alternateLink = alternateLink.asInstanceOf[js.Any], appDataContents = appDataContents.asInstanceOf[js.Any], canComment = canComment.asInstanceOf[js.Any], canReadRevisions = canReadRevisions.asInstanceOf[js.Any], capabilities = capabilities.asInstanceOf[js.Any], copyable = copyable.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], defaultOpenWithLink = defaultOpenWithLink.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], downloadUrl = downloadUrl.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any], embedLink = embedLink.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], explicitlyTrashed = explicitlyTrashed.asInstanceOf[js.Any], fileExtension = fileExtension.asInstanceOf[js.Any], fileSize = fileSize.asInstanceOf[js.Any], folderColorRgb = folderColorRgb.asInstanceOf[js.Any], fullFileExtension = fullFileExtension.asInstanceOf[js.Any], hasAugmentedPermissions = hasAugmentedPermissions.asInstanceOf[js.Any], hasThumbnail = hasThumbnail.asInstanceOf[js.Any], headRevisionId = headRevisionId.asInstanceOf[js.Any], iconLink = iconLink.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], imageMediaMetadata = imageMediaMetadata.asInstanceOf[js.Any], indexableText = indexableText.asInstanceOf[js.Any], isAppAuthorized = isAppAuthorized.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], lastModifyingUser = lastModifyingUser.asInstanceOf[js.Any], lastModifyingUserName = lastModifyingUserName.asInstanceOf[js.Any], lastViewedByMeDate = lastViewedByMeDate.asInstanceOf[js.Any], markedViewedByMeDate = markedViewedByMeDate.asInstanceOf[js.Any], md5Checksum = md5Checksum.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], modifiedByMeDate = modifiedByMeDate.asInstanceOf[js.Any], modifiedDate = modifiedDate.asInstanceOf[js.Any], originalFilename = originalFilename.asInstanceOf[js.Any], ownedByMe = ownedByMe.asInstanceOf[js.Any], ownerNames = ownerNames.asInstanceOf[js.Any], owners = owners.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], quotaBytesUsed = quotaBytesUsed.asInstanceOf[js.Any], selfLink = selfLink.asInstanceOf[js.Any], shareable = shareable.asInstanceOf[js.Any], shared = shared.asInstanceOf[js.Any], sharedWithMeDate = sharedWithMeDate.asInstanceOf[js.Any], sharingUser = sharingUser.asInstanceOf[js.Any], spaces = spaces.asInstanceOf[js.Any], teamDriveId = teamDriveId.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], thumbnailLink = thumbnailLink.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], trashedDate = trashedDate.asInstanceOf[js.Any], trashingUser = trashingUser.asInstanceOf[js.Any], userPermission = userPermission.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], videoMediaMetadata = videoMediaMetadata.asInstanceOf[js.Any], webContentLink = webContentLink.asInstanceOf[js.Any], webViewLink = webViewLink.asInstanceOf[js.Any], writersCanShare = writersCanShare.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileResource]
  }
  
  @scala.inline
  implicit class FileResourceOps[Self <: FileResource] (val x: Self) extends AnyVal {
    
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
    def setAppDataContents(value: Boolean): Self = this.set("appDataContents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanComment(value: Boolean): Self = this.set("canComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanReadRevisions(value: Boolean): Self = this.set("canReadRevisions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapabilities(value: CanAddChildren): Self = this.set("capabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyable(value: Boolean): Self = this.set("copyable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDate(value: Date): Self = this.set("createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultOpenWithLink(value: String): Self = this.set("defaultOpenWithLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadUrl(value: String): Self = this.set("downloadUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditable(value: Boolean): Self = this.set("editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbedLink(value: String): Self = this.set("embedLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExplicitlyTrashed(value: Boolean): Self = this.set("explicitlyTrashed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileExtension(value: String): Self = this.set("fileExtension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSize(value: Double): Self = this.set("fileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFolderColorRgb(value: String): Self = this.set("folderColorRgb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullFileExtension(value: String): Self = this.set("fullFileExtension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasAugmentedPermissions(value: Boolean): Self = this.set("hasAugmentedPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasThumbnail(value: Boolean): Self = this.set("hasThumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadRevisionId(value: String): Self = this.set("headRevisionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconLink(value: String): Self = this.set("iconLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageMediaMetadata(value: Aperture): Self = this.set("imageMediaMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexableText(value: Text): Self = this.set("indexableText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAppAuthorized(value: Boolean): Self = this.set("isAppAuthorized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: driveNumbersignfile): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabels(value: Hidden): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifyingUser(value: DisplayName): Self = this.set("lastModifyingUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifyingUserName(value: String): Self = this.set("lastModifyingUserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastViewedByMeDate(value: Date): Self = this.set("lastViewedByMeDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkedViewedByMeDate(value: Date): Self = this.set("markedViewedByMeDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMd5Checksum(value: String): Self = this.set("md5Checksum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedByMeDate(value: Date): Self = this.set("modifiedByMeDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedDate(value: Date): Self = this.set("modifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalFilename(value: String): Self = this.set("originalFilename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnedByMe(value: Boolean): Self = this.set("ownedByMe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerNamesVarargs(value: String*): Self = this.set("ownerNames", js.Array(value :_*))
    
    @scala.inline
    def setOwnerNames(value: js.Array[String]): Self = this.set("ownerNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnersVarargs(value: DisplayName*): Self = this.set("owners", js.Array(value :_*))
    
    @scala.inline
    def setOwners(value: js.Array[DisplayName]): Self = this.set("owners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentsVarargs(value: ParentResource*): Self = this.set("parents", js.Array(value :_*))
    
    @scala.inline
    def setParents(value: js.Array[ParentResource]): Self = this.set("parents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsVarargs(value: PermissionResource*): Self = this.set("permissions", js.Array(value :_*))
    
    @scala.inline
    def setPermissions(value: js.Array[PermissionResource]): Self = this.set("permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesVarargs(value: PropertiesResource*): Self = this.set("properties", js.Array(value :_*))
    
    @scala.inline
    def setProperties(value: js.Array[PropertiesResource]): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaBytesUsed(value: Double): Self = this.set("quotaBytesUsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShareable(value: Boolean): Self = this.set("shareable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShared(value: Boolean): Self = this.set("shared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedWithMeDate(value: Date): Self = this.set("sharedWithMeDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharingUser(value: DisplayName): Self = this.set("sharingUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacesVarargs(value: String*): Self = this.set("spaces", js.Array(value :_*))
    
    @scala.inline
    def setSpaces(value: js.Array[String]): Self = this.set("spaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamDriveId(value: String): Self = this.set("teamDriveId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnail(value: Image): Self = this.set("thumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailLink(value: String): Self = this.set("thumbnailLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrashedDate(value: Date): Self = this.set("trashedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrashingUser(value: DisplayName): Self = this.set("trashingUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPermission(value: PermissionResource): Self = this.set("userPermission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoMediaMetadata(value: DurationMillis): Self = this.set("videoMediaMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebContentLink(value: String): Self = this.set("webContentLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebViewLink(value: String): Self = this.set("webViewLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWritersCanShare(value: Boolean): Self = this.set("writersCanShare", value.asInstanceOf[js.Any])
  }
}
