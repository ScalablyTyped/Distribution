package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicinalProduct
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _specialMeasures: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * Whether the Medicinal Product is subject to additional monitoring for regulatory reasons.
    */
  var additionalMonitoringIndicator: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Supporting documentation, typically for regulatory submission.
    */
  var attachedDocument: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Clinical trials or studies that this product is involved in.
    */
  var clinicalTrial: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The dose form for a single part product, or combined form of a multiple part product.
    */
  var combinedPharmaceuticalDoseForm: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * A product specific contact, person (in a role), or an organization.
    */
  var contact: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Reference to another product, e.g. for linking authorised to investigational product.
    */
  var crossReference: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * If this medicine applies to human or veterinary uses.
    */
  var domain: js.UndefOr[Coding] = js.undefined
  
  /**
    * Business identifier for this product. Could be an MPID.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * The legal status of supply of the medicinal product as classified by the regulator.
    */
  var legalStatusOfSupply: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * An operation applied to the product, for manufacturing or adminsitrative purpose.
    */
  var manufacturingBusinessOperation: js.UndefOr[js.Array[MedicinalProductManufacturingBusinessOperation]] = js.undefined
  
  /**
    * Marketing status of the medicinal product, in contrast to marketing authorizaton.
    */
  var marketingStatus: js.UndefOr[js.Array[MarketingStatus]] = js.undefined
  
  /**
    * A master file for to the medicinal product (e.g. Pharmacovigilance System Master File).
    */
  var masterFile: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The product's name, including full name and possibly coded parts.
    */
  var name: js.Array[MedicinalProductName]
  
  /**
    * Package representation for the product.
    */
  var packagedMedicinalProduct: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * If authorised for use in children.
    */
  var paediatricUseIndicator: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Pharmaceutical aspects of product.
    */
  var pharmaceuticalProduct: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Allows the product to be classified by various systems.
    */
  var productClassification: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_MedicinalProduct: typings.fhir.fhirStrings.MedicinalProduct
  
  /**
    * Indicates if the medicinal product has an orphan designation for the treatment of a rare disease.
    */
  var specialDesignation: js.UndefOr[js.Array[MedicinalProductSpecialDesignation]] = js.undefined
  
  /**
    * Whether the Medicinal Product is subject to special measures for regulatory reasons.
    */
  var specialMeasures: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Regulatory type, e.g. Investigational or Authorized.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object MedicinalProduct {
  
  inline def apply(name: js.Array[MedicinalProductName]): MedicinalProduct = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], resourceType = "MedicinalProduct")
    __obj.asInstanceOf[MedicinalProduct]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MedicinalProduct] (val x: Self) extends AnyVal {
    
    inline def setAdditionalMonitoringIndicator(value: CodeableConcept): Self = StObject.set(x, "additionalMonitoringIndicator", value.asInstanceOf[js.Any])
    
    inline def setAdditionalMonitoringIndicatorUndefined: Self = StObject.set(x, "additionalMonitoringIndicator", js.undefined)
    
    inline def setAttachedDocument(value: js.Array[Reference]): Self = StObject.set(x, "attachedDocument", value.asInstanceOf[js.Any])
    
    inline def setAttachedDocumentUndefined: Self = StObject.set(x, "attachedDocument", js.undefined)
    
    inline def setAttachedDocumentVarargs(value: Reference*): Self = StObject.set(x, "attachedDocument", js.Array(value*))
    
    inline def setClinicalTrial(value: js.Array[Reference]): Self = StObject.set(x, "clinicalTrial", value.asInstanceOf[js.Any])
    
    inline def setClinicalTrialUndefined: Self = StObject.set(x, "clinicalTrial", js.undefined)
    
    inline def setClinicalTrialVarargs(value: Reference*): Self = StObject.set(x, "clinicalTrial", js.Array(value*))
    
    inline def setCombinedPharmaceuticalDoseForm(value: CodeableConcept): Self = StObject.set(x, "combinedPharmaceuticalDoseForm", value.asInstanceOf[js.Any])
    
    inline def setCombinedPharmaceuticalDoseFormUndefined: Self = StObject.set(x, "combinedPharmaceuticalDoseForm", js.undefined)
    
    inline def setContact(value: js.Array[Reference]): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    inline def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    inline def setContactVarargs(value: Reference*): Self = StObject.set(x, "contact", js.Array(value*))
    
    inline def setCrossReference(value: js.Array[Identifier]): Self = StObject.set(x, "crossReference", value.asInstanceOf[js.Any])
    
    inline def setCrossReferenceUndefined: Self = StObject.set(x, "crossReference", js.undefined)
    
    inline def setCrossReferenceVarargs(value: Identifier*): Self = StObject.set(x, "crossReference", js.Array(value*))
    
    inline def setDomain(value: Coding): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setLegalStatusOfSupply(value: CodeableConcept): Self = StObject.set(x, "legalStatusOfSupply", value.asInstanceOf[js.Any])
    
    inline def setLegalStatusOfSupplyUndefined: Self = StObject.set(x, "legalStatusOfSupply", js.undefined)
    
    inline def setManufacturingBusinessOperation(value: js.Array[MedicinalProductManufacturingBusinessOperation]): Self = StObject.set(x, "manufacturingBusinessOperation", value.asInstanceOf[js.Any])
    
    inline def setManufacturingBusinessOperationUndefined: Self = StObject.set(x, "manufacturingBusinessOperation", js.undefined)
    
    inline def setManufacturingBusinessOperationVarargs(value: MedicinalProductManufacturingBusinessOperation*): Self = StObject.set(x, "manufacturingBusinessOperation", js.Array(value*))
    
    inline def setMarketingStatus(value: js.Array[MarketingStatus]): Self = StObject.set(x, "marketingStatus", value.asInstanceOf[js.Any])
    
    inline def setMarketingStatusUndefined: Self = StObject.set(x, "marketingStatus", js.undefined)
    
    inline def setMarketingStatusVarargs(value: MarketingStatus*): Self = StObject.set(x, "marketingStatus", js.Array(value*))
    
    inline def setMasterFile(value: js.Array[Reference]): Self = StObject.set(x, "masterFile", value.asInstanceOf[js.Any])
    
    inline def setMasterFileUndefined: Self = StObject.set(x, "masterFile", js.undefined)
    
    inline def setMasterFileVarargs(value: Reference*): Self = StObject.set(x, "masterFile", js.Array(value*))
    
    inline def setName(value: js.Array[MedicinalProductName]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameVarargs(value: MedicinalProductName*): Self = StObject.set(x, "name", js.Array(value*))
    
    inline def setPackagedMedicinalProduct(value: js.Array[Reference]): Self = StObject.set(x, "packagedMedicinalProduct", value.asInstanceOf[js.Any])
    
    inline def setPackagedMedicinalProductUndefined: Self = StObject.set(x, "packagedMedicinalProduct", js.undefined)
    
    inline def setPackagedMedicinalProductVarargs(value: Reference*): Self = StObject.set(x, "packagedMedicinalProduct", js.Array(value*))
    
    inline def setPaediatricUseIndicator(value: CodeableConcept): Self = StObject.set(x, "paediatricUseIndicator", value.asInstanceOf[js.Any])
    
    inline def setPaediatricUseIndicatorUndefined: Self = StObject.set(x, "paediatricUseIndicator", js.undefined)
    
    inline def setPharmaceuticalProduct(value: js.Array[Reference]): Self = StObject.set(x, "pharmaceuticalProduct", value.asInstanceOf[js.Any])
    
    inline def setPharmaceuticalProductUndefined: Self = StObject.set(x, "pharmaceuticalProduct", js.undefined)
    
    inline def setPharmaceuticalProductVarargs(value: Reference*): Self = StObject.set(x, "pharmaceuticalProduct", js.Array(value*))
    
    inline def setProductClassification(value: js.Array[CodeableConcept]): Self = StObject.set(x, "productClassification", value.asInstanceOf[js.Any])
    
    inline def setProductClassificationUndefined: Self = StObject.set(x, "productClassification", js.undefined)
    
    inline def setProductClassificationVarargs(value: CodeableConcept*): Self = StObject.set(x, "productClassification", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.MedicinalProduct): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSpecialDesignation(value: js.Array[MedicinalProductSpecialDesignation]): Self = StObject.set(x, "specialDesignation", value.asInstanceOf[js.Any])
    
    inline def setSpecialDesignationUndefined: Self = StObject.set(x, "specialDesignation", js.undefined)
    
    inline def setSpecialDesignationVarargs(value: MedicinalProductSpecialDesignation*): Self = StObject.set(x, "specialDesignation", js.Array(value*))
    
    inline def setSpecialMeasures(value: js.Array[String]): Self = StObject.set(x, "specialMeasures", value.asInstanceOf[js.Any])
    
    inline def setSpecialMeasuresUndefined: Self = StObject.set(x, "specialMeasures", js.undefined)
    
    inline def setSpecialMeasuresVarargs(value: String*): Self = StObject.set(x, "specialMeasures", js.Array(value*))
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_specialMeasures(value: js.Array[Element]): Self = StObject.set(x, "_specialMeasures", value.asInstanceOf[js.Any])
    
    inline def set_specialMeasuresUndefined: Self = StObject.set(x, "_specialMeasures", js.undefined)
    
    inline def set_specialMeasuresVarargs(value: Element*): Self = StObject.set(x, "_specialMeasures", js.Array(value*))
  }
}
