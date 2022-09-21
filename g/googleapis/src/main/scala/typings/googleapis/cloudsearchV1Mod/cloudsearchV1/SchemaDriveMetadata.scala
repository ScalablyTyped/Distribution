package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDriveMetadata extends StObject {
  
  var aclFixRequest: js.UndefOr[SchemaAclFixRequest] = js.undefined
  
  var aclFixStatus: js.UndefOr[SchemaAclFixStatus] = js.undefined
  
  /**
    * Can the current user edit this resource
    */
  var canEdit: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Can the current user share this resource
    */
  var canShare: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Can the current user view this resource
    */
  var canView: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * DriveAction for organizing this file in Drive. If the user does not have access to the Drive file, the value will be DriveAction.DRIVE_ACTION_UNSPECIFIED. This field is only set when part of a FileResult in a ListFilesResponse.
    */
  var driveAction: js.UndefOr[String | Null] = js.undefined
  
  var driveState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Trusted Resource URL for drive file embedding.
    */
  var embedUrl: js.UndefOr[SchemaTrustedResourceUrlProto] = js.undefined
  
  /**
    * Indicates whether the Drive link contains an encrypted doc ID. If true, Dynamite should not attempt to query the doc ID in Drive Service. See go/docid-encryption for details.
    */
  var encryptedDocId: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * This is deprecated and unneeded. TODO (b/182479059): Remove this.
    */
  var encryptedResourceKey: js.UndefOr[String | Null] = js.undefined
  
  /**
    * External mimetype of the Drive Resource (Useful for creating Drive URL) See: http://b/35219462
    */
  var externalMimetype: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Drive resource ID of the artifact.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Deprecated. Whether the setting to restrict downloads is enabled for this file. This was previously used to determine whether to hide the download and print buttons in the UI, but is no longer used by clients, because Projector now independently queries Drive to ensure that we have the most up-to-date value.
    */
  var isDownloadRestricted: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * If the current user is the Drive file's owner. The field is currently only set for Annotations for the ListFiles action (as opposed to fetching Topics/Messages with Drive annotations).
    */
  var isOwner: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Only present if this DriveMetadata is converted from an UploadMetadata.
    */
  var legacyUploadMetadata: js.UndefOr[SchemaLegacyUploadMetadata] = js.undefined
  
  /**
    * Mimetype of the Drive Resource
    */
  var mimetype: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The display name of the organization owning the Drive item.
    */
  var organizationDisplayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Shortcut ID of this drive file in the shared drive, which is associated with a named room this file was shared in. Shortcuts will not be created for DMs or unnamed rooms. This is populated after the DriveMetadata is migrated to shared drive. go/chat-shared-drive-uploads.
    */
  var shortcutAuthorizedItemId: js.UndefOr[SchemaAuthorizedItemId] = js.undefined
  
  /**
    * If this field is set to true, server should still contact external backends to get metadata for search but clients should not render this chip.
    */
  var shouldNotRender: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Thumbnail image of the Drive Resource
    */
  var thumbnailHeight: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Thumbnail image of the Drive Resource
    */
  var thumbnailUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Thumbnail image of the Drive Resource
    */
  var thumbnailWidth: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Title of the Drive Resource
    */
  var title: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Url string fragment that generally indicates the specific location in the linked file. Example: #header=h.123abc456. If the fragment is not present this will not be present and therefore default to an empty string. The "#" will not be included.
    */
  var urlFragment: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This is considered SPII and should not be logged.
    */
  var wrappedResourceKey: js.UndefOr[SchemaWrappedResourceKey] = js.undefined
}
object SchemaDriveMetadata {
  
  inline def apply(): SchemaDriveMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDriveMetadata]
  }
  
  extension [Self <: SchemaDriveMetadata](x: Self) {
    
    inline def setAclFixRequest(value: SchemaAclFixRequest): Self = StObject.set(x, "aclFixRequest", value.asInstanceOf[js.Any])
    
    inline def setAclFixRequestUndefined: Self = StObject.set(x, "aclFixRequest", js.undefined)
    
    inline def setAclFixStatus(value: SchemaAclFixStatus): Self = StObject.set(x, "aclFixStatus", value.asInstanceOf[js.Any])
    
    inline def setAclFixStatusUndefined: Self = StObject.set(x, "aclFixStatus", js.undefined)
    
    inline def setCanEdit(value: Boolean): Self = StObject.set(x, "canEdit", value.asInstanceOf[js.Any])
    
    inline def setCanEditNull: Self = StObject.set(x, "canEdit", null)
    
    inline def setCanEditUndefined: Self = StObject.set(x, "canEdit", js.undefined)
    
    inline def setCanShare(value: Boolean): Self = StObject.set(x, "canShare", value.asInstanceOf[js.Any])
    
    inline def setCanShareNull: Self = StObject.set(x, "canShare", null)
    
    inline def setCanShareUndefined: Self = StObject.set(x, "canShare", js.undefined)
    
    inline def setCanView(value: Boolean): Self = StObject.set(x, "canView", value.asInstanceOf[js.Any])
    
    inline def setCanViewNull: Self = StObject.set(x, "canView", null)
    
    inline def setCanViewUndefined: Self = StObject.set(x, "canView", js.undefined)
    
    inline def setDriveAction(value: String): Self = StObject.set(x, "driveAction", value.asInstanceOf[js.Any])
    
    inline def setDriveActionNull: Self = StObject.set(x, "driveAction", null)
    
    inline def setDriveActionUndefined: Self = StObject.set(x, "driveAction", js.undefined)
    
    inline def setDriveState(value: String): Self = StObject.set(x, "driveState", value.asInstanceOf[js.Any])
    
    inline def setDriveStateNull: Self = StObject.set(x, "driveState", null)
    
    inline def setDriveStateUndefined: Self = StObject.set(x, "driveState", js.undefined)
    
    inline def setEmbedUrl(value: SchemaTrustedResourceUrlProto): Self = StObject.set(x, "embedUrl", value.asInstanceOf[js.Any])
    
    inline def setEmbedUrlUndefined: Self = StObject.set(x, "embedUrl", js.undefined)
    
    inline def setEncryptedDocId(value: Boolean): Self = StObject.set(x, "encryptedDocId", value.asInstanceOf[js.Any])
    
    inline def setEncryptedDocIdNull: Self = StObject.set(x, "encryptedDocId", null)
    
    inline def setEncryptedDocIdUndefined: Self = StObject.set(x, "encryptedDocId", js.undefined)
    
    inline def setEncryptedResourceKey(value: String): Self = StObject.set(x, "encryptedResourceKey", value.asInstanceOf[js.Any])
    
    inline def setEncryptedResourceKeyNull: Self = StObject.set(x, "encryptedResourceKey", null)
    
    inline def setEncryptedResourceKeyUndefined: Self = StObject.set(x, "encryptedResourceKey", js.undefined)
    
    inline def setExternalMimetype(value: String): Self = StObject.set(x, "externalMimetype", value.asInstanceOf[js.Any])
    
    inline def setExternalMimetypeNull: Self = StObject.set(x, "externalMimetype", null)
    
    inline def setExternalMimetypeUndefined: Self = StObject.set(x, "externalMimetype", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIsDownloadRestricted(value: Boolean): Self = StObject.set(x, "isDownloadRestricted", value.asInstanceOf[js.Any])
    
    inline def setIsDownloadRestrictedNull: Self = StObject.set(x, "isDownloadRestricted", null)
    
    inline def setIsDownloadRestrictedUndefined: Self = StObject.set(x, "isDownloadRestricted", js.undefined)
    
    inline def setIsOwner(value: Boolean): Self = StObject.set(x, "isOwner", value.asInstanceOf[js.Any])
    
    inline def setIsOwnerNull: Self = StObject.set(x, "isOwner", null)
    
    inline def setIsOwnerUndefined: Self = StObject.set(x, "isOwner", js.undefined)
    
    inline def setLegacyUploadMetadata(value: SchemaLegacyUploadMetadata): Self = StObject.set(x, "legacyUploadMetadata", value.asInstanceOf[js.Any])
    
    inline def setLegacyUploadMetadataUndefined: Self = StObject.set(x, "legacyUploadMetadata", js.undefined)
    
    inline def setMimetype(value: String): Self = StObject.set(x, "mimetype", value.asInstanceOf[js.Any])
    
    inline def setMimetypeNull: Self = StObject.set(x, "mimetype", null)
    
    inline def setMimetypeUndefined: Self = StObject.set(x, "mimetype", js.undefined)
    
    inline def setOrganizationDisplayName(value: String): Self = StObject.set(x, "organizationDisplayName", value.asInstanceOf[js.Any])
    
    inline def setOrganizationDisplayNameNull: Self = StObject.set(x, "organizationDisplayName", null)
    
    inline def setOrganizationDisplayNameUndefined: Self = StObject.set(x, "organizationDisplayName", js.undefined)
    
    inline def setShortcutAuthorizedItemId(value: SchemaAuthorizedItemId): Self = StObject.set(x, "shortcutAuthorizedItemId", value.asInstanceOf[js.Any])
    
    inline def setShortcutAuthorizedItemIdUndefined: Self = StObject.set(x, "shortcutAuthorizedItemId", js.undefined)
    
    inline def setShouldNotRender(value: Boolean): Self = StObject.set(x, "shouldNotRender", value.asInstanceOf[js.Any])
    
    inline def setShouldNotRenderNull: Self = StObject.set(x, "shouldNotRender", null)
    
    inline def setShouldNotRenderUndefined: Self = StObject.set(x, "shouldNotRender", js.undefined)
    
    inline def setThumbnailHeight(value: Double): Self = StObject.set(x, "thumbnailHeight", value.asInstanceOf[js.Any])
    
    inline def setThumbnailHeightNull: Self = StObject.set(x, "thumbnailHeight", null)
    
    inline def setThumbnailHeightUndefined: Self = StObject.set(x, "thumbnailHeight", js.undefined)
    
    inline def setThumbnailUrl(value: String): Self = StObject.set(x, "thumbnailUrl", value.asInstanceOf[js.Any])
    
    inline def setThumbnailUrlNull: Self = StObject.set(x, "thumbnailUrl", null)
    
    inline def setThumbnailUrlUndefined: Self = StObject.set(x, "thumbnailUrl", js.undefined)
    
    inline def setThumbnailWidth(value: Double): Self = StObject.set(x, "thumbnailWidth", value.asInstanceOf[js.Any])
    
    inline def setThumbnailWidthNull: Self = StObject.set(x, "thumbnailWidth", null)
    
    inline def setThumbnailWidthUndefined: Self = StObject.set(x, "thumbnailWidth", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUrlFragment(value: String): Self = StObject.set(x, "urlFragment", value.asInstanceOf[js.Any])
    
    inline def setUrlFragmentNull: Self = StObject.set(x, "urlFragment", null)
    
    inline def setUrlFragmentUndefined: Self = StObject.set(x, "urlFragment", js.undefined)
    
    inline def setWrappedResourceKey(value: SchemaWrappedResourceKey): Self = StObject.set(x, "wrappedResourceKey", value.asInstanceOf[js.Any])
    
    inline def setWrappedResourceKeyUndefined: Self = StObject.set(x, "wrappedResourceKey", js.undefined)
  }
}
