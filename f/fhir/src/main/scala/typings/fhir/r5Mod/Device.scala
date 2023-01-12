package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.inactive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Device
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _displayName: js.UndefOr[Element] = js.undefined
  
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
    * The state of the usage or application of the device - whether the device is implanted, or explanted, or attached to the patient.
    */
  var associationStatus: js.UndefOr[DeviceAssociationStatus] = js.undefined
  
  /**
    * Necessary to support mandatory requirements for traceability from donor/source to recipient and vice versa.  The element is defined consistently across BiologicallyDerivedProduct, NutritionProduct, and Device. For example, this applies to devices in the United States regulated under *Code of Federal Regulation 21CFR§1271.290(c)*.
    */
  var biologicalSource: js.UndefOr[Identifier] = js.undefined
  
  /**
    * used for troubleshooting etc.
    */
  var contact: js.UndefOr[js.Array[ContactPoint]] = js.undefined
  
  /**
    * The reference to the definition for the device.
    */
  var definition: js.UndefOr[CodeableReference] = js.undefined
  
  /**
    * This represents the manufacturer's name of the device as provided by the device, from a UDI label, or by a person describing the Device.  This typically would be used when a person provides the name(s) or when the device represents one of the names available from DeviceDefinition.
    */
  var deviceName: js.UndefOr[js.Array[DeviceDeviceName]] = js.undefined
  
  /**
    * The name used to display by default when the device is referenced. Based on intent of use by the resource creator, this may reflect one of the names in Device.deviceName, or may be another simple name.
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * Technical endpoints providing access to services provided by the device defined at this resource.
    */
  var endpoint: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The date and time beyond which this device is no longer valid or should not be used (if applicable).
    */
  var expirationDate: js.UndefOr[String] = js.undefined
  
  /**
    * Certain attributes, like serial number and UDI Carrier (the HRF or AIDC barcode string) are not device instance identifiers as they are not consistently able to uniquely identify the instance of a device, thus are not appropriate to be used to value Device.identifier. The barcode string from a barcode present on a device label or package may identify the instance, include names given to the device in local usage, or may identify the type of device. If the identifier identifies the type of device, Device.type element should be used. The identifier is typically valued if the serialNumber or lotNumber is not valued and represents a different type of identifier.  However, it is permissible to still include those identifiers in DeviceDefinition.identifier with the appropriate identifier.type.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * An associated device, attached to, used with, communicating with or linking a previous or new device model to the focal device.
    */
  var link: js.UndefOr[js.Array[DeviceLink]] = js.undefined
  
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
    * A name of the manufacturer or entity legally responsible for the device.
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
    * The status of the device itself - whether it is switched on, or activated, etc.
    */
  var operationalStatus: js.UndefOr[DeviceOperationalStatus] = js.undefined
  
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
    * Alphanumeric Maximum 20. While a serial number is a type of identifier, in the context of devices for which a UDI is required, thus a serial number may be part of the production identifier, it is more informative to have the serial number as a dedicated attribute together with the other UDI production identifier.  When the device is not subject to including the UDI (e.g., its presence and exchange is not mandated by local regulatory requirements or specific use case at hand), thus the concept of production identifiers is not relevant as a set, it remains helpful for consistency to still use Device.serialNumber rather than using Device.identifier with an appropriate type.  Systems that do not realize an identifier is a serial number may place it in Device.identifier or if the identifier.system is known for the serial number, it may also be populated in the Device.identifier as a globally unique id_.
    */
  var serialNumber: js.UndefOr[String] = js.undefined
  
  /**
    * This element is labeled as a modifier because the status contains the codes inactive and entered-in-error that mark the device (record)as not currently valid.
    */
  var status: js.UndefOr[active | inactive | `entered-in-error`] = js.undefined
  
  /**
    * Reason for the status of the Device record. For example, why is the record not active.
    */
  var statusReason: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Patient information, if the device is affixed to, or associated to a patient for their specific use, irrespective of the procedure, use, observation, or other activity that the device is involved in.
    */
  var subject: js.UndefOr[Reference] = js.undefined
  
  /**
    * Multiple device types are use when a device is categorized in more than one context – for example, hybrid devices in which the device is both of type gateway and sensor.
    */
  var `type`: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
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
    
    inline def setAssociationStatus(value: DeviceAssociationStatus): Self = StObject.set(x, "associationStatus", value.asInstanceOf[js.Any])
    
    inline def setAssociationStatusUndefined: Self = StObject.set(x, "associationStatus", js.undefined)
    
    inline def setBiologicalSource(value: Identifier): Self = StObject.set(x, "biologicalSource", value.asInstanceOf[js.Any])
    
    inline def setBiologicalSourceUndefined: Self = StObject.set(x, "biologicalSource", js.undefined)
    
    inline def setContact(value: js.Array[ContactPoint]): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    inline def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    inline def setContactVarargs(value: ContactPoint*): Self = StObject.set(x, "contact", js.Array(value*))
    
    inline def setDefinition(value: CodeableReference): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    inline def setDeviceName(value: js.Array[DeviceDeviceName]): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    inline def setDeviceNameUndefined: Self = StObject.set(x, "deviceName", js.undefined)
    
    inline def setDeviceNameVarargs(value: DeviceDeviceName*): Self = StObject.set(x, "deviceName", js.Array(value*))
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEndpoint(value: js.Array[Reference]): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    inline def setEndpointVarargs(value: Reference*): Self = StObject.set(x, "endpoint", js.Array(value*))
    
    inline def setExpirationDate(value: String): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
    
    inline def setExpirationDateUndefined: Self = StObject.set(x, "expirationDate", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setLink(value: js.Array[DeviceLink]): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    inline def setLinkVarargs(value: DeviceLink*): Self = StObject.set(x, "link", js.Array(value*))
    
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
    
    inline def setOperationalStatus(value: DeviceOperationalStatus): Self = StObject.set(x, "operationalStatus", value.asInstanceOf[js.Any])
    
    inline def setOperationalStatusUndefined: Self = StObject.set(x, "operationalStatus", js.undefined)
    
    inline def setOwner(value: Reference): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setParent(value: Reference): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setPartNumber(value: String): Self = StObject.set(x, "partNumber", value.asInstanceOf[js.Any])
    
    inline def setPartNumberUndefined: Self = StObject.set(x, "partNumber", js.undefined)
    
    inline def setProperty(value: js.Array[DeviceProperty]): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    inline def setPropertyVarargs(value: DeviceProperty*): Self = StObject.set(x, "property", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Device): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSafety(value: js.Array[CodeableConcept]): Self = StObject.set(x, "safety", value.asInstanceOf[js.Any])
    
    inline def setSafetyUndefined: Self = StObject.set(x, "safety", js.undefined)
    
    inline def setSafetyVarargs(value: CodeableConcept*): Self = StObject.set(x, "safety", js.Array(value*))
    
    inline def setSerialNumber(value: String): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    inline def setSerialNumberUndefined: Self = StObject.set(x, "serialNumber", js.undefined)
    
    inline def setStatus(value: active | inactive | `entered-in-error`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusReason(value: js.Array[CodeableConcept]): Self = StObject.set(x, "statusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "statusReason", js.undefined)
    
    inline def setStatusReasonVarargs(value: CodeableConcept*): Self = StObject.set(x, "statusReason", js.Array(value*))
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setType(value: js.Array[CodeableConcept]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setTypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "type", js.Array(value*))
    
    inline def setUdiCarrier(value: js.Array[DeviceUdiCarrier]): Self = StObject.set(x, "udiCarrier", value.asInstanceOf[js.Any])
    
    inline def setUdiCarrierUndefined: Self = StObject.set(x, "udiCarrier", js.undefined)
    
    inline def setUdiCarrierVarargs(value: DeviceUdiCarrier*): Self = StObject.set(x, "udiCarrier", js.Array(value*))
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setVersion(value: js.Array[DeviceVersion]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setVersionVarargs(value: DeviceVersion*): Self = StObject.set(x, "version", js.Array(value*))
    
    inline def set_displayName(value: Element): Self = StObject.set(x, "_displayName", value.asInstanceOf[js.Any])
    
    inline def set_displayNameUndefined: Self = StObject.set(x, "_displayName", js.undefined)
    
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
