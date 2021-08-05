package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Insurance or medical plan or a payment agreement
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait Coverage
  extends StObject
     with DomainResource {
  
  /**
    * Contains extended information for property 'dependent'.
    */
  var _dependent: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'network'.
    */
  var _network: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'order'.
    */
  var _order: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'sequence'.
    */
  var _sequence: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'subscriberId'.
    */
  var _subscriberId: js.UndefOr[Element] = js.undefined
  
  /**
    * Plan Beneficiary
    */
  var beneficiary: js.UndefOr[Reference] = js.undefined
  
  /**
    * Contract details
    */
  var contract: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Dependent number
    */
  var dependent: js.UndefOr[String] = js.undefined
  
  /**
    * Additional coverage classifications
    */
  var grouping: js.UndefOr[CoverageGrouping] = js.undefined
  
  /**
    * The primary coverage ID
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Insurer network
    */
  var network: js.UndefOr[String] = js.undefined
  
  /**
    * Relative order of the coverage
    */
  var order: js.UndefOr[positiveInt] = js.undefined
  
  /**
    * Identifier for the plan or agreement issuer
    */
  var payor: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Coverage start and end dates
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /**
    * Owner of the policy
    */
  var policyHolder: js.UndefOr[Reference] = js.undefined
  
  /**
    * Beneficiary relationship to the Subscriber
    */
  var relationship: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The plan instance or sequence counter
    */
  var sequence: js.UndefOr[String] = js.undefined
  
  /**
    * active | cancelled | draft | entered-in-error
    */
  var status: js.UndefOr[code] = js.undefined
  
  /**
    * Subscriber to the policy
    */
  var subscriber: js.UndefOr[Reference] = js.undefined
  
  /**
    * ID assigned to the Subscriber
    */
  var subscriberId: js.UndefOr[String] = js.undefined
  
  /**
    * Type of coverage such as medical or accident
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object Coverage {
  
  inline def apply(): Coverage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Coverage]
  }
  
  extension [Self <: Coverage](x: Self) {
    
    inline def setBeneficiary(value: Reference): Self = StObject.set(x, "beneficiary", value.asInstanceOf[js.Any])
    
    inline def setBeneficiaryUndefined: Self = StObject.set(x, "beneficiary", js.undefined)
    
    inline def setContract(value: js.Array[Reference]): Self = StObject.set(x, "contract", value.asInstanceOf[js.Any])
    
    inline def setContractUndefined: Self = StObject.set(x, "contract", js.undefined)
    
    inline def setContractVarargs(value: Reference*): Self = StObject.set(x, "contract", js.Array(value :_*))
    
    inline def setDependent(value: String): Self = StObject.set(x, "dependent", value.asInstanceOf[js.Any])
    
    inline def setDependentUndefined: Self = StObject.set(x, "dependent", js.undefined)
    
    inline def setGrouping(value: CoverageGrouping): Self = StObject.set(x, "grouping", value.asInstanceOf[js.Any])
    
    inline def setGroupingUndefined: Self = StObject.set(x, "grouping", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    inline def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    inline def setOrder(value: positiveInt): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setPayor(value: js.Array[Reference]): Self = StObject.set(x, "payor", value.asInstanceOf[js.Any])
    
    inline def setPayorUndefined: Self = StObject.set(x, "payor", js.undefined)
    
    inline def setPayorVarargs(value: Reference*): Self = StObject.set(x, "payor", js.Array(value :_*))
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setPolicyHolder(value: Reference): Self = StObject.set(x, "policyHolder", value.asInstanceOf[js.Any])
    
    inline def setPolicyHolderUndefined: Self = StObject.set(x, "policyHolder", js.undefined)
    
    inline def setRelationship(value: CodeableConcept): Self = StObject.set(x, "relationship", value.asInstanceOf[js.Any])
    
    inline def setRelationshipUndefined: Self = StObject.set(x, "relationship", js.undefined)
    
    inline def setSequence(value: String): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    inline def setSequenceUndefined: Self = StObject.set(x, "sequence", js.undefined)
    
    inline def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
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
    
    inline def set_order(value: Element): Self = StObject.set(x, "_order", value.asInstanceOf[js.Any])
    
    inline def set_orderUndefined: Self = StObject.set(x, "_order", js.undefined)
    
    inline def set_sequence(value: Element): Self = StObject.set(x, "_sequence", value.asInstanceOf[js.Any])
    
    inline def set_sequenceUndefined: Self = StObject.set(x, "_sequence", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    inline def set_subscriberId(value: Element): Self = StObject.set(x, "_subscriberId", value.asInstanceOf[js.Any])
    
    inline def set_subscriberIdUndefined: Self = StObject.set(x, "_subscriberId", js.undefined)
  }
}
