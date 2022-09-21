package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`biological-source`
import typings.fhir.fhirStrings.`expiration-date`
import typings.fhir.fhirStrings.`lot-number`
import typings.fhir.fhirStrings.`manufactured-date`
import typings.fhir.fhirStrings.`serial-number`
import typings.fhir.fhirStrings.`software-version`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceDefinition
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _manufacturerString: js.UndefOr[Element] = js.undefined
  
  var _modelNumber: js.UndefOr[Element] = js.undefined
  
  var _partNumber: js.UndefOr[Element] = js.undefined
  
  var _productionIdentifierInUDI: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * Billing code or reference associated with the device.
    */
  var chargeItem: js.UndefOr[js.Array[DeviceDefinitionChargeItem]] = js.undefined
  
  /**
    * In this element various classifications can be used, such as GMDN, EMDN, SNOMED CT, risk classes, national product codes.
    */
  var classification: js.UndefOr[js.Array[DeviceDefinitionClassification]] = js.undefined
  
  /**
    * used for troubleshooting etc.
    */
  var contact: js.UndefOr[js.Array[ContactPoint]] = js.undefined
  
  /**
    * Tracking of latest field safety corrective action.
    */
  var correctiveAction: js.UndefOr[DeviceDefinitionCorrectiveAction] = js.undefined
  
  /**
    * Additional information to describe the device.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The name or names of the device as given by the manufacturer.
    */
  var deviceName: js.UndefOr[js.Array[DeviceDefinitionDeviceName]] = js.undefined
  
  /**
    * Information aimed at providing directions for the usage of this model of device.
    */
  var guideline: js.UndefOr[DeviceDefinitionGuideline] = js.undefined
  
  /**
    * A device that is part (for example a component) of the present device.
    */
  var hasPart: js.UndefOr[js.Array[DeviceDefinitionHasPart]] = js.undefined
  
  /**
    * Unique instance identifiers assigned to a device by the software, manufacturers, other organizations or owners. For example: handle ID. The identifier is typically valued if the udiDeviceIdentifier, partNumber or modelNumber is not valued and represents a different type of identifier.  However, it is permissible to still include those identifiers in DeviceDefinition.identifier with the appropriate identifier.type.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Language code for the human-readable text strings produced by the device (all supported).
    */
  var languageCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * An associated device, attached to, used with, communicating with or linking a previous or new device model to the focal device.
    */
  var link: js.UndefOr[js.Array[DeviceDefinitionLink]] = js.undefined
  
  /**
    * A name of the manufacturer  or legal representative e.g. labeler. Whether this is the actual manufacturer or the labeler or responsible depends on implementation and jurisdiction.
    */
  var manufacturerReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * A name of the manufacturer  or legal representative e.g. labeler. Whether this is the actual manufacturer or the labeler or responsible depends on implementation and jurisdiction.
    */
  var manufacturerString: js.UndefOr[String] = js.undefined
  
  /**
    * A substance used to create the material(s) of which the device is made.
    */
  var material: js.UndefOr[js.Array[DeviceDefinitionMaterial]] = js.undefined
  
  /**
    * The model number for the device for example as defined by the manufacturer or labeler, or other agency.
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
    * Information about the packaging of the device, i.e. how the device is packaged.
    */
  var packaging: js.UndefOr[js.Array[DeviceDefinitionPackaging]] = js.undefined
  
  /**
    * The parent device it can be part of.
    */
  var parentDevice: js.UndefOr[Reference] = js.undefined
  
  /**
    * Alphanumeric Maximum 20.
    */
  var partNumber: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates the production identifier(s) that are expected to appear in the UDI carrier on the device label.
    */
  var productionIdentifierInUDI: js.UndefOr[
    js.Array[
      `lot-number` | `manufactured-date` | `serial-number` | `expiration-date` | `biological-source` | `software-version`
    ]
  ] = js.undefined
  
  /**
    * The potential, valid configuration settings of a device, e.g., regulation status, time properties.
    */
  var property: js.UndefOr[js.Array[DeviceDefinitionProperty]] = js.undefined
  
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
  var specialization: js.UndefOr[js.Array[RelatedArtifact]] = js.undefined
  
  /**
    * Unique device identifier (UDI) assigned to device label or package.  Note that the Device may include multiple udiCarriers as it either may include just the udiCarrier for the jurisdiction it is sold, or for multiple jurisdictions it could have been sold.
    */
  var udiDeviceIdentifier: js.UndefOr[js.Array[DeviceDefinitionUdiDeviceIdentifier]] = js.undefined
  
  /**
    * The version of the device or software.
    */
  var version: js.UndefOr[js.Array[DeviceDefinitionVersion]] = js.undefined
}
object DeviceDefinition {
  
  inline def apply(): DeviceDefinition = {
    val __obj = js.Dynamic.literal(resourceType = "DeviceDefinition")
    __obj.asInstanceOf[DeviceDefinition]
  }
  
  extension [Self <: DeviceDefinition](x: Self) {
    
    inline def setChargeItem(value: js.Array[DeviceDefinitionChargeItem]): Self = StObject.set(x, "chargeItem", value.asInstanceOf[js.Any])
    
    inline def setChargeItemUndefined: Self = StObject.set(x, "chargeItem", js.undefined)
    
    inline def setChargeItemVarargs(value: DeviceDefinitionChargeItem*): Self = StObject.set(x, "chargeItem", js.Array(value*))
    
    inline def setClassification(value: js.Array[DeviceDefinitionClassification]): Self = StObject.set(x, "classification", value.asInstanceOf[js.Any])
    
    inline def setClassificationUndefined: Self = StObject.set(x, "classification", js.undefined)
    
    inline def setClassificationVarargs(value: DeviceDefinitionClassification*): Self = StObject.set(x, "classification", js.Array(value*))
    
    inline def setContact(value: js.Array[ContactPoint]): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    inline def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    inline def setContactVarargs(value: ContactPoint*): Self = StObject.set(x, "contact", js.Array(value*))
    
    inline def setCorrectiveAction(value: DeviceDefinitionCorrectiveAction): Self = StObject.set(x, "correctiveAction", value.asInstanceOf[js.Any])
    
    inline def setCorrectiveActionUndefined: Self = StObject.set(x, "correctiveAction", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDeviceName(value: js.Array[DeviceDefinitionDeviceName]): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    inline def setDeviceNameUndefined: Self = StObject.set(x, "deviceName", js.undefined)
    
    inline def setDeviceNameVarargs(value: DeviceDefinitionDeviceName*): Self = StObject.set(x, "deviceName", js.Array(value*))
    
    inline def setGuideline(value: DeviceDefinitionGuideline): Self = StObject.set(x, "guideline", value.asInstanceOf[js.Any])
    
    inline def setGuidelineUndefined: Self = StObject.set(x, "guideline", js.undefined)
    
    inline def setHasPart(value: js.Array[DeviceDefinitionHasPart]): Self = StObject.set(x, "hasPart", value.asInstanceOf[js.Any])
    
    inline def setHasPartUndefined: Self = StObject.set(x, "hasPart", js.undefined)
    
    inline def setHasPartVarargs(value: DeviceDefinitionHasPart*): Self = StObject.set(x, "hasPart", js.Array(value*))
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setLanguageCode(value: js.Array[CodeableConcept]): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setLanguageCodeVarargs(value: CodeableConcept*): Self = StObject.set(x, "languageCode", js.Array(value*))
    
    inline def setLink(value: js.Array[DeviceDefinitionLink]): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    inline def setLinkVarargs(value: DeviceDefinitionLink*): Self = StObject.set(x, "link", js.Array(value*))
    
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
    
    inline def setOwner(value: Reference): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setPackaging(value: js.Array[DeviceDefinitionPackaging]): Self = StObject.set(x, "packaging", value.asInstanceOf[js.Any])
    
    inline def setPackagingUndefined: Self = StObject.set(x, "packaging", js.undefined)
    
    inline def setPackagingVarargs(value: DeviceDefinitionPackaging*): Self = StObject.set(x, "packaging", js.Array(value*))
    
    inline def setParentDevice(value: Reference): Self = StObject.set(x, "parentDevice", value.asInstanceOf[js.Any])
    
    inline def setParentDeviceUndefined: Self = StObject.set(x, "parentDevice", js.undefined)
    
    inline def setPartNumber(value: String): Self = StObject.set(x, "partNumber", value.asInstanceOf[js.Any])
    
    inline def setPartNumberUndefined: Self = StObject.set(x, "partNumber", js.undefined)
    
    inline def setProductionIdentifierInUDI(
      value: js.Array[
          `lot-number` | `manufactured-date` | `serial-number` | `expiration-date` | `biological-source` | `software-version`
        ]
    ): Self = StObject.set(x, "productionIdentifierInUDI", value.asInstanceOf[js.Any])
    
    inline def setProductionIdentifierInUDIUndefined: Self = StObject.set(x, "productionIdentifierInUDI", js.undefined)
    
    inline def setProductionIdentifierInUDIVarargs(
      value: (`lot-number` | `manufactured-date` | `serial-number` | `expiration-date` | `biological-source` | `software-version`)*
    ): Self = StObject.set(x, "productionIdentifierInUDI", js.Array(value*))
    
    inline def setProperty(value: js.Array[DeviceDefinitionProperty]): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    inline def setPropertyVarargs(value: DeviceDefinitionProperty*): Self = StObject.set(x, "property", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.DeviceDefinition): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSafety(value: js.Array[CodeableConcept]): Self = StObject.set(x, "safety", value.asInstanceOf[js.Any])
    
    inline def setSafetyUndefined: Self = StObject.set(x, "safety", js.undefined)
    
    inline def setSafetyVarargs(value: CodeableConcept*): Self = StObject.set(x, "safety", js.Array(value*))
    
    inline def setShelfLifeStorage(value: js.Array[ProductShelfLife]): Self = StObject.set(x, "shelfLifeStorage", value.asInstanceOf[js.Any])
    
    inline def setShelfLifeStorageUndefined: Self = StObject.set(x, "shelfLifeStorage", js.undefined)
    
    inline def setShelfLifeStorageVarargs(value: ProductShelfLife*): Self = StObject.set(x, "shelfLifeStorage", js.Array(value*))
    
    inline def setSpecialization(value: js.Array[RelatedArtifact]): Self = StObject.set(x, "specialization", value.asInstanceOf[js.Any])
    
    inline def setSpecializationUndefined: Self = StObject.set(x, "specialization", js.undefined)
    
    inline def setSpecializationVarargs(value: RelatedArtifact*): Self = StObject.set(x, "specialization", js.Array(value*))
    
    inline def setUdiDeviceIdentifier(value: js.Array[DeviceDefinitionUdiDeviceIdentifier]): Self = StObject.set(x, "udiDeviceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setUdiDeviceIdentifierUndefined: Self = StObject.set(x, "udiDeviceIdentifier", js.undefined)
    
    inline def setUdiDeviceIdentifierVarargs(value: DeviceDefinitionUdiDeviceIdentifier*): Self = StObject.set(x, "udiDeviceIdentifier", js.Array(value*))
    
    inline def setVersion(value: js.Array[DeviceDefinitionVersion]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setVersionVarargs(value: DeviceDefinitionVersion*): Self = StObject.set(x, "version", js.Array(value*))
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_manufacturerString(value: Element): Self = StObject.set(x, "_manufacturerString", value.asInstanceOf[js.Any])
    
    inline def set_manufacturerStringUndefined: Self = StObject.set(x, "_manufacturerString", js.undefined)
    
    inline def set_modelNumber(value: Element): Self = StObject.set(x, "_modelNumber", value.asInstanceOf[js.Any])
    
    inline def set_modelNumberUndefined: Self = StObject.set(x, "_modelNumber", js.undefined)
    
    inline def set_partNumber(value: Element): Self = StObject.set(x, "_partNumber", value.asInstanceOf[js.Any])
    
    inline def set_partNumberUndefined: Self = StObject.set(x, "_partNumber", js.undefined)
    
    inline def set_productionIdentifierInUDI(value: js.Array[Element]): Self = StObject.set(x, "_productionIdentifierInUDI", value.asInstanceOf[js.Any])
    
    inline def set_productionIdentifierInUDIUndefined: Self = StObject.set(x, "_productionIdentifierInUDI", js.undefined)
    
    inline def set_productionIdentifierInUDIVarargs(value: Element*): Self = StObject.set(x, "_productionIdentifierInUDI", js.Array(value*))
  }
}
