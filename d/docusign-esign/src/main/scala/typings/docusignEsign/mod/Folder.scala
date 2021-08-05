package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Folder extends StObject {
  
  /**
    * This object describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[
    /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
  ] = js.undefined
  
  /**
    * An object used to present a filtered view of the items in a folder.
    */
  var filter: js.UndefOr[/* Use this object to create a filtered view of the items in a folder. */ Filter] = js.undefined
  
  /**
    * The id of the folder.
    */
  var folderId: js.UndefOr[String] = js.undefined
  
  /**
    * A list of envelopes and templates that the folder contains.
    */
  var folderItems: js.UndefOr[js.Array[/* Information about folder item results. */ FolderItemV2]] = js.undefined
  
  /**
    * A list of folder objects.
    */
  var folders: js.UndefOr[js.Array[/* This object contains details about a folder. */ Folder]] = js.undefined
  
  /**
    * When set to **true**, the current user has access to the folder.
    */
  var hasAccess: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, the folder has subfolders.
    */
  var hasSubFolders: js.UndefOr[String] = js.undefined
  
  /**
    * The number of items in the folder.
    */
  var itemCount: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the folder.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the user who owns the folder.
    */
  var owner: js.UndefOr[UserInfo] = js.undefined
  
  /**
    * The id of the parent folder, or the special value `root` for the root folder.
    */
  var parentFolderId: js.UndefOr[String] = js.undefined
  
  /**
    * The URI of the parent folder.
    */
  var parentFolderUri: js.UndefOr[String] = js.undefined
  
  /**
    * The number of subfolders.
    */
  var subFolderCount: js.UndefOr[String] = js.undefined
  
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
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * The URI for the folder.
    */
  var uri: js.UndefOr[String] = js.undefined
}
object Folder {
  
  inline def apply(): Folder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Folder]
  }
  
  extension [Self <: Folder](x: Self) {
    
    inline def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    inline def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
    
    inline def setFilter(value: /* Use this object to create a filtered view of the items in a folder. */ Filter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFolderId(value: String): Self = StObject.set(x, "folderId", value.asInstanceOf[js.Any])
    
    inline def setFolderIdUndefined: Self = StObject.set(x, "folderId", js.undefined)
    
    inline def setFolderItems(value: js.Array[/* Information about folder item results. */ FolderItemV2]): Self = StObject.set(x, "folderItems", value.asInstanceOf[js.Any])
    
    inline def setFolderItemsUndefined: Self = StObject.set(x, "folderItems", js.undefined)
    
    inline def setFolderItemsVarargs(value: (/* Information about folder item results. */ FolderItemV2)*): Self = StObject.set(x, "folderItems", js.Array(value :_*))
    
    inline def setFolders(value: js.Array[/* This object contains details about a folder. */ Folder]): Self = StObject.set(x, "folders", value.asInstanceOf[js.Any])
    
    inline def setFoldersUndefined: Self = StObject.set(x, "folders", js.undefined)
    
    inline def setFoldersVarargs(value: (/* This object contains details about a folder. */ Folder)*): Self = StObject.set(x, "folders", js.Array(value :_*))
    
    inline def setHasAccess(value: String): Self = StObject.set(x, "hasAccess", value.asInstanceOf[js.Any])
    
    inline def setHasAccessUndefined: Self = StObject.set(x, "hasAccess", js.undefined)
    
    inline def setHasSubFolders(value: String): Self = StObject.set(x, "hasSubFolders", value.asInstanceOf[js.Any])
    
    inline def setHasSubFoldersUndefined: Self = StObject.set(x, "hasSubFolders", js.undefined)
    
    inline def setItemCount(value: String): Self = StObject.set(x, "itemCount", value.asInstanceOf[js.Any])
    
    inline def setItemCountUndefined: Self = StObject.set(x, "itemCount", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOwner(value: UserInfo): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setParentFolderId(value: String): Self = StObject.set(x, "parentFolderId", value.asInstanceOf[js.Any])
    
    inline def setParentFolderIdUndefined: Self = StObject.set(x, "parentFolderId", js.undefined)
    
    inline def setParentFolderUri(value: String): Self = StObject.set(x, "parentFolderUri", value.asInstanceOf[js.Any])
    
    inline def setParentFolderUriUndefined: Self = StObject.set(x, "parentFolderUri", js.undefined)
    
    inline def setSubFolderCount(value: String): Self = StObject.set(x, "subFolderCount", value.asInstanceOf[js.Any])
    
    inline def setSubFolderCountUndefined: Self = StObject.set(x, "subFolderCount", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
