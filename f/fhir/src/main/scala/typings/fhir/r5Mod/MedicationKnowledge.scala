package typings.fhir.r5Mod

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
  
  var _name: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _preparationInstruction: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Links to associated medications that could be prescribed, dispensed or administered.
    */
  var associatedMedication: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The creator or owner of the knowledge or information about the medication.
    */
  var author: js.UndefOr[Reference] = js.undefined
  
  /**
    * Potential clinical issue with or between medication(s) (for example, drug-drug interaction, drug-disease contraindication, drug-allergy interaction, etc.).
    */
  var clinicalUseIssue: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Depending on the context of use, the code that was actually selected by the user (prescriber, dispenser, etc.) will have the coding.userSelected set to true.  As described in the coding datatype: "A coding may be marked as a "userSelected" if a user selected the particular coded value in a user interface (e.g. the user selects an item in a pick-list). If a user selected coding exists, it is the preferred choice for performing translations etc. Other codes can only be literal translations to alternative code systems, or codes at a lower level of granularity (e.g. a generic code for a vendor-specific primary one).
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The price of the medication.
    */
  var cost: js.UndefOr[js.Array[MedicationKnowledgeCost]] = js.undefined
  
  /**
    * Along with the link to a Medicinal Product Definition resource, this information provides common definitional elements that are needed to understand the specific medication that is being described.
    */
  var definitional: js.UndefOr[MedicationKnowledgeDefinitional] = js.undefined
  
  /**
    * This is a business identifier, not a resource identifier (see discussion).
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Guidelines or protocols that are applicable for the administration of the medication based on indication.
    */
  var indicationGuideline: js.UndefOr[js.Array[MedicationKnowledgeIndicationGuideline]] = js.undefined
  
  /**
    * The codes could have varying granularity from a country or group of countries down to a specific district.
    */
  var intendedJurisdiction: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
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
    * All of the names for a medication, for example, the name(s) given to a medication in different countries.  For example, acetaminophen and paracetamol or salbutamol and albuterol.
    */
  var name: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Information that only applies to packages (not products).
    */
  var packaging: js.UndefOr[js.Array[MedicationKnowledgePackaging]] = js.undefined
  
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
    * Associated or related medications. For example, if the medication is a branded product (e.g. Crestor), this is the Therapeutic Moeity (e.g. Rosuvastatin) or if this is a generic medication (e.g. Rosuvastatin), this would link to a branded product (e.g. Crestor.
    */
  var relatedMedicationKnowledge: js.UndefOr[js.Array[MedicationKnowledgeRelatedMedicationKnowledge]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_MedicationKnowledge: typings.fhir.fhirStrings.MedicationKnowledge
  
  /**
    * This status is intended to identify if the medication in a local system is in active use within a drug database or inventory.  For example, a pharmacy system may create a new drug file record for a compounded product "ABC Hospital Special Cream" with an active status.  At some point in the future, it may be determined that the drug record was created with an error and the status is changed to "entered in error".   This status is not intended to specify if a medication is part of a particular formulary.  It is possible that the drug record may be referenced by multiple formularies or catalogues and each of those entries would have a separate status.
    */
  var status: js.UndefOr[active | `entered-in-error` | inactive] = js.undefined
}
object MedicationKnowledge {
  
  inline def apply(): MedicationKnowledge = {
    val __obj = js.Dynamic.literal(resourceType = "MedicationKnowledge")
    __obj.asInstanceOf[MedicationKnowledge]
  }
  
  extension [Self <: MedicationKnowledge](x: Self) {
    
    inline def setAssociatedMedication(value: js.Array[Reference]): Self = StObject.set(x, "associatedMedication", value.asInstanceOf[js.Any])
    
    inline def setAssociatedMedicationUndefined: Self = StObject.set(x, "associatedMedication", js.undefined)
    
    inline def setAssociatedMedicationVarargs(value: Reference*): Self = StObject.set(x, "associatedMedication", js.Array(value*))
    
    inline def setAuthor(value: Reference): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setClinicalUseIssue(value: js.Array[Reference]): Self = StObject.set(x, "clinicalUseIssue", value.asInstanceOf[js.Any])
    
    inline def setClinicalUseIssueUndefined: Self = StObject.set(x, "clinicalUseIssue", js.undefined)
    
    inline def setClinicalUseIssueVarargs(value: Reference*): Self = StObject.set(x, "clinicalUseIssue", js.Array(value*))
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setCost(value: js.Array[MedicationKnowledgeCost]): Self = StObject.set(x, "cost", value.asInstanceOf[js.Any])
    
    inline def setCostUndefined: Self = StObject.set(x, "cost", js.undefined)
    
    inline def setCostVarargs(value: MedicationKnowledgeCost*): Self = StObject.set(x, "cost", js.Array(value*))
    
    inline def setDefinitional(value: MedicationKnowledgeDefinitional): Self = StObject.set(x, "definitional", value.asInstanceOf[js.Any])
    
    inline def setDefinitionalUndefined: Self = StObject.set(x, "definitional", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setIndicationGuideline(value: js.Array[MedicationKnowledgeIndicationGuideline]): Self = StObject.set(x, "indicationGuideline", value.asInstanceOf[js.Any])
    
    inline def setIndicationGuidelineUndefined: Self = StObject.set(x, "indicationGuideline", js.undefined)
    
    inline def setIndicationGuidelineVarargs(value: MedicationKnowledgeIndicationGuideline*): Self = StObject.set(x, "indicationGuideline", js.Array(value*))
    
    inline def setIntendedJurisdiction(value: js.Array[CodeableConcept]): Self = StObject.set(x, "intendedJurisdiction", value.asInstanceOf[js.Any])
    
    inline def setIntendedJurisdictionUndefined: Self = StObject.set(x, "intendedJurisdiction", js.undefined)
    
    inline def setIntendedJurisdictionVarargs(value: CodeableConcept*): Self = StObject.set(x, "intendedJurisdiction", js.Array(value*))
    
    inline def setMedicineClassification(value: js.Array[MedicationKnowledgeMedicineClassification]): Self = StObject.set(x, "medicineClassification", value.asInstanceOf[js.Any])
    
    inline def setMedicineClassificationUndefined: Self = StObject.set(x, "medicineClassification", js.undefined)
    
    inline def setMedicineClassificationVarargs(value: MedicationKnowledgeMedicineClassification*): Self = StObject.set(x, "medicineClassification", js.Array(value*))
    
    inline def setMonitoringProgram(value: js.Array[MedicationKnowledgeMonitoringProgram]): Self = StObject.set(x, "monitoringProgram", value.asInstanceOf[js.Any])
    
    inline def setMonitoringProgramUndefined: Self = StObject.set(x, "monitoringProgram", js.undefined)
    
    inline def setMonitoringProgramVarargs(value: MedicationKnowledgeMonitoringProgram*): Self = StObject.set(x, "monitoringProgram", js.Array(value*))
    
    inline def setMonograph(value: js.Array[MedicationKnowledgeMonograph]): Self = StObject.set(x, "monograph", value.asInstanceOf[js.Any])
    
    inline def setMonographUndefined: Self = StObject.set(x, "monograph", js.undefined)
    
    inline def setMonographVarargs(value: MedicationKnowledgeMonograph*): Self = StObject.set(x, "monograph", js.Array(value*))
    
    inline def setName(value: js.Array[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNameVarargs(value: String*): Self = StObject.set(x, "name", js.Array(value*))
    
    inline def setPackaging(value: js.Array[MedicationKnowledgePackaging]): Self = StObject.set(x, "packaging", value.asInstanceOf[js.Any])
    
    inline def setPackagingUndefined: Self = StObject.set(x, "packaging", js.undefined)
    
    inline def setPackagingVarargs(value: MedicationKnowledgePackaging*): Self = StObject.set(x, "packaging", js.Array(value*))
    
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
    
    inline def setStatus(value: active | `entered-in-error` | inactive): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def set_name(value: js.Array[Element]): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_nameVarargs(value: Element*): Self = StObject.set(x, "_name", js.Array(value*))
    
    inline def set_preparationInstruction(value: Element): Self = StObject.set(x, "_preparationInstruction", value.asInstanceOf[js.Any])
    
    inline def set_preparationInstructionUndefined: Self = StObject.set(x, "_preparationInstruction", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
