package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsInstancesAppprofilesCreate
  extends StObject
     with StandardParameters {
  
  /**
    * The ID to be used when referring to the new app profile within its
    * instance, e.g., just `myprofile` rather than
    * `projects/myproject/instances/myinstance/appProfiles/myprofile`.
    */
  var appProfileId: js.UndefOr[String] = js.undefined
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * If true, ignore safety checks when creating the app profile.
    */
  var ignoreWarnings: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The unique name of the instance in which to create the new app profile.
    * Values are of the form `projects/<project>/instances/<instance>`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAppProfile] = js.undefined
}
object ParamsResourceProjectsInstancesAppprofilesCreate {
  
  inline def apply(): ParamsResourceProjectsInstancesAppprofilesCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsInstancesAppprofilesCreate]
  }
  
  extension [Self <: ParamsResourceProjectsInstancesAppprofilesCreate](x: Self) {
    
    inline def setAppProfileId(value: String): Self = StObject.set(x, "appProfileId", value.asInstanceOf[js.Any])
    
    inline def setAppProfileIdUndefined: Self = StObject.set(x, "appProfileId", js.undefined)
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setIgnoreWarnings(value: Boolean): Self = StObject.set(x, "ignoreWarnings", value.asInstanceOf[js.Any])
    
    inline def setIgnoreWarningsUndefined: Self = StObject.set(x, "ignoreWarnings", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaAppProfile): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
