package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MemberSharedItems extends js.Object {
  
  /**
    * List of information about shared envelopes.
    */
  var envelopes: js.UndefOr[js.Array[/* Information about the shared item. */ SharedItem]] = js.native
  
  /**
    * This object describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[
    /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
  ] = js.native
  
  /**
    * List of information about shared folders.
    */
  var folders: js.UndefOr[js.Array[FolderSharedItem]] = js.native
  
  /**
    * List of information about shared templates.
    */
  var templates: js.UndefOr[js.Array[/* Information about shared templates. */ TemplateSharedItem]] = js.native
  
  /**
    * Information about the user requesting sharing information.
    */
  var user: js.UndefOr[UserInfo] = js.native
}
object MemberSharedItems {
  
  @scala.inline
  def apply(): MemberSharedItems = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MemberSharedItems]
  }
  
  @scala.inline
  implicit class MemberSharedItemsOps[Self <: MemberSharedItems] (val x: Self) extends AnyVal {
    
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
    def setEnvelopesVarargs(value: (/* Information about the shared item. */ SharedItem)*): Self = this.set("envelopes", js.Array(value :_*))
    
    @scala.inline
    def setEnvelopes(value: js.Array[/* Information about the shared item. */ SharedItem]): Self = this.set("envelopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvelopes: Self = this.set("envelopes", js.undefined)
    
    @scala.inline
    def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = this.set("errorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorDetails: Self = this.set("errorDetails", js.undefined)
    
    @scala.inline
    def setFoldersVarargs(value: FolderSharedItem*): Self = this.set("folders", js.Array(value :_*))
    
    @scala.inline
    def setFolders(value: js.Array[FolderSharedItem]): Self = this.set("folders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFolders: Self = this.set("folders", js.undefined)
    
    @scala.inline
    def setTemplatesVarargs(value: (/* Information about shared templates. */ TemplateSharedItem)*): Self = this.set("templates", js.Array(value :_*))
    
    @scala.inline
    def setTemplates(value: js.Array[/* Information about shared templates. */ TemplateSharedItem]): Self = this.set("templates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplates: Self = this.set("templates", js.undefined)
    
    @scala.inline
    def setUser(value: UserInfo): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
}
