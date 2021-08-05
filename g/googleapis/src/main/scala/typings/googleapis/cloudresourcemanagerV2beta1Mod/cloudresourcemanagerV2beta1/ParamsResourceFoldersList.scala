package typings.googleapis.cloudresourcemanagerV2beta1Mod.cloudresourcemanagerV2beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceFoldersList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The maximum number of Folders to return in the response. This field is
    * optional.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * A pagination token returned from a previous call to `ListFolders` that
    * indicates where this listing should continue from. This field is
    * optional.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The resource name of the Organization or Folder whose Folders are being
    * listed. Must be of the form `folders/{folder_id}` or
    * `organizations/{org_id}`. Access to this method is controlled by checking
    * the `resourcemanager.folders.list` permission on the `parent`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Controls whether Folders in the DELETE_REQUESTED state should be
    * returned. Defaults to false. This field is optional.
    */
  var showDeleted: js.UndefOr[Boolean] = js.undefined
}
object ParamsResourceFoldersList {
  
  inline def apply(): ParamsResourceFoldersList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFoldersList]
  }
  
  extension [Self <: ParamsResourceFoldersList](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setShowDeleted(value: Boolean): Self = StObject.set(x, "showDeleted", value.asInstanceOf[js.Any])
    
    inline def setShowDeletedUndefined: Self = StObject.set(x, "showDeleted", js.undefined)
  }
}
