package typings.fhir.fhir

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
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    if (_category != null) __obj.updateDynamic("_category")(_category.asInstanceOf[js.Any])
    if (_documentation != null) __obj.updateDynamic("_documentation")(_documentation.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_focus != null) __obj.updateDynamic("_focus")(_focus.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_mode != null) __obj.updateDynamic("_mode")(_mode.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapabilityStatementMessagingEvent]
  }
}

