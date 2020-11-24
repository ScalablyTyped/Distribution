package typings.googleCloudStorage.storageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetHmacKeysOptions extends js.Object {
  
  var autoPaginate: js.UndefOr[Boolean] = js.native
  
  var maxApiCalls: js.UndefOr[Double] = js.native
  
  var maxResults: js.UndefOr[Double] = js.native
  
  var pageToken: js.UndefOr[String] = js.native
  
  var projectId: js.UndefOr[String] = js.native
  
  var serviceAccountEmail: js.UndefOr[String] = js.native
  
  var showDeletedKeys: js.UndefOr[Boolean] = js.native
  
  var userProject: js.UndefOr[String] = js.native
}
object GetHmacKeysOptions {
  
  @scala.inline
  def apply(): GetHmacKeysOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetHmacKeysOptions]
  }
  
  @scala.inline
  implicit class GetHmacKeysOptionsOps[Self <: GetHmacKeysOptions] (val x: Self) extends AnyVal {
    
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
    def setAutoPaginate(value: Boolean): Self = this.set("autoPaginate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoPaginate: Self = this.set("autoPaginate", js.undefined)
    
    @scala.inline
    def setMaxApiCalls(value: Double): Self = this.set("maxApiCalls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxApiCalls: Self = this.set("maxApiCalls", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    
    @scala.inline
    def setServiceAccountEmail(value: String): Self = this.set("serviceAccountEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceAccountEmail: Self = this.set("serviceAccountEmail", js.undefined)
    
    @scala.inline
    def setShowDeletedKeys(value: Boolean): Self = this.set("showDeletedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowDeletedKeys: Self = this.set("showDeletedKeys", js.undefined)
    
    @scala.inline
    def setUserProject(value: String): Self = this.set("userProject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserProject: Self = this.set("userProject", js.undefined)
  }
}
