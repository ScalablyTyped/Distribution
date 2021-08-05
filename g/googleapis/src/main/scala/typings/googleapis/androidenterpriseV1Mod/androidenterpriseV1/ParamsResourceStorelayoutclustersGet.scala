package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceStorelayoutclustersGet
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The ID of the cluster.
    */
  var clusterId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the enterprise.
    */
  var enterpriseId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the page.
    */
  var pageId: js.UndefOr[String] = js.undefined
}
object ParamsResourceStorelayoutclustersGet {
  
  inline def apply(): ParamsResourceStorelayoutclustersGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceStorelayoutclustersGet]
  }
  
  extension [Self <: ParamsResourceStorelayoutclustersGet](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setClusterId(value: String): Self = StObject.set(x, "clusterId", value.asInstanceOf[js.Any])
    
    inline def setClusterIdUndefined: Self = StObject.set(x, "clusterId", js.undefined)
    
    inline def setEnterpriseId(value: String): Self = StObject.set(x, "enterpriseId", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseIdUndefined: Self = StObject.set(x, "enterpriseId", js.undefined)
    
    inline def setPageId(value: String): Self = StObject.set(x, "pageId", value.asInstanceOf[js.Any])
    
    inline def setPageIdUndefined: Self = StObject.set(x, "pageId", js.undefined)
  }
}
