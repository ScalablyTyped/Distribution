package typings.googleapis.accesscontextmanagerV1Mod.accesscontextmanagerV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccesspoliciesAccesslevelsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Whether to return `BasicLevels` in the Cloud Common Expression Language
    * rather than as `BasicLevels`. Defaults to AS_DEFINED, where Access Levels
    * are returned as `BasicLevels` or `CustomLevels` based on how they were
    * created. If set to CEL, all Access Levels are returned as `CustomLevels`.
    * In the CEL case, `BasicLevels` are translated to equivalent
    * `CustomLevels`.
    */
  var accessLevelFormat: js.UndefOr[String] = js.undefined
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Required. Resource name for the Access Level.  Format:
    * `accessPolicies/{policy_id}/accessLevels/{access_level_id}`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceAccesspoliciesAccesslevelsGet {
  
  inline def apply(): ParamsResourceAccesspoliciesAccesslevelsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccesspoliciesAccesslevelsGet]
  }
  
  extension [Self <: ParamsResourceAccesspoliciesAccesslevelsGet](x: Self) {
    
    inline def setAccessLevelFormat(value: String): Self = StObject.set(x, "accessLevelFormat", value.asInstanceOf[js.Any])
    
    inline def setAccessLevelFormatUndefined: Self = StObject.set(x, "accessLevelFormat", js.undefined)
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
