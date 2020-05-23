package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A server push subscription criteria
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait Subscription extends DomainResource {
  /**
    * Contains extended information for property 'criteria'.
    */
  var _criteria: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'end'.
    */
  var _end: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'error'.
    */
  var _error: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'reason'.
    */
  var _reason: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * The channel on which to report matches to the criteria
    */
  var channel: SubscriptionChannel
  /**
    * Contact details for source (e.g. troubleshooting)
    */
  var contact: js.UndefOr[js.Array[ContactPoint]] = js.undefined
  /**
    * Rule for server push criteria
    */
  var criteria: String
  /**
    * When to automatically delete the subscription
    */
  var end: js.UndefOr[instant] = js.undefined
  /**
    * Latest error note
    */
  var error: js.UndefOr[String] = js.undefined
  /**
    * Description of why this subscription was created
    */
  var reason: String
  /**
    * requested | active | error | off
    */
  var status: code
  /**
    * A tag to add to matching resources
    */
  var tag: js.UndefOr[js.Array[Coding]] = js.undefined
}

object Subscription {
  @scala.inline
  def apply(
    channel: SubscriptionChannel,
    criteria: String,
    reason: String,
    status: code,
    _criteria: Element = null,
    _end: Element = null,
    _error: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _reason: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    contact: js.Array[ContactPoint] = null,
    contained: js.Array[Resource] = null,
    end: instant = null,
    error: String = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    resourceType: code = null,
    tag: js.Array[Coding] = null,
    text: Narrative = null
  ): Subscription = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], criteria = criteria.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (_criteria != null) __obj.updateDynamic("_criteria")(_criteria.asInstanceOf[js.Any])
    if (_end != null) __obj.updateDynamic("_end")(_end.asInstanceOf[js.Any])
    if (_error != null) __obj.updateDynamic("_error")(_error.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_reason != null) __obj.updateDynamic("_reason")(_reason.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (contact != null) __obj.updateDynamic("contact")(contact.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subscription]
  }
}

