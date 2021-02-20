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
trait ParamsResourceDatasetsList extends StandardParameters {
  
  /**
    * Whether to list all datasets, including hidden ones
    */
  var all: js.UndefOr[Boolean] = js.native
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * An expression for filtering the results of the request by label. The
    * syntax is "labels.<name>[:<value>]". Multiple filters can be ANDed
    * together by connecting with a space. Example:
    * "labels.department:receiving labels.active". See Filtering datasets using
    * labels for details.
    */
  var filter: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of results to return
    */
  var maxResults: js.UndefOr[Double] = js.native
  
  /**
    * Page token, returned by a previous call, to request the next page of
    * results
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * Project ID of the datasets to be listed
    */
  var projectId: js.UndefOr[String] = js.native
}
object ParamsResourceDatasetsList {
  
  @scala.inline
  def apply(): ParamsResourceDatasetsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDatasetsList]
  }
  
  @scala.inline
  implicit class ParamsResourceDatasetsListMutableBuilder[Self <: ParamsResourceDatasetsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAll(value: Boolean): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
