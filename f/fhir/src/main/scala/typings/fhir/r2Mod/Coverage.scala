package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Coverage
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _group: js.UndefOr[Element] = js.undefined
  
  var _plan: js.UndefOr[Element] = js.undefined
  
  var _subPlan: js.UndefOr[Element] = js.undefined
  
  /**
    * Business Identification Number (BIN number) used to identify the routing  of eclaims if the insurer themselves don't have a BIN number for all of their business.
    */
  var bin: js.UndefOr[Identifier] = js.undefined
  
  /**
    * The policy(s) which constitute this insurance coverage.
    */
  var contract: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * For some coverage a single identifier is issued to the PolicyHolder and dependent number issues to each to each of their dependents to track and manage the plan.
    */
  var dependent: js.UndefOr[Double] = js.undefined
  
  /**
    * Identifies a style or collective of coverage issues by the underwriter, for example may be used to identify a class of coverage or employer group. May also be referred to as a Policy or Group ID.
    */
  var group: js.UndefOr[String] = js.undefined
  
  /**
    * This value may uniquely identify the coverage or it may be used in conjunction with the additional identifiers below.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Need to identify the issuer to target for processing and for coordination of benefit processing.
    */
  var issuer: js.UndefOr[Reference] = js.undefined
  
  /**
    * The identifier for a community of providers.
    */
  var network: js.UndefOr[Identifier] = js.undefined
  
  /**
    * Time period during which the coverage is in force. A missing start date indicates the start date isn't known, a missing end date means the coverage is continuing to be in force.
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /**
    * Identifies a style or collective of coverage issues by the underwriter, for example may be used to identify a class of coverage or employer group. May also be referred to as a Policy or Group ID.
    */
  var plan: js.UndefOr[String] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Coverage: typings.fhir.fhirStrings.Coverage
  
  /**
    * Some coverage, for example social plans, may be offered in short time increments, for example for a week or a month at a time, so while the rest of the plan details and identifiers may remain constant over time, the instance is incremented with each renewal and provided to the covered party on their 'card'.
    */
  var sequence: js.UndefOr[Double] = js.undefined
  
  /**
    * Identifies a sub-style or sub-collective of coverage issues by the underwriter, for example may be used to identify a specific employer group within a class of employers. May be referred to as a Section or Division ID.
    */
  var subPlan: js.UndefOr[String] = js.undefined
  
  /**
    * The party who 'owns' the insurance contractual relationship to the policy or to whom the benefit of the policy is due.
    */
  var subscriber: js.UndefOr[Reference] = js.undefined
  
  /**
    * The id issued to the subscriber.
    */
  var subscriberId: js.UndefOr[Identifier] = js.undefined
  
  /**
    * The order of application of coverages is dependent on the types of coverage.
    */
  var `type`: js.UndefOr[Coding] = js.undefined
}
object Coverage {
  
  inline def apply(): Coverage = {
    val __obj = js.Dynamic.literal(resourceType = "Coverage")
    __obj.asInstanceOf[Coverage]
  }
  
  extension [Self <: Coverage](x: Self) {
    
    inline def setBin(value: Identifier): Self = StObject.set(x, "bin", value.asInstanceOf[js.Any])
    
    inline def setBinUndefined: Self = StObject.set(x, "bin", js.undefined)
    
    inline def setContract(value: js.Array[Reference]): Self = StObject.set(x, "contract", value.asInstanceOf[js.Any])
    
    inline def setContractUndefined: Self = StObject.set(x, "contract", js.undefined)
    
    inline def setContractVarargs(value: Reference*): Self = StObject.set(x, "contract", js.Array(value*))
    
    inline def setDependent(value: Double): Self = StObject.set(x, "dependent", value.asInstanceOf[js.Any])
    
    inline def setDependentUndefined: Self = StObject.set(x, "dependent", js.undefined)
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setIssuer(value: Reference): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
    
    inline def setNetwork(value: Identifier): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setPlan(value: String): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
    
    inline def setPlanUndefined: Self = StObject.set(x, "plan", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Coverage): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSequence(value: Double): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    inline def setSequenceUndefined: Self = StObject.set(x, "sequence", js.undefined)
    
    inline def setSubPlan(value: String): Self = StObject.set(x, "subPlan", value.asInstanceOf[js.Any])
    
    inline def setSubPlanUndefined: Self = StObject.set(x, "subPlan", js.undefined)
    
    inline def setSubscriber(value: Reference): Self = StObject.set(x, "subscriber", value.asInstanceOf[js.Any])
    
    inline def setSubscriberId(value: Identifier): Self = StObject.set(x, "subscriberId", value.asInstanceOf[js.Any])
    
    inline def setSubscriberIdUndefined: Self = StObject.set(x, "subscriberId", js.undefined)
    
    inline def setSubscriberUndefined: Self = StObject.set(x, "subscriber", js.undefined)
    
    inline def setType(value: Coding): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_group(value: Element): Self = StObject.set(x, "_group", value.asInstanceOf[js.Any])
    
    inline def set_groupUndefined: Self = StObject.set(x, "_group", js.undefined)
    
    inline def set_plan(value: Element): Self = StObject.set(x, "_plan", value.asInstanceOf[js.Any])
    
    inline def set_planUndefined: Self = StObject.set(x, "_plan", js.undefined)
    
    inline def set_subPlan(value: Element): Self = StObject.set(x, "_subPlan", value.asInstanceOf[js.Any])
    
    inline def set_subPlanUndefined: Self = StObject.set(x, "_subPlan", js.undefined)
  }
}
