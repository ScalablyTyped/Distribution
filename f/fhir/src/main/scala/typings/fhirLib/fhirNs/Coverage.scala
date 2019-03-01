package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Insurance or medical plan or a payment agreement
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- fhirLib.fhirNs.Resource because Already inherited */ trait Coverage extends DomainResource {
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
  var dependent: js.UndefOr[java.lang.String] = js.undefined
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
  var network: js.UndefOr[java.lang.String] = js.undefined
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
  var sequence: js.UndefOr[java.lang.String] = js.undefined
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
  var subscriberId: js.UndefOr[java.lang.String] = js.undefined
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
    dependent: java.lang.String = null,
    extension: js.Array[Extension] = null,
    grouping: CoverageGrouping = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    network: java.lang.String = null,
    order: js.UndefOr[positiveInt] = js.undefined,
    payor: js.Array[Reference] = null,
    period: Period = null,
    policyHolder: Reference = null,
    relationship: CodeableConcept = null,
    resourceType: code = null,
    sequence: java.lang.String = null,
    status: code = null,
    subscriber: Reference = null,
    subscriberId: java.lang.String = null,
    text: Narrative = null,
    `type`: CodeableConcept = null
  ): Coverage = {
    val __obj = js.Dynamic.literal()
    if (_dependent != null) __obj.updateDynamic("_dependent")(_dependent)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_network != null) __obj.updateDynamic("_network")(_network)
    if (_order != null) __obj.updateDynamic("_order")(_order)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (_sequence != null) __obj.updateDynamic("_sequence")(_sequence)
    if (_status != null) __obj.updateDynamic("_status")(_status)
    if (_subscriberId != null) __obj.updateDynamic("_subscriberId")(_subscriberId)
    if (beneficiary != null) __obj.updateDynamic("beneficiary")(beneficiary)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (contract != null) __obj.updateDynamic("contract")(contract)
    if (dependent != null) __obj.updateDynamic("dependent")(dependent)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (grouping != null) __obj.updateDynamic("grouping")(grouping)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (language != null) __obj.updateDynamic("language")(language)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (network != null) __obj.updateDynamic("network")(network)
    if (!js.isUndefined(order)) __obj.updateDynamic("order")(order)
    if (payor != null) __obj.updateDynamic("payor")(payor)
    if (period != null) __obj.updateDynamic("period")(period)
    if (policyHolder != null) __obj.updateDynamic("policyHolder")(policyHolder)
    if (relationship != null) __obj.updateDynamic("relationship")(relationship)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (sequence != null) __obj.updateDynamic("sequence")(sequence)
    if (status != null) __obj.updateDynamic("status")(status)
    if (subscriber != null) __obj.updateDynamic("subscriber")(subscriber)
    if (subscriberId != null) __obj.updateDynamic("subscriberId")(subscriberId)
    if (text != null) __obj.updateDynamic("text")(text)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Coverage]
  }
}

