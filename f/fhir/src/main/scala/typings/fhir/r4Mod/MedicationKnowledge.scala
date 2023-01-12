package typings.fhir.r4Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.inactive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicationKnowledge
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _preparationInstruction: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  var _synonym: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * Guidelines for the administration of the medication.
    */
  var administrationGuidelines: js.UndefOr[js.Array[MedicationKnowledgeAdministrationGuidelines]] = js.undefined
  
  /**
    * This is the quantity of medication in a package.  To specify the strength of the medication, the Ingredient.strength attribute is used.
    */
  var amount: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Associated or related medications.  For example, if the medication is a branded product (e.g. Crestor), this is the Therapeutic Moeity (e.g. Rosuvastatin) or if this is a generic medication (e.g. Rosuvastatin), this would link to a branded product (e.g. Crestor).
    */
  var associatedMedication: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Depending on the context of use, the code that was actually selected by the user (prescriber, dispenser, etc.) will have the coding.userSelected set to true.  As described in the coding datatype: "A coding may be marked as a "userSelected" if a user selected the particular coded value in a user interface (e.g. the user selects an item in a pick-list). If a user selected coding exists, it is the preferred choice for performing translations etc. Other codes can only be literal translations to alternative code systems, or codes at a lower level of granularity (e.g. a generic code for a vendor-specific primary one).
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Potential clinical issue with or between medication(s) (for example, drug-drug interaction, drug-disease contraindication, drug-allergy interaction, etc.).
    */
  var contraindication: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The price of the medication.
    */
  var cost: js.UndefOr[js.Array[MedicationKnowledgeCost]] = js.undefined
  
  /**
    * When Medication is referenced from MedicationRequest, this is the ordered form.  When Medication is referenced within MedicationDispense, this is the dispensed form.  When Medication is referenced within MedicationAdministration, this is administered form.
    */
  var doseForm: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Specifies descriptive properties of the medicine, such as color, shape, imprints, etc.
    */
  var drugCharacteristic: js.UndefOr[js.Array[MedicationKnowledgeDrugCharacteristic]] = js.undefined
  
  /**
    * Identifies a particular constituent of interest in the product.
    */
  var ingredient: js.UndefOr[js.Array[MedicationKnowledgeIngredient]] = js.undefined
  
  /**
    * The intended or approved route of administration.
    */
  var intendedRoute: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The time course of drug absorption, distribution, metabolism and excretion of a medication from the body.
    */
  var kinetics: js.UndefOr[js.Array[MedicationKnowledgeKinetics]] = js.undefined
  
  /**
    * Describes the details of the manufacturer of the medication product.  This is not intended to represent the distributor of a medication product.
    */
  var manufacturer: js.UndefOr[Reference] = js.undefined
  
  /**
    * Categorization of the medication within a formulary or classification system.
    */
  var medicineClassification: js.UndefOr[js.Array[MedicationKnowledgeMedicineClassification]] = js.undefined
  
  /**
    * The program under which the medication is reviewed.
    */
  var monitoringProgram: js.UndefOr[js.Array[MedicationKnowledgeMonitoringProgram]] = js.undefined
  
  /**
    * Associated documentation about the medication.
    */
  var monograph: js.UndefOr[js.Array[MedicationKnowledgeMonograph]] = js.undefined
  
  /**
    * Information that only applies to packages (not products).
    */
  var packaging: js.UndefOr[MedicationKnowledgePackaging] = js.undefined
  
  /**
    * The instructions for preparing the medication.
    */
  var preparationInstruction: js.UndefOr[String] = js.undefined
  
  /**
    * Category of the medication or product (e.g. branded product, therapeutic moeity, generic product, innovator product, etc.).
    */
  var productType: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Regulatory information about a medication.
    */
  var regulatory: js.UndefOr[js.Array[MedicationKnowledgeRegulatory]] = js.undefined
  
  /**
    * Associated or related knowledge about a medication.
    */
  var relatedMedicationKnowledge: js.UndefOr[js.Array[MedicationKnowledgeRelatedMedicationKnowledge]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_MedicationKnowledge: typings.fhir.fhirStrings.MedicationKnowledge
  
  /**
    * This status is intended to identify if the medication in a local system is in active use within a drug database or inventory.  For example, a pharmacy system may create a new drug file record for a compounded product "ABC Hospital Special Cream" with an active status.  At some point in the future, it may be determined that the drug record was created with an error and the status is changed to "entered in error".   This status is not intended to specify if a medication is part of a particular formulary.  It is possible that the drug record may be referenced by multiple formularies or catalogues and each of those entries would have a separate status.
    */
  var status: js.UndefOr[active | inactive | `entered-in-error`] = js.undefined
  
  /**
    * Additional names for a medication, for example, the name(s) given to a medication in different countries.  For example, acetaminophen and paracetamol or salbutamol and albuterol.
    */
  var synonym: js.UndefOr[js.Array[String]] = js.undefined
}
object MedicationKnowledge {
  
  inline def apply(): MedicationKnowledge = {
    val __obj = js.Dynamic.literal(resourceType = "MedicationKnowledge")
    __obj.asInstanceOf[MedicationKnowledge]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MedicationKnowledge] (val x: Self) extends AnyVal {
    
    inline def setAdministrationGuidelines(value: js.Array[MedicationKnowledgeAdministrationGuidelines]): Self = StObject.set(x, "administrationGuidelines", value.asInstanceOf[js.Any])
    
    inline def setAdministrationGuidelinesUndefined: Self = StObject.set(x, "administrationGuidelines", js.undefined)
    
    inline def setAdministrationGuidelinesVarargs(value: MedicationKnowledgeAdministrationGuidelines*): Self = StObject.set(x, "administrationGuidelines", js.Array(value*))
    
    inline def setAmount(value: Quantity): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setAssociatedMedication(value: js.Array[Reference]): Self = StObject.set(x, "associatedMedication", value.asInstanceOf[js.Any])
    
    inline def setAssociatedMedicationUndefined: Self = StObject.set(x, "associatedMedication", js.undefined)
    
    inline def setAssociatedMedicationVarargs(value: Reference*): Self = StObject.set(x, "associatedMedication", js.Array(value*))
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setContraindication(value: js.Array[Reference]): Self = StObject.set(x, "contraindication", value.asInstanceOf[js.Any])
    
    inline def setContraindicationUndefined: Self = StObject.set(x, "contraindication", js.undefined)
    
    inline def setContraindicationVarargs(value: Reference*): Self = StObject.set(x, "contraindication", js.Array(value*))
    
    inline def setCost(value: js.Array[MedicationKnowledgeCost]): Self = StObject.set(x, "cost", value.asInstanceOf[js.Any])
    
    inline def setCostUndefined: Self = StObject.set(x, "cost", js.undefined)
    
    inline def setCostVarargs(value: MedicationKnowledgeCost*): Self = StObject.set(x, "cost", js.Array(value*))
    
    inline def setDoseForm(value: CodeableConcept): Self = StObject.set(x, "doseForm", value.asInstanceOf[js.Any])
    
    inline def setDoseFormUndefined: Self = StObject.set(x, "doseForm", js.undefined)
    
    inline def setDrugCharacteristic(value: js.Array[MedicationKnowledgeDrugCharacteristic]): Self = StObject.set(x, "drugCharacteristic", value.asInstanceOf[js.Any])
    
    inline def setDrugCharacteristicUndefined: Self = StObject.set(x, "drugCharacteristic", js.undefined)
    
    inline def setDrugCharacteristicVarargs(value: MedicationKnowledgeDrugCharacteristic*): Self = StObject.set(x, "drugCharacteristic", js.Array(value*))
    
    inline def setIngredient(value: js.Array[MedicationKnowledgeIngredient]): Self = StObject.set(x, "ingredient", value.asInstanceOf[js.Any])
    
    inline def setIngredientUndefined: Self = StObject.set(x, "ingredient", js.undefined)
    
    inline def setIngredientVarargs(value: MedicationKnowledgeIngredient*): Self = StObject.set(x, "ingredient", js.Array(value*))
    
    inline def setIntendedRoute(value: js.Array[CodeableConcept]): Self = StObject.set(x, "intendedRoute", value.asInstanceOf[js.Any])
    
    inline def setIntendedRouteUndefined: Self = StObject.set(x, "intendedRoute", js.undefined)
    
    inline def setIntendedRouteVarargs(value: CodeableConcept*): Self = StObject.set(x, "intendedRoute", js.Array(value*))
    
    inline def setKinetics(value: js.Array[MedicationKnowledgeKinetics]): Self = StObject.set(x, "kinetics", value.asInstanceOf[js.Any])
    
    inline def setKineticsUndefined: Self = StObject.set(x, "kinetics", js.undefined)
    
    inline def setKineticsVarargs(value: MedicationKnowledgeKinetics*): Self = StObject.set(x, "kinetics", js.Array(value*))
    
    inline def setManufacturer(value: Reference): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    inline def setManufacturerUndefined: Self = StObject.set(x, "manufacturer", js.undefined)
    
    inline def setMedicineClassification(value: js.Array[MedicationKnowledgeMedicineClassification]): Self = StObject.set(x, "medicineClassification", value.asInstanceOf[js.Any])
    
    inline def setMedicineClassificationUndefined: Self = StObject.set(x, "medicineClassification", js.undefined)
    
    inline def setMedicineClassificationVarargs(value: MedicationKnowledgeMedicineClassification*): Self = StObject.set(x, "medicineClassification", js.Array(value*))
    
    inline def setMonitoringProgram(value: js.Array[MedicationKnowledgeMonitoringProgram]): Self = StObject.set(x, "monitoringProgram", value.asInstanceOf[js.Any])
    
    inline def setMonitoringProgramUndefined: Self = StObject.set(x, "monitoringProgram", js.undefined)
    
    inline def setMonitoringProgramVarargs(value: MedicationKnowledgeMonitoringProgram*): Self = StObject.set(x, "monitoringProgram", js.Array(value*))
    
    inline def setMonograph(value: js.Array[MedicationKnowledgeMonograph]): Self = StObject.set(x, "monograph", value.asInstanceOf[js.Any])
    
    inline def setMonographUndefined: Self = StObject.set(x, "monograph", js.undefined)
    
    inline def setMonographVarargs(value: MedicationKnowledgeMonograph*): Self = StObject.set(x, "monograph", js.Array(value*))
    
    inline def setPackaging(value: MedicationKnowledgePackaging): Self = StObject.set(x, "packaging", value.asInstanceOf[js.Any])
    
    inline def setPackagingUndefined: Self = StObject.set(x, "packaging", js.undefined)
    
    inline def setPreparationInstruction(value: String): Self = StObject.set(x, "preparationInstruction", value.asInstanceOf[js.Any])
    
    inline def setPreparationInstructionUndefined: Self = StObject.set(x, "preparationInstruction", js.undefined)
    
    inline def setProductType(value: js.Array[CodeableConcept]): Self = StObject.set(x, "productType", value.asInstanceOf[js.Any])
    
    inline def setProductTypeUndefined: Self = StObject.set(x, "productType", js.undefined)
    
    inline def setProductTypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "productType", js.Array(value*))
    
    inline def setRegulatory(value: js.Array[MedicationKnowledgeRegulatory]): Self = StObject.set(x, "regulatory", value.asInstanceOf[js.Any])
    
    inline def setRegulatoryUndefined: Self = StObject.set(x, "regulatory", js.undefined)
    
    inline def setRegulatoryVarargs(value: MedicationKnowledgeRegulatory*): Self = StObject.set(x, "regulatory", js.Array(value*))
    
    inline def setRelatedMedicationKnowledge(value: js.Array[MedicationKnowledgeRelatedMedicationKnowledge]): Self = StObject.set(x, "relatedMedicationKnowledge", value.asInstanceOf[js.Any])
    
    inline def setRelatedMedicationKnowledgeUndefined: Self = StObject.set(x, "relatedMedicationKnowledge", js.undefined)
    
    inline def setRelatedMedicationKnowledgeVarargs(value: MedicationKnowledgeRelatedMedicationKnowledge*): Self = StObject.set(x, "relatedMedicationKnowledge", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.MedicationKnowledge): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: active | inactive | `entered-in-error`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSynonym(value: js.Array[String]): Self = StObject.set(x, "synonym", value.asInstanceOf[js.Any])
    
    inline def setSynonymUndefined: Self = StObject.set(x, "synonym", js.undefined)
    
    inline def setSynonymVarargs(value: String*): Self = StObject.set(x, "synonym", js.Array(value*))
    
    inline def set_preparationInstruction(value: Element): Self = StObject.set(x, "_preparationInstruction", value.asInstanceOf[js.Any])
    
    inline def set_preparationInstructionUndefined: Self = StObject.set(x, "_preparationInstruction", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    inline def set_synonym(value: js.Array[Element]): Self = StObject.set(x, "_synonym", value.asInstanceOf[js.Any])
    
    inline def set_synonymUndefined: Self = StObject.set(x, "_synonym", js.undefined)
    
    inline def set_synonymVarargs(value: Element*): Self = StObject.set(x, "_synonym", js.Array(value*))
  }
}
