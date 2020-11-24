package typings.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsTransferconfigsRunsTransferlogsList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Message types to return. If not populated - INFO, WARNING and ERROR
    * messages are returned.
    */
  var messageTypes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Page size. The default page size is the maximum value of 1000 results.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * Pagination token, which can be used to request a specific page of
    * `ListTransferLogsRequest` list results. For multiple-page results,
    * `ListTransferLogsResponse` outputs a `next_page` token, which can be used
    * as the `page_token` value to request the next page of list results.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * Transfer run name in the form:
    * `projects/{project_id}/transferConfigs/{config_Id}/runs/{run_id}`.
    */
  var parent: js.UndefOr[String] = js.native
}
object ParamsResourceProjectsTransferconfigsRunsTransferlogsList {
  
  @scala.inline
  def apply(): ParamsResourceProjectsTransferconfigsRunsTransferlogsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsTransferconfigsRunsTransferlogsList]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsTransferconfigsRunsTransferlogsListOps[Self <: ParamsResourceProjectsTransferconfigsRunsTransferlogsList] (val x: Self) extends AnyVal {
    
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
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setMessageTypesVarargs(value: String*): Self = this.set("messageTypes", js.Array(value :_*))
    
    @scala.inline
    def setMessageTypes(value: js.Array[String]): Self = this.set("messageTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageTypes: Self = this.set("messageTypes", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
  }
}
