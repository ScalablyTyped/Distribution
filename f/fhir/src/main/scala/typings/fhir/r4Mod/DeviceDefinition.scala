package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceDefinition
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _manufacturerString: js.UndefOr[Element] = js.undefined
  
  var _modelNumber: js.UndefOr[Element] = js.undefined
  
  var _onlineInformation: js.UndefOr[Element] = js.undefined
  
  var _url: js.UndefOr[Element] = js.undefined
  
  var _version: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * Device capabilities.
    */
  var capability: js.UndefOr[js.Array[DeviceDefinitionCapability]] = js.undefined
  
  /**
    * used for troubleshooting etc.
    */
  var contact: js.UndefOr[js.Array[ContactPoint]] = js.undefined
  
  /**
    * A name given to the device to identify it.
    */
  var deviceName: js.UndefOr[js.Array[DeviceDefinitionDeviceName]] = js.undefined
  
  /**
    * Unique instance identifiers assigned to a device by the software, manufacturers, other organizations or owners. For example: handle ID.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Language code for the human-readable text strings produced by the device (all supported).
    */
  var languageCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * A name of the manufacturer.
    */
  var manufacturerReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * A name of the manufacturer.
    */
  var manufacturerString: js.UndefOr[String] = js.undefined
  
  /**
    * A substance used to create the material(s) of which the device is made.
    */
  var material: js.UndefOr[js.Array[DeviceDefinitionMaterial]] = js.undefined
  
  /**
    * The model number for the device.
    */
  var modelNumber: js.UndefOr[String] = js.undefined
  
  /**
    * Descriptive information, usage information or implantation information that is not captured in an existing element.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * Access to on-line information about the device.
    */
  var onlineInformation: js.UndefOr[String] = js.undefined
  
  /**
    * An organization that is responsible for the provision and ongoing maintenance of the device.
    */
  var owner: js.UndefOr[Reference] = js.undefined
  
  /**
    * The parent device it can be part of.
    */
  var parentDevice: js.UndefOr[Reference] = js.undefined
  
  /**
    * Dimensions, color etc.
    */
  var physicalCharacteristics: js.UndefOr[ProdCharacteristic] = js.undefined
  
  /**
    * The actual configuration settings of a device as it actually operates, e.g., regulation status, time properties.
    */
  var property: js.UndefOr[js.Array[DeviceDefinitionProperty]] = js.undefined
  
  /**
    * The quantity of the device present in the packaging (e.g. the number of devices present in a pack, or the number of devices in the same package of the medicinal product).
    */
  var quantity: js.UndefOr[Quantity] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_DeviceDefinition: typings.fhir.fhirStrings.DeviceDefinition
  
  /**
    * Safety characteristics of the device.
    */
  var safety: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Shelf Life and storage information.
    */
  var shelfLifeStorage: js.UndefOr[js.Array[ProductShelfLife]] = js.undefined
  
  /**
    * The capabilities supported on a  device, the standards to which the device conforms for a particular purpose, and used for the communication.
    */
  var specialization: js.UndefOr[js.Array[DeviceDefinitionSpecialization]] = js.undefined
  
  /**
    * What kind of device or device system this is.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Unique device identifier (UDI) assigned to device label or package.  Note that the Device may include multiple udiCarriers as it either may include just the udiCarrier for the jurisdiction it is sold, or for multiple jurisdictions it could have been sold.
    */
  var udiDeviceIdentifier: js.UndefOr[js.Array[DeviceDefinitionUdiDeviceIdentifier]] = js.undefined
  
  /**
    * If the device is running a FHIR server, the network address should  be the Base URL from which a conformance statement may be retrieved.
    */
  var url: js.UndefOr[String] = js.undefined
  
  /**
    * The available versions of the device, e.g., software versions.
    */
  var version: js.UndefOr[js.Array[String]] = js.undefined
}
object DeviceDefinition {
  
  inline def apply(): DeviceDefinition = {
    val __obj = js.Dynamic.literal(resourceType = "DeviceDefinition")
    __obj.asInstanceOf[DeviceDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceDefinition] (val x: Self) extends AnyVal {
    
    inline def setCapability(value: js.Array[DeviceDefinitionCapability]): Self = StObject.set(x, "capability", value.asInstanceOf[js.Any])
    
    inline def setCapabilityUndefined: Self = StObject.set(x, "capability", js.undefined)
    
    inline def setCapabilityVarargs(value: DeviceDefinitionCapability*): Self = StObject.set(x, "capability", js.Array(value*))
    
    inline def setContact(value: js.Array[ContactPoint]): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    inline def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    inline def setContactVarargs(value: ContactPoint*): Self = StObject.set(x, "contact", js.Array(value*))
    
    inline def setDeviceName(value: js.Array[DeviceDefinitionDeviceName]): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    inline def setDeviceNameUndefined: Self = StObject.set(x, "deviceName", js.undefined)
    
    inline def setDeviceNameVarargs(value: DeviceDefinitionDeviceName*): Self = StObject.set(x, "deviceName", js.Array(value*))
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setLanguageCode(value: js.Array[CodeableConcept]): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setLanguageCodeVarargs(value: CodeableConcept*): Self = StObject.set(x, "languageCode", js.Array(value*))
    
    inline def setManufacturerReference(value: Reference): Self = StObject.set(x, "manufacturerReference", value.asInstanceOf[js.Any])
    
    inline def setManufacturerReferenceUndefined: Self = StObject.set(x, "manufacturerReference", js.undefined)
    
    inline def setManufacturerString(value: String): Self = StObject.set(x, "manufacturerString", value.asInstanceOf[js.Any])
    
    inline def setManufacturerStringUndefined: Self = StObject.set(x, "manufacturerString", js.undefined)
    
    inline def setMaterial(value: js.Array[DeviceDefinitionMaterial]): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
    
    inline def setMaterialUndefined: Self = StObject.set(x, "material", js.undefined)
    
    inline def setMaterialVarargs(value: DeviceDefinitionMaterial*): Self = StObject.set(x, "material", js.Array(value*))
    
    inline def setModelNumber(value: String): Self = StObject.set(x, "modelNumber", value.asInstanceOf[js.Any])
    
    inline def setModelNumberUndefined: Self = StObject.set(x, "modelNumber", js.undefined)
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setOnlineInformation(value: String): Self = StObject.set(x, "onlineInformation", value.asInstanceOf[js.Any])
    
    inline def setOnlineInformationUndefined: Self = StObject.set(x, "onlineInformation", js.undefined)
    
    inline def setOwner(value: Reference): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setParentDevice(value: Reference): Self = StObject.set(x, "parentDevice", value.asInstanceOf[js.Any])
    
    inline def setParentDeviceUndefined: Self = StObject.set(x, "parentDevice", js.undefined)
    
    inline def setPhysicalCharacteristics(value: ProdCharacteristic): Self = StObject.set(x, "physicalCharacteristics", value.asInstanceOf[js.Any])
    
    inline def setPhysicalCharacteristicsUndefined: Self = StObject.set(x, "physicalCharacteristics", js.undefined)
    
    inline def setProperty(value: js.Array[DeviceDefinitionProperty]): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    inline def setPropertyVarargs(value: DeviceDefinitionProperty*): Self = StObject.set(x, "property", js.Array(value*))
    
    inline def setQuantity(value: Quantity): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.DeviceDefinition): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSafety(value: js.Array[CodeableConcept]): Self = StObject.set(x, "safety", value.asInstanceOf[js.Any])
    
    inline def setSafetyUndefined: Self = StObject.set(x, "safety", js.undefined)
    
    inline def setSafetyVarargs(value: CodeableConcept*): Self = StObject.set(x, "safety", js.Array(value*))
    
    inline def setShelfLifeStorage(value: js.Array[ProductShelfLife]): Self = StObject.set(x, "shelfLifeStorage", value.asInstanceOf[js.Any])
    
    inline def setShelfLifeStorageUndefined: Self = StObject.set(x, "shelfLifeStorage", js.undefined)
    
    inline def setShelfLifeStorageVarargs(value: ProductShelfLife*): Self = StObject.set(x, "shelfLifeStorage", js.Array(value*))
    
    inline def setSpecialization(value: js.Array[DeviceDefinitionSpecialization]): Self = StObject.set(x, "specialization", value.asInstanceOf[js.Any])
    
    inline def setSpecializationUndefined: Self = StObject.set(x, "specialization", js.undefined)
    
    inline def setSpecializationVarargs(value: DeviceDefinitionSpecialization*): Self = StObject.set(x, "specialization", js.Array(value*))
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUdiDeviceIdentifier(value: js.Array[DeviceDefinitionUdiDeviceIdentifier]): Self = StObject.set(x, "udiDeviceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setUdiDeviceIdentifierUndefined: Self = StObject.set(x, "udiDeviceIdentifier", js.undefined)
    
    inline def setUdiDeviceIdentifierVarargs(value: DeviceDefinitionUdiDeviceIdentifier*): Self = StObject.set(x, "udiDeviceIdentifier", js.Array(value*))
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setVersion(value: js.Array[String]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setVersionVarargs(value: String*): Self = StObject.set(x, "version", js.Array(value*))
    
    inline def set_manufacturerString(value: Element): Self = StObject.set(x, "_manufacturerString", value.asInstanceOf[js.Any])
    
    inline def set_manufacturerStringUndefined: Self = StObject.set(x, "_manufacturerString", js.undefined)
    
    inline def set_modelNumber(value: Element): Self = StObject.set(x, "_modelNumber", value.asInstanceOf[js.Any])
    
    inline def set_modelNumberUndefined: Self = StObject.set(x, "_modelNumber", js.undefined)
    
    inline def set_onlineInformation(value: Element): Self = StObject.set(x, "_onlineInformation", value.asInstanceOf[js.Any])
    
    inline def set_onlineInformationUndefined: Self = StObject.set(x, "_onlineInformation", js.undefined)
    
    inline def set_url(value: Element): Self = StObject.set(x, "_url", value.asInstanceOf[js.Any])
    
    inline def set_urlUndefined: Self = StObject.set(x, "_url", js.undefined)
    
    inline def set_version(value: js.Array[Element]): Self = StObject.set(x, "_version", value.asInstanceOf[js.Any])
    
    inline def set_versionUndefined: Self = StObject.set(x, "_version", js.undefined)
    
    inline def set_versionVarargs(value: Element*): Self = StObject.set(x, "_version", js.Array(value*))
  }
}
