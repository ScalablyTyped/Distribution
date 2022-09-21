package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceQuerySourcesList
  extends StObject
     with StandardParameters {
  
  /**
    * Number of sources to return in the response.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * If you are asked by Google to help with debugging, set this field. Otherwise, ignore this field.
    */
  @JSName("requestOptions.debugOptions.enableDebugging")
  var requestOptionsDotdebugOptionsDotenableDebugging: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The BCP-47 language code, such as "en-US" or "sr-Latn". For more information, see http://www.unicode.org/reports/tr35/#Unicode_locale_identifier. For translations. Set this field using the language set in browser or for the page. In the event that the user's language preference is known, set this field to the known user language. When specified, the documents in search results are biased towards the specified language. The suggest API does not use this parameter. Instead, suggest autocompletes only based on characters in the query.
    */
  @JSName("requestOptions.languageCode")
  var requestOptionsDotlanguageCode: js.UndefOr[String] = js.undefined
  
  /**
    * The ID generated when you create a search application using the [admin console](https://support.google.com/a/answer/9043922).
    */
  @JSName("requestOptions.searchApplicationId")
  var requestOptionsDotsearchApplicationId: js.UndefOr[String] = js.undefined
  
  /**
    * Current user's time zone id, such as "America/Los_Angeles" or "Australia/Sydney". These IDs are defined by [Unicode Common Locale Data Repository (CLDR)](http://cldr.unicode.org/) project, and currently available in the file [timezone.xml](http://unicode.org/repos/cldr/trunk/common/bcp47/timezone.xml). This field is used to correctly interpret date and time queries. If this field is not specified, the default time zone (UTC) is used.
    */
  @JSName("requestOptions.timeZone")
  var requestOptionsDottimeZone: js.UndefOr[String] = js.undefined
}
object ParamsResourceQuerySourcesList {
  
  inline def apply(): ParamsResourceQuerySourcesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceQuerySourcesList]
  }
  
  extension [Self <: ParamsResourceQuerySourcesList](x: Self) {
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setRequestOptionsDotdebugOptionsDotenableDebugging(value: Boolean): Self = StObject.set(x, "requestOptions.debugOptions.enableDebugging", value.asInstanceOf[js.Any])
    
    inline def setRequestOptionsDotdebugOptionsDotenableDebuggingUndefined: Self = StObject.set(x, "requestOptions.debugOptions.enableDebugging", js.undefined)
    
    inline def setRequestOptionsDotlanguageCode(value: String): Self = StObject.set(x, "requestOptions.languageCode", value.asInstanceOf[js.Any])
    
    inline def setRequestOptionsDotlanguageCodeUndefined: Self = StObject.set(x, "requestOptions.languageCode", js.undefined)
    
    inline def setRequestOptionsDotsearchApplicationId(value: String): Self = StObject.set(x, "requestOptions.searchApplicationId", value.asInstanceOf[js.Any])
    
    inline def setRequestOptionsDotsearchApplicationIdUndefined: Self = StObject.set(x, "requestOptions.searchApplicationId", js.undefined)
    
    inline def setRequestOptionsDottimeZone(value: String): Self = StObject.set(x, "requestOptions.timeZone", value.asInstanceOf[js.Any])
    
    inline def setRequestOptionsDottimeZoneUndefined: Self = StObject.set(x, "requestOptions.timeZone", js.undefined)
  }
}
