package typings.googleapis.calendarV3Mod.calendarV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCalendarlistWatch
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
    * The minimum access role for the user in the returned entries. Optional.
    * The default is no restriction.
    */
  var minAccessRole: js.UndefOr[String] = js.undefined
  
  /**
    * Token specifying which result page to return. Optional.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaChannel] = js.undefined
  
  /**
    * Whether to include deleted calendar list entries in the result. Optional.
    * The default is False.
    */
  var showDeleted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to show hidden entries. Optional. The default is False.
    */
  var showHidden: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Token obtained from the nextSyncToken field returned on the last page of
    * results from the previous list request. It makes the result of this list
    * request contain only entries that have changed since then. If only
    * read-only fields such as calendar properties or ACLs have changed, the
    * entry won't be returned. All entries deleted and hidden since the
    * previous list request will always be in the result set and it is not
    * allowed to set showDeleted neither showHidden to False. To ensure client
    * state consistency minAccessRole query parameter cannot be specified
    * together with nextSyncToken. If the syncToken expires, the server will
    * respond with a 410 GONE response code and the client should clear its
    * storage and perform a full synchronization without any syncToken. Learn
    * more about incremental synchronization. Optional. The default is to
    * return all entries.
    */
  var syncToken: js.UndefOr[String] = js.undefined
}
object ParamsResourceCalendarlistWatch {
  
  inline def apply(): ParamsResourceCalendarlistWatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCalendarlistWatch]
  }
  
  extension [Self <: ParamsResourceCalendarlistWatch](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setMinAccessRole(value: String): Self = StObject.set(x, "minAccessRole", value.asInstanceOf[js.Any])
    
    inline def setMinAccessRoleUndefined: Self = StObject.set(x, "minAccessRole", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setRequestBody(value: SchemaChannel): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setShowDeleted(value: Boolean): Self = StObject.set(x, "showDeleted", value.asInstanceOf[js.Any])
    
    inline def setShowDeletedUndefined: Self = StObject.set(x, "showDeleted", js.undefined)
    
    inline def setShowHidden(value: Boolean): Self = StObject.set(x, "showHidden", value.asInstanceOf[js.Any])
    
    inline def setShowHiddenUndefined: Self = StObject.set(x, "showHidden", js.undefined)
    
    inline def setSyncToken(value: String): Self = StObject.set(x, "syncToken", value.asInstanceOf[js.Any])
    
    inline def setSyncTokenUndefined: Self = StObject.set(x, "syncToken", js.undefined)
  }
}
