package typings.fhir.mod

import typings.fhir.fhirStrings.complete
import typings.fhir.fhirStrings.exploratory
import typings.fhir.fhirStrings.institutional
import typings.fhir.fhirStrings.oral
import typings.fhir.fhirStrings.other
import typings.fhir.fhirStrings.pharmacy
import typings.fhir.fhirStrings.professional
import typings.fhir.fhirStrings.proposed
import typings.fhir.fhirStrings.vision
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Claim
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _accident: js.UndefOr[Element] = js.undefined
  
  var _created: js.UndefOr[Element] = js.undefined
  
  var _school: js.UndefOr[Element] = js.undefined
  
  var _type: js.UndefOr[Element] = js.undefined
  
  var _use: js.UndefOr[Element] = js.undefined
  
  /**
    * Coverage may be dependent on accidents.
    */
  var accident: js.UndefOr[String] = js.undefined
  
  /**
    * Coverage may be dependent on the type of accident.
    */
  var accidentType: js.UndefOr[Coding] = js.undefined
  
  /**
    * Code to indicate that Xrays, images, emails, documents, models or attachments are being sent in support of this submission.
    */
  var additionalMaterials: js.UndefOr[js.Array[Coding]] = js.undefined
  
  /**
    * List of patient conditions for which care is sought.
    */
  var condition: js.UndefOr[js.Array[Coding]] = js.undefined
  
  /**
    * Health care programs and insurers are significant payors of health service costs.
    */
  var coverage: js.UndefOr[js.Array[ClaimCoverage]] = js.undefined
  
  /**
    * The date when the enclosed suite of services were performed or completed.
    */
  var created: js.UndefOr[String] = js.undefined
  
  /**
    * Ordered list of patient diagnosis for which care is sought.
    */
  var diagnosis: js.UndefOr[js.Array[ClaimDiagnosis]] = js.undefined
  
  /**
    * Person who created the invoice/claim/pre-determination or pre-authorization.
    */
  var enterer: js.UndefOr[Reference] = js.undefined
  
  /**
    * To determine extenuating circumstances for coverage.
    */
  var exception: js.UndefOr[js.Array[Coding]] = js.undefined
  
  /**
    * Facility where the services were provided.
    */
  var facility: js.UndefOr[Reference] = js.undefined
  
  /**
    * In the case of a Pre-Determination/Pre-Authorization the provider may request that funds in the amount of the expected Benefit be reserved ('Patient' or 'Provider') to pay for the Benefits determined on the subsequent claim(s). 'None' explicitly indicates no funds reserving is requested.
    */
  var fundsReserve: js.UndefOr[Coding] = js.undefined
  
  /**
    * The business identifier for the instance: invoice number, claim number, pre-determination or pre-authorization number.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Coverage may be modified based on exception information provided.
    */
  var interventionException: js.UndefOr[js.Array[Coding]] = js.undefined
  
  /**
    * First tier of goods and services.
    */
  var item: js.UndefOr[js.Array[ClaimItem]] = js.undefined
  
  /**
    * The list of missing teeth may influence the adjudication of services for example with Bridges.
    */
  var missingTeeth: js.UndefOr[js.Array[ClaimMissingTeeth]] = js.undefined
  
  /**
    * The organization which is responsible for the bill, claim pre-determination, pre-authorization.
    */
  var organization: js.UndefOr[Reference] = js.undefined
  
  /**
    * Original prescription to support the dispensing of pharmacy services, medications or products.
    */
  var originalPrescription: js.UndefOr[Reference] = js.undefined
  
  /**
    * The version of the specification from which the original instance was created.
    */
  var originalRuleset: js.UndefOr[Coding] = js.undefined
  
  /**
    * Patient Resource.
    */
  var patient: Reference
  
  /**
    * The party to be reimbursed for the services.
    */
  var payee: js.UndefOr[ClaimPayee] = js.undefined
  
  /**
    * For type=Pharmacy and Vision only.
    */
  var prescription: js.UndefOr[Reference] = js.undefined
  
  /**
    * Immediate (stat), best effort (normal), deferred (deferred).
    */
  var priority: js.UndefOr[Coding] = js.undefined
  
  /**
    * The provider which is responsible for the bill, claim pre-determination, pre-authorization.
    */
  var provider: js.UndefOr[Reference] = js.undefined
  
  /**
    * The referral resource which lists the date, practitioner, reason and other supporting information.
    */
  var referral: js.UndefOr[Reference] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Claim: typings.fhir.fhirStrings.Claim
  
  /**
    * The version of the specification on which this instance relies.
    */
  var ruleset: js.UndefOr[Coding] = js.undefined
  
  /**
    * Often required for over-age dependents.
    */
  var school: js.UndefOr[String] = js.undefined
  
  /**
    * Insurer Identifier, typical BIN number (6 digit).
    */
  var target: js.UndefOr[Reference] = js.undefined
  
  /**
    * The category of claim this is.
    */
  var `type`: institutional | oral | pharmacy | professional | vision
  
  /**
    * Complete (Bill or Claim), Proposed (Pre-Authorization), Exploratory (Pre-determination).
    */
  var use: js.UndefOr[complete | proposed | exploratory | other] = js.undefined
}
object Claim {
  
  inline def apply(patient: Reference, `type`: institutional | oral | pharmacy | professional | vision): Claim = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], resourceType = "Claim")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Claim]
  }
  
  extension [Self <: Claim](x: Self) {
    
    inline def setAccident(value: String): Self = StObject.set(x, "accident", value.asInstanceOf[js.Any])
    
    inline def setAccidentType(value: Coding): Self = StObject.set(x, "accidentType", value.asInstanceOf[js.Any])
    
    inline def setAccidentTypeUndefined: Self = StObject.set(x, "accidentType", js.undefined)
    
    inline def setAccidentUndefined: Self = StObject.set(x, "accident", js.undefined)
    
    inline def setAdditionalMaterials(value: js.Array[Coding]): Self = StObject.set(x, "additionalMaterials", value.asInstanceOf[js.Any])
    
    inline def setAdditionalMaterialsUndefined: Self = StObject.set(x, "additionalMaterials", js.undefined)
    
    inline def setAdditionalMaterialsVarargs(value: Coding*): Self = StObject.set(x, "additionalMaterials", js.Array(value*))
    
    inline def setCondition(value: js.Array[Coding]): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setConditionVarargs(value: Coding*): Self = StObject.set(x, "condition", js.Array(value*))
    
    inline def setCoverage(value: js.Array[ClaimCoverage]): Self = StObject.set(x, "coverage", value.asInstanceOf[js.Any])
    
    inline def setCoverageUndefined: Self = StObject.set(x, "coverage", js.undefined)
    
    inline def setCoverageVarargs(value: ClaimCoverage*): Self = StObject.set(x, "coverage", js.Array(value*))
    
    inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setDiagnosis(value: js.Array[ClaimDiagnosis]): Self = StObject.set(x, "diagnosis", value.asInstanceOf[js.Any])
    
    inline def setDiagnosisUndefined: Self = StObject.set(x, "diagnosis", js.undefined)
    
    inline def setDiagnosisVarargs(value: ClaimDiagnosis*): Self = StObject.set(x, "diagnosis", js.Array(value*))
    
    inline def setEnterer(value: Reference): Self = StObject.set(x, "enterer", value.asInstanceOf[js.Any])
    
    inline def setEntererUndefined: Self = StObject.set(x, "enterer", js.undefined)
    
    inline def setException(value: js.Array[Coding]): Self = StObject.set(x, "exception", value.asInstanceOf[js.Any])
    
    inline def setExceptionUndefined: Self = StObject.set(x, "exception", js.undefined)
    
    inline def setExceptionVarargs(value: Coding*): Self = StObject.set(x, "exception", js.Array(value*))
    
    inline def setFacility(value: Reference): Self = StObject.set(x, "facility", value.asInstanceOf[js.Any])
    
    inline def setFacilityUndefined: Self = StObject.set(x, "facility", js.undefined)
    
    inline def setFundsReserve(value: Coding): Self = StObject.set(x, "fundsReserve", value.asInstanceOf[js.Any])
    
    inline def setFundsReserveUndefined: Self = StObject.set(x, "fundsReserve", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setInterventionException(value: js.Array[Coding]): Self = StObject.set(x, "interventionException", value.asInstanceOf[js.Any])
    
    inline def setInterventionExceptionUndefined: Self = StObject.set(x, "interventionException", js.undefined)
    
    inline def setInterventionExceptionVarargs(value: Coding*): Self = StObject.set(x, "interventionException", js.Array(value*))
    
    inline def setItem(value: js.Array[ClaimItem]): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setItemVarargs(value: ClaimItem*): Self = StObject.set(x, "item", js.Array(value*))
    
    inline def setMissingTeeth(value: js.Array[ClaimMissingTeeth]): Self = StObject.set(x, "missingTeeth", value.asInstanceOf[js.Any])
    
    inline def setMissingTeethUndefined: Self = StObject.set(x, "missingTeeth", js.undefined)
    
    inline def setMissingTeethVarargs(value: ClaimMissingTeeth*): Self = StObject.set(x, "missingTeeth", js.Array(value*))
    
    inline def setOrganization(value: Reference): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setOriginalPrescription(value: Reference): Self = StObject.set(x, "originalPrescription", value.asInstanceOf[js.Any])
    
    inline def setOriginalPrescriptionUndefined: Self = StObject.set(x, "originalPrescription", js.undefined)
    
    inline def setOriginalRuleset(value: Coding): Self = StObject.set(x, "originalRuleset", value.asInstanceOf[js.Any])
    
    inline def setOriginalRulesetUndefined: Self = StObject.set(x, "originalRuleset", js.undefined)
    
    inline def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    inline def setPayee(value: ClaimPayee): Self = StObject.set(x, "payee", value.asInstanceOf[js.Any])
    
    inline def setPayeeUndefined: Self = StObject.set(x, "payee", js.undefined)
    
    inline def setPrescription(value: Reference): Self = StObject.set(x, "prescription", value.asInstanceOf[js.Any])
    
    inline def setPrescriptionUndefined: Self = StObject.set(x, "prescription", js.undefined)
    
    inline def setPriority(value: Coding): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setProvider(value: Reference): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    
    inline def setReferral(value: Reference): Self = StObject.set(x, "referral", value.asInstanceOf[js.Any])
    
    inline def setReferralUndefined: Self = StObject.set(x, "referral", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Claim): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setRuleset(value: Coding): Self = StObject.set(x, "ruleset", value.asInstanceOf[js.Any])
    
    inline def setRulesetUndefined: Self = StObject.set(x, "ruleset", js.undefined)
    
    inline def setSchool(value: String): Self = StObject.set(x, "school", value.asInstanceOf[js.Any])
    
    inline def setSchoolUndefined: Self = StObject.set(x, "school", js.undefined)
    
    inline def setTarget(value: Reference): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setType(value: institutional | oral | pharmacy | professional | vision): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUse(value: complete | proposed | exploratory | other): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
    
    inline def setUseUndefined: Self = StObject.set(x, "use", js.undefined)
    
    inline def set_accident(value: Element): Self = StObject.set(x, "_accident", value.asInstanceOf[js.Any])
    
    inline def set_accidentUndefined: Self = StObject.set(x, "_accident", js.undefined)
    
    inline def set_created(value: Element): Self = StObject.set(x, "_created", value.asInstanceOf[js.Any])
    
    inline def set_createdUndefined: Self = StObject.set(x, "_created", js.undefined)
    
    inline def set_school(value: Element): Self = StObject.set(x, "_school", value.asInstanceOf[js.Any])
    
    inline def set_schoolUndefined: Self = StObject.set(x, "_school", js.undefined)
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
    
    inline def set_use(value: Element): Self = StObject.set(x, "_use", value.asInstanceOf[js.Any])
    
    inline def set_useUndefined: Self = StObject.set(x, "_use", js.undefined)
  }
}
