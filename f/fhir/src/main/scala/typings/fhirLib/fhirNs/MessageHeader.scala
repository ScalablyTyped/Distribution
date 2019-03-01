package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A resource that describes a message that is exchanged between systems
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- fhirLib.fhirNs.Resource because Already inherited */ trait MessageHeader extends DomainResource {
  /**
    * Contains extended information for property 'timestamp'.
    */
  var _timestamp: js.UndefOr[Element] = js.undefined
  /**
    * The source of the decision
    */
  var author: js.UndefOr[Reference] = js.undefined
  /**
    * Message destination application(s)
    */
  var destination: js.UndefOr[js.Array[MessageHeaderDestination]] = js.undefined
  /**
    * The source of the data entry
    */
  var enterer: js.UndefOr[Reference] = js.undefined
  /**
    * Code for the event this message represents
    */
  var event: Coding
  /**
    * The actual content of the message
    */
  var focus: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Cause of event
    */
  var reason: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Intended "real-world" recipient for the data
    */
  var receiver: js.UndefOr[Reference] = js.undefined
  /**
    * If this is a reply to prior message
    */
  var response: js.UndefOr[MessageHeaderResponse] = js.undefined
  /**
    * Final responsibility for event
    */
  var responsible: js.UndefOr[Reference] = js.undefined
  /**
    * Real world sender of the message
    */
  var sender: js.UndefOr[Reference] = js.undefined
  /**
    * Message source application
    */
  var source: MessageHeaderSource
  /**
    * Time that the message was sent
    */
  var timestamp: instant
}

object MessageHeader {
  @scala.inline
  def apply(
    event: Coding,
    source: MessageHeaderSource,
    timestamp: instant,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    _timestamp: Element = null,
    author: Reference = null,
    contained: js.Array[Resource] = null,
    destination: js.Array[MessageHeaderDestination] = null,
    enterer: Reference = null,
    extension: js.Array[Extension] = null,
    focus: js.Array[Reference] = null,
    id: id = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    reason: CodeableConcept = null,
    receiver: Reference = null,
    resourceType: code = null,
    response: MessageHeaderResponse = null,
    responsible: Reference = null,
    sender: Reference = null,
    text: Narrative = null
  ): MessageHeader = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("event")(event)
    __obj.updateDynamic("source")(source)
    __obj.updateDynamic("timestamp")(timestamp)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (_timestamp != null) __obj.updateDynamic("_timestamp")(_timestamp)
    if (author != null) __obj.updateDynamic("author")(author)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (destination != null) __obj.updateDynamic("destination")(destination)
    if (enterer != null) __obj.updateDynamic("enterer")(enterer)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (focus != null) __obj.updateDynamic("focus")(focus)
    if (id != null) __obj.updateDynamic("id")(id)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (language != null) __obj.updateDynamic("language")(language)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    if (receiver != null) __obj.updateDynamic("receiver")(receiver)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (response != null) __obj.updateDynamic("response")(response)
    if (responsible != null) __obj.updateDynamic("responsible")(responsible)
    if (sender != null) __obj.updateDynamic("sender")(sender)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[MessageHeader]
  }
}

