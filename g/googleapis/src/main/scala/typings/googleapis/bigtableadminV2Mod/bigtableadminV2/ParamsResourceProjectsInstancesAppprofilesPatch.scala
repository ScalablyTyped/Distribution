package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsInstancesAppprofilesPatch extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * If true, ignore safety checks when updating the app profile.
    */
  var ignoreWarnings: js.UndefOr[Boolean] = js.native
  
  /**
    * (`OutputOnly`) The unique name of the app profile. Values are of the form
    * `projects/<project>/instances/<instance>/appProfiles/_a-zA-Z0-9*`.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAppProfile] = js.native
  
  /**
    * The subset of app profile fields which should be replaced. If unset, all
    * fields will be replaced.
    */
  var updateMask: js.UndefOr[String] = js.native
}
object ParamsResourceProjectsInstancesAppprofilesPatch {
  
  @scala.inline
  def apply(): ParamsResourceProjectsInstancesAppprofilesPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsInstancesAppprofilesPatch]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsInstancesAppprofilesPatchMutableBuilder[Self <: ParamsResourceProjectsInstancesAppprofilesPatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setIgnoreWarnings(value: Boolean): Self = StObject.set(x, "ignoreWarnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreWarningsUndefined: Self = StObject.set(x, "ignoreWarnings", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaAppProfile): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
