package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Insurance or medical plan or a payment agreement
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait Coverage extends DomainResource {
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
  @scala.inline
  def apply(
    _dependent: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _network: Element = null,
    _order: Element = null,
    _resourceType: Element = null,
    _sequence: Element = null,
    _status: Element = null,
    _subscriberId: Element = null,
    beneficiary: Reference = null,
    contained: js.Array[Resource] = null,
    contract: js.Array[Reference] = null,
    dependent: String = null,
    extension: js.Array[Extension] = null,
    grouping: CoverageGrouping = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    network: String = null,
    order: js.UndefOr[positiveInt] = js.undefined,
    payor: js.Array[Reference] = null,
    period: Period = null,
    policyHolder: Reference = null,
    relationship: CodeableConcept = null,
    resourceType: code = null,
    sequence: String = null,
    status: code = null,
    subscriber: Reference = null,
    subscriberId: String = null,
    text: Narrative = null,
    `type`: CodeableConcept = null
  ): Coverage = {
    val __obj = js.Dynamic.literal()
    if (_dependent != null) __obj.updateDynamic("_dependent")(_dependent.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_network != null) __obj.updateDynamic("_network")(_network.asInstanceOf[js.Any])
    if (_order != null) __obj.updateDynamic("_order")(_order.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_sequence != null) __obj.updateDynamic("_sequence")(_sequence.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (_subscriberId != null) __obj.updateDynamic("_subscriberId")(_subscriberId.asInstanceOf[js.Any])
    if (beneficiary != null) __obj.updateDynamic("beneficiary")(beneficiary.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (contract != null) __obj.updateDynamic("contract")(contract.asInstanceOf[js.Any])
    if (dependent != null) __obj.updateDynamic("dependent")(dependent.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (grouping != null) __obj.updateDynamic("grouping")(grouping.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (network != null) __obj.updateDynamic("network")(network.asInstanceOf[js.Any])
    if (!js.isUndefined(order)) __obj.updateDynamic("order")(order.get.asInstanceOf[js.Any])
    if (payor != null) __obj.updateDynamic("payor")(payor.asInstanceOf[js.Any])
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    if (policyHolder != null) __obj.updateDynamic("policyHolder")(policyHolder.asInstanceOf[js.Any])
    if (relationship != null) __obj.updateDynamic("relationship")(relationship.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (sequence != null) __obj.updateDynamic("sequence")(sequence.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (subscriber != null) __obj.updateDynamic("subscriber")(subscriber.asInstanceOf[js.Any])
    if (subscriberId != null) __obj.updateDynamic("subscriberId")(subscriberId.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Coverage]
  }
}

