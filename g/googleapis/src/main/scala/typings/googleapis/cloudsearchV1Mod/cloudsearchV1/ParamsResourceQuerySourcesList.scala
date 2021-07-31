package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceQuerySourcesList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Number of sources to return in the response.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * If set, the request will enable debugging features of Cloud Search. Only
    * turn on this field, if asked by Google to help with debugging.
    */
  @JSName("requestOptions.debugOptions.enableDebugging")
  var requestOptionsDotdebugOptionsDotenableDebugging: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The BCP-47 language code, such as "en-US" or "sr-Latn". For more
    * information, see
    * http://www.unicode.org/reports/tr35/#Unicode_locale_identifier. For
    * translations.
    */
  @JSName("requestOptions.languageCode")
  var requestOptionsDotlanguageCode: js.UndefOr[String] = js.undefined
  
  /**
    * Id of the application created using SearchApplicationsService.
    */
  @JSName("requestOptions.searchApplicationId")
  var requestOptionsDotsearchApplicationId: js.UndefOr[String] = js.undefined
  
  /**
    * Current user's time zone id, such as "America/Los_Angeles" or
    * "Australia/Sydney". These IDs are defined by [Unicode Common Locale Data
    * Repository (CLDR)](http://cldr.unicode.org/) project, and currently
    * available in the file
    * [timezone.xml](http://unicode.org/repos/cldr/trunk/common/bcp47/timezone.xml)
    */
  @JSName("requestOptions.timeZone")
  var requestOptionsDottimeZone: js.UndefOr[String] = js.undefined
}
object ParamsResourceQuerySourcesList {
  
  @scala.inline
  def apply(): ParamsResourceQuerySourcesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceQuerySourcesList]
  }
  
  @scala.inline
  implicit class ParamsResourceQuerySourcesListMutableBuilder[Self <: ParamsResourceQuerySourcesList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setRequestOptionsDotdebugOptionsDotenableDebugging(value: Boolean): Self = StObject.set(x, "requestOptions.debugOptions.enableDebugging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestOptionsDotdebugOptionsDotenableDebuggingUndefined: Self = StObject.set(x, "requestOptions.debugOptions.enableDebugging", js.undefined)
    
    @scala.inline
    def setRequestOptionsDotlanguageCode(value: String): Self = StObject.set(x, "requestOptions.languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestOptionsDotlanguageCodeUndefined: Self = StObject.set(x, "requestOptions.languageCode", js.undefined)
    
    @scala.inline
    def setRequestOptionsDotsearchApplicationId(value: String): Self = StObject.set(x, "requestOptions.searchApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestOptionsDotsearchApplicationIdUndefined: Self = StObject.set(x, "requestOptions.searchApplicationId", js.undefined)
    
    @scala.inline
    def setRequestOptionsDottimeZone(value: String): Self = StObject.set(x, "requestOptions.timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestOptionsDottimeZoneUndefined: Self = StObject.set(x, "requestOptions.timeZone", js.undefined)
  }
}
