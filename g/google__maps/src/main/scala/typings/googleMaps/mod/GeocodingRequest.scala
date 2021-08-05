package typings.googleMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeocodingRequest extends StObject {
  
  /**
    * The street address that you want to geocode, in the format used by the national postal service of the country concerned.
    * Additional address elements such as business names and unit, suite or floor numbers should be avoided.
    */
  var address: js.UndefOr[String] = js.undefined
  
  /**
    * The bounding box of the viewport within which to bias geocode results more prominently.
    * This parameter will only influence, not fully restrict, results from the geocoder.
    */
  var bounds: js.UndefOr[LatLngBounds] = js.undefined
  
  /**
    * A components filter with elements separated by a pipe (`|`).
    * The components filter is *required* if the request doesn't include an `address`.
    * Each element in the components filter consists of a `component:value` pair, and fully restricts the results from the geocoder.
    */
  var components: js.UndefOr[GeocodingComponents] = js.undefined
  
  /**
    * The language in which to return results.
    *  - If `language` is not supplied, the geocoder attempts to use the preferred language as specified in the `Accept-Language` header,
    *    or the native language of the domain from which the request is sent.
    *  - The geocoder does its best to provide a street address that is readable for both the user and locals.
    *    To achieve that goal, it returns street addresses in the local language, transliterated to a script readable
    *    by the user if necessary, observing the preferred language. All other addresses are returned in the preferred language.
    *    Address components are all returned in the same language, which is chosen from the first component.
    *  - If a name is not available in the preferred language, the geocoder uses the closest match.
    *  - The preferred language has a small influence on the set of results that the API chooses to return,
    *    and the order in which they are returned. The geocoder interprets abbreviations differently depending on language,
    *    such as the abbreviations for street types, or synonyms that may be valid in one language but not in another.
    *    For example, utca and tér are synonyms for street in Hungarian.
    */
  var language: js.UndefOr[String] = js.undefined
  
  /**
    * The region code, specified as a ccTLD ("top-level domain") two-character value.
    * This parameter will only influence, not fully restrict, results from the geocoder.
    */
  var region: js.UndefOr[String] = js.undefined
}
object GeocodingRequest {
  
  inline def apply(): GeocodingRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeocodingRequest]
  }
  
  extension [Self <: GeocodingRequest](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setBounds(value: LatLngBounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    inline def setComponents(value: GeocodingComponents): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
  }
}
