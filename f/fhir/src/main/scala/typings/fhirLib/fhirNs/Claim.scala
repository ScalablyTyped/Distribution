package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Claim, Pre-determination or Pre-authorization
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- fhirLib.fhirNs.Resource because Already inherited */ trait Claim extends DomainResource {
  /**
    * Contains extended information for property 'created'.
    */
  var _created: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'use'.
    */
  var _use: js.UndefOr[Element] = js.undefined
  /**
    * Details about an accident
    */
  var accident: js.UndefOr[ClaimAccident] = js.undefined
  /**
    * Period for charge submission
    */
  var billablePeriod: js.UndefOr[Period] = js.undefined
  /**
    * Members of the care team
    */
  var careTeam: js.UndefOr[js.Array[ClaimCareTeam]] = js.undefined
  /**
    * Creation date
    */
  var created: js.UndefOr[dateTime] = js.undefined
  /**
    * List of Diagnosis
    */
  var diagnosis: js.UndefOr[js.Array[ClaimDiagnosis]] = js.undefined
  /**
    * Period unable to work
    */
  var employmentImpacted: js.UndefOr[Period] = js.undefined
  /**
    * Author
    */
  var enterer: js.UndefOr[Reference] = js.undefined
  /**
    * Servicing Facility
    */
  var facility: js.UndefOr[Reference] = js.undefined
  /**
    * Funds requested to be reserved
    */
  var fundsReserve: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Period in hospital
    */
  var hospitalization: js.UndefOr[Period] = js.undefined
  /**
    * Claim number
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
    * Exceptions, special considerations, the condition, situation, prior or concurrent issues
    */
  var information: js.UndefOr[js.Array[ClaimInformation]] = js.undefined
  /**
    * Insurance or medical plan
    */
  var insurance: js.UndefOr[js.Array[ClaimInsurance]] = js.undefined
  /**
    * Target
    */
  var insurer: js.UndefOr[Reference] = js.undefined
  /**
    * Goods and Services
    */
  var item: js.UndefOr[js.Array[ClaimItem]] = js.undefined
  /**
    * Responsible organization
    */
  var organization: js.UndefOr[Reference] = js.undefined
  /**
    * Original prescription if superceded by fulfiller
    */
  var originalPrescription: js.UndefOr[Reference] = js.undefined
  /**
    * The subject of the Products and Services
    */
  var patient: js.UndefOr[Reference] = js.undefined
  /**
    * Party to be paid any benefits payable
    */
  var payee: js.UndefOr[ClaimPayee] = js.undefined
  /**
    * Prescription authorizing services or products
    */
  var prescription: js.UndefOr[Reference] = js.undefined
  /**
    * Desired processing priority
    */
  var priority: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Procedures performed
    */
  var procedure: js.UndefOr[js.Array[ClaimProcedure]] = js.undefined
  /**
    * Responsible provider
    */
  var provider: js.UndefOr[Reference] = js.undefined
  /**
    * Treatment Referral
    */
  var referral: js.UndefOr[Reference] = js.undefined
  /**
    * Related Claims which may be revelant to processing this claimn
    */
  var related: js.UndefOr[js.Array[ClaimRelated]] = js.undefined
  /**
    * active | cancelled | draft | entered-in-error
    */
  var status: js.UndefOr[code] = js.undefined
  /**
    * Finer grained claim type information
    */
  var subType: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Total claim cost
    */
  var total: js.UndefOr[Money] = js.undefined
  /**
    * Type or discipline
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * complete | proposed | exploratory | other
    */
  var use: js.UndefOr[code] = js.undefined
}

object Claim {
  @scala.inline
  def apply(
    _created: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    _use: Element = null,
    accident: ClaimAccident = null,
    billablePeriod: Period = null,
    careTeam: js.Array[ClaimCareTeam] = null,
    contained: js.Array[Resource] = null,
    created: dateTime = null,
    diagnosis: js.Array[ClaimDiagnosis] = null,
    employmentImpacted: Period = null,
    enterer: Reference = null,
    extension: js.Array[Extension] = null,
    facility: Reference = null,
    fundsReserve: CodeableConcept = null,
    hospitalization: Period = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    information: js.Array[ClaimInformation] = null,
    insurance: js.Array[ClaimInsurance] = null,
    insurer: Reference = null,
    item: js.Array[ClaimItem] = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    organization: Reference = null,
    originalPrescription: Reference = null,
    patient: Reference = null,
    payee: ClaimPayee = null,
    prescription: Reference = null,
    priority: CodeableConcept = null,
    procedure: js.Array[ClaimProcedure] = null,
    provider: Reference = null,
    referral: Reference = null,
    related: js.Array[ClaimRelated] = null,
    resourceType: code = null,
    status: code = null,
    subType: js.Array[CodeableConcept] = null,
    text: Narrative = null,
    total: Money = null,
    `type`: CodeableConcept = null,
    use: code = null
  ): Claim = {
    val __obj = js.Dynamic.literal()
    if (_created != null) __obj.updateDynamic("_created")(_created)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (_status != null) __obj.updateDynamic("_status")(_status)
    if (_use != null) __obj.updateDynamic("_use")(_use)
    if (accident != null) __obj.updateDynamic("accident")(accident)
    if (billablePeriod != null) __obj.updateDynamic("billablePeriod")(billablePeriod)
    if (careTeam != null) __obj.updateDynamic("careTeam")(careTeam)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (created != null) __obj.updateDynamic("created")(created)
    if (diagnosis != null) __obj.updateDynamic("diagnosis")(diagnosis)
    if (employmentImpacted != null) __obj.updateDynamic("employmentImpacted")(employmentImpacted)
    if (enterer != null) __obj.updateDynamic("enterer")(enterer)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (facility != null) __obj.updateDynamic("facility")(facility)
    if (fundsReserve != null) __obj.updateDynamic("fundsReserve")(fundsReserve)
    if (hospitalization != null) __obj.updateDynamic("hospitalization")(hospitalization)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (information != null) __obj.updateDynamic("information")(information)
    if (insurance != null) __obj.updateDynamic("insurance")(insurance)
    if (insurer != null) __obj.updateDynamic("insurer")(insurer)
    if (item != null) __obj.updateDynamic("item")(item)
    if (language != null) __obj.updateDynamic("language")(language)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (organization != null) __obj.updateDynamic("organization")(organization)
    if (originalPrescription != null) __obj.updateDynamic("originalPrescription")(originalPrescription)
    if (patient != null) __obj.updateDynamic("patient")(patient)
    if (payee != null) __obj.updateDynamic("payee")(payee)
    if (prescription != null) __obj.updateDynamic("prescription")(prescription)
    if (priority != null) __obj.updateDynamic("priority")(priority)
    if (procedure != null) __obj.updateDynamic("procedure")(procedure)
    if (provider != null) __obj.updateDynamic("provider")(provider)
    if (referral != null) __obj.updateDynamic("referral")(referral)
    if (related != null) __obj.updateDynamic("related")(related)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (status != null) __obj.updateDynamic("status")(status)
    if (subType != null) __obj.updateDynamic("subType")(subType)
    if (text != null) __obj.updateDynamic("text")(text)
    if (total != null) __obj.updateDynamic("total")(total)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (use != null) __obj.updateDynamic("use")(use)
    __obj.asInstanceOf[Claim]
  }
}

