package typings.googleapis.cloudassetV1beta1Mod.cloudassetV1beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceOrganizationsBatchgetassetshistory extends StandardParameters {
  
  /**
    * A list of the full names of the assets. For example:
    * `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1`.
    * See [Resource
    * Names](https://cloud.google.com/apis/design/resource_names#full_resource_name)
    * for more info.  The request becomes a no-op if the asset name list is
    * empty, and the max size of the asset name list is 100 in one request.
    */
  var assetNames: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Required. The content type.
    */
  var contentType: js.UndefOr[String] = js.native
  
  /**
    * Required. The relative name of the root asset. It can only be an
    * organization number (such as "organizations/123"), a project ID (such as
    * "projects/my-project-id")", or a project number (such as
    * "projects/12345").
    */
  var parent: js.UndefOr[String] = js.native
  
  /**
    * End time of the time window (inclusive). Current timestamp if not
    * specified.
    */
  @JSName("readTimeWindow.endTime")
  var readTimeWindowDotendTime: js.UndefOr[String] = js.native
  
  /**
    * Start time of the time window (exclusive).
    */
  @JSName("readTimeWindow.startTime")
  var readTimeWindowDotstartTime: js.UndefOr[String] = js.native
}
object ParamsResourceOrganizationsBatchgetassetshistory {
  
  @scala.inline
  def apply(): ParamsResourceOrganizationsBatchgetassetshistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsBatchgetassetshistory]
  }
  
  @scala.inline
  implicit class ParamsResourceOrganizationsBatchgetassetshistoryOps[Self <: ParamsResourceOrganizationsBatchgetassetshistory] (val x: Self) extends AnyVal {
    
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
    def setAssetNamesVarargs(value: String*): Self = this.set("assetNames", js.Array(value :_*))
    
    @scala.inline
    def setAssetNames(value: js.Array[String]): Self = this.set("assetNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssetNames: Self = this.set("assetNames", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setReadTimeWindowDotendTime(value: String): Self = this.set("readTimeWindow.endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadTimeWindowDotendTime: Self = this.set("readTimeWindow.endTime", js.undefined)
    
    @scala.inline
    def setReadTimeWindowDotstartTime(value: String): Self = this.set("readTimeWindow.startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadTimeWindowDotstartTime: Self = this.set("readTimeWindow.startTime", js.undefined)
  }
}
