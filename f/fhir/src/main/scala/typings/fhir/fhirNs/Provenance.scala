package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Who, What, When for a set of resources
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.fhir.fhirNs.Resource because Already inherited */ trait Provenance extends DomainResource {
  /**
    * Contains extended information for property 'policy'.
    */
  var _policy: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Contains extended information for property 'recorded'.
    */
  var _recorded: js.UndefOr[Element] = js.undefined
  /**
    * Activity that occurred
    */
  var activity: js.UndefOr[Coding] = js.undefined
  /**
    * Actor involved
    */
  var agent: js.Array[ProvenanceAgent]
  /**
    * An entity used in this activity
    */
  var entity: js.UndefOr[js.Array[ProvenanceEntity]] = js.undefined
  /**
    * Where the activity occurred, if relevant
    */
  var location: js.UndefOr[Reference] = js.undefined
  /**
    * When the activity occurred
    */
  var period: js.UndefOr[Period] = js.undefined
  /**
    * Policy or plan the activity was defined by
    */
  var policy: js.UndefOr[js.Array[uri]] = js.undefined
  /**
    * Reason the activity is occurring
    */
  var reason: js.UndefOr[js.Array[Coding]] = js.undefined
  /**
    * When the activity was recorded / updated
    */
  var recorded: instant
  /**
    * Signature on target
    */
  var signature: js.UndefOr[js.Array[Signature]] = js.undefined
  /**
    * Target Reference(s) (usually version specific)
    */
  var target: js.Array[Reference]
}

object Provenance {
  @scala.inline
  def apply(
    agent: js.Array[ProvenanceAgent],
    recorded: instant,
    target: js.Array[Reference],
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _policy: js.Array[Element] = null,
    _recorded: Element = null,
    _resourceType: Element = null,
    activity: Coding = null,
    contained: js.Array[Resource] = null,
    entity: js.Array[ProvenanceEntity] = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    implicitRules: uri = null,
    language: code = null,
    location: Reference = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    period: Period = null,
    policy: js.Array[uri] = null,
    reason: js.Array[Coding] = null,
    resourceType: code = null,
    signature: js.Array[Signature] = null,
    text: Narrative = null
  ): Provenance = {
    val __obj = js.Dynamic.literal(agent = agent, recorded = recorded, target = target)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_policy != null) __obj.updateDynamic("_policy")(_policy)
    if (_recorded != null) __obj.updateDynamic("_recorded")(_recorded)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (activity != null) __obj.updateDynamic("activity")(activity)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (entity != null) __obj.updateDynamic("entity")(entity)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (id != null) __obj.updateDynamic("id")(id)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (language != null) __obj.updateDynamic("language")(language)
    if (location != null) __obj.updateDynamic("location")(location)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (period != null) __obj.updateDynamic("period")(period)
    if (policy != null) __obj.updateDynamic("policy")(policy)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (signature != null) __obj.updateDynamic("signature")(signature)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Provenance]
  }
}

