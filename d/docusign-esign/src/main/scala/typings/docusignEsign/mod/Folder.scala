package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Folder extends StObject {
  
  /**
    * This object describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[
    /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
  ] = js.native
  
  /**
    * An object used to present a filtered view of the items in a folder.
    */
  var filter: js.UndefOr[/* Use this object to create a filtered view of the items in a folder. */ Filter] = js.native
  
  /**
    * The id of the folder.
    */
  var folderId: js.UndefOr[String] = js.native
  
  /**
    * A list of envelopes and templates that the folder contains.
    */
  var folderItems: js.UndefOr[js.Array[/* Information about folder item results. */ FolderItemV2]] = js.native
  
  /**
    * A list of folder objects.
    */
  var folders: js.UndefOr[js.Array[/* This object contains details about a folder. */ Folder]] = js.native
  
  /**
    * When set to **true**, the current user has access to the folder.
    */
  var hasAccess: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the folder has subfolders.
    */
  var hasSubFolders: js.UndefOr[String] = js.native
  
  /**
    * The number of items in the folder.
    */
  var itemCount: js.UndefOr[String] = js.native
  
  /**
    * The name of the folder.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Information about the user who owns the folder.
    */
  var owner: js.UndefOr[UserInfo] = js.native
  
  /**
    * The id of the parent folder, or the special value `root` for the root folder.
    */
  var parentFolderId: js.UndefOr[String] = js.native
  
  /**
    * The URI of the parent folder.
    */
  var parentFolderUri: js.UndefOr[String] = js.native
  
  /**
    * The number of subfolders.
    */
  var subFolderCount: js.UndefOr[String] = js.native
  
  /**
    * The type of folder. Possible values include:
    *
    * - `draft`
    * - `inbox`
    * - `normal` (a system-generated folder)
    * - `recyclebin`
    * - `sentitems`
    * - `custom` (a custom folder created by a user)
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * The URI for the folder.
    */
  var uri: js.UndefOr[String] = js.native
}
object Folder {
  
  @scala.inline
  def apply(): Folder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Folder]
  }
  
  @scala.inline
  implicit class FolderMutableBuilder[Self <: Folder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
    
    @scala.inline
    def setFilter(value: /* Use this object to create a filtered view of the items in a folder. */ Filter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setFolderId(value: String): Self = StObject.set(x, "folderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFolderIdUndefined: Self = StObject.set(x, "folderId", js.undefined)
    
    @scala.inline
    def setFolderItems(value: js.Array[/* Information about folder item results. */ FolderItemV2]): Self = StObject.set(x, "folderItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFolderItemsUndefined: Self = StObject.set(x, "folderItems", js.undefined)
    
    @scala.inline
    def setFolderItemsVarargs(value: (/* Information about folder item results. */ FolderItemV2)*): Self = StObject.set(x, "folderItems", js.Array(value :_*))
    
    @scala.inline
    def setFolders(value: js.Array[/* This object contains details about a folder. */ Folder]): Self = StObject.set(x, "folders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFoldersUndefined: Self = StObject.set(x, "folders", js.undefined)
    
    @scala.inline
    def setFoldersVarargs(value: (/* This object contains details about a folder. */ Folder)*): Self = StObject.set(x, "folders", js.Array(value :_*))
    
    @scala.inline
    def setHasAccess(value: String): Self = StObject.set(x, "hasAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasAccessUndefined: Self = StObject.set(x, "hasAccess", js.undefined)
    
    @scala.inline
    def setHasSubFolders(value: String): Self = StObject.set(x, "hasSubFolders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasSubFoldersUndefined: Self = StObject.set(x, "hasSubFolders", js.undefined)
    
    @scala.inline
    def setItemCount(value: String): Self = StObject.set(x, "itemCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemCountUndefined: Self = StObject.set(x, "itemCount", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOwner(value: UserInfo): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setParentFolderId(value: String): Self = StObject.set(x, "parentFolderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentFolderIdUndefined: Self = StObject.set(x, "parentFolderId", js.undefined)
    
    @scala.inline
    def setParentFolderUri(value: String): Self = StObject.set(x, "parentFolderUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentFolderUriUndefined: Self = StObject.set(x, "parentFolderUri", js.undefined)
    
    @scala.inline
    def setSubFolderCount(value: String): Self = StObject.set(x, "subFolderCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubFolderCountUndefined: Self = StObject.set(x, "subFolderCount", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
