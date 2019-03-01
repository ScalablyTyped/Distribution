package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Tracks balance, charges, for patient or cost center
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- fhirLib.fhirNs.Resource because Already inherited */ trait Account extends DomainResource {
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * Time window that transactions may be posted to this account
    */
  var active: js.UndefOr[Period] = js.undefined
  /**
    * How much is in account?
    */
  var balance: js.UndefOr[Money] = js.undefined
  /**
    * The party(s) that are responsible for covering the payment of this account, and what order should they be applied to the account
    */
  var coverage: js.UndefOr[js.Array[AccountCoverage]] = js.undefined
  /**
    * Explanation of purpose/use
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Responsible for the account
    */
  var guarantor: js.UndefOr[js.Array[AccountGuarantor]] = js.undefined
  /**
    * Account number
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
    * Human-readable label
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Who is responsible?
    */
  var owner: js.UndefOr[Reference] = js.undefined
  /**
    * Transaction window
    */
  var period: js.UndefOr[Period] = js.undefined
  /**
    * active | inactive | entered-in-error
    */
  var status: js.UndefOr[code] = js.undefined
  /**
    * What is account tied to?
    */
  var subject: js.UndefOr[Reference] = js.undefined
  /**
    * E.g. patient, expense, depreciation
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}

object Account {
  @scala.inline
  def apply(
    _description: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _name: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    active: Period = null,
    balance: Money = null,
    contained: js.Array[Resource] = null,
    coverage: js.Array[AccountCoverage] = null,
    description: java.lang.String = null,
    extension: js.Array[Extension] = null,
    guarantor: js.Array[AccountGuarantor] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    name: java.lang.String = null,
    owner: Reference = null,
    period: Period = null,
    resourceType: code = null,
    status: code = null,
    subject: Reference = null,
    text: Narrative = null,
    `type`: CodeableConcept = null
  ): Account = {
    val __obj = js.Dynamic.literal()
    if (_description != null) __obj.updateDynamic("_description")(_description)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_name != null) __obj.updateDynamic("_name")(_name)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (_status != null) __obj.updateDynamic("_status")(_status)
    if (active != null) __obj.updateDynamic("active")(active)
    if (balance != null) __obj.updateDynamic("balance")(balance)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (coverage != null) __obj.updateDynamic("coverage")(coverage)
    if (description != null) __obj.updateDynamic("description")(description)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (guarantor != null) __obj.updateDynamic("guarantor")(guarantor)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (language != null) __obj.updateDynamic("language")(language)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (name != null) __obj.updateDynamic("name")(name)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (period != null) __obj.updateDynamic("period")(period)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (status != null) __obj.updateDynamic("status")(status)
    if (subject != null) __obj.updateDynamic("subject")(subject)
    if (text != null) __obj.updateDynamic("text")(text)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Account]
  }
}

