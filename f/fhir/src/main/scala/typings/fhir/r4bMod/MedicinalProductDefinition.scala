package typings.fhir.r4bMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicinalProductDefinition
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _indication: js.UndefOr[Element] = js.undefined
  
  var _statusDate: js.UndefOr[Element] = js.undefined
  
  var _version: js.UndefOr[Element] = js.undefined
  
  /**
    * Whether the Medicinal Product is subject to additional monitoring for regulatory reasons, such as heightened reporting requirements.
    */
  var additionalMonitoringIndicator: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Additional information or supporting documentation about the medicinal product.
    */
  var attachedDocument: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Allows the key product features to be recorded, such as "sugar free", "modified release", "parallel import".
    */
  var characteristic: js.UndefOr[js.Array[MedicinalProductDefinitionCharacteristic]] = js.undefined
  
  /**
    * Allows the product to be classified by various systems, commonly WHO ATC.
    */
  var classification: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Clinical trials or studies that this product is involved in.
    */
  var clinicalTrial: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * A code that this product is known by, usually within some formal terminology, perhaps assigned by a third party (i.e. not the manufacturer or regulator). Products (types of medications) tend to be known by identifiers during development and within regulatory process. However when they are prescribed they tend to be identified by codes. The same product may be have multiple codes, applied to it by multiple organizations.
    */
  var code: js.UndefOr[js.Array[Coding]] = js.undefined
  
  /**
    * The dose form for a single part product, or combined form of a multiple part product. This is one concept that describes all the components. It does not represent the form with components physically mixed, if that might be necessary, for which see (AdministrableProductDefinition.administrableDoseForm).
    */
  var combinedPharmaceuticalDoseForm: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * A product specific contact, person (in a role), or an organization.
    */
  var contact: js.UndefOr[js.Array[MedicinalProductDefinitionContact]] = js.undefined
  
  /**
    * Reference to another product, e.g. for linking authorised to investigational product, or a virtual product.
    */
  var crossReference: js.UndefOr[js.Array[MedicinalProductDefinitionCrossReference]] = js.undefined
  
  /**
    * General description of this product.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * If this medicine applies to human or veterinary uses.
    */
  var domain: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Business identifier for this product. Could be an MPID. When in development or being regulated, products are typically referenced by official identifiers, assigned by a manufacturer or regulator, and unique to a product (which, when compared to a product instance being prescribed, is actually a product type). See also MedicinalProductDefinition.code.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Any component of the drug product which is not the chemical entity defined as the drug substance, or an excipient in the drug product. This includes process-related impurities and contaminants, product-related impurities including degradation products.
    */
  var impurity: js.UndefOr[js.Array[CodeableReference]] = js.undefined
  
  /**
    * Description of indication(s) for this product, used when structured indications are not required. In cases where structured indications are required, they are captured using the ClinicalUseDefinition resource. An indication is a medical situation for which using the product is appropriate.
    */
  var indication: js.UndefOr[String] = js.undefined
  
  /**
    * The ingredients of this medicinal product - when not detailed in other resources. This is only needed if the ingredients are not specified by incoming references from the Ingredient resource, or indirectly via incoming AdministrableProductDefinition, PackagedProductDefinition or ManufacturedItemDefinition references. In cases where those levels of detail are not used, the ingredients may be specified directly here as codes.
    */
  var ingredient: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The legal status of supply of the medicinal product as classified by the regulator.
    */
  var legalStatusOfSupply: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Marketing status of the medicinal product, in contrast to marketing authorization. This refers to the product being actually 'on the market' as opposed to being allowed to be on the market (which is an authorization).
    */
  var marketingStatus: js.UndefOr[js.Array[MarketingStatus]] = js.undefined
  
  /**
    * A master file for the medicinal product (e.g. Pharmacovigilance System Master File). Drug master files (DMFs) are documents submitted to regulatory agencies to provide confidential detailed information about facilities, processes or articles used in the manufacturing, processing, packaging and storing of drug products.
    */
  var masterFile: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The product's name, including full name and possibly coded parts.
    */
  var name: js.Array[MedicinalProductDefinitionName]
  
  /**
    * A manufacturing or administrative process or step associated with (or performed on) the medicinal product.
    */
  var operation: js.UndefOr[js.Array[MedicinalProductDefinitionOperation]] = js.undefined
  
  /**
    * Package type for the product. See also the PackagedProductDefinition resource.
    */
  var packagedMedicinalProduct: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * If authorised for use in children, or infants, neonates etc.
    */
  var pediatricUseIndicator: js.UndefOr[CodeableConcept] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_MedicinalProductDefinition: typings.fhir.fhirStrings.MedicinalProductDefinition
  
  /**
    * The path by which the product is taken into or makes contact with the body. In some regions this is referred to as the licenced or approved route. See also AdministrableProductDefinition resource. MedicinalProductDefinition.route is the same concept as AdministrableProductDefinition.routeOfAdministration.code, and they cannot be used together.
    */
  var route: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Whether the Medicinal Product is subject to special measures for regulatory reasons, such as a requirement to conduct post-authorisation studies.
    */
  var specialMeasures: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The status within the lifecycle of this product record. A high-level status, this is not intended to duplicate details carried elsewhere such as legal status, or authorization status.
    */
  var status: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The date at which the given status became applicable.
    */
  var statusDate: js.UndefOr[String] = js.undefined
  
  /**
    * Regulatory type, e.g. Investigational or Authorized.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * A business identifier relating to a specific version of the product, this is commonly used to support revisions to an existing product.
    */
  var version: js.UndefOr[String] = js.undefined
}
object MedicinalProductDefinition {
  
  inline def apply(name: js.Array[MedicinalProductDefinitionName]): MedicinalProductDefinition = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], resourceType = "MedicinalProductDefinition")
    __obj.asInstanceOf[MedicinalProductDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MedicinalProductDefinition] (val x: Self) extends AnyVal {
    
    inline def setAdditionalMonitoringIndicator(value: CodeableConcept): Self = StObject.set(x, "additionalMonitoringIndicator", value.asInstanceOf[js.Any])
    
    inline def setAdditionalMonitoringIndicatorUndefined: Self = StObject.set(x, "additionalMonitoringIndicator", js.undefined)
    
    inline def setAttachedDocument(value: js.Array[Reference]): Self = StObject.set(x, "attachedDocument", value.asInstanceOf[js.Any])
    
    inline def setAttachedDocumentUndefined: Self = StObject.set(x, "attachedDocument", js.undefined)
    
    inline def setAttachedDocumentVarargs(value: Reference*): Self = StObject.set(x, "attachedDocument", js.Array(value*))
    
    inline def setCharacteristic(value: js.Array[MedicinalProductDefinitionCharacteristic]): Self = StObject.set(x, "characteristic", value.asInstanceOf[js.Any])
    
    inline def setCharacteristicUndefined: Self = StObject.set(x, "characteristic", js.undefined)
    
    inline def setCharacteristicVarargs(value: MedicinalProductDefinitionCharacteristic*): Self = StObject.set(x, "characteristic", js.Array(value*))
    
    inline def setClassification(value: js.Array[CodeableConcept]): Self = StObject.set(x, "classification", value.asInstanceOf[js.Any])
    
    inline def setClassificationUndefined: Self = StObject.set(x, "classification", js.undefined)
    
    inline def setClassificationVarargs(value: CodeableConcept*): Self = StObject.set(x, "classification", js.Array(value*))
    
    inline def setClinicalTrial(value: js.Array[Reference]): Self = StObject.set(x, "clinicalTrial", value.asInstanceOf[js.Any])
    
    inline def setClinicalTrialUndefined: Self = StObject.set(x, "clinicalTrial", js.undefined)
    
    inline def setClinicalTrialVarargs(value: Reference*): Self = StObject.set(x, "clinicalTrial", js.Array(value*))
    
    inline def setCode(value: js.Array[Coding]): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setCodeVarargs(value: Coding*): Self = StObject.set(x, "code", js.Array(value*))
    
    inline def setCombinedPharmaceuticalDoseForm(value: CodeableConcept): Self = StObject.set(x, "combinedPharmaceuticalDoseForm", value.asInstanceOf[js.Any])
    
    inline def setCombinedPharmaceuticalDoseFormUndefined: Self = StObject.set(x, "combinedPharmaceuticalDoseForm", js.undefined)
    
    inline def setContact(value: js.Array[MedicinalProductDefinitionContact]): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    inline def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    inline def setContactVarargs(value: MedicinalProductDefinitionContact*): Self = StObject.set(x, "contact", js.Array(value*))
    
    inline def setCrossReference(value: js.Array[MedicinalProductDefinitionCrossReference]): Self = StObject.set(x, "crossReference", value.asInstanceOf[js.Any])
    
    inline def setCrossReferenceUndefined: Self = StObject.set(x, "crossReference", js.undefined)
    
    inline def setCrossReferenceVarargs(value: MedicinalProductDefinitionCrossReference*): Self = StObject.set(x, "crossReference", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDomain(value: CodeableConcept): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setImpurity(value: js.Array[CodeableReference]): Self = StObject.set(x, "impurity", value.asInstanceOf[js.Any])
    
    inline def setImpurityUndefined: Self = StObject.set(x, "impurity", js.undefined)
    
    inline def setImpurityVarargs(value: CodeableReference*): Self = StObject.set(x, "impurity", js.Array(value*))
    
    inline def setIndication(value: String): Self = StObject.set(x, "indication", value.asInstanceOf[js.Any])
    
    inline def setIndicationUndefined: Self = StObject.set(x, "indication", js.undefined)
    
    inline def setIngredient(value: js.Array[CodeableConcept]): Self = StObject.set(x, "ingredient", value.asInstanceOf[js.Any])
    
    inline def setIngredientUndefined: Self = StObject.set(x, "ingredient", js.undefined)
    
    inline def setIngredientVarargs(value: CodeableConcept*): Self = StObject.set(x, "ingredient", js.Array(value*))
    
    inline def setLegalStatusOfSupply(value: CodeableConcept): Self = StObject.set(x, "legalStatusOfSupply", value.asInstanceOf[js.Any])
    
    inline def setLegalStatusOfSupplyUndefined: Self = StObject.set(x, "legalStatusOfSupply", js.undefined)
    
    inline def setMarketingStatus(value: js.Array[MarketingStatus]): Self = StObject.set(x, "marketingStatus", value.asInstanceOf[js.Any])
    
    inline def setMarketingStatusUndefined: Self = StObject.set(x, "marketingStatus", js.undefined)
    
    inline def setMarketingStatusVarargs(value: MarketingStatus*): Self = StObject.set(x, "marketingStatus", js.Array(value*))
    
    inline def setMasterFile(value: js.Array[Reference]): Self = StObject.set(x, "masterFile", value.asInstanceOf[js.Any])
    
    inline def setMasterFileUndefined: Self = StObject.set(x, "masterFile", js.undefined)
    
    inline def setMasterFileVarargs(value: Reference*): Self = StObject.set(x, "masterFile", js.Array(value*))
    
    inline def setName(value: js.Array[MedicinalProductDefinitionName]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameVarargs(value: MedicinalProductDefinitionName*): Self = StObject.set(x, "name", js.Array(value*))
    
    inline def setOperation(value: js.Array[MedicinalProductDefinitionOperation]): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    inline def setOperationVarargs(value: MedicinalProductDefinitionOperation*): Self = StObject.set(x, "operation", js.Array(value*))
    
    inline def setPackagedMedicinalProduct(value: js.Array[CodeableConcept]): Self = StObject.set(x, "packagedMedicinalProduct", value.asInstanceOf[js.Any])
    
    inline def setPackagedMedicinalProductUndefined: Self = StObject.set(x, "packagedMedicinalProduct", js.undefined)
    
    inline def setPackagedMedicinalProductVarargs(value: CodeableConcept*): Self = StObject.set(x, "packagedMedicinalProduct", js.Array(value*))
    
    inline def setPediatricUseIndicator(value: CodeableConcept): Self = StObject.set(x, "pediatricUseIndicator", value.asInstanceOf[js.Any])
    
    inline def setPediatricUseIndicatorUndefined: Self = StObject.set(x, "pediatricUseIndicator", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.MedicinalProductDefinition): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setRoute(value: js.Array[CodeableConcept]): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    
    inline def setRouteUndefined: Self = StObject.set(x, "route", js.undefined)
    
    inline def setRouteVarargs(value: CodeableConcept*): Self = StObject.set(x, "route", js.Array(value*))
    
    inline def setSpecialMeasures(value: js.Array[CodeableConcept]): Self = StObject.set(x, "specialMeasures", value.asInstanceOf[js.Any])
    
    inline def setSpecialMeasuresUndefined: Self = StObject.set(x, "specialMeasures", js.undefined)
    
    inline def setSpecialMeasuresVarargs(value: CodeableConcept*): Self = StObject.set(x, "specialMeasures", js.Array(value*))
    
    inline def setStatus(value: CodeableConcept): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusDate(value: String): Self = StObject.set(x, "statusDate", value.asInstanceOf[js.Any])
    
    inline def setStatusDateUndefined: Self = StObject.set(x, "statusDate", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_indication(value: Element): Self = StObject.set(x, "_indication", value.asInstanceOf[js.Any])
    
    inline def set_indicationUndefined: Self = StObject.set(x, "_indication", js.undefined)
    
    inline def set_statusDate(value: Element): Self = StObject.set(x, "_statusDate", value.asInstanceOf[js.Any])
    
    inline def set_statusDateUndefined: Self = StObject.set(x, "_statusDate", js.undefined)
    
    inline def set_version(value: Element): Self = StObject.set(x, "_version", value.asInstanceOf[js.Any])
    
    inline def set_versionUndefined: Self = StObject.set(x, "_version", js.undefined)
  }
}
