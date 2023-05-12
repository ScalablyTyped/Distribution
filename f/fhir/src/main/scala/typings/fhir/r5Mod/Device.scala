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
    * The availability of the device.
    */
  var availabilityStatus: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Necessary to support mandatory requirements for traceability from donor/source to recipient and vice versa, while also satisfying donor anonymity requirements. The element is defined consistently across BiologicallyDerivedProduct, NutritionProduct, and Device.  The identifier references an event that links to a single biological entity such as a blood donor, or to multiple biological entities (e.g. when the product is an embryo or a pooled platelet product).  A single biologicalSourceEvent identifier may appear on multiple products of many types derived from a single donation event or source extraction.  As an example, a single donation event may provide 2 kidneys and a liver for organ transplantation, 2 corneas for eye surgery, heart valves and arterial tissue for cardiovascular surgery, multiple skin grafts, tendons, multiple shaped bone grafts and a large number of bone putty/paste products; and each of them may be assigned to the same biological source event identifier.
    */
  var biologicalSourceEvent: js.UndefOr[Identifier] = js.undefined
  
  /**
    * Devices may be associated with one or more categories.
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Identifies the standards, specifications, or formal guidances for the capabilities supported by the device. The device may be certified as conformant to these specifications e.g., communication, performance, process, measurement, or specialization standards.
    */
  var conformsTo: js.UndefOr[js.Array[DeviceConformsTo]] = js.undefined
  
  /**
    * used for troubleshooting etc.
    */
  var contact: js.UndefOr[js.Array[ContactPoint]] = js.undefined
  
  /**
    * The series of occurrences that repeats during the operation of the device.
    */
  var cycle: js.UndefOr[Count] = js.undefined
  
  /**
    * The reference to the definition for the device.
    */
  var definition: js.UndefOr[CodeableReference] = js.undefined
  
  /**
    * The name used to display by default when the device is referenced. Based on intent of use by the resource creator, this may reflect one of the names in Device.name, or may be another simple name.
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * A measurement of time during the device's operation (e.g., days, hours, mins, etc.).
    */
  var duration: js.UndefOr[Duration] = js.undefined
  
  /**
    * Technical endpoints providing access to services provided by the device defined at this resource.
    */
  var endpoint: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The date and time beyond which this device is no longer valid or should not be used (if applicable).
    */
  var expirationDate: js.UndefOr[String] = js.undefined
  
  /**
    * The Device.gateway may be used when the Device being referenced has a gateway and/or to capture one or more gateways associated with the device. If the Gateway is included in the Observation resource, the Observation.gatewayDevice should be used instead.
    */
  var gateway: js.UndefOr[js.Array[CodeableReference]] = js.undefined
  
  /**
    * Certain attributes, like serial number and UDI Carrier (the HRF or AIDC barcode string) are not device instance identifiers as they are not consistently able to uniquely identify the instance of a device, thus are not appropriate to be used to value Device.identifier. The barcode string from a barcode present on a device label or package may identify the instance, include names given to the device in local usage, or may identify the type of device. If the identifier identifies the type of device, Device.type element should be used. The identifier is typically valued if the serialNumber or lotNumber is not valued and represents a different type of identifier.  However, it is permissible to still include those identifiers in DeviceDefinition.identifier with the appropriate identifier.type.
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
    * A name of the manufacturer or entity legally responsible for the device.
    */
  var manufacturer: js.UndefOr[String] = js.undefined
  
  /**
    * The designated condition for performing a task with the device.
    */
  var mode: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The manufacturer's model number for the device.
    */
  var modelNumber: js.UndefOr[String] = js.undefined
  
  /**
    * This represents the manufacturer's name of the device as provided by the device, from a UDI label, or by a person describing the Device.  This typically would be used when a person provides the name(s) or when the device represents one of the names available from DeviceDefinition.
    */
  var name: js.UndefOr[js.Array[DeviceName]] = js.undefined
  
  /**
    * Descriptive information, usage information or implantation information that is not captured in an existing element.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * An organization that is responsible for the provision and ongoing maintenance of the device.
    */
  var owner: js.UndefOr[Reference] = js.undefined
  
  /**
    * For example a vital signs monitor (parent) where three separate modules can be plugged into such as interchangeable blood pressure, oximeter, temperature modules.  These modules are represented as devices with the .parent valued to the vital signs monitor when plugged in.
    */
  var parent: js.UndefOr[Reference] = js.undefined
  
  /**
    * Alphanumeric Maximum 20.
    */
  var partNumber: js.UndefOr[String] = js.undefined
  
  /**
    * Dynamic or current properties, such as settings, of an individual device are described using a Device instance-specific [DeviceMetric] and recorded using [Observation].  Static characteristics of a device could also be documented in an associated [DeviceDefinition] instance. The Device instance's properties, and their values, could be, but need not be, the same as those described in an associated DeviceDefinition.
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
    * The Device record status. This is not the status of the device like availability.
    */
  var status: js.UndefOr[active | inactive | `entered-in-error`] = js.undefined
  
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
    
    inline def setAvailabilityStatus(value: CodeableConcept): Self = StObject.set(x, "availabilityStatus", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityStatusUndefined: Self = StObject.set(x, "availabilityStatus", js.undefined)
    
    inline def setBiologicalSourceEvent(value: Identifier): Self = StObject.set(x, "biologicalSourceEvent", value.asInstanceOf[js.Any])
    
    inline def setBiologicalSourceEventUndefined: Self = StObject.set(x, "biologicalSourceEvent", js.undefined)
    
    inline def setCategory(value: js.Array[CodeableConcept]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCategoryVarargs(value: CodeableConcept*): Self = StObject.set(x, "category", js.Array(value*))
    
    inline def setConformsTo(value: js.Array[DeviceConformsTo]): Self = StObject.set(x, "conformsTo", value.asInstanceOf[js.Any])
    
    inline def setConformsToUndefined: Self = StObject.set(x, "conformsTo", js.undefined)
    
    inline def setConformsToVarargs(value: DeviceConformsTo*): Self = StObject.set(x, "conformsTo", js.Array(value*))
    
    inline def setContact(value: js.Array[ContactPoint]): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    inline def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    inline def setContactVarargs(value: ContactPoint*): Self = StObject.set(x, "contact", js.Array(value*))
    
    inline def setCycle(value: Count): Self = StObject.set(x, "cycle", value.asInstanceOf[js.Any])
    
    inline def setCycleUndefined: Self = StObject.set(x, "cycle", js.undefined)
    
    inline def setDefinition(value: CodeableReference): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setDuration(value: Duration): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEndpoint(value: js.Array[Reference]): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    inline def setEndpointVarargs(value: Reference*): Self = StObject.set(x, "endpoint", js.Array(value*))
    
    inline def setExpirationDate(value: String): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
    
    inline def setExpirationDateUndefined: Self = StObject.set(x, "expirationDate", js.undefined)
    
    inline def setGateway(value: js.Array[CodeableReference]): Self = StObject.set(x, "gateway", value.asInstanceOf[js.Any])
    
    inline def setGatewayUndefined: Self = StObject.set(x, "gateway", js.undefined)
    
    inline def setGatewayVarargs(value: CodeableReference*): Self = StObject.set(x, "gateway", js.Array(value*))
    
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
    
    inline def setMode(value: CodeableConcept): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setModelNumber(value: String): Self = StObject.set(x, "modelNumber", value.asInstanceOf[js.Any])
    
    inline def setModelNumberUndefined: Self = StObject.set(x, "modelNumber", js.undefined)
    
    inline def setName(value: js.Array[DeviceName]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNameVarargs(value: DeviceName*): Self = StObject.set(x, "name", js.Array(value*))
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
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
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
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
