package typings.googleapis.apigeeregistryV1Mod.apigeeregistryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsApisDeploymentsListrevisions
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the deployment to list revisions for.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of revisions to return per page.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The page token, received from a previous ListApiDeploymentRevisions call. Provide this to retrieve the subsequent page.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsApisDeploymentsListrevisions {
  
  inline def apply(): ParamsResourceProjectsLocationsApisDeploymentsListrevisions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsApisDeploymentsListrevisions]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsApisDeploymentsListrevisions](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
