package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Unique Device Identifier (UDI) Barcode string
  */
trait DeviceUdi extends BackboneElement {
  /**
    * Contains extended information for property 'carrierAIDC'.
    */
  var _carrierAIDC: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'carrierHRF'.
    */
  var _carrierHRF: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'deviceIdentifier'.
    */
  var _deviceIdentifier: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'entryType'.
    */
  var _entryType: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'issuer'.
    */
  var _issuer: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'jurisdiction'.
    */
  var _jurisdiction: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  /**
    * UDI Machine Readable Barcode String
    */
  var carrierAIDC: js.UndefOr[base64Binary] = js.undefined
  /**
    * UDI Human Readable Barcode String
    */
  var carrierHRF: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Mandatory fixed portion of UDI
    */
  var deviceIdentifier: js.UndefOr[java.lang.String] = js.undefined
  /**
    * barcode | rfid | manual +
    */
  var entryType: js.UndefOr[code] = js.undefined
  /**
    * UDI Issuing Organization
    */
  var issuer: js.UndefOr[uri] = js.undefined
  /**
    * Regional UDI authority
    */
  var jurisdiction: js.UndefOr[uri] = js.undefined
  /**
    * Device Name as appears on UDI label
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

