package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkspaceItem extends StObject {
  
  var callerAuthorization: js.UndefOr[
    /* Provides properties that describe user authorization to a workspace. */ WorkspaceUserAuthorization
  ] = js.undefined
  
  /**
    * If the item is a file, this property specifies the content type of the file.
    */
  var contentType: js.UndefOr[String] = js.undefined
  
  /**
    * The UTC DateTime when the workspace user authorization was created.
    */
  var created: js.UndefOr[String] = js.undefined
  
  /**
    * The id of the user who created the workspace item.
    */
  var createdById: js.UndefOr[String] = js.undefined
  
  /**
    * Details about the user who created the workspace item.
    */
  var createdByInformation: js.UndefOr[
    /* This object represents the workspace user. This property is only returned in response to user specific GET call.  */ WorkspaceUser
  ] = js.undefined
  
  /**
    * The file extension of a file item.
    */
  var `extension`: js.UndefOr[String] = js.undefined
  
  /**
    * The size of the file in bytes.
    */
  var fileSize: js.UndefOr[String] = js.undefined
  
  /**
    * The URI for retrieving the file.
    */
  var fileUri: js.UndefOr[String] = js.undefined
  
  /**
    * A unique ID for the Salesforce object.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    *  When **true**, the item is public.
    */
  var isPublic: js.UndefOr[String] = js.undefined
  
  /**
    * The UTC date and time that the comment was last updated.
    *
    * **Note**: This can only be done by the creator.
    */
  var lastModified: js.UndefOr[String] = js.undefined
  
  /**
    * The id of the user who last modified the item.
    */
  var lastModifiedById: js.UndefOr[String] = js.undefined
  
  /**
    * Details about the user who last modified the workspace item.
    */
  var lastModifiedByInformation: js.UndefOr[
    /* This object represents the workspace user. This property is only returned in response to user specific GET call.  */ WorkspaceUser
  ] = js.undefined
  
  /**
    * The name of the file or folder.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The number of pages in a file.
    */
  var pageCount: js.UndefOr[String] = js.undefined
  
  /**
    * The id of the parent folder, or the special value `root` for the root folder.
    */
  var parentFolderId: js.UndefOr[String] = js.undefined
  
  /**
    * The URI of the parent folder.
    */
  var parentFolderUri: js.UndefOr[String] = js.undefined
  
  /**
    * A 64-byte, Secure Hash Algorithm 256 (SHA256) checksum that the caller computes across the entirety of the original content of a file.
    * DocuSign compares this value to its own computation. If the two values are not equal, the original content and received content are not the same and the upload is refused.
    */
  var sha256: js.UndefOr[String] = js.undefined
  
  /**
    * The height of the thumbnail image.
    */
  var thumbHeight: js.UndefOr[String] = js.undefined
  
  /**
    * The width of the thumbnail image.
    */
  var thumbWidth: js.UndefOr[String] = js.undefined
  
  var thumbnail: js.UndefOr[/* Description of a page of a document. */ Page] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * A URI containing the user ID.
    */
  var uri: js.UndefOr[String] = js.undefined
  
  var userAuthorization: js.UndefOr[
    /* Provides properties that describe user authorization to a workspace. */ WorkspaceUserAuthorization
  ] = js.undefined
}
object WorkspaceItem {
  
  inline def apply(): WorkspaceItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkspaceItem] (val x: Self) extends AnyVal {
    
    inline def setCallerAuthorization(
      value: /* Provides properties that describe user authorization to a workspace. */ WorkspaceUserAuthorization
    ): Self = StObject.set(x, "callerAuthorization", value.asInstanceOf[js.Any])
    
    inline def setCallerAuthorizationUndefined: Self = StObject.set(x, "callerAuthorization", js.undefined)
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedById(value: String): Self = StObject.set(x, "createdById", value.asInstanceOf[js.Any])
    
    inline def setCreatedByIdUndefined: Self = StObject.set(x, "createdById", js.undefined)
    
    inline def setCreatedByInformation(
      value: /* This object represents the workspace user. This property is only returned in response to user specific GET call.  */ WorkspaceUser
    ): Self = StObject.set(x, "createdByInformation", value.asInstanceOf[js.Any])
    
    inline def setCreatedByInformationUndefined: Self = StObject.set(x, "createdByInformation", js.undefined)
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    inline def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
    
    inline def setFileSize(value: String): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
    
    inline def setFileSizeUndefined: Self = StObject.set(x, "fileSize", js.undefined)
    
    inline def setFileUri(value: String): Self = StObject.set(x, "fileUri", value.asInstanceOf[js.Any])
    
    inline def setFileUriUndefined: Self = StObject.set(x, "fileUri", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIsPublic(value: String): Self = StObject.set(x, "isPublic", value.asInstanceOf[js.Any])
    
    inline def setIsPublicUndefined: Self = StObject.set(x, "isPublic", js.undefined)
    
    inline def setLastModified(value: String): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedById(value: String): Self = StObject.set(x, "lastModifiedById", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedByIdUndefined: Self = StObject.set(x, "lastModifiedById", js.undefined)
    
    inline def setLastModifiedByInformation(
      value: /* This object represents the workspace user. This property is only returned in response to user specific GET call.  */ WorkspaceUser
    ): Self = StObject.set(x, "lastModifiedByInformation", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedByInformationUndefined: Self = StObject.set(x, "lastModifiedByInformation", js.undefined)
    
    inline def setLastModifiedUndefined: Self = StObject.set(x, "lastModified", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPageCount(value: String): Self = StObject.set(x, "pageCount", value.asInstanceOf[js.Any])
    
    inline def setPageCountUndefined: Self = StObject.set(x, "pageCount", js.undefined)
    
    inline def setParentFolderId(value: String): Self = StObject.set(x, "parentFolderId", value.asInstanceOf[js.Any])
    
    inline def setParentFolderIdUndefined: Self = StObject.set(x, "parentFolderId", js.undefined)
    
    inline def setParentFolderUri(value: String): Self = StObject.set(x, "parentFolderUri", value.asInstanceOf[js.Any])
    
    inline def setParentFolderUriUndefined: Self = StObject.set(x, "parentFolderUri", js.undefined)
    
    inline def setSha256(value: String): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
    
    inline def setSha256Undefined: Self = StObject.set(x, "sha256", js.undefined)
    
    inline def setThumbHeight(value: String): Self = StObject.set(x, "thumbHeight", value.asInstanceOf[js.Any])
    
    inline def setThumbHeightUndefined: Self = StObject.set(x, "thumbHeight", js.undefined)
    
    inline def setThumbWidth(value: String): Self = StObject.set(x, "thumbWidth", value.asInstanceOf[js.Any])
    
    inline def setThumbWidthUndefined: Self = StObject.set(x, "thumbWidth", js.undefined)
    
    inline def setThumbnail(value: /* Description of a page of a document. */ Page): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    inline def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    
    inline def setUserAuthorization(
      value: /* Provides properties that describe user authorization to a workspace. */ WorkspaceUserAuthorization
    ): Self = StObject.set(x, "userAuthorization", value.asInstanceOf[js.Any])
    
    inline def setUserAuthorizationUndefined: Self = StObject.set(x, "userAuthorization", js.undefined)
  }
}
