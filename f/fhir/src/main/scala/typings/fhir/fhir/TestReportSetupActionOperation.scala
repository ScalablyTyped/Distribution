package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The operation to perform
  */
trait TestReportSetupActionOperation extends BackboneElement {
  /**
    * Contains extended information for property 'detail'.
    */
  var _detail: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'message'.
    */
  var _message: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'result'.
    */
  var _result: js.UndefOr[Element] = js.undefined
  /**
    * A link to further details on the result
    */
  var detail: js.UndefOr[uri] = js.undefined
  /**
    * A message associated with the result
    */
  var message: js.UndefOr[markdown] = js.undefined
  /**
    * pass | skip | fail | warning | error
    */
  var result: code
}

object TestReportSetupActionOperation {
  @scala.inline
  def apply(
    result: code,
    _detail: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _message: Element = null,
    _result: Element = null,
    detail: uri = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    message: markdown = null,
    modifierExtension: js.Array[Extension] = null
  ): TestReportSetupActionOperation = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    if (_detail != null) __obj.updateDynamic("_detail")(_detail.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_message != null) __obj.updateDynamic("_message")(_message.asInstanceOf[js.Any])
    if (_result != null) __obj.updateDynamic("_result")(_result.asInstanceOf[js.Any])
    if (detail != null) __obj.updateDynamic("detail")(detail.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestReportSetupActionOperation]
  }
}

