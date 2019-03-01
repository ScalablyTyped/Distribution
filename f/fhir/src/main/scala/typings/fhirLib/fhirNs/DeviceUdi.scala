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

object DeviceUdi {
  @scala.inline
  def apply(
    _carrierAIDC: Element = null,
    _carrierHRF: Element = null,
    _deviceIdentifier: Element = null,
    _entryType: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _issuer: Element = null,
    _jurisdiction: Element = null,
    _name: Element = null,
    carrierAIDC: base64Binary = null,
    carrierHRF: java.lang.String = null,
    deviceIdentifier: java.lang.String = null,
    entryType: code = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    issuer: uri = null,
    jurisdiction: uri = null,
    modifierExtension: js.Array[Extension] = null,
    name: java.lang.String = null
  ): DeviceUdi = {
    val __obj = js.Dynamic.literal()
    if (_carrierAIDC != null) __obj.updateDynamic("_carrierAIDC")(_carrierAIDC)
    if (_carrierHRF != null) __obj.updateDynamic("_carrierHRF")(_carrierHRF)
    if (_deviceIdentifier != null) __obj.updateDynamic("_deviceIdentifier")(_deviceIdentifier)
    if (_entryType != null) __obj.updateDynamic("_entryType")(_entryType)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_issuer != null) __obj.updateDynamic("_issuer")(_issuer)
    if (_jurisdiction != null) __obj.updateDynamic("_jurisdiction")(_jurisdiction)
    if (_name != null) __obj.updateDynamic("_name")(_name)
    if (carrierAIDC != null) __obj.updateDynamic("carrierAIDC")(carrierAIDC)
    if (carrierHRF != null) __obj.updateDynamic("carrierHRF")(carrierHRF)
    if (deviceIdentifier != null) __obj.updateDynamic("deviceIdentifier")(deviceIdentifier)
    if (entryType != null) __obj.updateDynamic("entryType")(entryType)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (issuer != null) __obj.updateDynamic("issuer")(issuer)
    if (jurisdiction != null) __obj.updateDynamic("jurisdiction")(jurisdiction)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[DeviceUdi]
  }
}

