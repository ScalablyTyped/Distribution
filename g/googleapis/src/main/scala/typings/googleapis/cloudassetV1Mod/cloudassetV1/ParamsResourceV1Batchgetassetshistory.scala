package typings.googleapis.cloudassetV1Mod.cloudassetV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceV1Batchgetassetshistory
  extends StObject
     with StandardParameters {
  
  /**
    * A list of the full names of the assets. For example:
    * `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1`.
    * See [Resource
    * Names](https://cloud.google.com/apis/design/resource_names#full_resource_name)
    * and [Resource Name
    * Format](https://cloud.google.com/resource-manager/docs/cloud-asset-inventory/resource-name-format)
    * for more info.  The request becomes a no-op if the asset name list is
    * empty, and the max size of the asset name list is 100 in one request.
    */
  var assetNames: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Required. The content type.
    */
  var contentType: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The relative name of the root asset. It can only be an
    * organization number (such as "organizations/123"), a project ID (such as
    * "projects/my-project-id")", or a project number (such as
    * "projects/12345").
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * End time of the time window (inclusive). Current timestamp if not
    * specified.
    */
  @JSName("readTimeWindow.endTime")
  var readTimeWindowDotendTime: js.UndefOr[String] = js.undefined
  
  /**
    * Start time of the time window (exclusive).
    */
  @JSName("readTimeWindow.startTime")
  var readTimeWindowDotstartTime: js.UndefOr[String] = js.undefined
}
object ParamsResourceV1Batchgetassetshistory {
  
  inline def apply(): ParamsResourceV1Batchgetassetshistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceV1Batchgetassetshistory]
  }
  
  extension [Self <: ParamsResourceV1Batchgetassetshistory](x: Self) {
    
    inline def setAssetNames(value: js.Array[String]): Self = StObject.set(x, "assetNames", value.asInstanceOf[js.Any])
    
    inline def setAssetNamesUndefined: Self = StObject.set(x, "assetNames", js.undefined)
    
    inline def setAssetNamesVarargs(value: String*): Self = StObject.set(x, "assetNames", js.Array(value :_*))
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setReadTimeWindowDotendTime(value: String): Self = StObject.set(x, "readTimeWindow.endTime", value.asInstanceOf[js.Any])
    
    inline def setReadTimeWindowDotendTimeUndefined: Self = StObject.set(x, "readTimeWindow.endTime", js.undefined)
    
    inline def setReadTimeWindowDotstartTime(value: String): Self = StObject.set(x, "readTimeWindow.startTime", value.asInstanceOf[js.Any])
    
    inline def setReadTimeWindowDotstartTimeUndefined: Self = StObject.set(x, "readTimeWindow.startTime", js.undefined)
  }
}
