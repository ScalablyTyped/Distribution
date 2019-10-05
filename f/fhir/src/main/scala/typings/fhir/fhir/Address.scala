package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An address expressed using postal conventions (as opposed to GPS or other location definition formats)
  */
trait Address extends Element {
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
  @scala.inline
  def apply(
    _city: Element = null,
    _country: Element = null,
    _district: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _line: js.Array[Element] = null,
    _postalCode: Element = null,
    _state: Element = null,
    _text: Element = null,
    _type: Element = null,
    _use: Element = null,
    city: String = null,
    country: String = null,
    district: String = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    line: js.Array[String] = null,
    period: Period = null,
    postalCode: String = null,
    state: String = null,
    text: String = null,
    `type`: code = null,
    use: code = null
  ): Address = {
    val __obj = js.Dynamic.literal()
    if (_city != null) __obj.updateDynamic("_city")(_city)
    if (_country != null) __obj.updateDynamic("_country")(_country)
    if (_district != null) __obj.updateDynamic("_district")(_district)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_line != null) __obj.updateDynamic("_line")(_line)
    if (_postalCode != null) __obj.updateDynamic("_postalCode")(_postalCode)
    if (_state != null) __obj.updateDynamic("_state")(_state)
    if (_text != null) __obj.updateDynamic("_text")(_text)
    if (_type != null) __obj.updateDynamic("_type")(_type)
    if (_use != null) __obj.updateDynamic("_use")(_use)
    if (city != null) __obj.updateDynamic("city")(city)
    if (country != null) __obj.updateDynamic("country")(country)
    if (district != null) __obj.updateDynamic("district")(district)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (line != null) __obj.updateDynamic("line")(line)
    if (period != null) __obj.updateDynamic("period")(period)
    if (postalCode != null) __obj.updateDynamic("postalCode")(postalCode)
    if (state != null) __obj.updateDynamic("state")(state)
    if (text != null) __obj.updateDynamic("text")(text)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (use != null) __obj.updateDynamic("use")(use)
    __obj.asInstanceOf[Address]
  }
}

