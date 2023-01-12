package typings.fhir.r4Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.inactive
import typings.fhir.fhirStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Device
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _distinctIdentifier: js.UndefOr[Element] = js.undefined
  
  var _expirationDate: js.UndefOr[Element] = js.undefined
  
  var _lotNumber: js.UndefOr[Element] = js.undefined
  
  var _manufactureDate: js.UndefOr[Element] = js.undefined
  
  var _manufacturer: js.UndefOr[Element] = js.undefined
  
  var _modelNumber: js.UndefOr[Element] = js.undefined
  
  var _partNumber: js.UndefOr[Element] = js.undefined
  
  var _serialNumber: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  var _url: js.UndefOr[Element] = js.undefined
  
  /**
    * used for troubleshooting etc.
    */
  var contact: js.UndefOr[js.Array[ContactPoint]] = js.undefined
  
  /**
    * The reference to the definition for the device.
    */
  var definition: js.UndefOr[Reference] = js.undefined
  
  /**
    * This represents the manufacturer's name of the device as provided by the device, from a UDI label, or by a person describing the Device.  This typically would be used when a person provides the name(s) or when the device represents one of the names available from DeviceDefinition.
    */
  var deviceName: js.UndefOr[js.Array[DeviceDeviceName]] = js.undefined
  
  /**
    * For example, this applies to devices in the United States regulated under *Code of Federal Regulation 21CFR§1271.290(c)*.
    */
  var distinctIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time beyond which this device is no longer valid or should not be used (if applicable).
    */
  var expirationDate: js.UndefOr[String] = js.undefined
  
  /**
    * The barcode string from a barcode present on a device label or package may identify the instance, include names given to the device in local usage, or may identify the type of device. If the identifier identifies the type of device, Device.type element should be used.
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
    * The manufacturer's model number for the device.
    */
  var modelNumber: js.UndefOr[String] = js.undefined
  
  /**
    * Descriptive information, usage information or implantation information that is not captured in an existing element.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * An organization that is responsible for the provision and ongoing maintenance of the device.
    */
  var owner: js.UndefOr[Reference] = js.undefined
  
  /**
    * The device that this device is attached to or is part of.
    */
  var parent: js.UndefOr[Reference] = js.undefined
  
  /**
    * Alphanumeric Maximum 20.
    */
  var partNumber: js.UndefOr[String] = js.undefined
  
  /**
    * Patient information, If the device is affixed to a person.
    */
  var patient: js.UndefOr[Reference] = js.undefined
  
  /**
    * The actual configuration settings of a device as it actually operates, e.g., regulation status, time properties.
    */
  var property: js.UndefOr[js.Array[DeviceProperty]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Device: typings.fhir.fhirStrings.Device
  
  /**
    * Provides additional safety characteristics about a medical device.  For example devices containing latex.
    */
  var safety: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Alphanumeric Maximum 20.
    */
  var serialNumber: js.UndefOr[String] = js.undefined
  
  /**
    * The capabilities supported on a  device, the standards to which the device conforms for a particular purpose, and used for the communication.
    */
  var specialization: js.UndefOr[js.Array[DeviceSpecialization]] = js.undefined
  
  /**
    * This element is labeled as a modifier because the status contains the codes inactive and entered-in-error that mark the device (record)as not currently valid.
    */
  var status: js.UndefOr[active | inactive | `entered-in-error` | unknown] = js.undefined
  
  /**
    * Reason for the dtatus of the Device availability.
    */
  var statusReason: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The kind or type of device.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * UDI may identify an unique instance of a device, or it may only identify the type of the device.  See [UDI mappings](device-mappings.html#udi) for a complete mapping of UDI parts to Device.
    */
  var udiCarrier: js.UndefOr[js.Array[DeviceUdiCarrier]] = js.undefined
  
  /**
    * If the device is running a FHIR server, the network address should  be the Base URL from which a conformance statement may be retrieved.
    */
  var url: js.UndefOr[String] = js.undefined
  
  /**
    * The actual design of the device or software version running on the device.
    */
  var version: js.UndefOr[js.Array[DeviceVersion]] = js.undefined
}
object Device {
  
  inline def apply(): Device = {
    val __obj = js.Dynamic.literal(resourceType = "Device")
    __obj.asInstanceOf[Device]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Device] (val x: Self) extends AnyVal {
    
    inline def setContact(value: js.Array[ContactPoint]): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    inline def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    inline def setContactVarargs(value: ContactPoint*): Self = StObject.set(x, "contact", js.Array(value*))
    
    inline def setDefinition(value: Reference): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    inline def setDeviceName(value: js.Array[DeviceDeviceName]): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    inline def setDeviceNameUndefined: Self = StObject.set(x, "deviceName", js.undefined)
    
    inline def setDeviceNameVarargs(value: DeviceDeviceName*): Self = StObject.set(x, "deviceName", js.Array(value*))
    
    inline def setDistinctIdentifier(value: String): Self = StObject.set(x, "distinctIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDistinctIdentifierUndefined: Self = StObject.set(x, "distinctIdentifier", js.undefined)
    
    inline def setExpirationDate(value: String): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
    
    inline def setExpirationDateUndefined: Self = StObject.set(x, "expirationDate", js.undefined)
    
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
    
    inline def setModelNumber(value: String): Self = StObject.set(x, "modelNumber", value.asInstanceOf[js.Any])
    
    inline def setModelNumberUndefined: Self = StObject.set(x, "modelNumber", js.undefined)
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setOwner(value: Reference): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setParent(value: Reference): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setPartNumber(value: String): Self = StObject.set(x, "partNumber", value.asInstanceOf[js.Any])
    
    inline def setPartNumberUndefined: Self = StObject.set(x, "partNumber", js.undefined)
    
    inline def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    inline def setPatientUndefined: Self = StObject.set(x, "patient", js.undefined)
    
    inline def setProperty(value: js.Array[DeviceProperty]): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    inline def setPropertyVarargs(value: DeviceProperty*): Self = StObject.set(x, "property", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Device): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSafety(value: js.Array[CodeableConcept]): Self = StObject.set(x, "safety", value.asInstanceOf[js.Any])
    
    inline def setSafetyUndefined: Self = StObject.set(x, "safety", js.undefined)
    
    inline def setSafetyVarargs(value: CodeableConcept*): Self = StObject.set(x, "safety", js.Array(value*))
    
    inline def setSerialNumber(value: String): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    inline def setSerialNumberUndefined: Self = StObject.set(x, "serialNumber", js.undefined)
    
    inline def setSpecialization(value: js.Array[DeviceSpecialization]): Self = StObject.set(x, "specialization", value.asInstanceOf[js.Any])
    
    inline def setSpecializationUndefined: Self = StObject.set(x, "specialization", js.undefined)
    
    inline def setSpecializationVarargs(value: DeviceSpecialization*): Self = StObject.set(x, "specialization", js.Array(value*))
    
    inline def setStatus(value: active | inactive | `entered-in-error` | unknown): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusReason(value: js.Array[CodeableConcept]): Self = StObject.set(x, "statusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "statusReason", js.undefined)
    
    inline def setStatusReasonVarargs(value: CodeableConcept*): Self = StObject.set(x, "statusReason", js.Array(value*))
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUdiCarrier(value: js.Array[DeviceUdiCarrier]): Self = StObject.set(x, "udiCarrier", value.asInstanceOf[js.Any])
    
    inline def setUdiCarrierUndefined: Self = StObject.set(x, "udiCarrier", js.undefined)
    
    inline def setUdiCarrierVarargs(value: DeviceUdiCarrier*): Self = StObject.set(x, "udiCarrier", js.Array(value*))
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setVersion(value: js.Array[DeviceVersion]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setVersionVarargs(value: DeviceVersion*): Self = StObject.set(x, "version", js.Array(value*))
    
    inline def set_distinctIdentifier(value: Element): Self = StObject.set(x, "_distinctIdentifier", value.asInstanceOf[js.Any])
    
    inline def set_distinctIdentifierUndefined: Self = StObject.set(x, "_distinctIdentifier", js.undefined)
    
    inline def set_expirationDate(value: Element): Self = StObject.set(x, "_expirationDate", value.asInstanceOf[js.Any])
    
    inline def set_expirationDateUndefined: Self = StObject.set(x, "_expirationDate", js.undefined)
    
    inline def set_lotNumber(value: Element): Self = StObject.set(x, "_lotNumber", value.asInstanceOf[js.Any])
    
    inline def set_lotNumberUndefined: Self = StObject.set(x, "_lotNumber", js.undefined)
    
    inline def set_manufactureDate(value: Element): Self = StObject.set(x, "_manufactureDate", value.asInstanceOf[js.Any])
    
    inline def set_manufactureDateUndefined: Self = StObject.set(x, "_manufactureDate", js.undefined)
    
    inline def set_manufacturer(value: Element): Self = StObject.set(x, "_manufacturer", value.asInstanceOf[js.Any])
    
    inline def set_manufacturerUndefined: Self = StObject.set(x, "_manufacturer", js.undefined)
    
    inline def set_modelNumber(value: Element): Self = StObject.set(x, "_modelNumber", value.asInstanceOf[js.Any])
    
    inline def set_modelNumberUndefined: Self = StObject.set(x, "_modelNumber", js.undefined)
    
    inline def set_partNumber(value: Element): Self = StObject.set(x, "_partNumber", value.asInstanceOf[js.Any])
    
    inline def set_partNumberUndefined: Self = StObject.set(x, "_partNumber", js.undefined)
    
    inline def set_serialNumber(value: Element): Self = StObject.set(x, "_serialNumber", value.asInstanceOf[js.Any])
    
    inline def set_serialNumberUndefined: Self = StObject.set(x, "_serialNumber", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    inline def set_url(value: Element): Self = StObject.set(x, "_url", value.asInstanceOf[js.Any])
    
    inline def set_urlUndefined: Self = StObject.set(x, "_url", js.undefined)
  }
}
