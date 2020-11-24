package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeocodingComponents extends js.Object {
  
  /** matches all the administrative_area levels. */
  var administrative_area: js.UndefOr[String] = js.native
  
  /**
    * matches a country name or a two letter [ISO 3166-1](https://en.wikipedia.org/wiki/ISO_3166-1) country code.
    * **Note:** The API follows the ISO standard for defining countries, and the filtering works best when using
    * the corresponding ISO code of the country
    */
  var country: js.UndefOr[String | js.Array[String]] = js.native
  
  /** matches against `locality` and `sublocality` types. */
  var locality: js.UndefOr[String] = js.native
  
  /** matches `postal_code` and `postal_code_prefix`. */
  var postal_code: js.UndefOr[String] = js.native
  
  /** matches the long or short name of a route. */
  var route: js.UndefOr[String] = js.native
}
object GeocodingComponents {
  
  @scala.inline
  def apply(): GeocodingComponents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeocodingComponents]
  }
  
  @scala.inline
  implicit class GeocodingComponentsOps[Self <: GeocodingComponents] (val x: Self) extends AnyVal {
    
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
    def setAdministrative_area(value: String): Self = this.set("administrative_area", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdministrative_area: Self = this.set("administrative_area", js.undefined)
    
    @scala.inline
    def setCountryVarargs(value: String*): Self = this.set("country", js.Array(value :_*))
    
    @scala.inline
    def setCountry(value: String | js.Array[String]): Self = this.set("country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    
    @scala.inline
    def setLocality(value: String): Self = this.set("locality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocality: Self = this.set("locality", js.undefined)
    
    @scala.inline
    def setPostal_code(value: String): Self = this.set("postal_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostal_code: Self = this.set("postal_code", js.undefined)
    
    @scala.inline
    def setRoute(value: String): Self = this.set("route", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoute: Self = this.set("route", js.undefined)
  }
}
