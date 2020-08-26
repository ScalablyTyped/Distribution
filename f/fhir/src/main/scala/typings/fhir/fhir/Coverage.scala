package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Insurance or medical plan or a payment agreement
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait Coverage extends DomainResource {
  /**
    * Contains extended information for property 'dependent'.
    */
  var _dependent: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'network'.
    */
  var _network: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'order'.
    */
  var _order: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'sequence'.
    */
  var _sequence: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'subscriberId'.
    */
  var _subscriberId: js.UndefOr[Element] = js.native
  /**
    * Plan Beneficiary
    */
  var beneficiary: js.UndefOr[Reference] = js.native
  /**
    * Contract details
    */
  var contract: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Dependent number
    */
  var dependent: js.UndefOr[String] = js.native
  /**
    * Additional coverage classifications
    */
  var grouping: js.UndefOr[CoverageGrouping] = js.native
  /**
    * The primary coverage ID
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  /**
    * Insurer network
    */
  var network: js.UndefOr[String] = js.native
  /**
    * Relative order of the coverage
    */
  var order: js.UndefOr[positiveInt] = js.native
  /**
    * Identifier for the plan or agreement issuer
    */
  var payor: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Coverage start and end dates
    */
  var period: js.UndefOr[Period] = js.native
  /**
    * Owner of the policy
    */
  var policyHolder: js.UndefOr[Reference] = js.native
  /**
    * Beneficiary relationship to the Subscriber
    */
  var relationship: js.UndefOr[CodeableConcept] = js.native
  /**
    * The plan instance or sequence counter
    */
  var sequence: js.UndefOr[String] = js.native
  /**
    * active | cancelled | draft | entered-in-error
    */
  var status: js.UndefOr[code] = js.native
  /**
    * Subscriber to the policy
    */
  var subscriber: js.UndefOr[Reference] = js.native
  /**
    * ID assigned to the Subscriber
    */
  var subscriberId: js.UndefOr[String] = js.native
  /**
    * Type of coverage such as medical or accident
    */
  var `type`: js.UndefOr[CodeableConcept] = js.native
}

object Coverage {
  @scala.inline
  def apply(): Coverage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Coverage]
  }
  @scala.inline
  implicit class CoverageOps[Self <: Coverage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_dependent(value: Element): Self = this.set("_dependent", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_dependent: Self = this.set("_dependent", js.undefined)
    @scala.inline
    def set_network(value: Element): Self = this.set("_network", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_network: Self = this.set("_network", js.undefined)
    @scala.inline
    def set_order(value: Element): Self = this.set("_order", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_order: Self = this.set("_order", js.undefined)
    @scala.inline
    def set_sequence(value: Element): Self = this.set("_sequence", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_sequence: Self = this.set("_sequence", js.undefined)
    @scala.inline
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
    @scala.inline
    def set_subscriberId(value: Element): Self = this.set("_subscriberId", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_subscriberId: Self = this.set("_subscriberId", js.undefined)
    @scala.inline
    def setBeneficiary(value: Reference): Self = this.set("beneficiary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeneficiary: Self = this.set("beneficiary", js.undefined)
    @scala.inline
    def setContractVarargs(value: Reference*): Self = this.set("contract", js.Array(value :_*))
    @scala.inline
    def setContract(value: js.Array[Reference]): Self = this.set("contract", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContract: Self = this.set("contract", js.undefined)
    @scala.inline
    def setDependent(value: String): Self = this.set("dependent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDependent: Self = this.set("dependent", js.undefined)
    @scala.inline
    def setGrouping(value: CoverageGrouping): Self = this.set("grouping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrouping: Self = this.set("grouping", js.undefined)
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = this.set("identifier", js.Array(value :_*))
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    @scala.inline
    def setNetwork(value: String): Self = this.set("network", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetwork: Self = this.set("network", js.undefined)
    @scala.inline
    def setOrder(value: positiveInt): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    @scala.inline
    def setPayorVarargs(value: Reference*): Self = this.set("payor", js.Array(value :_*))
    @scala.inline
    def setPayor(value: js.Array[Reference]): Self = this.set("payor", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayor: Self = this.set("payor", js.undefined)
    @scala.inline
    def setPeriod(value: Period): Self = this.set("period", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeriod: Self = this.set("period", js.undefined)
    @scala.inline
    def setPolicyHolder(value: Reference): Self = this.set("policyHolder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicyHolder: Self = this.set("policyHolder", js.undefined)
    @scala.inline
    def setRelationship(value: CodeableConcept): Self = this.set("relationship", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelationship: Self = this.set("relationship", js.undefined)
    @scala.inline
    def setSequence(value: String): Self = this.set("sequence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSequence: Self = this.set("sequence", js.undefined)
    @scala.inline
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setSubscriber(value: Reference): Self = this.set("subscriber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubscriber: Self = this.set("subscriber", js.undefined)
    @scala.inline
    def setSubscriberId(value: String): Self = this.set("subscriberId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubscriberId: Self = this.set("subscriberId", js.undefined)
    @scala.inline
    def setType(value: CodeableConcept): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

