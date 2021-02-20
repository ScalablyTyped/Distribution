package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FolderSharedItem extends StObject {
  
  /**
    * This object describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[
    /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
  ] = js.native
  
  /**
    * The id of the folder.
    */
  var folderId: js.UndefOr[String] = js.native
  
  /**
    * The name of the folder.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Information about the user who owns the folder.
    */
  var owner: js.UndefOr[UserInfo] = js.native
  
  /**
    * The id of the parent folder.
    */
  var parentFolderId: js.UndefOr[String] = js.native
  
  /**
    * The URI for the parent folder.
    */
  var parentFolderUri: js.UndefOr[String] = js.native
  
  /**
    * Indicates how the folder is shared. Valid values are:
    *
    * - `not_shared`
    * - `shared_to`
    */
  var shared: js.UndefOr[String] = js.native
  
  /**
    * A list of groups that share the folder.
    */
  var sharedGroups: js.UndefOr[
    js.Array[/* Information about items shared among groups. */ MemberGroupSharedItem]
  ] = js.native
  
  /**
    * A list of users that share the folder.
    */
  var sharedUsers: js.UndefOr[js.Array[/* Information about a shared item. */ UserSharedItem]] = js.native
  
  /**
    * A URI containing the user ID.
    */
  var uri: js.UndefOr[String] = js.native
  
  /**
    * Information about the user associated with the folder.
    */
  var user: js.UndefOr[UserInfo] = js.native
}
object FolderSharedItem {
  
  @scala.inline
  def apply(): FolderSharedItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FolderSharedItem]
  }
  
  @scala.inline
  implicit class FolderSharedItemMutableBuilder[Self <: FolderSharedItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
    
    @scala.inline
    def setFolderId(value: String): Self = StObject.set(x, "folderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFolderIdUndefined: Self = StObject.set(x, "folderId", js.undefined)
    
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
    def setShared(value: String): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedGroups(value: js.Array[/* Information about items shared among groups. */ MemberGroupSharedItem]): Self = StObject.set(x, "sharedGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedGroupsUndefined: Self = StObject.set(x, "sharedGroups", js.undefined)
    
    @scala.inline
    def setSharedGroupsVarargs(value: (/* Information about items shared among groups. */ MemberGroupSharedItem)*): Self = StObject.set(x, "sharedGroups", js.Array(value :_*))
    
    @scala.inline
    def setSharedUndefined: Self = StObject.set(x, "shared", js.undefined)
    
    @scala.inline
    def setSharedUsers(value: js.Array[/* Information about a shared item. */ UserSharedItem]): Self = StObject.set(x, "sharedUsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedUsersUndefined: Self = StObject.set(x, "sharedUsers", js.undefined)
    
    @scala.inline
    def setSharedUsersVarargs(value: (/* Information about a shared item. */ UserSharedItem)*): Self = StObject.set(x, "sharedUsers", js.Array(value :_*))
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    
    @scala.inline
    def setUser(value: UserInfo): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
