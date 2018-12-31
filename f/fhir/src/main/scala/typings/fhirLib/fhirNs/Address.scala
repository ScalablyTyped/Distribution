package typings
package fhirLib.fhirNs

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
  var city: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Country (e.g. can be ISO 3166 2 or 3 letter code)
    */
  var country: js.UndefOr[java.lang.String] = js.undefined
  /**
    * District name (aka county)
    */
  var district: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Street name, number, direction & P.O. Box etc.
    */
  var line: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Time period when address was/is in use
    */
  var period: js.UndefOr[Period] = js.undefined
  /**
    * Postal code for area
    */
  var postalCode: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Sub-unit of country (abbreviations ok)
    */
  var state: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Text representation of the address
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /**
    * postal | physical | both
    */
  var `type`: js.UndefOr[code] = js.undefined
  /**
    * home | work | temp | old - purpose of this address
    */
  var use: js.UndefOr[code] = js.undefined
}

