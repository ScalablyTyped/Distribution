package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.`self-pay`
import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.cancelled
import typings.fhir.fhirStrings.draft
import typings.fhir.fhirStrings.insurance
import typings.fhir.fhirStrings.other
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Coverage
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _dependent: js.UndefOr[Element] = js.undefined
  
  var _kind: js.UndefOr[Element] = js.undefined
  
  var _network: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  var _subrogation: js.UndefOr[Element] = js.undefined
  
  /**
    * The party who benefits from the insurance coverage; the patient when products and/or services are provided.
    */
  var beneficiary: Reference
  
  /**
    * For example, class may be used to identify a class of coverage or employer group, policy, or plan.
    */
  var `class`: js.UndefOr[js.Array[CoverageClass]] = js.undefined
  
  /**
    * The policy(s) which constitute this insurance coverage.
    */
  var contract: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * For example by knowing the patient visit co-pay, the provider can collect the amount prior to undertaking treatment.
    */
  var costToBeneficiary: js.UndefOr[js.Array[CoverageCostToBeneficiary]] = js.undefined
  
  /**
    * Sometimes the member number is constructed from the subscriberId and the dependant number.
    */
  var dependent: js.UndefOr[String] = js.undefined
  
  /**
    * The main (and possibly only) identifier for the coverage - often referred to as a Member Id, Certificate number, Personal Health Number or Case ID. May be constructed as the concatenation of the Coverage.SubscriberID and the Coverage.dependant. Note that not all insurers issue unique member IDs therefore searches may result in multiple responses.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * The insurance plan details, benefits and costs, which constitute this insurance coverage.
    */
  var insurancePlan: js.UndefOr[Reference] = js.undefined
  
  /**
    * May provide multiple identifiers such as insurance company identifier or business identifier (BIN number).
    */
  var insurer: js.UndefOr[Reference] = js.undefined
  
  /**
    * The nature of the coverage be it insurance, or cash payment such as self-pay.
    */
  var kind: insurance | `self-pay` | other
  
  /**
    * The insurer-specific identifier for the insurer-defined network of providers to which the beneficiary may seek treatment which will be covered at the 'in-network' rate, otherwise 'out of network' terms and conditions apply.
    */
  var network: js.UndefOr[String] = js.undefined
  
  /**
    * The order of applicability of this coverage relative to other coverages which are currently in force. Note, there may be gaps in the numbering and this does not imply primary, secondary etc. as the specific positioning of coverages depends upon the episode of care. For example; a patient might have (0) auto insurance (1) their own health insurance and (2) spouse's health insurance. When claiming for treatments which were not the result of an auto accident then only coverages (1) and (2) above would be applicatble and would apply in the order specified in parenthesis.
    */
  var order: js.UndefOr[Double] = js.undefined
  
  /**
    * Link to the paying party and optionally what specifically they will be responsible to pay.
    */
  var paymentBy: js.UndefOr[js.Array[CoveragePaymentBy]] = js.undefined
  
  /**
    * Time period during which the coverage is in force. A missing start date indicates the start date isn't known, a missing end date means the coverage is continuing to be in force.
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /**
    * For example: may be an individual, corporation or the subscriber's employer.
    */
  var policyHolder: js.UndefOr[Reference] = js.undefined
  
  /**
    * Typically, an individual uses policies which are theirs (relationship='self') before policies owned by others.
    */
  var relationship: js.UndefOr[CodeableConcept] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Coverage: typings.fhir.fhirStrings.Coverage
  
  /**
    * This element is labeled as a modifier because the status contains the code entered-in-error that marks the coverage as not currently valid.
    */
  var status: active | cancelled | draft | `entered-in-error`
  
  /**
    * Typically, automotive and worker's compensation policies would be flagged with 'subrogation=true' to enable healthcare payors to collect against accident claims.
    */
  var subrogation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * May be self or a parent in the case of dependants. A subscriber is only required on certain types of policies not all policies and that it is appropriate to have just a policyholder and a beneficiary when not other party can join that policy instance.
    */
  var subscriber: js.UndefOr[Reference] = js.undefined
  
  /**
    * The insurer assigned ID for the Subscriber.
    */
  var subscriberId: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * The type of coverage: social program, medical plan, accident coverage (workers compensation, auto), group health or payment by an individual or organization.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object Coverage {
  
  inline def apply(
    beneficiary: Reference,
    kind: insurance | `self-pay` | other,
    status: active | cancelled | draft | `entered-in-error`
  ): Coverage = {
    val __obj = js.Dynamic.literal(beneficiary = beneficiary.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], resourceType = "Coverage", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Coverage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Coverage] (val x: Self) extends AnyVal {
    
    inline def setBeneficiary(value: Reference): Self = StObject.set(x, "beneficiary", value.asInstanceOf[js.Any])
    
    inline def setClass(value: js.Array[CoverageClass]): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
    
    inline def setClassVarargs(value: CoverageClass*): Self = StObject.set(x, "class", js.Array(value*))
    
    inline def setContract(value: js.Array[Reference]): Self = StObject.set(x, "contract", value.asInstanceOf[js.Any])
    
    inline def setContractUndefined: Self = StObject.set(x, "contract", js.undefined)
    
    inline def setContractVarargs(value: Reference*): Self = StObject.set(x, "contract", js.Array(value*))
    
    inline def setCostToBeneficiary(value: js.Array[CoverageCostToBeneficiary]): Self = StObject.set(x, "costToBeneficiary", value.asInstanceOf[js.Any])
    
    inline def setCostToBeneficiaryUndefined: Self = StObject.set(x, "costToBeneficiary", js.undefined)
    
    inline def setCostToBeneficiaryVarargs(value: CoverageCostToBeneficiary*): Self = StObject.set(x, "costToBeneficiary", js.Array(value*))
    
    inline def setDependent(value: String): Self = StObject.set(x, "dependent", value.asInstanceOf[js.Any])
    
    inline def setDependentUndefined: Self = StObject.set(x, "dependent", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setInsurancePlan(value: Reference): Self = StObject.set(x, "insurancePlan", value.asInstanceOf[js.Any])
    
    inline def setInsurancePlanUndefined: Self = StObject.set(x, "insurancePlan", js.undefined)
    
    inline def setInsurer(value: Reference): Self = StObject.set(x, "insurer", value.asInstanceOf[js.Any])
    
    inline def setInsurerUndefined: Self = StObject.set(x, "insurer", js.undefined)
    
    inline def setKind(value: insurance | `self-pay` | other): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setPaymentBy(value: js.Array[CoveragePaymentBy]): Self = StObject.set(x, "paymentBy", value.asInstanceOf[js.Any])
    
    inline def setPaymentByUndefined: Self = StObject.set(x, "paymentBy", js.undefined)
    
    inline def setPaymentByVarargs(value: CoveragePaymentBy*): Self = StObject.set(x, "paymentBy", js.Array(value*))
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setPolicyHolder(value: Reference): Self = StObject.set(x, "policyHolder", value.asInstanceOf[js.Any])
    
    inline def setPolicyHolderUndefined: Self = StObject.set(x, "policyHolder", js.undefined)
    
    inline def setRelationship(value: CodeableConcept): Self = StObject.set(x, "relationship", value.asInstanceOf[js.Any])
    
    inline def setRelationshipUndefined: Self = StObject.set(x, "relationship", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Coverage): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: active | cancelled | draft | `entered-in-error`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSubrogation(value: Boolean): Self = StObject.set(x, "subrogation", value.asInstanceOf[js.Any])
    
    inline def setSubrogationUndefined: Self = StObject.set(x, "subrogation", js.undefined)
    
    inline def setSubscriber(value: Reference): Self = StObject.set(x, "subscriber", value.asInstanceOf[js.Any])
    
    inline def setSubscriberId(value: js.Array[Identifier]): Self = StObject.set(x, "subscriberId", value.asInstanceOf[js.Any])
    
    inline def setSubscriberIdUndefined: Self = StObject.set(x, "subscriberId", js.undefined)
    
    inline def setSubscriberIdVarargs(value: Identifier*): Self = StObject.set(x, "subscriberId", js.Array(value*))
    
    inline def setSubscriberUndefined: Self = StObject.set(x, "subscriber", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_dependent(value: Element): Self = StObject.set(x, "_dependent", value.asInstanceOf[js.Any])
    
    inline def set_dependentUndefined: Self = StObject.set(x, "_dependent", js.undefined)
    
    inline def set_kind(value: Element): Self = StObject.set(x, "_kind", value.asInstanceOf[js.Any])
    
    inline def set_kindUndefined: Self = StObject.set(x, "_kind", js.undefined)
    
    inline def set_network(value: Element): Self = StObject.set(x, "_network", value.asInstanceOf[js.Any])
    
    inline def set_networkUndefined: Self = StObject.set(x, "_network", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    inline def set_subrogation(value: Element): Self = StObject.set(x, "_subrogation", value.asInstanceOf[js.Any])
    
    inline def set_subrogationUndefined: Self = StObject.set(x, "_subrogation", js.undefined)
  }
}
