package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceEnterprisesApplicationsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The preferred language for localized application info, as a BCP47 tag
    * (e.g. "en-US", "de"). If not specified the default language of the
    * application will be used.
    */
  var languageCode: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the application in the form
    * enterprises/{enterpriseId}/applications/{package_name}.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceEnterprisesApplicationsGet {
  
  @scala.inline
  def apply(): ParamsResourceEnterprisesApplicationsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEnterprisesApplicationsGet]
  }
  
  @scala.inline
  implicit class ParamsResourceEnterprisesApplicationsGetMutableBuilder[Self <: ParamsResourceEnterprisesApplicationsGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
