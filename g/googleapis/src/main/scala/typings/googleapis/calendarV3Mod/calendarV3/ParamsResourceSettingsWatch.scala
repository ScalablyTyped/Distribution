package typings.googleapis.calendarV3Mod.calendarV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceSettingsWatch
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Maximum number of entries returned on one result page. By default the
    * value is 100 entries. The page size can never be larger than 250 entries.
    * Optional.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * Token specifying which result page to return. Optional.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaChannel] = js.undefined
  
  /**
    * Token obtained from the nextSyncToken field returned on the last page of
    * results from the previous list request. It makes the result of this list
    * request contain only entries that have changed since then. If the
    * syncToken expires, the server will respond with a 410 GONE response code
    * and the client should clear its storage and perform a full
    * synchronization without any syncToken. Learn more about incremental
    * synchronization. Optional. The default is to return all entries.
    */
  var syncToken: js.UndefOr[String] = js.undefined
}
object ParamsResourceSettingsWatch {
  
  @scala.inline
  def apply(): ParamsResourceSettingsWatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSettingsWatch]
  }
  
  @scala.inline
  implicit class ParamsResourceSettingsWatchMutableBuilder[Self <: ParamsResourceSettingsWatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaChannel): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setSyncToken(value: String): Self = StObject.set(x, "syncToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyncTokenUndefined: Self = StObject.set(x, "syncToken", js.undefined)
  }
}
