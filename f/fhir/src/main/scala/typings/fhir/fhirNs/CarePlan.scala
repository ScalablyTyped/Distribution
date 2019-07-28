package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Healthcare plan for patient or group
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.fhir.fhirNs.Resource because Already inherited */ trait CarePlan extends DomainResource {
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'intent'.
    */
  var _intent: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'title'.
    */
  var _title: js.UndefOr[Element] = js.undefined
  /**
    * Action to occur as part of plan
    */
  var activity: js.UndefOr[js.Array[CarePlanActivity]] = js.undefined
  /**
    * Health issues this plan addresses
    */
  var addresses: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Who is responsible for contents of the plan
    */
  var author: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Fulfills care plan
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Who's involved in plan?
    */
  var careTeam: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Type of plan
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Created in context of
    */
  var context: js.UndefOr[Reference] = js.undefined
  /**
    * Protocol or definition
    */
  var definition: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Summary of nature of plan
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Desired outcome of plan
    */
  var goal: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * External Ids for this plan
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
    * proposal | plan | order | option
    */
  var intent: code
  /**
    * Comments about the plan
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  /**
    * Part of referenced CarePlan
    */
  var partOf: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Time period plan covers
    */
  var period: js.UndefOr[Period] = js.undefined
  /**
    * CarePlan replaced by this CarePlan
    */
  var replaces: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * draft | active | suspended | completed | entered-in-error | cancelled | unknown
    */
  var status: code
  /**
    * Who care plan is for
    */
  var subject: Reference
  /**
    * Information considered as part of plan
    */
  var supportingInfo: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Human-friendly name for the CarePlan
    */
  var title: js.UndefOr[String] = js.undefined
}

object CarePlan {
  @scala.inline
  def apply(
    intent: code,
    status: code,
    subject: Reference,
    _description: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _intent: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    _title: Element = null,
    activity: js.Array[CarePlanActivity] = null,
    addresses: js.Array[Reference] = null,
    author: js.Array[Reference] = null,
    basedOn: js.Array[Reference] = null,
    careTeam: js.Array[Reference] = null,
    category: js.Array[CodeableConcept] = null,
    contained: js.Array[Resource] = null,
    context: Reference = null,
    definition: js.Array[Reference] = null,
    description: String = null,
    extension: js.Array[Extension] = null,
    goal: js.Array[Reference] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    note: js.Array[Annotation] = null,
    partOf: js.Array[Reference] = null,
    period: Period = null,
    replaces: js.Array[Reference] = null,
    resourceType: code = null,
    supportingInfo: js.Array[Reference] = null,
    text: Narrative = null,
    title: String = null
  ): CarePlan = {
    val __obj = js.Dynamic.literal(intent = intent, status = status, subject = subject)
    if (_description != null) __obj.updateDynamic("_description")(_description)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_intent != null) __obj.updateDynamic("_intent")(_intent)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (_status != null) __obj.updateDynamic("_status")(_status)
    if (_title != null) __obj.updateDynamic("_title")(_title)
    if (activity != null) __obj.updateDynamic("activity")(activity)
    if (addresses != null) __obj.updateDynamic("addresses")(addresses)
    if (author != null) __obj.updateDynamic("author")(author)
    if (basedOn != null) __obj.updateDynamic("basedOn")(basedOn)
    if (careTeam != null) __obj.updateDynamic("careTeam")(careTeam)
    if (category != null) __obj.updateDynamic("category")(category)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (context != null) __obj.updateDynamic("context")(context)
    if (definition != null) __obj.updateDynamic("definition")(definition)
    if (description != null) __obj.updateDynamic("description")(description)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (goal != null) __obj.updateDynamic("goal")(goal)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (language != null) __obj.updateDynamic("language")(language)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (note != null) __obj.updateDynamic("note")(note)
    if (partOf != null) __obj.updateDynamic("partOf")(partOf)
    if (period != null) __obj.updateDynamic("period")(period)
    if (replaces != null) __obj.updateDynamic("replaces")(replaces)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (supportingInfo != null) __obj.updateDynamic("supportingInfo")(supportingInfo)
    if (text != null) __obj.updateDynamic("text")(text)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[CarePlan]
  }
}

