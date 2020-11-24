package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkspaceItems extends js.Object {
  
  /**
    * An object that describes the caller's workspace permissions.
    */
  var callerAuthorization: js.UndefOr[
    /* Provides properties that describe user authorization to a workspace. */ WorkspaceUserAuthorization
  ] = js.native
  
  /**
    * If the item is a file, this property specifies the content type of the file.
    */
  var contentType: js.UndefOr[String] = js.native
  
  /**
    * The UTC DateTime when the workspace item was created.
    */
  var created: js.UndefOr[String] = js.native
  
  /**
    * The id of the user who created the workspace item.
    */
  var createdById: js.UndefOr[String] = js.native
  
  /**
    * Details about the user who created the workspace item.
    */
  var createdByInformation: js.UndefOr[
    /* This object represents the workspace user. This property is only returned in response to user specific GET call.  */ WorkspaceUser
  ] = js.native
  
  /**
    * The file extension of a file item.
    */
  var extension: js.UndefOr[String] = js.native
  
  /**
    * The size of the file in bytes.
    */
  var fileSize: js.UndefOr[String] = js.native
  
  /**
    * The URI for retrieving the file.
    */
  var fileUri: js.UndefOr[String] = js.native
  
  /**
    * The id of the workspace item.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    *  When **true**, the item is public.
    */
  var isPublic: js.UndefOr[String] = js.native
  
  /**
    * The UTC DateTime that the item was last modified.
    */
  var lastModified: js.UndefOr[String] = js.native
  
  /**
    * The id of the user who last modified the item.
    */
  var lastModifiedById: js.UndefOr[String] = js.native
  
  /**
    * Details about the user who last modified the workspace item.
    */
  var lastModifiedByInformation: js.UndefOr[
    /* This object represents the workspace user. This property is only returned in response to user specific GET call.  */ WorkspaceUser
  ] = js.native
  
  /**
    * The name of the file or folder.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The number of pages in a file.
    */
  var pageCount: js.UndefOr[String] = js.native
  
  /**
    * The id of the parent folder, or the special value `root` for the root folder.
    */
  var parentFolderId: js.UndefOr[String] = js.native
  
  /**
    * The URI of the parent folder.
    */
  var parentFolderUri: js.UndefOr[String] = js.native
  
  /**
    * A 64-byte, Secure Hash Algorithm 256 (SHA256) checksum that the caller computes across the entirety of the original content of a file.
    * DocuSign compares this value to its own computation. If the two values are not equal, the original content and received content are not the same and the upload is refused.
    */
  var sha256: js.UndefOr[String] = js.native
  
  /**
    * The height of the thumbnail image.
    */
  var thumbHeight: js.UndefOr[String] = js.native
  
  /**
    * The width of the thumbnail image.
    */
  var thumbWidth: js.UndefOr[String] = js.native
  
  var thumbnail: js.UndefOr[/* Description of a page of a document. */ Page] = js.native
  
  /**
    * The type of workspace item. Valid values are:
    *
    * - `file`
    * - `folder`
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * A URI containing the user ID.
    */
  var uri: js.UndefOr[String] = js.native
  
  /**
    * An object that describes the user's workspace permissions.
    */
  var userAuthorization: js.UndefOr[
    /* Provides properties that describe user authorization to a workspace. */ WorkspaceUserAuthorization
  ] = js.native
}
object WorkspaceItems {
  
  @scala.inline
  def apply(): WorkspaceItems = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceItems]
  }
  
  @scala.inline
  implicit class WorkspaceItemsOps[Self <: WorkspaceItems] (val x: Self) extends AnyVal {
    
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
    def setCallerAuthorization(
      value: /* Provides properties that describe user authorization to a workspace. */ WorkspaceUserAuthorization
    ): Self = this.set("callerAuthorization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallerAuthorization: Self = this.set("callerAuthorization", js.undefined)
    
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    
    @scala.inline
    def setCreated(value: String): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    
    @scala.inline
    def setCreatedById(value: String): Self = this.set("createdById", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedById: Self = this.set("createdById", js.undefined)
    
    @scala.inline
    def setCreatedByInformation(
      value: /* This object represents the workspace user. This property is only returned in response to user specific GET call.  */ WorkspaceUser
    ): Self = this.set("createdByInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedByInformation: Self = this.set("createdByInformation", js.undefined)
    
    @scala.inline
    def setExtension(value: String): Self = this.set("extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtension: Self = this.set("extension", js.undefined)
    
    @scala.inline
    def setFileSize(value: String): Self = this.set("fileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileSize: Self = this.set("fileSize", js.undefined)
    
    @scala.inline
    def setFileUri(value: String): Self = this.set("fileUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileUri: Self = this.set("fileUri", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIsPublic(value: String): Self = this.set("isPublic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsPublic: Self = this.set("isPublic", js.undefined)
    
    @scala.inline
    def setLastModified(value: String): Self = this.set("lastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModified: Self = this.set("lastModified", js.undefined)
    
    @scala.inline
    def setLastModifiedById(value: String): Self = this.set("lastModifiedById", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedById: Self = this.set("lastModifiedById", js.undefined)
    
    @scala.inline
    def setLastModifiedByInformation(
      value: /* This object represents the workspace user. This property is only returned in response to user specific GET call.  */ WorkspaceUser
    ): Self = this.set("lastModifiedByInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedByInformation: Self = this.set("lastModifiedByInformation", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPageCount(value: String): Self = this.set("pageCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageCount: Self = this.set("pageCount", js.undefined)
    
    @scala.inline
    def setParentFolderId(value: String): Self = this.set("parentFolderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentFolderId: Self = this.set("parentFolderId", js.undefined)
    
    @scala.inline
    def setParentFolderUri(value: String): Self = this.set("parentFolderUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentFolderUri: Self = this.set("parentFolderUri", js.undefined)
    
    @scala.inline
    def setSha256(value: String): Self = this.set("sha256", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSha256: Self = this.set("sha256", js.undefined)
    
    @scala.inline
    def setThumbHeight(value: String): Self = this.set("thumbHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbHeight: Self = this.set("thumbHeight", js.undefined)
    
    @scala.inline
    def setThumbWidth(value: String): Self = this.set("thumbWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbWidth: Self = this.set("thumbWidth", js.undefined)
    
    @scala.inline
    def setThumbnail(value: /* Description of a page of a document. */ Page): Self = this.set("thumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbnail: Self = this.set("thumbnail", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
    
    @scala.inline
    def setUserAuthorization(
      value: /* Provides properties that describe user authorization to a workspace. */ WorkspaceUserAuthorization
    ): Self = this.set("userAuthorization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserAuthorization: Self = this.set("userAuthorization", js.undefined)
  }
}
