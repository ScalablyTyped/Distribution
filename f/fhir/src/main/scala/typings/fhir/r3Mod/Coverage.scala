package typings.fhir.r3Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.cancelled
import typings.fhir.fhirStrings.draft
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Coverage
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _dependent: js.UndefOr[Element] = js.undefined
  
  var _network: js.UndefOr[Element] = js.undefined
  
  var _sequence: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  var _subscriberId: js.UndefOr[Element] = js.undefined
  
  /**
    * The party who benefits from the insurance coverage., the patient when services are provided.
    */
  var beneficiary: js.UndefOr[Reference] = js.undefined
  
  /**
    * The policy(s) which constitute this insurance coverage.
    */
  var contract: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * A unique identifier for a dependent under the coverage.
    */
  var dependent: js.UndefOr[String] = js.undefined
  
  /**
    * A suite of underwrite specific classifiers, for example may be used to identify a class of coverage or employer group, Policy, Plan.
    */
  var grouping: js.UndefOr[CoverageGrouping] = js.undefined
  
  /**
    * The main (and possibly only) identifier for the coverage - often referred to as a Member Id, Certificate number, Personal Health Number or Case ID. May be constructed as the concatination of the Coverage.SubscriberID and the Coverage.dependant.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * The insurer-specific identifier for the insurer-defined network of providers to which the beneficiary may seek treatment which will be covered at the 'in-network' rate, otherwise 'out of network' terms and conditions apply.
    */
  var network: js.UndefOr[String] = js.undefined
  
  /**
    * The order of applicability of this coverage relative to other coverages which are currently inforce. Note, there may be gaps in the numbering and this does not imply primary, secondard etc. as the specific positioning of coverages depends upon the episode of care.
    */
  var order: js.UndefOr[Double] = js.undefined
  
  /**
    * The program or plan underwriter or payor including both insurance and non-insurance agreements, such as patient-pay agreements. May provide multiple identifiers such as insurance company identifier or business identifier (BIN number).
    */
  var payor: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Time period during which the coverage is in force. A missing start date indicates the start date isn't known, a missing end date means the coverage is continuing to be in force.
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /**
    * The party who 'owns' the insurance policy,  may be an individual, corporation or the subscriber's employer.
    */
  var policyHolder: js.UndefOr[Reference] = js.undefined
  
  /**
    * The relationship of beneficiary (patient) to the subscriber.
    */
  var relationship: js.UndefOr[CodeableConcept] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Coverage: typings.fhir.fhirStrings.Coverage
  
  /**
    * An optional counter for a particular instance of the identified coverage which increments upon each renewal.
    */
  var sequence: js.UndefOr[String] = js.undefined
  
  /**
    * This element is labeled as a modifier because the status contains the code entered-in-error that marks the coverage as not currently valid.
    */
  var status: js.UndefOr[active | cancelled | draft | `entered-in-error`] = js.undefined
  
  /**
    * The party who has signed-up for or 'owns' the contractual relationship to the policy or to whom the benefit of the policy for services rendered to them or their family is due.
    */
  var subscriber: js.UndefOr[Reference] = js.undefined
  
  /**
    * The insurer assigned ID for the Subscriber.
    */
  var subscriberId: js.UndefOr[String] = js.undefined
  
  /**
    * The type of coverage: social program, medical plan, accident coverage (workers compensation, auto), group health or payment by an individual or organization.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object Coverage {
  
  inline def apply(): Coverage = {
    val __obj = js.Dynamic.literal(resourceType = "Coverage")
    __obj.asInstanceOf[Coverage]
  }
  
  extension [Self <: Coverage](x: Self) {
    
    inline def setBeneficiary(value: Reference): Self = StObject.set(x, "beneficiary", value.asInstanceOf[js.Any])
    
    inline def setBeneficiaryUndefined: Self = StObject.set(x, "beneficiary", js.undefined)
    
    inline def setContract(value: js.Array[Reference]): Self = StObject.set(x, "contract", value.asInstanceOf[js.Any])
    
    inline def setContractUndefined: Self = StObject.set(x, "contract", js.undefined)
    
    inline def setContractVarargs(value: Reference*): Self = StObject.set(x, "contract", js.Array(value*))
    
    inline def setDependent(value: String): Self = StObject.set(x, "dependent", value.asInstanceOf[js.Any])
    
    inline def setDependentUndefined: Self = StObject.set(x, "dependent", js.undefined)
    
    inline def setGrouping(value: CoverageGrouping): Self = StObject.set(x, "grouping", value.asInstanceOf[js.Any])
    
    inline def setGroupingUndefined: Self = StObject.set(x, "grouping", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setPayor(value: js.Array[Reference]): Self = StObject.set(x, "payor", value.asInstanceOf[js.Any])
    
    inline def setPayorUndefined: Self = StObject.set(x, "payor", js.undefined)
    
    inline def setPayorVarargs(value: Reference*): Self = StObject.set(x, "payor", js.Array(value*))
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setPolicyHolder(value: Reference): Self = StObject.set(x, "policyHolder", value.asInstanceOf[js.Any])
    
    inline def setPolicyHolderUndefined: Self = StObject.set(x, "policyHolder", js.undefined)
    
    inline def setRelationship(value: CodeableConcept): Self = StObject.set(x, "relationship", value.asInstanceOf[js.Any])
    
    inline def setRelationshipUndefined: Self = StObject.set(x, "relationship", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Coverage): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSequence(value: String): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    inline def setSequenceUndefined: Self = StObject.set(x, "sequence", js.undefined)
    
    inline def setStatus(value: active | cancelled | draft | `entered-in-error`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSubscriber(value: Reference): Self = StObject.set(x, "subscriber", value.asInstanceOf[js.Any])
    
    inline def setSubscriberId(value: String): Self = StObject.set(x, "subscriberId", value.asInstanceOf[js.Any])
    
    inline def setSubscriberIdUndefined: Self = StObject.set(x, "subscriberId", js.undefined)
    
    inline def setSubscriberUndefined: Self = StObject.set(x, "subscriber", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_dependent(value: Element): Self = StObject.set(x, "_dependent", value.asInstanceOf[js.Any])
    
    inline def set_dependentUndefined: Self = StObject.set(x, "_dependent", js.undefined)
    
    inline def set_network(value: Element): Self = StObject.set(x, "_network", value.asInstanceOf[js.Any])
    
    inline def set_networkUndefined: Self = StObject.set(x, "_network", js.undefined)
    
    inline def set_sequence(value: Element): Self = StObject.set(x, "_sequence", value.asInstanceOf[js.Any])
    
    inline def set_sequenceUndefined: Self = StObject.set(x, "_sequence", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    inline def set_subscriberId(value: Element): Self = StObject.set(x, "_subscriberId", value.asInstanceOf[js.Any])
    
    inline def set_subscriberIdUndefined: Self = StObject.set(x, "_subscriberId", js.undefined)
  }
}
