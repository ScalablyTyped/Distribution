package typings.googleapis.appsactivityV1Mod.appsactivityV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceActivitiesList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Identifies the Drive folder containing the items for which to return
    * activities.
    */
  @JSName("drive.ancestorId")
  var driveDotancestorId: js.UndefOr[String] = js.native
  
  /**
    * Identifies the Drive item to return activities for.
    */
  @JSName("drive.fileId")
  var driveDotfileId: js.UndefOr[String] = js.native
  
  /**
    * Indicates the strategy to use when grouping singleEvents items in the
    * associated combinedEvent object.
    */
  var groupingStrategy: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of events to return on a page. The response includes a
    * continuation token if there are more events.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * A token to retrieve a specific page of results.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * The Google service from which to return activities. Possible values of
    * source are:  - drive.google.com
    */
  var source: js.UndefOr[String] = js.native
  
  /**
    * The ID used for ACL checks (does not filter the resulting event list by
    * the assigned value). Use the special value me to indicate the currently
    * authenticated user.
    */
  var userId: js.UndefOr[String] = js.native
}
object ParamsResourceActivitiesList {
  
  @scala.inline
  def apply(): ParamsResourceActivitiesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceActivitiesList]
  }
  
  @scala.inline
  implicit class ParamsResourceActivitiesListMutableBuilder[Self <: ParamsResourceActivitiesList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setDriveDotancestorId(value: String): Self = StObject.set(x, "drive.ancestorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriveDotancestorIdUndefined: Self = StObject.set(x, "drive.ancestorId", js.undefined)
    
    @scala.inline
    def setDriveDotfileId(value: String): Self = StObject.set(x, "drive.fileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriveDotfileIdUndefined: Self = StObject.set(x, "drive.fileId", js.undefined)
    
    @scala.inline
    def setGroupingStrategy(value: String): Self = StObject.set(x, "groupingStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupingStrategyUndefined: Self = StObject.set(x, "groupingStrategy", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
