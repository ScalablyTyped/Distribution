package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A server push subscription criteria
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- fhirLib.fhirNs.Resource because Already inherited */ trait Subscription extends DomainResource {
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
  var criteria: java.lang.String
  /**
    * When to automatically delete the subscription
    */
  var end: js.UndefOr[instant] = js.undefined
  /**
    * Latest error note
    */
  var error: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Description of why this subscription was created
    */
  var reason: java.lang.String
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
    criteria: java.lang.String,
    reason: java.lang.String,
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
    error: java.lang.String = null,
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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("channel")(channel)
    __obj.updateDynamic("criteria")(criteria)
    __obj.updateDynamic("reason")(reason)
    __obj.updateDynamic("status")(status)
    if (_criteria != null) __obj.updateDynamic("_criteria")(_criteria)
    if (_end != null) __obj.updateDynamic("_end")(_end)
    if (_error != null) __obj.updateDynamic("_error")(_error)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_reason != null) __obj.updateDynamic("_reason")(_reason)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (_status != null) __obj.updateDynamic("_status")(_status)
    if (contact != null) __obj.updateDynamic("contact")(contact)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (end != null) __obj.updateDynamic("end")(end)
    if (error != null) __obj.updateDynamic("error")(error)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (id != null) __obj.updateDynamic("id")(id)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (language != null) __obj.updateDynamic("language")(language)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Subscription]
  }
}

