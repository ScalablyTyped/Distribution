package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.cancelled
import typings.fhir.fhirStrings.claim_
import typings.fhir.fhirStrings.complete
import typings.fhir.fhirStrings.draft
import typings.fhir.fhirStrings.error
import typings.fhir.fhirStrings.partial
import typings.fhir.fhirStrings.preauthorization
import typings.fhir.fhirStrings.predetermination
import typings.fhir.fhirStrings.queued
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExplanationOfBenefit
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _created: js.UndefOr[Element] = js.undefined
  
  var _disposition: js.UndefOr[Element] = js.undefined
  
  var _outcome: js.UndefOr[Element] = js.undefined
  
  var _preAuthRef: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  var _use: js.UndefOr[Element] = js.undefined
  
  /**
    * Details of a accident which resulted in injuries which required the products and services listed in the claim.
    */
  var accident: js.UndefOr[ExplanationOfBenefitAccident] = js.undefined
  
  /**
    * The first-tier service adjudications for payor added product or service lines.
    */
  var addItem: js.UndefOr[js.Array[ExplanationOfBenefitAddItem]] = js.undefined
  
  /**
    * The adjudication results which are presented at the header level rather than at the line-item or add-item levels.
    */
  var adjudication: js.UndefOr[js.Array[ExplanationOfBenefitItemAdjudication]] = js.undefined
  
  /**
    * Balance by Benefit Category.
    */
  var benefitBalance: js.UndefOr[js.Array[ExplanationOfBenefitBenefitBalance]] = js.undefined
  
  /**
    * Not applicable when use=claim.
    */
  var benefitPeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * Typically this would be today or in the past for a claim, and today or in the future for preauthorizations and prodeterminations. Typically line item dates of service should fall within the billing period if one is specified.
    */
  var billablePeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * The members of the team who provided the products and services.
    */
  var careTeam: js.UndefOr[js.Array[ExplanationOfBenefitCareTeam]] = js.undefined
  
  /**
    * The business identifier for the instance of the adjudication request: claim predetermination or preauthorization.
    */
  var claim: js.UndefOr[Reference] = js.undefined
  
  /**
    * The business identifier for the instance of the adjudication response: claim, predetermination or preauthorization response.
    */
  var claimResponse: js.UndefOr[Reference] = js.undefined
  
  /**
    * The date this resource was created.
    */
  var created: String
  
  /**
    * The element is used to indicate the current state of the adjudication overall for the claim resource, for example: the request has been held (pended) for adjudication processing, for manual review or other reasons; that it has been processed and will be paid, or the outstanding paid, as submitted (approved); that no amount will be paid (denied); or that some amount between zero and the submitted amoutn will be paid (partial).
    */
  var decision: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Information about diagnoses relevant to the claim items.
    */
  var diagnosis: js.UndefOr[js.Array[ExplanationOfBenefitDiagnosis]] = js.undefined
  
  /**
    * For example DRG (Diagnosis Related Group) or a bundled billing code. A patient may have a diagnosis of a Myocardial Infarction and a DRG for HeartAttack would be assigned. The Claim item (and possible subsequent claims) would refer to the DRG for those line items that were for services related to the heart attack event.
    */
  var diagnosisRelatedGroup: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * A human readable description of the status of the adjudication.
    */
  var disposition: js.UndefOr[String] = js.undefined
  
  /**
    * Healthcare encounters related to this claim.
    */
  var encounter: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Individual who created the claim, predetermination or preauthorization.
    */
  var enterer: js.UndefOr[Reference] = js.undefined
  
  /**
    * Information code for an event with a corresponding date or period.
    */
  var event: js.UndefOr[js.Array[ExplanationOfBenefitEvent]] = js.undefined
  
  /**
    * Facility where the services were provided.
    */
  var facility: js.UndefOr[Reference] = js.undefined
  
  /**
    * Needed to permit insurers to include the actual form.
    */
  var form: js.UndefOr[Attachment] = js.undefined
  
  /**
    * May be needed to identify specific jurisdictional forms.
    */
  var formCode: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Fund would be release by a future claim quoting the preAuthRef of this response. Examples of values include: provider, patient, none.
    */
  var fundsReserve: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * This field is only used for preauthorizations.
    */
  var fundsReserveRequested: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * A unique identifier assigned to this explanation of benefit.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * All insurance coverages for the patient which may be applicable for reimbursement, of the products and services listed in the claim, are typically provided in the claim to allow insurers to confirm the ordering of the insurance coverages relative to local 'coordination of benefit' rules. One coverage (and only one) with 'focal=true' is to be used in the adjudication of this claim. Coverages appearing before the focal Coverage in the list, and where 'Coverage.subrogation=false', should provide a reference to the ClaimResponse containing the adjudication results of the prior claim.
    */
  var insurance: js.UndefOr[js.Array[ExplanationOfBenefitInsurance]] = js.undefined
  
  /**
    * The party responsible for authorization, adjudication and reimbursement.
    */
  var insurer: js.UndefOr[Reference] = js.undefined
  
  /**
    * A claim line. Either a simple (a product or service) or a 'group' of details which can also be a simple items or groups of sub-details.
    */
  var item: js.UndefOr[js.Array[ExplanationOfBenefitItem]] = js.undefined
  
  /**
    * For example, a physician may prescribe a medication which the pharmacy determines is contraindicated, or for which the patient has an intolerance, and therefor issues a new prescription for an alternate medication which has the same therapeutic intent. The prescription from the pharmacy becomes the 'prescription' and that from the physician becomes the 'original prescription'.
    */
  var originalPrescription: js.UndefOr[Reference] = js.undefined
  
  /**
    * The resource may be used to indicate that the Claim/Preauthorization/Pre-determination has been received but processing has not begun (queued); that it has been processed and one or more errors have been detected (error); no errors were detected and some of the adjudication processing has been performed (partial); or all of the adjudication processing has completed without errors (complete).
    */
  var outcome: queued | complete | error | partial
  
  /**
    * The party to whom the professional services and/or products have been supplied or are being considered and for whom actual for forecast reimbursement is sought.
    */
  var patient: Reference
  
  /**
    * The amount paid by the patient, in total at the claim claim level or specifically for the item and detail level, to the provider for goods and services.
    */
  var patientPaid: js.UndefOr[Money] = js.undefined
  
  /**
    * Often providers agree to receive the benefits payable to reduce the near-term costs to the patient. The insurer may decline to pay the provider and may choose to pay the subscriber instead.
    */
  var payee: js.UndefOr[ExplanationOfBenefitPayee] = js.undefined
  
  /**
    * Payment details for the adjudication of the claim.
    */
  var payment: js.UndefOr[ExplanationOfBenefitPayment] = js.undefined
  
  /**
    * This value is only present on preauthorization adjudications.
    */
  var preAuthRef: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * This value is only present on preauthorization adjudications.
    */
  var preAuthRefPeriod: js.UndefOr[js.Array[Period]] = js.undefined
  
  /**
    * This indicates the relative order of a series of EOBs related to different coverages for the same suite of services.
    */
  var precedence: js.UndefOr[Double] = js.undefined
  
  /**
    * Prescription is the document/authorization given to the claim author for them to provide products and services for which consideration (reimbursement) is sought. Could be a RX for medications, an 'order' for oxygen or wheelchair or physiotherapy treatments.
    */
  var prescription: js.UndefOr[Reference] = js.undefined
  
  /**
    * If a claim processor is unable to complete the processing as per the priority then they should generate an error and not process the request.
    */
  var priority: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Procedures performed on the patient relevant to the billing items with the claim.
    */
  var procedure: js.UndefOr[js.Array[ExplanationOfBenefitProcedure]] = js.undefined
  
  /**
    * A note that describes or explains adjudication results in a human readable form.
    */
  var processNote: js.UndefOr[js.Array[ExplanationOfBenefitProcessNote]] = js.undefined
  
  /**
    * Typically this field would be 1..1 where this party is accountable for the data content within the claim but is not necessarily the facility, provider group or practitioner who provided the products and services listed within this claim resource. This field is the Billing Provider, for example, a facility, provider group, lab or practitioner.
    */
  var provider: js.UndefOr[Reference] = js.undefined
  
  /**
    * The referral resource which lists the date, practitioner, reason and other supporting information.
    */
  var referral: js.UndefOr[Reference] = js.undefined
  
  /**
    * For example,  for the original treatment and follow-up exams.
    */
  var related: js.UndefOr[js.Array[ExplanationOfBenefitRelated]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_ExplanationOfBenefit: typings.fhir.fhirStrings.ExplanationOfBenefit
  
  /**
    * This element is labeled as a modifier because the status contains codes that mark the resource as not currently valid.
    */
  var status: active | cancelled | draft | `entered-in-error`
  
  /**
    * This may contain the local bill type codes such as the US UB-04 bill type code.
    */
  var subType: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Often there are multiple jurisdiction specific valuesets which are required.
    */
  var supportingInfo: js.UndefOr[js.Array[ExplanationOfBenefitSupportingInfo]] = js.undefined
  
  /**
    * Totals for amounts submitted, co-pays, benefits payable etc.
    */
  var total: js.UndefOr[js.Array[ExplanationOfBenefitTotal]] = js.undefined
  
  /**
    * Trace number for tracking purposes. May be defined at the jurisdiction level or between trading partners.
    */
  var traceNumber: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * The majority of jurisdictions use: oral, pharmacy, vision, professional and institutional, or variants on those terms, as the general styles of claims. The valueset is extensible to accommodate other jurisdictional requirements.
    */
  var `type`: CodeableConcept
  
  /**
    * A code to indicate whether the nature of the request is: Claim - A request to an Insurer to adjudicate the supplied charges for health care goods and services under the identified policy and to pay the determined Benefit amount, if any; Preauthorization - A request to an Insurer to adjudicate the supplied proposed future charges for health care goods and services under the identified policy and to approve the services and provide the expected benefit amounts and potentially to reserve funds to pay the benefits when Claims for the indicated services are later submitted; or, Pre-determination - A request to an Insurer to adjudicate the supplied 'what if' charges for health care goods and services under the identified policy and report back what the Benefit payable would be had the services actually been provided.
    */
  var use: claim_ | preauthorization | predetermination
}
object ExplanationOfBenefit {
  
  inline def apply(
    created: String,
    outcome: queued | complete | error | partial,
    patient: Reference,
    status: active | cancelled | draft | `entered-in-error`,
    `type`: CodeableConcept,
    use: claim_ | preauthorization | predetermination
  ): ExplanationOfBenefit = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], outcome = outcome.asInstanceOf[js.Any], patient = patient.asInstanceOf[js.Any], resourceType = "ExplanationOfBenefit", status = status.asInstanceOf[js.Any], use = use.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExplanationOfBenefit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExplanationOfBenefit] (val x: Self) extends AnyVal {
    
    inline def setAccident(value: ExplanationOfBenefitAccident): Self = StObject.set(x, "accident", value.asInstanceOf[js.Any])
    
    inline def setAccidentUndefined: Self = StObject.set(x, "accident", js.undefined)
    
    inline def setAddItem(value: js.Array[ExplanationOfBenefitAddItem]): Self = StObject.set(x, "addItem", value.asInstanceOf[js.Any])
    
    inline def setAddItemUndefined: Self = StObject.set(x, "addItem", js.undefined)
    
    inline def setAddItemVarargs(value: ExplanationOfBenefitAddItem*): Self = StObject.set(x, "addItem", js.Array(value*))
    
    inline def setAdjudication(value: js.Array[ExplanationOfBenefitItemAdjudication]): Self = StObject.set(x, "adjudication", value.asInstanceOf[js.Any])
    
    inline def setAdjudicationUndefined: Self = StObject.set(x, "adjudication", js.undefined)
    
    inline def setAdjudicationVarargs(value: ExplanationOfBenefitItemAdjudication*): Self = StObject.set(x, "adjudication", js.Array(value*))
    
    inline def setBenefitBalance(value: js.Array[ExplanationOfBenefitBenefitBalance]): Self = StObject.set(x, "benefitBalance", value.asInstanceOf[js.Any])
    
    inline def setBenefitBalanceUndefined: Self = StObject.set(x, "benefitBalance", js.undefined)
    
    inline def setBenefitBalanceVarargs(value: ExplanationOfBenefitBenefitBalance*): Self = StObject.set(x, "benefitBalance", js.Array(value*))
    
    inline def setBenefitPeriod(value: Period): Self = StObject.set(x, "benefitPeriod", value.asInstanceOf[js.Any])
    
    inline def setBenefitPeriodUndefined: Self = StObject.set(x, "benefitPeriod", js.undefined)
    
    inline def setBillablePeriod(value: Period): Self = StObject.set(x, "billablePeriod", value.asInstanceOf[js.Any])
    
    inline def setBillablePeriodUndefined: Self = StObject.set(x, "billablePeriod", js.undefined)
    
    inline def setCareTeam(value: js.Array[ExplanationOfBenefitCareTeam]): Self = StObject.set(x, "careTeam", value.asInstanceOf[js.Any])
    
    inline def setCareTeamUndefined: Self = StObject.set(x, "careTeam", js.undefined)
    
    inline def setCareTeamVarargs(value: ExplanationOfBenefitCareTeam*): Self = StObject.set(x, "careTeam", js.Array(value*))
    
    inline def setClaim(value: Reference): Self = StObject.set(x, "claim", value.asInstanceOf[js.Any])
    
    inline def setClaimResponse(value: Reference): Self = StObject.set(x, "claimResponse", value.asInstanceOf[js.Any])
    
    inline def setClaimResponseUndefined: Self = StObject.set(x, "claimResponse", js.undefined)
    
    inline def setClaimUndefined: Self = StObject.set(x, "claim", js.undefined)
    
    inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setDecision(value: CodeableConcept): Self = StObject.set(x, "decision", value.asInstanceOf[js.Any])
    
    inline def setDecisionUndefined: Self = StObject.set(x, "decision", js.undefined)
    
    inline def setDiagnosis(value: js.Array[ExplanationOfBenefitDiagnosis]): Self = StObject.set(x, "diagnosis", value.asInstanceOf[js.Any])
    
    inline def setDiagnosisRelatedGroup(value: CodeableConcept): Self = StObject.set(x, "diagnosisRelatedGroup", value.asInstanceOf[js.Any])
    
    inline def setDiagnosisRelatedGroupUndefined: Self = StObject.set(x, "diagnosisRelatedGroup", js.undefined)
    
    inline def setDiagnosisUndefined: Self = StObject.set(x, "diagnosis", js.undefined)
    
    inline def setDiagnosisVarargs(value: ExplanationOfBenefitDiagnosis*): Self = StObject.set(x, "diagnosis", js.Array(value*))
    
    inline def setDisposition(value: String): Self = StObject.set(x, "disposition", value.asInstanceOf[js.Any])
    
    inline def setDispositionUndefined: Self = StObject.set(x, "disposition", js.undefined)
    
    inline def setEncounter(value: js.Array[Reference]): Self = StObject.set(x, "encounter", value.asInstanceOf[js.Any])
    
    inline def setEncounterUndefined: Self = StObject.set(x, "encounter", js.undefined)
    
    inline def setEncounterVarargs(value: Reference*): Self = StObject.set(x, "encounter", js.Array(value*))
    
    inline def setEnterer(value: Reference): Self = StObject.set(x, "enterer", value.asInstanceOf[js.Any])
    
    inline def setEntererUndefined: Self = StObject.set(x, "enterer", js.undefined)
    
    inline def setEvent(value: js.Array[ExplanationOfBenefitEvent]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setEventVarargs(value: ExplanationOfBenefitEvent*): Self = StObject.set(x, "event", js.Array(value*))
    
    inline def setFacility(value: Reference): Self = StObject.set(x, "facility", value.asInstanceOf[js.Any])
    
    inline def setFacilityUndefined: Self = StObject.set(x, "facility", js.undefined)
    
    inline def setForm(value: Attachment): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormCode(value: CodeableConcept): Self = StObject.set(x, "formCode", value.asInstanceOf[js.Any])
    
    inline def setFormCodeUndefined: Self = StObject.set(x, "formCode", js.undefined)
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    inline def setFundsReserve(value: CodeableConcept): Self = StObject.set(x, "fundsReserve", value.asInstanceOf[js.Any])
    
    inline def setFundsReserveRequested(value: CodeableConcept): Self = StObject.set(x, "fundsReserveRequested", value.asInstanceOf[js.Any])
    
    inline def setFundsReserveRequestedUndefined: Self = StObject.set(x, "fundsReserveRequested", js.undefined)
    
    inline def setFundsReserveUndefined: Self = StObject.set(x, "fundsReserve", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setInsurance(value: js.Array[ExplanationOfBenefitInsurance]): Self = StObject.set(x, "insurance", value.asInstanceOf[js.Any])
    
    inline def setInsuranceUndefined: Self = StObject.set(x, "insurance", js.undefined)
    
    inline def setInsuranceVarargs(value: ExplanationOfBenefitInsurance*): Self = StObject.set(x, "insurance", js.Array(value*))
    
    inline def setInsurer(value: Reference): Self = StObject.set(x, "insurer", value.asInstanceOf[js.Any])
    
    inline def setInsurerUndefined: Self = StObject.set(x, "insurer", js.undefined)
    
    inline def setItem(value: js.Array[ExplanationOfBenefitItem]): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setItemVarargs(value: ExplanationOfBenefitItem*): Self = StObject.set(x, "item", js.Array(value*))
    
    inline def setOriginalPrescription(value: Reference): Self = StObject.set(x, "originalPrescription", value.asInstanceOf[js.Any])
    
    inline def setOriginalPrescriptionUndefined: Self = StObject.set(x, "originalPrescription", js.undefined)
    
    inline def setOutcome(value: queued | complete | error | partial): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
    
    inline def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    inline def setPatientPaid(value: Money): Self = StObject.set(x, "patientPaid", value.asInstanceOf[js.Any])
    
    inline def setPatientPaidUndefined: Self = StObject.set(x, "patientPaid", js.undefined)
    
    inline def setPayee(value: ExplanationOfBenefitPayee): Self = StObject.set(x, "payee", value.asInstanceOf[js.Any])
    
    inline def setPayeeUndefined: Self = StObject.set(x, "payee", js.undefined)
    
    inline def setPayment(value: ExplanationOfBenefitPayment): Self = StObject.set(x, "payment", value.asInstanceOf[js.Any])
    
    inline def setPaymentUndefined: Self = StObject.set(x, "payment", js.undefined)
    
    inline def setPreAuthRef(value: js.Array[String]): Self = StObject.set(x, "preAuthRef", value.asInstanceOf[js.Any])
    
    inline def setPreAuthRefPeriod(value: js.Array[Period]): Self = StObject.set(x, "preAuthRefPeriod", value.asInstanceOf[js.Any])
    
    inline def setPreAuthRefPeriodUndefined: Self = StObject.set(x, "preAuthRefPeriod", js.undefined)
    
    inline def setPreAuthRefPeriodVarargs(value: Period*): Self = StObject.set(x, "preAuthRefPeriod", js.Array(value*))
    
    inline def setPreAuthRefUndefined: Self = StObject.set(x, "preAuthRef", js.undefined)
    
    inline def setPreAuthRefVarargs(value: String*): Self = StObject.set(x, "preAuthRef", js.Array(value*))
    
    inline def setPrecedence(value: Double): Self = StObject.set(x, "precedence", value.asInstanceOf[js.Any])
    
    inline def setPrecedenceUndefined: Self = StObject.set(x, "precedence", js.undefined)
    
    inline def setPrescription(value: Reference): Self = StObject.set(x, "prescription", value.asInstanceOf[js.Any])
    
    inline def setPrescriptionUndefined: Self = StObject.set(x, "prescription", js.undefined)
    
    inline def setPriority(value: CodeableConcept): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setProcedure(value: js.Array[ExplanationOfBenefitProcedure]): Self = StObject.set(x, "procedure", value.asInstanceOf[js.Any])
    
    inline def setProcedureUndefined: Self = StObject.set(x, "procedure", js.undefined)
    
    inline def setProcedureVarargs(value: ExplanationOfBenefitProcedure*): Self = StObject.set(x, "procedure", js.Array(value*))
    
    inline def setProcessNote(value: js.Array[ExplanationOfBenefitProcessNote]): Self = StObject.set(x, "processNote", value.asInstanceOf[js.Any])
    
    inline def setProcessNoteUndefined: Self = StObject.set(x, "processNote", js.undefined)
    
    inline def setProcessNoteVarargs(value: ExplanationOfBenefitProcessNote*): Self = StObject.set(x, "processNote", js.Array(value*))
    
    inline def setProvider(value: Reference): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    
    inline def setReferral(value: Reference): Self = StObject.set(x, "referral", value.asInstanceOf[js.Any])
    
    inline def setReferralUndefined: Self = StObject.set(x, "referral", js.undefined)
    
    inline def setRelated(value: js.Array[ExplanationOfBenefitRelated]): Self = StObject.set(x, "related", value.asInstanceOf[js.Any])
    
    inline def setRelatedUndefined: Self = StObject.set(x, "related", js.undefined)
    
    inline def setRelatedVarargs(value: ExplanationOfBenefitRelated*): Self = StObject.set(x, "related", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.ExplanationOfBenefit): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: active | cancelled | draft | `entered-in-error`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSubType(value: CodeableConcept): Self = StObject.set(x, "subType", value.asInstanceOf[js.Any])
    
    inline def setSubTypeUndefined: Self = StObject.set(x, "subType", js.undefined)
    
    inline def setSupportingInfo(value: js.Array[ExplanationOfBenefitSupportingInfo]): Self = StObject.set(x, "supportingInfo", value.asInstanceOf[js.Any])
    
    inline def setSupportingInfoUndefined: Self = StObject.set(x, "supportingInfo", js.undefined)
    
    inline def setSupportingInfoVarargs(value: ExplanationOfBenefitSupportingInfo*): Self = StObject.set(x, "supportingInfo", js.Array(value*))
    
    inline def setTotal(value: js.Array[ExplanationOfBenefitTotal]): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    
    inline def setTotalVarargs(value: ExplanationOfBenefitTotal*): Self = StObject.set(x, "total", js.Array(value*))
    
    inline def setTraceNumber(value: js.Array[Identifier]): Self = StObject.set(x, "traceNumber", value.asInstanceOf[js.Any])
    
    inline def setTraceNumberUndefined: Self = StObject.set(x, "traceNumber", js.undefined)
    
    inline def setTraceNumberVarargs(value: Identifier*): Self = StObject.set(x, "traceNumber", js.Array(value*))
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUse(value: claim_ | preauthorization | predetermination): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
    
    inline def set_created(value: Element): Self = StObject.set(x, "_created", value.asInstanceOf[js.Any])
    
    inline def set_createdUndefined: Self = StObject.set(x, "_created", js.undefined)
    
    inline def set_disposition(value: Element): Self = StObject.set(x, "_disposition", value.asInstanceOf[js.Any])
    
    inline def set_dispositionUndefined: Self = StObject.set(x, "_disposition", js.undefined)
    
    inline def set_outcome(value: Element): Self = StObject.set(x, "_outcome", value.asInstanceOf[js.Any])
    
    inline def set_outcomeUndefined: Self = StObject.set(x, "_outcome", js.undefined)
    
    inline def set_preAuthRef(value: js.Array[Element]): Self = StObject.set(x, "_preAuthRef", value.asInstanceOf[js.Any])
    
    inline def set_preAuthRefUndefined: Self = StObject.set(x, "_preAuthRef", js.undefined)
    
    inline def set_preAuthRefVarargs(value: Element*): Self = StObject.set(x, "_preAuthRef", js.Array(value*))
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    inline def set_use(value: Element): Self = StObject.set(x, "_use", value.asInstanceOf[js.Any])
    
    inline def set_useUndefined: Self = StObject.set(x, "_use", js.undefined)
  }
}
