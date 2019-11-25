package typings.fhir.fhir

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
  var carrierHRF: js.UndefOr[String] = js.undefined
  /**
    * Mandatory fixed portion of UDI
    */
  var deviceIdentifier: js.UndefOr[String] = js.undefined
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
  var name: js.UndefOr[String] = js.undefined
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
    carrierHRF: String = null,
    deviceIdentifier: String = null,
    entryType: code = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    issuer: uri = null,
    jurisdiction: uri = null,
    modifierExtension: js.Array[Extension] = null,
    name: String = null
  ): DeviceUdi = {
    val __obj = js.Dynamic.literal()
    if (_carrierAIDC != null) __obj.updateDynamic("_carrierAIDC")(_carrierAIDC.asInstanceOf[js.Any])
    if (_carrierHRF != null) __obj.updateDynamic("_carrierHRF")(_carrierHRF.asInstanceOf[js.Any])
    if (_deviceIdentifier != null) __obj.updateDynamic("_deviceIdentifier")(_deviceIdentifier.asInstanceOf[js.Any])
    if (_entryType != null) __obj.updateDynamic("_entryType")(_entryType.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_issuer != null) __obj.updateDynamic("_issuer")(_issuer.asInstanceOf[js.Any])
    if (_jurisdiction != null) __obj.updateDynamic("_jurisdiction")(_jurisdiction.asInstanceOf[js.Any])
    if (_name != null) __obj.updateDynamic("_name")(_name.asInstanceOf[js.Any])
    if (carrierAIDC != null) __obj.updateDynamic("carrierAIDC")(carrierAIDC.asInstanceOf[js.Any])
    if (carrierHRF != null) __obj.updateDynamic("carrierHRF")(carrierHRF.asInstanceOf[js.Any])
    if (deviceIdentifier != null) __obj.updateDynamic("deviceIdentifier")(deviceIdentifier.asInstanceOf[js.Any])
    if (entryType != null) __obj.updateDynamic("entryType")(entryType.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (issuer != null) __obj.updateDynamic("issuer")(issuer.asInstanceOf[js.Any])
    if (jurisdiction != null) __obj.updateDynamic("jurisdiction")(jurisdiction.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceUdi]
  }
}

