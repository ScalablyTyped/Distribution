package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An association of a Patient with an Organization and  Healthcare Provider(s) for a period of time that the Organization assumes some level of responsibility
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait EpisodeOfCare extends DomainResource {
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * The set of accounts that may be used for billing for this EpisodeOfCare
    */
  var account: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Care manager/care co-ordinator for the patient
    */
  var careManager: js.UndefOr[Reference] = js.undefined
  /**
    * The list of diagnosis relevant to this episode of care
    */
  var diagnosis: js.UndefOr[js.Array[EpisodeOfCareDiagnosis]] = js.undefined
  /**
    * Business Identifier(s) relevant for this EpisodeOfCare
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
    * Organization that assumes care
    */
  var managingOrganization: js.UndefOr[Reference] = js.undefined
  /**
    * The patient who is the focus of this episode of care
    */
  var patient: Reference
  /**
    * Interval during responsibility is assumed
    */
  var period: js.UndefOr[Period] = js.undefined
  /**
    * Originating Referral Request(s)
    */
  var referralRequest: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * planned | waitlist | active | onhold | finished | cancelled | entered-in-error
    */
  var status: code
  /**
    * Past list of status codes (the current status may be included to cover the start date of the status)
    */
  var statusHistory: js.UndefOr[js.Array[EpisodeOfCareStatusHistory]] = js.undefined
  /**
    * Other practitioners facilitating this episode of care
    */
  var team: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Type/class  - e.g. specialist referral, disease management
    */
  var `type`: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}

object EpisodeOfCare {
  @scala.inline
  def apply(
    patient: Reference,
    status: code,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    account: js.Array[Reference] = null,
    careManager: Reference = null,
    contained: js.Array[Resource] = null,
    diagnosis: js.Array[EpisodeOfCareDiagnosis] = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    managingOrganization: Reference = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    period: Period = null,
    referralRequest: js.Array[Reference] = null,
    resourceType: code = null,
    statusHistory: js.Array[EpisodeOfCareStatusHistory] = null,
    team: js.Array[Reference] = null,
    text: Narrative = null,
    `type`: js.Array[CodeableConcept] = null
  ): EpisodeOfCare = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (account != null) __obj.updateDynamic("account")(account.asInstanceOf[js.Any])
    if (careManager != null) __obj.updateDynamic("careManager")(careManager.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (diagnosis != null) __obj.updateDynamic("diagnosis")(diagnosis.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (managingOrganization != null) __obj.updateDynamic("managingOrganization")(managingOrganization.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    if (referralRequest != null) __obj.updateDynamic("referralRequest")(referralRequest.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (statusHistory != null) __obj.updateDynamic("statusHistory")(statusHistory.asInstanceOf[js.Any])
    if (team != null) __obj.updateDynamic("team")(team.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EpisodeOfCare]
  }
}

