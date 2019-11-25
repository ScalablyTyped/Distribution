package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * If messaging is supported
  */
trait CapabilityStatementMessaging extends BackboneElement {
  /**
    * Contains extended information for property 'documentation'.
    */
  var _documentation: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'reliableCache'.
    */
  var _reliableCache: js.UndefOr[Element] = js.undefined
  /**
    * Messaging interface behavior details
    */
  var documentation: js.UndefOr[String] = js.undefined
  /**
    * Where messages should be sent
    */
  var endpoint: js.UndefOr[js.Array[CapabilityStatementMessagingEndpoint]] = js.undefined
  /**
    * Declare support for this event
    */
  var event: js.UndefOr[js.Array[CapabilityStatementMessagingEvent]] = js.undefined
  /**
    * Reliable Message Cache Length (min)
    */
  var reliableCache: js.UndefOr[unsignedInt] = js.undefined
  /**
    * Messages supported by this system
    */
  var supportedMessage: js.UndefOr[js.Array[CapabilityStatementMessagingSupportedMessage]] = js.undefined
}

object CapabilityStatementMessaging {
  @scala.inline
  def apply(
    _documentation: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _reliableCache: Element = null,
    documentation: String = null,
    endpoint: js.Array[CapabilityStatementMessagingEndpoint] = null,
    event: js.Array[CapabilityStatementMessagingEvent] = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    reliableCache: Int | Double = null,
    supportedMessage: js.Array[CapabilityStatementMessagingSupportedMessage] = null
  ): CapabilityStatementMessaging = {
    val __obj = js.Dynamic.literal()
    if (_documentation != null) __obj.updateDynamic("_documentation")(_documentation.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_reliableCache != null) __obj.updateDynamic("_reliableCache")(_reliableCache.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (reliableCache != null) __obj.updateDynamic("reliableCache")(reliableCache.asInstanceOf[js.Any])
    if (supportedMessage != null) __obj.updateDynamic("supportedMessage")(supportedMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapabilityStatementMessaging]
  }
}

