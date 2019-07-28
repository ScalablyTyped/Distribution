package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Planned participants in the coordination and delivery of care for a patient or group
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.fhir.fhirNs.Resource because Already inherited */ trait CareTeam extends DomainResource {
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * Type of team
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Encounter or episode associated with CareTeam
    */
  var context: js.UndefOr[Reference] = js.undefined
  /**
    * External Ids for this team
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
    * Organization responsible for the care team
    */
  var managingOrganization: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Name of the team, such as crisis assessment team
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Comments made about the CareTeam
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  /**
    * Members of the team
    */
  var participant: js.UndefOr[js.Array[CareTeamParticipant]] = js.undefined
  /**
    * Time period team covers
    */
  var period: js.UndefOr[Period] = js.undefined
  /**
    * Why the care team exists
    */
  var reasonCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Why the care team exists
    */
  var reasonReference: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * proposed | active | suspended | inactive | entered-in-error
    */
  var status: js.UndefOr[code] = js.undefined
  /**
    * Who care team is for
    */
  var subject: js.UndefOr[Reference] = js.undefined
}

object CareTeam {
  @scala.inline
  def apply(
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _name: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    category: js.Array[CodeableConcept] = null,
    contained: js.Array[Resource] = null,
    context: Reference = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    managingOrganization: js.Array[Reference] = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    name: String = null,
    note: js.Array[Annotation] = null,
    participant: js.Array[CareTeamParticipant] = null,
    period: Period = null,
    reasonCode: js.Array[CodeableConcept] = null,
    reasonReference: js.Array[Reference] = null,
    resourceType: code = null,
    status: code = null,
    subject: Reference = null,
    text: Narrative = null
  ): CareTeam = {
    val __obj = js.Dynamic.literal()
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_name != null) __obj.updateDynamic("_name")(_name)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (_status != null) __obj.updateDynamic("_status")(_status)
    if (category != null) __obj.updateDynamic("category")(category)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (context != null) __obj.updateDynamic("context")(context)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (language != null) __obj.updateDynamic("language")(language)
    if (managingOrganization != null) __obj.updateDynamic("managingOrganization")(managingOrganization)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (name != null) __obj.updateDynamic("name")(name)
    if (note != null) __obj.updateDynamic("note")(note)
    if (participant != null) __obj.updateDynamic("participant")(participant)
    if (period != null) __obj.updateDynamic("period")(period)
    if (reasonCode != null) __obj.updateDynamic("reasonCode")(reasonCode)
    if (reasonReference != null) __obj.updateDynamic("reasonReference")(reasonReference)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (status != null) __obj.updateDynamic("status")(status)
    if (subject != null) __obj.updateDynamic("subject")(subject)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[CareTeam]
  }
}

