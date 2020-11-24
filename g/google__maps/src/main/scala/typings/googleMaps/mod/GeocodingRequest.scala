package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeocodingRequest extends js.Object {
  
  /**
    * The street address that you want to geocode, in the format used by the national postal service of the country concerned.
    * Additional address elements such as business names and unit, suite or floor numbers should be avoided.
    */
  var address: js.UndefOr[String] = js.native
  
  /**
    * The bounding box of the viewport within which to bias geocode results more prominently.
    * This parameter will only influence, not fully restrict, results from the geocoder.
    */
  var bounds: js.UndefOr[LatLngBounds] = js.native
  
  /**
    * A components filter with elements separated by a pipe (`|`).
    * The components filter is *required* if the request doesn't include an `address`.
    * Each element in the components filter consists of a `component:value` pair, and fully restricts the results from the geocoder.
    */
  var components: js.UndefOr[GeocodingComponents] = js.native
  
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
  var language: js.UndefOr[String] = js.native
  
  /**
    * The region code, specified as a ccTLD ("top-level domain") two-character value.
    * This parameter will only influence, not fully restrict, results from the geocoder.
    */
  var region: js.UndefOr[String] = js.native
}
object GeocodingRequest {
  
  @scala.inline
  def apply(): GeocodingRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeocodingRequest]
  }
  
  @scala.inline
  implicit class GeocodingRequestOps[Self <: GeocodingRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    
    @scala.inline
    def setBounds(value: LatLngBounds): Self = this.set("bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBounds: Self = this.set("bounds", js.undefined)
    
    @scala.inline
    def setComponents(value: GeocodingComponents): Self = this.set("components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponents: Self = this.set("components", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
  }
}
