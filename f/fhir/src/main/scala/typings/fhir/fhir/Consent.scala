package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A healthcare consumer's policy choices to permits or denies recipients or roles to perform actions for specific purposes and periods of time
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait Consent extends DomainResource {
  /**
    * Contains extended information for property 'dateTime'.
    */
  var _dateTime: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'policyRule'.
    */
  var _policyRule: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * Actions controlled by this consent
    */
  var action: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Who|what controlled by this consent (or group, by role)
    */
  var actor: js.UndefOr[js.Array[ConsentActor]] = js.undefined
  /**
    * Classification of the consent statement - for indexing/retrieval
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Who is agreeing to the policy and exceptions
    */
  var consentingParty: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Data controlled by this consent
    */
  var data: js.UndefOr[js.Array[ConsentData]] = js.undefined
  /**
    * Timeframe for data controlled by this consent
    */
  var dataPeriod: js.UndefOr[Period] = js.undefined
  /**
    * When this Consent was created or indexed
    */
  var dateTime: js.UndefOr[typings.fhir.fhir.dateTime] = js.undefined
  /**
    * Additional rule -  addition or removal of permissions
    */
  var except: js.UndefOr[js.Array[ConsentExcept]] = js.undefined
  /**
    * Identifier for this record (external references)
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  /**
    * Custodian of the consent
    */
  var organization: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Who the consent applies to
    */
  var patient: Reference
  /**
    * Period that this consent applies
    */
  var period: js.UndefOr[Period] = js.undefined
  /**
    * Policies covered by this consent
    */
  var policy: js.UndefOr[js.Array[ConsentPolicy]] = js.undefined
  /**
    * Policy that this consents to
    */
  var policyRule: js.UndefOr[uri] = js.undefined
  /**
    * Context of activities for which the agreement is made
    */
  var purpose: js.UndefOr[js.Array[Coding]] = js.undefined
  /**
    * Security Labels that define affected resources
    */
  var securityLabel: js.UndefOr[js.Array[Coding]] = js.undefined
  /**
    * Source from which this consent is taken
    */
  var sourceAttachment: js.UndefOr[Attachment] = js.undefined
  /**
    * Source from which this consent is taken
    */
  var sourceIdentifier: js.UndefOr[Identifier] = js.undefined
  /**
    * Source from which this consent is taken
    */
  var sourceReference: js.UndefOr[Reference] = js.undefined
  /**
    * draft | proposed | active | rejected | inactive | entered-in-error
    */
  var status: code
}

object Consent {
  @scala.inline
  def apply(
    patient: Reference,
    status: code,
    _dateTime: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _policyRule: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    action: js.Array[CodeableConcept] = null,
    actor: js.Array[ConsentActor] = null,
    category: js.Array[CodeableConcept] = null,
    consentingParty: js.Array[Reference] = null,
    contained: js.Array[Resource] = null,
    data: js.Array[ConsentData] = null,
    dataPeriod: Period = null,
    dateTime: dateTime = null,
    except: js.Array[ConsentExcept] = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: Identifier = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    organization: js.Array[Reference] = null,
    period: Period = null,
    policy: js.Array[ConsentPolicy] = null,
    policyRule: uri = null,
    purpose: js.Array[Coding] = null,
    resourceType: code = null,
    securityLabel: js.Array[Coding] = null,
    sourceAttachment: Attachment = null,
    sourceIdentifier: Identifier = null,
    sourceReference: Reference = null,
    text: Narrative = null
  ): Consent = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (_dateTime != null) __obj.updateDynamic("_dateTime")(_dateTime.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_policyRule != null) __obj.updateDynamic("_policyRule")(_policyRule.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (actor != null) __obj.updateDynamic("actor")(actor.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (consentingParty != null) __obj.updateDynamic("consentingParty")(consentingParty.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataPeriod != null) __obj.updateDynamic("dataPeriod")(dataPeriod.asInstanceOf[js.Any])
    if (dateTime != null) __obj.updateDynamic("dateTime")(dateTime.asInstanceOf[js.Any])
    if (except != null) __obj.updateDynamic("except")(except.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (organization != null) __obj.updateDynamic("organization")(organization.asInstanceOf[js.Any])
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    if (policyRule != null) __obj.updateDynamic("policyRule")(policyRule.asInstanceOf[js.Any])
    if (purpose != null) __obj.updateDynamic("purpose")(purpose.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (securityLabel != null) __obj.updateDynamic("securityLabel")(securityLabel.asInstanceOf[js.Any])
    if (sourceAttachment != null) __obj.updateDynamic("sourceAttachment")(sourceAttachment.asInstanceOf[js.Any])
    if (sourceIdentifier != null) __obj.updateDynamic("sourceIdentifier")(sourceIdentifier.asInstanceOf[js.Any])
    if (sourceReference != null) __obj.updateDynamic("sourceReference")(sourceReference.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Consent]
  }
}

