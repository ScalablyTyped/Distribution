package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A record of information transmitted from a sender to a receiver
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.fhir.fhirNs.Resource because Already inherited */ trait Communication extends DomainResource {
  /**
    * Contains extended information for property 'notDone'.
    */
  var _notDone: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'received'.
    */
  var _received: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'sent'.
    */
  var _sent: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * Request fulfilled by this communication
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Message category
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Encounter or episode leading to message
    */
  var context: js.UndefOr[Reference] = js.undefined
  /**
    * Instantiates protocol or definition
    */
  var definition: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Unique identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
    * A channel of communication
    */
  var medium: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Communication did not occur
    */
  var notDone: js.UndefOr[Boolean] = js.undefined
  /**
    * Why communication did not occur
    */
  var notDoneReason: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Comments made about the communication
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  /**
    * Part of this action
    */
  var partOf: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Message payload
    */
  var payload: js.UndefOr[js.Array[CommunicationPayload]] = js.undefined
  /**
    * Indication for message
    */
  var reasonCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Why was communication done?
    */
  var reasonReference: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * When received
    */
  var received: js.UndefOr[dateTime] = js.undefined
  /**
    * Message recipient
    */
  var recipient: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Message sender
    */
  var sender: js.UndefOr[Reference] = js.undefined
  /**
    * When sent
    */
  var sent: js.UndefOr[dateTime] = js.undefined
  /**
    * preparation | in-progress | suspended | aborted | completed | entered-in-error
    */
  var status: code
  /**
    * Focus of message
    */
  var subject: js.UndefOr[Reference] = js.undefined
  /**
    * Focal resources
    */
  var topic: js.UndefOr[js.Array[Reference]] = js.undefined
}

object Communication {
  @scala.inline
  def apply(
    status: code,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _notDone: Element = null,
    _received: Element = null,
    _resourceType: Element = null,
    _sent: Element = null,
    _status: Element = null,
    basedOn: js.Array[Reference] = null,
    category: js.Array[CodeableConcept] = null,
    contained: js.Array[Resource] = null,
    context: Reference = null,
    definition: js.Array[Reference] = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    medium: js.Array[CodeableConcept] = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    notDone: js.UndefOr[Boolean] = js.undefined,
    notDoneReason: CodeableConcept = null,
    note: js.Array[Annotation] = null,
    partOf: js.Array[Reference] = null,
    payload: js.Array[CommunicationPayload] = null,
    reasonCode: js.Array[CodeableConcept] = null,
    reasonReference: js.Array[Reference] = null,
    received: dateTime = null,
    recipient: js.Array[Reference] = null,
    resourceType: code = null,
    sender: Reference = null,
    sent: dateTime = null,
    subject: Reference = null,
    text: Narrative = null,
    topic: js.Array[Reference] = null
  ): Communication = {
    val __obj = js.Dynamic.literal(status = status)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_notDone != null) __obj.updateDynamic("_notDone")(_notDone)
    if (_received != null) __obj.updateDynamic("_received")(_received)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (_sent != null) __obj.updateDynamic("_sent")(_sent)
    if (_status != null) __obj.updateDynamic("_status")(_status)
    if (basedOn != null) __obj.updateDynamic("basedOn")(basedOn)
    if (category != null) __obj.updateDynamic("category")(category)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (context != null) __obj.updateDynamic("context")(context)
    if (definition != null) __obj.updateDynamic("definition")(definition)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (language != null) __obj.updateDynamic("language")(language)
    if (medium != null) __obj.updateDynamic("medium")(medium)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (!js.isUndefined(notDone)) __obj.updateDynamic("notDone")(notDone)
    if (notDoneReason != null) __obj.updateDynamic("notDoneReason")(notDoneReason)
    if (note != null) __obj.updateDynamic("note")(note)
    if (partOf != null) __obj.updateDynamic("partOf")(partOf)
    if (payload != null) __obj.updateDynamic("payload")(payload)
    if (reasonCode != null) __obj.updateDynamic("reasonCode")(reasonCode)
    if (reasonReference != null) __obj.updateDynamic("reasonReference")(reasonReference)
    if (received != null) __obj.updateDynamic("received")(received)
    if (recipient != null) __obj.updateDynamic("recipient")(recipient)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (sender != null) __obj.updateDynamic("sender")(sender)
    if (sent != null) __obj.updateDynamic("sent")(sent)
    if (subject != null) __obj.updateDynamic("subject")(subject)
    if (text != null) __obj.updateDynamic("text")(text)
    if (topic != null) __obj.updateDynamic("topic")(topic)
    __obj.asInstanceOf[Communication]
  }
}

