package typings.googleapis.bigqueryV2Mod.bigqueryV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceDatasetsDelete extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Dataset ID of dataset being deleted
    */
  var datasetId: js.UndefOr[String] = js.native
  /**
    * If True, delete all the tables in the dataset. If False and the dataset
    * contains tables, the request will fail. Default is False
    */
  var deleteContents: js.UndefOr[Boolean] = js.native
  /**
    * Project ID of the dataset being deleted
    */
  var projectId: js.UndefOr[String] = js.native
}

object ParamsResourceDatasetsDelete {
  @scala.inline
  def apply(): ParamsResourceDatasetsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDatasetsDelete]
  }
  @scala.inline
  implicit class ParamsResourceDatasetsDeleteOps[Self <: ParamsResourceDatasetsDelete] (val x: Self) extends AnyVal {
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
    def setDatasetId(value: String): Self = this.set("datasetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatasetId: Self = this.set("datasetId", js.undefined)
    @scala.inline
    def setDeleteContents(value: Boolean): Self = this.set("deleteContents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteContents: Self = this.set("deleteContents", js.undefined)
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
  }
  
}

