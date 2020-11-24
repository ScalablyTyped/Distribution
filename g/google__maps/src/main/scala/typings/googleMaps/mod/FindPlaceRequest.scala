package typings.googleMaps.mod

import typings.googleMaps.googleMapsStrings.alt_ids
import typings.googleMaps.googleMapsStrings.formatted_address
import typings.googleMaps.googleMapsStrings.geometry
import typings.googleMaps.googleMapsStrings.icon
import typings.googleMaps.googleMapsStrings.name
import typings.googleMaps.googleMapsStrings.opening_hours
import typings.googleMaps.googleMapsStrings.permanently_closed
import typings.googleMaps.googleMapsStrings.phonenumber
import typings.googleMaps.googleMapsStrings.photos
import typings.googleMaps.googleMapsStrings.place_id
import typings.googleMaps.googleMapsStrings.plus_code
import typings.googleMaps.googleMapsStrings.price_level
import typings.googleMaps.googleMapsStrings.rating
import typings.googleMaps.googleMapsStrings.scope
import typings.googleMaps.googleMapsStrings.textquery
import typings.googleMaps.googleMapsStrings.types
import typings.googleMaps.googleMapsStrings.vicinity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindPlaceRequest extends js.Object {
  
  /**
    * The fields specifying the types of place data to return.
    *
    * **Note:** If you omit the fields parameter from a Find Place request, only the place_id for the result will be returned.
    */
  var fields: js.UndefOr[
    js.Array[
      icon | geometry | plus_code | name | opening_hours | photos | place_id | scope | alt_ids | price_level | rating | types | vicinity | formatted_address | permanently_closed
    ]
  ] = js.native
  
  /** The text input specifying which place to search for (for example, a name, address, or phone number). */
  var input: String = js.native
  
  /** The type of input. This can be one of either `textquery` or `phonenumber`. */
  var inputtype: textquery | phonenumber = js.native
  
  /**
    * The language code, indicating in which language the results should be returned, if possible.
    * Searches are also biased to the selected language; results in the selected language may be given a higher ranking
    */
  var language: js.UndefOr[Language] = js.native
  
  /**
    * Prefer results in a specified area, by specifying either a radius plus lat/lng, or two lat/lng pairs representing
    * the points of a rectangle. If this parameter is not specified, the API uses IP address biasing by default.
    */
  var locationbias: js.UndefOr[String] = js.native
}
object FindPlaceRequest {
  
  @scala.inline
  def apply(input: String, inputtype: textquery | phonenumber): FindPlaceRequest = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], inputtype = inputtype.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindPlaceRequest]
  }
  
  @scala.inline
  implicit class FindPlaceRequestOps[Self <: FindPlaceRequest] (val x: Self) extends AnyVal {
    
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
    def setInput(value: String): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputtype(value: textquery | phonenumber): Self = this.set("inputtype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsVarargs(
      value: (icon | geometry | plus_code | name | opening_hours | photos | place_id | scope | alt_ids | price_level | rating | types | vicinity | formatted_address | permanently_closed)*
    ): Self = this.set("fields", js.Array(value :_*))
    
    @scala.inline
    def setFields(
      value: js.Array[
          icon | geometry | plus_code | name | opening_hours | photos | place_id | scope | alt_ids | price_level | rating | types | vicinity | formatted_address | permanently_closed
        ]
    ): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setLanguage(value: Language): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setLocationbias(value: String): Self = this.set("locationbias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationbias: Self = this.set("locationbias", js.undefined)
  }
}
