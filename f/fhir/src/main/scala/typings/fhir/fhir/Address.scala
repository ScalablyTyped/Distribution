package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An address expressed using postal conventions (as opposed to GPS or other location definition formats)
  */
@js.native
trait Address extends Element {
  
  /**
    * Contains extended information for property 'city'.
    */
  var _city: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'country'.
    */
  var _country: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'district'.
    */
  var _district: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'line'.
    */
  var _line: js.UndefOr[js.Array[Element]] = js.native
  
  /**
    * Contains extended information for property 'postalCode'.
    */
  var _postalCode: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'state'.
    */
  var _state: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'text'.
    */
  var _text: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'use'.
    */
  var _use: js.UndefOr[Element] = js.native
  
  /**
    * Name of city, town etc.
    */
  var city: js.UndefOr[String] = js.native
  
  /**
    * Country (e.g. can be ISO 3166 2 or 3 letter code)
    */
  var country: js.UndefOr[String] = js.native
  
  /**
    * District name (aka county)
    */
  var district: js.UndefOr[String] = js.native
  
  /**
    * Street name, number, direction & P.O. Box etc.
    */
  var line: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Time period when address was/is in use
    */
  var period: js.UndefOr[Period] = js.native
  
  /**
    * Postal code for area
    */
  var postalCode: js.UndefOr[String] = js.native
  
  /**
    * Sub-unit of country (abbreviations ok)
    */
  var state: js.UndefOr[String] = js.native
  
  /**
    * Text representation of the address
    */
  var text: js.UndefOr[String] = js.native
  
  /**
    * postal | physical | both
    */
  var `type`: js.UndefOr[code] = js.native
  
  /**
    * home | work | temp | old - purpose of this address
    */
  var use: js.UndefOr[code] = js.native
}
object Address {
  
  @scala.inline
  def apply(): Address = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Address]
  }
  
  @scala.inline
  implicit class AddressOps[Self <: Address] (val x: Self) extends AnyVal {
    
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
    def set_city(value: Element): Self = this.set("_city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_city: Self = this.set("_city", js.undefined)
    
    @scala.inline
    def set_country(value: Element): Self = this.set("_country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_country: Self = this.set("_country", js.undefined)
    
    @scala.inline
    def set_district(value: Element): Self = this.set("_district", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_district: Self = this.set("_district", js.undefined)
    
    @scala.inline
    def set_lineVarargs(value: Element*): Self = this.set("_line", js.Array(value :_*))
    
    @scala.inline
    def set_line(value: js.Array[Element]): Self = this.set("_line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_line: Self = this.set("_line", js.undefined)
    
    @scala.inline
    def set_postalCode(value: Element): Self = this.set("_postalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_postalCode: Self = this.set("_postalCode", js.undefined)
    
    @scala.inline
    def set_state(value: Element): Self = this.set("_state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_state: Self = this.set("_state", js.undefined)
    
    @scala.inline
    def set_text(value: Element): Self = this.set("_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_text: Self = this.set("_text", js.undefined)
    
    @scala.inline
    def set_type(value: Element): Self = this.set("_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_type: Self = this.set("_type", js.undefined)
    
    @scala.inline
    def set_use(value: Element): Self = this.set("_use", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_use: Self = this.set("_use", js.undefined)
    
    @scala.inline
    def setCity(value: String): Self = this.set("city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCity: Self = this.set("city", js.undefined)
    
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    
    @scala.inline
    def setDistrict(value: String): Self = this.set("district", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistrict: Self = this.set("district", js.undefined)
    
    @scala.inline
    def setLineVarargs(value: String*): Self = this.set("line", js.Array(value :_*))
    
    @scala.inline
    def setLine(value: js.Array[String]): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    
    @scala.inline
    def setPeriod(value: Period): Self = this.set("period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeriod: Self = this.set("period", js.undefined)
    
    @scala.inline
    def setPostalCode(value: String): Self = this.set("postalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostalCode: Self = this.set("postalCode", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setType(value: code): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUse(value: code): Self = this.set("use", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUse: Self = this.set("use", js.undefined)
  }
}
