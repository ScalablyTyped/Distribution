package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FolderSharedItem extends js.Object {
  
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
  implicit class FolderSharedItemOps[Self <: FolderSharedItem] (val x: Self) extends AnyVal {
    
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
    def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = this.set("errorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorDetails: Self = this.set("errorDetails", js.undefined)
    
    @scala.inline
    def setFolderId(value: String): Self = this.set("folderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFolderId: Self = this.set("folderId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOwner(value: UserInfo): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    
    @scala.inline
    def setParentFolderId(value: String): Self = this.set("parentFolderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentFolderId: Self = this.set("parentFolderId", js.undefined)
    
    @scala.inline
    def setParentFolderUri(value: String): Self = this.set("parentFolderUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentFolderUri: Self = this.set("parentFolderUri", js.undefined)
    
    @scala.inline
    def setShared(value: String): Self = this.set("shared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShared: Self = this.set("shared", js.undefined)
    
    @scala.inline
    def setSharedGroupsVarargs(value: (/* Information about items shared among groups. */ MemberGroupSharedItem)*): Self = this.set("sharedGroups", js.Array(value :_*))
    
    @scala.inline
    def setSharedGroups(value: js.Array[/* Information about items shared among groups. */ MemberGroupSharedItem]): Self = this.set("sharedGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharedGroups: Self = this.set("sharedGroups", js.undefined)
    
    @scala.inline
    def setSharedUsersVarargs(value: (/* Information about a shared item. */ UserSharedItem)*): Self = this.set("sharedUsers", js.Array(value :_*))
    
    @scala.inline
    def setSharedUsers(value: js.Array[/* Information about a shared item. */ UserSharedItem]): Self = this.set("sharedUsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharedUsers: Self = this.set("sharedUsers", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
    
    @scala.inline
    def setUser(value: UserInfo): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
}
