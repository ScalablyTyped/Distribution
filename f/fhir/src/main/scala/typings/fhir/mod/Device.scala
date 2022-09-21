package typings.fhir.mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.`not-available`
import typings.fhir.fhirStrings.available
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Device
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _expiry: js.UndefOr[Element] = js.undefined
  
  var _lotNumber: js.UndefOr[Element] = js.undefined
  
  var _manufactureDate: js.UndefOr[Element] = js.undefined
  
  var _manufacturer: js.UndefOr[Element] = js.undefined
  
  var _model: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  var _udi: js.UndefOr[Element] = js.undefined
  
  var _url: js.UndefOr[Element] = js.undefined
  
  var _version: js.UndefOr[Element] = js.undefined
  
  /**
    * Contact details for an organization or a particular human that is responsible for the device.
    */
  var contact: js.UndefOr[js.Array[ContactPoint]] = js.undefined
  
  /**
    * The date and time beyond which this device is no longer valid or should not be used (if applicable).
    */
  var expiry: js.UndefOr[String] = js.undefined
  
  /**
    * Unique instance identifiers assigned to a device by organizations like manufacturers or owners. If the identifier identifies the type of device, Device.type should be used.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * The place where the device can be found.
    */
  var location: js.UndefOr[Reference] = js.undefined
  
  /**
    * Lot number assigned by the manufacturer.
    */
  var lotNumber: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time when the device was manufactured.
    */
  var manufactureDate: js.UndefOr[String] = js.undefined
  
  /**
    * A name of the manufacturer.
    */
  var manufacturer: js.UndefOr[String] = js.undefined
  
  /**
    * The "model" is an identifier assigned by the manufacturer to identify the product by its type. This number is shared by the all devices sold as the same type.
    */
  var model: js.UndefOr[String] = js.undefined
  
  /**
    * Descriptive information, usage information or implantation information that is not captured in an existing element.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * An organization that is responsible for the provision and ongoing maintenance of the device.
    */
  var owner: js.UndefOr[Reference] = js.undefined
  
  /**
    * Patient information, if the resource is affixed to a person.
    */
  var patient: js.UndefOr[Reference] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Device: typings.fhir.fhirStrings.Device
  
  /**
    * Status of the Device availability.
    */
  var status: js.UndefOr[available | `not-available` | `entered-in-error`] = js.undefined
  
  /**
    * Code or identifier to identify a kind of device.
    */
  var `type`: CodeableConcept
  
  /**
    * United States Food and Drug Administration mandated Unique Device Identifier (UDI). Use the human readable information (the content that the user sees, which is sometimes different to the exact syntax represented in the barcode)  - see http://www.fda.gov/MedicalDevices/DeviceRegulationandGuidance/UniqueDeviceIdentification/default.htm.
    */
  var udi: js.UndefOr[String] = js.undefined
  
  /**
    * A network address on which the device may be contacted directly.
    */
  var url: js.UndefOr[String] = js.undefined
  
  /**
    * The version of the device, if the device has multiple releases under the same model, or if the device is software or carries firmware.
    */
  var version: js.UndefOr[String] = js.undefined
}
object Device {
  
  inline def apply(`type`: CodeableConcept): Device = {
    val __obj = js.Dynamic.literal(resourceType = "Device")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Device]
  }
  
  extension [Self <: Device](x: Self) {
    
    inline def setContact(value: js.Array[ContactPoint]): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    inline def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    inline def setContactVarargs(value: ContactPoint*): Self = StObject.set(x, "contact", js.Array(value*))
    
    inline def setExpiry(value: String): Self = StObject.set(x, "expiry", value.asInstanceOf[js.Any])
    
    inline def setExpiryUndefined: Self = StObject.set(x, "expiry", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setLocation(value: Reference): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setLotNumber(value: String): Self = StObject.set(x, "lotNumber", value.asInstanceOf[js.Any])
    
    inline def setLotNumberUndefined: Self = StObject.set(x, "lotNumber", js.undefined)
    
    inline def setManufactureDate(value: String): Self = StObject.set(x, "manufactureDate", value.asInstanceOf[js.Any])
    
    inline def setManufactureDateUndefined: Self = StObject.set(x, "manufactureDate", js.undefined)
    
    inline def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    inline def setManufacturerUndefined: Self = StObject.set(x, "manufacturer", js.undefined)
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setOwner(value: Reference): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    inline def setPatientUndefined: Self = StObject.set(x, "patient", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Device): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: available | `not-available` | `entered-in-error`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUdi(value: String): Self = StObject.set(x, "udi", value.asInstanceOf[js.Any])
    
    inline def setUdiUndefined: Self = StObject.set(x, "udi", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def set_expiry(value: Element): Self = StObject.set(x, "_expiry", value.asInstanceOf[js.Any])
    
    inline def set_expiryUndefined: Self = StObject.set(x, "_expiry", js.undefined)
    
    inline def set_lotNumber(value: Element): Self = StObject.set(x, "_lotNumber", value.asInstanceOf[js.Any])
    
    inline def set_lotNumberUndefined: Self = StObject.set(x, "_lotNumber", js.undefined)
    
    inline def set_manufactureDate(value: Element): Self = StObject.set(x, "_manufactureDate", value.asInstanceOf[js.Any])
    
    inline def set_manufactureDateUndefined: Self = StObject.set(x, "_manufactureDate", js.undefined)
    
    inline def set_manufacturer(value: Element): Self = StObject.set(x, "_manufacturer", value.asInstanceOf[js.Any])
    
    inline def set_manufacturerUndefined: Self = StObject.set(x, "_manufacturer", js.undefined)
    
    inline def set_model(value: Element): Self = StObject.set(x, "_model", value.asInstanceOf[js.Any])
    
    inline def set_modelUndefined: Self = StObject.set(x, "_model", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    inline def set_udi(value: Element): Self = StObject.set(x, "_udi", value.asInstanceOf[js.Any])
    
    inline def set_udiUndefined: Self = StObject.set(x, "_udi", js.undefined)
    
    inline def set_url(value: Element): Self = StObject.set(x, "_url", value.asInstanceOf[js.Any])
    
    inline def set_urlUndefined: Self = StObject.set(x, "_url", js.undefined)
    
    inline def set_version(value: Element): Self = StObject.set(x, "_version", value.asInstanceOf[js.Any])
    
    inline def set_versionUndefined: Self = StObject.set(x, "_version", js.undefined)
  }
}
