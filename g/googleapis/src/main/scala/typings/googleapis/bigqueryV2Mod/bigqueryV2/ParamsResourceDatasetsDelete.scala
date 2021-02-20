package typings.googleapis.bigqueryV2Mod.bigqueryV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class ParamsResourceDatasetsDeleteMutableBuilder[Self <: ParamsResourceDatasetsDelete] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setDatasetId(value: String): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetIdUndefined: Self = StObject.set(x, "datasetId", js.undefined)
    
    @scala.inline
    def setDeleteContents(value: Boolean): Self = StObject.set(x, "deleteContents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteContentsUndefined: Self = StObject.set(x, "deleteContents", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
