package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateSharedItem extends js.Object {
  
  /**
    * This object describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[
    /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
  ] = js.native
  
  /**
    * Information about the user who owns the template.
    */
  var owner: js.UndefOr[UserInfo] = js.native
  
  /**
    * The user's encrypted password hash.
    */
  var password: js.UndefOr[String] = js.native
  
  /**
    * How the template is shared. One of:
    *
    * - `not_shared`
    * - `shared_to`
    *
    */
  var shared: js.UndefOr[String] = js.native
  
  /**
    * List of groups that share the template.
    */
  var sharedGroups: js.UndefOr[
    js.Array[/* Information about items shared among groups. */ MemberGroupSharedItem]
  ] = js.native
  
  /**
    * List of users that share the template.
    */
  var sharedUsers: js.UndefOr[js.Array[/* Information about a shared item. */ UserSharedItem]] = js.native
  
  /**
    * The unique identifier of the template. If this is not provided, DocuSign will generate a value.
    */
  var templateId: js.UndefOr[String] = js.native
  
  /**
    * The name of the shared template.
    */
  var templateName: js.UndefOr[String] = js.native
}
object TemplateSharedItem {
  
  @scala.inline
  def apply(): TemplateSharedItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateSharedItem]
  }
  
  @scala.inline
  implicit class TemplateSharedItemOps[Self <: TemplateSharedItem] (val x: Self) extends AnyVal {
    
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
    def setOwner(value: UserInfo): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
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
    def setTemplateId(value: String): Self = this.set("templateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateId: Self = this.set("templateId", js.undefined)
    
    @scala.inline
    def setTemplateName(value: String): Self = this.set("templateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateName: Self = this.set("templateName", js.undefined)
  }
}
