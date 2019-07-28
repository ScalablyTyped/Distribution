package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A healthcare consumer's policy choices to permits or denies recipients or roles to perform actions for specific purposes and periods of time
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.fhir.fhirNs.Resource because Already inherited */ trait Consent extends DomainResource {
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
  var dateTime: js.UndefOr[typings.fhir.fhirNs.dateTime] = js.undefined
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
    val __obj = js.Dynamic.literal(patient = patient, status = status)
    if (_dateTime != null) __obj.updateDynamic("_dateTime")(_dateTime)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_policyRule != null) __obj.updateDynamic("_policyRule")(_policyRule)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (_status != null) __obj.updateDynamic("_status")(_status)
    if (action != null) __obj.updateDynamic("action")(action)
    if (actor != null) __obj.updateDynamic("actor")(actor)
    if (category != null) __obj.updateDynamic("category")(category)
    if (consentingParty != null) __obj.updateDynamic("consentingParty")(consentingParty)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (data != null) __obj.updateDynamic("data")(data)
    if (dataPeriod != null) __obj.updateDynamic("dataPeriod")(dataPeriod)
    if (dateTime != null) __obj.updateDynamic("dateTime")(dateTime)
    if (except != null) __obj.updateDynamic("except")(except)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (language != null) __obj.updateDynamic("language")(language)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (organization != null) __obj.updateDynamic("organization")(organization)
    if (period != null) __obj.updateDynamic("period")(period)
    if (policy != null) __obj.updateDynamic("policy")(policy)
    if (policyRule != null) __obj.updateDynamic("policyRule")(policyRule)
    if (purpose != null) __obj.updateDynamic("purpose")(purpose)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (securityLabel != null) __obj.updateDynamic("securityLabel")(securityLabel)
    if (sourceAttachment != null) __obj.updateDynamic("sourceAttachment")(sourceAttachment)
    if (sourceIdentifier != null) __obj.updateDynamic("sourceIdentifier")(sourceIdentifier)
    if (sourceReference != null) __obj.updateDynamic("sourceReference")(sourceReference)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Consent]
  }
}

