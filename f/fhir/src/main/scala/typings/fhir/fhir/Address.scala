package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An address expressed using postal conventions (as opposed to GPS or other location definition formats)
  */
trait Address
  extends StObject
     with Element {
  
  /**
    * Contains extended information for property 'city'.
    */
  var _city: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'country'.
    */
  var _country: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'district'.
    */
  var _district: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'line'.
    */
  var _line: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * Contains extended information for property 'postalCode'.
    */
  var _postalCode: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'state'.
    */
  var _state: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'text'.
    */
  var _text: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'use'.
    */
  var _use: js.UndefOr[Element] = js.undefined
  
  /**
    * Name of city, town etc.
    */
  var city: js.UndefOr[String] = js.undefined
  
  /**
    * Country (e.g. can be ISO 3166 2 or 3 letter code)
    */
  var country: js.UndefOr[String] = js.undefined
  
  /**
    * District name (aka county)
    */
  var district: js.UndefOr[String] = js.undefined
  
  /**
    * Street name, number, direction & P.O. Box etc.
    */
  var line: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Time period when address was/is in use
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /**
    * Postal code for area
    */
  var postalCode: js.UndefOr[String] = js.undefined
  
  /**
    * Sub-unit of country (abbreviations ok)
    */
  var state: js.UndefOr[String] = js.undefined
  
  /**
    * Text representation of the address
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * postal | physical | both
    */
  var `type`: js.UndefOr[code] = js.undefined
  
  /**
    * home | work | temp | old - purpose of this address
    */
  var use: js.UndefOr[code] = js.undefined
}
object Address {
  
  inline def apply(): Address = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Address]
  }
  
  extension [Self <: Address](x: Self) {
    
    inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    inline def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setDistrict(value: String): Self = StObject.set(x, "district", value.asInstanceOf[js.Any])
    
    inline def setDistrictUndefined: Self = StObject.set(x, "district", js.undefined)
    
    inline def setLine(value: js.Array[String]): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setLineVarargs(value: String*): Self = StObject.set(x, "line", js.Array(value :_*))
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    inline def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setType(value: code): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUse(value: code): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
    
    inline def setUseUndefined: Self = StObject.set(x, "use", js.undefined)
    
    inline def set_city(value: Element): Self = StObject.set(x, "_city", value.asInstanceOf[js.Any])
    
    inline def set_cityUndefined: Self = StObject.set(x, "_city", js.undefined)
    
    inline def set_country(value: Element): Self = StObject.set(x, "_country", value.asInstanceOf[js.Any])
    
    inline def set_countryUndefined: Self = StObject.set(x, "_country", js.undefined)
    
    inline def set_district(value: Element): Self = StObject.set(x, "_district", value.asInstanceOf[js.Any])
    
    inline def set_districtUndefined: Self = StObject.set(x, "_district", js.undefined)
    
    inline def set_line(value: js.Array[Element]): Self = StObject.set(x, "_line", value.asInstanceOf[js.Any])
    
    inline def set_lineUndefined: Self = StObject.set(x, "_line", js.undefined)
    
    inline def set_lineVarargs(value: Element*): Self = StObject.set(x, "_line", js.Array(value :_*))
    
    inline def set_postalCode(value: Element): Self = StObject.set(x, "_postalCode", value.asInstanceOf[js.Any])
    
    inline def set_postalCodeUndefined: Self = StObject.set(x, "_postalCode", js.undefined)
    
    inline def set_state(value: Element): Self = StObject.set(x, "_state", value.asInstanceOf[js.Any])
    
    inline def set_stateUndefined: Self = StObject.set(x, "_state", js.undefined)
    
    inline def set_text(value: Element): Self = StObject.set(x, "_text", value.asInstanceOf[js.Any])
    
    inline def set_textUndefined: Self = StObject.set(x, "_text", js.undefined)
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
    
    inline def set_use(value: Element): Self = StObject.set(x, "_use", value.asInstanceOf[js.Any])
    
    inline def set_useUndefined: Self = StObject.set(x, "_use", js.undefined)
  }
}
