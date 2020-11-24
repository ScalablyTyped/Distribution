package typings.fontoxml.com_.fontoxml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IInvocator extends js.Object {
  
  //Allow/disallow auto-save functionality.
  var autosave: js.UndefOr[Boolean] = js.native
  
  //The base URL where the CMS endpoints are exposed.
  var cmsBaseUrl: String = js.native
  
  //The document id's of the documents to load from the CMS.
  var documentIds: js.Array[String] = js.native
  
  //The edit session token to use for accessing the CMS endpoints.
  var editSessionToken: String = js.native
  
  //If set to a positive integer, enable the Heartbeat API to send every x seconds.
  var heartbeat: js.UndefOr[Double] = js.native
  
  //User information.
  var user: js.UndefOr[IUserInfo] = js.native
  
  //Workflow information.
  var workflow: js.UndefOr[IWorkflowInfo] = js.native
}
object IInvocator {
  
  @scala.inline
  def apply(cmsBaseUrl: String, documentIds: js.Array[String], editSessionToken: String): IInvocator = {
    val __obj = js.Dynamic.literal(cmsBaseUrl = cmsBaseUrl.asInstanceOf[js.Any], documentIds = documentIds.asInstanceOf[js.Any], editSessionToken = editSessionToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInvocator]
  }
  
  @scala.inline
  implicit class IInvocatorOps[Self <: IInvocator] (val x: Self) extends AnyVal {
    
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
    def setCmsBaseUrl(value: String): Self = this.set("cmsBaseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentIdsVarargs(value: String*): Self = this.set("documentIds", js.Array(value :_*))
    
    @scala.inline
    def setDocumentIds(value: js.Array[String]): Self = this.set("documentIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditSessionToken(value: String): Self = this.set("editSessionToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutosave(value: Boolean): Self = this.set("autosave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutosave: Self = this.set("autosave", js.undefined)
    
    @scala.inline
    def setHeartbeat(value: Double): Self = this.set("heartbeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeartbeat: Self = this.set("heartbeat", js.undefined)
    
    @scala.inline
    def setUser(value: IUserInfo): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
    
    @scala.inline
    def setWorkflow(value: IWorkflowInfo): Self = this.set("workflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkflow: Self = this.set("workflow", js.undefined)
  }
}
