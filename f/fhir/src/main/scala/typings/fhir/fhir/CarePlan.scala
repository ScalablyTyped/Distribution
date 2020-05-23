package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Healthcare plan for patient or group
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait CarePlan extends DomainResource {
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
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    if (_description != null) __obj.updateDynamic("_description")(_description.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_intent != null) __obj.updateDynamic("_intent")(_intent.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (_title != null) __obj.updateDynamic("_title")(_title.asInstanceOf[js.Any])
    if (activity != null) __obj.updateDynamic("activity")(activity.asInstanceOf[js.Any])
    if (addresses != null) __obj.updateDynamic("addresses")(addresses.asInstanceOf[js.Any])
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (basedOn != null) __obj.updateDynamic("basedOn")(basedOn.asInstanceOf[js.Any])
    if (careTeam != null) __obj.updateDynamic("careTeam")(careTeam.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (definition != null) __obj.updateDynamic("definition")(definition.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (goal != null) __obj.updateDynamic("goal")(goal.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    if (partOf != null) __obj.updateDynamic("partOf")(partOf.asInstanceOf[js.Any])
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    if (replaces != null) __obj.updateDynamic("replaces")(replaces.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (supportingInfo != null) __obj.updateDynamic("supportingInfo")(supportingInfo.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CarePlan]
  }
}

