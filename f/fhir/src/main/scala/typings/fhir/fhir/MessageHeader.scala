package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A resource that describes a message that is exchanged between systems
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait MessageHeader extends DomainResource {
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
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_timestamp != null) __obj.updateDynamic("_timestamp")(_timestamp.asInstanceOf[js.Any])
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (enterer != null) __obj.updateDynamic("enterer")(enterer.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (focus != null) __obj.updateDynamic("focus")(focus.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (receiver != null) __obj.updateDynamic("receiver")(receiver.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    if (responsible != null) __obj.updateDynamic("responsible")(responsible.asInstanceOf[js.Any])
    if (sender != null) __obj.updateDynamic("sender")(sender.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageHeader]
  }
}

