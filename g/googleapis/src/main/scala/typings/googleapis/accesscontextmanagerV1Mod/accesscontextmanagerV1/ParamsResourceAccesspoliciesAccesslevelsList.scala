package typings.googleapis.accesscontextmanagerV1Mod.accesscontextmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccesspoliciesAccesslevelsList
  extends StObject
     with StandardParameters {
  
  /**
    * Whether to return `BasicLevels` in the Cloud Common Expression language, as `CustomLevels`, rather than as `BasicLevels`. Defaults to returning `AccessLevels` in the format they were defined.
    */
  var accessLevelFormat: js.UndefOr[String] = js.undefined
  
  /**
    * Number of Access Levels to include in the list. Default 100.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Next page token for the next batch of Access Level instances. Defaults to the first page of results.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Resource name for the access policy to list Access Levels from. Format: `accessPolicies/{policy_id\}`
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceAccesspoliciesAccesslevelsList {
  
  inline def apply(): ParamsResourceAccesspoliciesAccesslevelsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccesspoliciesAccesslevelsList]
  }
  
  extension [Self <: ParamsResourceAccesspoliciesAccesslevelsList](x: Self) {
    
    inline def setAccessLevelFormat(value: String): Self = StObject.set(x, "accessLevelFormat", value.asInstanceOf[js.Any])
    
    inline def setAccessLevelFormatUndefined: Self = StObject.set(x, "accessLevelFormat", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
