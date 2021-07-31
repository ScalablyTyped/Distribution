package typings.googleMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaceDetailsRequest extends StObject {
  
  /**
    * One or more fields, specifying the types of place data to return, separated by a comma.
    *
    * **Warning: If you do not specify at least one field with a request, or if you omit the **fields**
    * parameter from a request, ALL possible fields will be returned, and you will be billed accordingly.
    * This applies only to Place Details requests.
    */
  var fields: js.UndefOr[js.Array[PlaceDetailsRequestField]] = js.undefined
  
  /**
    * The language code, indicating in which language the results should be returned, if possible.
    * Note that some fields may not be available in the requested language.
    * Note that we often update supported languages so this list may not be exhaustive.
    */
  var language: js.UndefOr[Language] = js.undefined
  
  /** A textual identifier that uniquely identifies a place, returned from a Place Search. */
  var placeid: String
  
  /**
    * The region code, specified as a ccTLD (country code top-level domain) two-character value.
    * Most ccTLD codes are identical to ISO 3166-1 codes, with some exceptions.
    * This parameter will only influence, not fully restrict, results.
    * If more relevant results exist outside of the specified region, they may be included.
    * When this parameter is used, the country name is omitted from the resulting `formatted_address`
    * for results in the specified region.
    */
  var region: js.UndefOr[String] = js.undefined
  
  /**
    * A random string which identifies an autocomplete session for billing purposes.
    * Use this for Place Details requests that are called following an autocomplete request in the same user session
    */
  var sessiontoken: js.UndefOr[String] = js.undefined
}
object PlaceDetailsRequest {
  
  @scala.inline
  def apply(placeid: String): PlaceDetailsRequest = {
    val __obj = js.Dynamic.literal(placeid = placeid.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaceDetailsRequest]
  }
  
  @scala.inline
  implicit class PlaceDetailsRequestMutableBuilder[Self <: PlaceDetailsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: js.Array[PlaceDetailsRequestField]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: PlaceDetailsRequestField*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setLanguage(value: Language): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setPlaceid(value: String): Self = StObject.set(x, "placeid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setSessiontoken(value: String): Self = StObject.set(x, "sessiontoken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessiontokenUndefined: Self = StObject.set(x, "sessiontoken", js.undefined)
  }
}
