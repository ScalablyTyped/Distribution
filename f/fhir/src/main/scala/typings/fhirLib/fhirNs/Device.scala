package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Item used in healthcare
  */
trait Device extends DomainResource {
  /**
    * Contains extended information for property 'expirationDate'.
    */
  var _expirationDate: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'lotNumber'.
    */
  var _lotNumber: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'manufactureDate'.
    */
  var _manufactureDate: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'manufacturer'.
    */
  var _manufacturer: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'model'.
    */
  var _model: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'url'.
    */
  var _url: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'version'.
    */
  var _version: js.UndefOr[Element] = js.undefined
  /**
    * Details for human/organization for support
    */
  var contact: js.UndefOr[js.Array[ContactPoint]] = js.undefined
  /**
    * Date and time of expiry of this device (if applicable)
    */
  var expirationDate: js.UndefOr[dateTime] = js.undefined
  /**
    * Instance identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
    * Where the resource is found
    */
  var location: js.UndefOr[Reference] = js.undefined
  /**
    * Lot number of manufacture
    */
  var lotNumber: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Date when the device was made
    */
  var manufactureDate: js.UndefOr[dateTime] = js.undefined
  /**
    * Name of device manufacturer
    */
  var manufacturer: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Model id assigned by the manufacturer
    */
  var model: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Device notes and comments
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  /**
    * Organization responsible for device
    */
  var owner: js.UndefOr[Reference] = js.undefined
  /**
    * Patient to whom Device is affixed
    */
  var patient: js.UndefOr[Reference] = js.undefined
  /**
    * Safety Characteristics of Device
    */
  var safety: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * active | inactive | entered-in-error | unknown
    */
  var status: js.UndefOr[code] = js.undefined
  /**
    * What kind of device this is
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Unique Device Identifier (UDI) Barcode string
    */
  var udi: js.UndefOr[DeviceUdi] = js.undefined
  /**
    * Network address to contact device
    */
  var url: js.UndefOr[uri] = js.undefined
  /**
    * Version number (i.e. software)
    */
  var version: js.UndefOr[java.lang.String] = js.undefined
}

