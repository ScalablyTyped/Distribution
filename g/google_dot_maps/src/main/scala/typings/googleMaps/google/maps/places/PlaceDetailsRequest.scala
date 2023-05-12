package typings.googleMaps.google.maps.places

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaceDetailsRequest extends StObject {
  
  /**
    * Fields to be included in the details response, <a
    * href="https://developers.google.com/maps/billing/understanding-cost-of-use#places-product">which
    * will be billed for</a>. If no fields are specified or
    * <code>[&#39;ALL&#39;]</code> is passed in, all available fields will be
    * returned and billed for (this is not recommended for production
    * deployments). For a list of fields see {@link
    * google.maps.places.PlaceResult}. Nested fields can be specified with
    * dot-paths (for example, <code>"geometry.location"</code>).
    */
  var fields: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A language identifier for the language in which details should be
    * returned. See the <a
    * href="https://developers.google.com/maps/faq#languagesupport">list of
    * supported languages</a>.
    */
  var language: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Place ID of the Place for which details are being requested.
    */
  var placeId: String
  
  /**
    * A region code of the user&#39;s region. This can affect which photos may
    * be returned, and possibly other things. The region code accepts a <a
    * href="https://en.wikipedia.org/wiki/List_of_Internet_top-level_domains#Country_code_top-level_domains">ccTLD
    * (&quot;top-level domain&quot;)</a> two-character value. Most ccTLD codes
    * are identical to ISO 3166-1 codes, with some notable exceptions. For
    * example, the United Kingdom&#39;s ccTLD is &quot;uk&quot;
    * (<code>.co.uk</code>) while its ISO 3166-1 code is &quot;gb&quot;
    * (technically for the entity of &quot;The United Kingdom of Great Britain
    * and Northern Ireland&quot;).
    */
  var region: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Unique reference used to bundle the details request with an autocomplete
    * session.
    */
  var sessionToken: js.UndefOr[AutocompleteSessionToken] = js.undefined
}
object PlaceDetailsRequest {
  
  inline def apply(placeId: String): PlaceDetailsRequest = {
    val __obj = js.Dynamic.literal(placeId = placeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaceDetailsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlaceDetailsRequest] (val x: Self) extends AnyVal {
    
    inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageNull: Self = StObject.set(x, "language", null)
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setPlaceId(value: String): Self = StObject.set(x, "placeId", value.asInstanceOf[js.Any])
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionNull: Self = StObject.set(x, "region", null)
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setSessionToken(value: AutocompleteSessionToken): Self = StObject.set(x, "sessionToken", value.asInstanceOf[js.Any])
    
    inline def setSessionTokenUndefined: Self = StObject.set(x, "sessionToken", js.undefined)
  }
}
