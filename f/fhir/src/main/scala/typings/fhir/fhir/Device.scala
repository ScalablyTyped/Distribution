package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Item used in healthcare
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait Device extends DomainResource {
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
  var lotNumber: js.UndefOr[String] = js.undefined
  /**
    * Date when the device was made
    */
  var manufactureDate: js.UndefOr[dateTime] = js.undefined
  /**
    * Name of device manufacturer
    */
  var manufacturer: js.UndefOr[String] = js.undefined
  /**
    * Model id assigned by the manufacturer
    */
  var model: js.UndefOr[String] = js.undefined
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
  var version: js.UndefOr[String] = js.undefined
}

object Device {
  @scala.inline
  def apply(
    _expirationDate: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _lotNumber: Element = null,
    _manufactureDate: Element = null,
    _manufacturer: Element = null,
    _model: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    _url: Element = null,
    _version: Element = null,
    contact: js.Array[ContactPoint] = null,
    contained: js.Array[Resource] = null,
    expirationDate: dateTime = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    location: Reference = null,
    lotNumber: String = null,
    manufactureDate: dateTime = null,
    manufacturer: String = null,
    meta: Meta = null,
    model: String = null,
    modifierExtension: js.Array[Extension] = null,
    note: js.Array[Annotation] = null,
    owner: Reference = null,
    patient: Reference = null,
    resourceType: code = null,
    safety: js.Array[CodeableConcept] = null,
    status: code = null,
    text: Narrative = null,
    `type`: CodeableConcept = null,
    udi: DeviceUdi = null,
    url: uri = null,
    version: String = null
  ): Device = {
    val __obj = js.Dynamic.literal()
    if (_expirationDate != null) __obj.updateDynamic("_expirationDate")(_expirationDate.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_lotNumber != null) __obj.updateDynamic("_lotNumber")(_lotNumber.asInstanceOf[js.Any])
    if (_manufactureDate != null) __obj.updateDynamic("_manufactureDate")(_manufactureDate.asInstanceOf[js.Any])
    if (_manufacturer != null) __obj.updateDynamic("_manufacturer")(_manufacturer.asInstanceOf[js.Any])
    if (_model != null) __obj.updateDynamic("_model")(_model.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (_url != null) __obj.updateDynamic("_url")(_url.asInstanceOf[js.Any])
    if (_version != null) __obj.updateDynamic("_version")(_version.asInstanceOf[js.Any])
    if (contact != null) __obj.updateDynamic("contact")(contact.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (expirationDate != null) __obj.updateDynamic("expirationDate")(expirationDate.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (lotNumber != null) __obj.updateDynamic("lotNumber")(lotNumber.asInstanceOf[js.Any])
    if (manufactureDate != null) __obj.updateDynamic("manufactureDate")(manufactureDate.asInstanceOf[js.Any])
    if (manufacturer != null) __obj.updateDynamic("manufacturer")(manufacturer.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (patient != null) __obj.updateDynamic("patient")(patient.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (safety != null) __obj.updateDynamic("safety")(safety.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (udi != null) __obj.updateDynamic("udi")(udi.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Device]
  }
}

