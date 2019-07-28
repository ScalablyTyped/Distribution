package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Declare support for this event
  */
trait CapabilityStatementMessagingEvent extends BackboneElement {
  /**
    * Contains extended information for property 'category'.
    */
  var _category: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'documentation'.
    */
  var _documentation: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'focus'.
    */
  var _focus: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'mode'.
    */
  var _mode: js.UndefOr[Element] = js.undefined
  /**
    * Consequence | Currency | Notification
    */
  var category: js.UndefOr[code] = js.undefined
  /**
    * Event type
    */
  var code: Coding
  /**
    * Endpoint-specific event documentation
    */
  var documentation: js.UndefOr[String] = js.undefined
  /**
    * Resource that's focus of message
    */
  var focus: code
  /**
    * sender | receiver
    */
  var mode: code
  /**
    * Profile that describes the request
    */
  var request: Reference
  /**
    * Profile that describes the response
    */
  var response: Reference
}

object CapabilityStatementMessagingEvent {
  @scala.inline
  def apply(
    code: Coding,
    focus: code,
    mode: code,
    request: Reference,
    response: Reference,
    _category: Element = null,
    _documentation: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _focus: Element = null,
    _id: Element = null,
    _mode: Element = null,
    category: code = null,
    documentation: String = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null
  ): CapabilityStatementMessagingEvent = {
    val __obj = js.Dynamic.literal(code = code, focus = focus, mode = mode, request = request, response = response)
    if (_category != null) __obj.updateDynamic("_category")(_category)
    if (_documentation != null) __obj.updateDynamic("_documentation")(_documentation)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_focus != null) __obj.updateDynamic("_focus")(_focus)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_mode != null) __obj.updateDynamic("_mode")(_mode)
    if (category != null) __obj.updateDynamic("category")(category)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    __obj.asInstanceOf[CapabilityStatementMessagingEvent]
  }
}

