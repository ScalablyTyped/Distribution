package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The assertion to perform
  */
trait TestReportSetupActionAssert extends BackboneElement {
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
  var detail: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A message associated with the result
    */
  var message: js.UndefOr[markdown] = js.undefined
  /**
    * pass | skip | fail | warning | error
    */
  var result: code
}

object TestReportSetupActionAssert {
  @scala.inline
  def apply(
    result: code,
    _detail: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _message: Element = null,
    _result: Element = null,
    detail: java.lang.String = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    message: markdown = null,
    modifierExtension: js.Array[Extension] = null
  ): TestReportSetupActionAssert = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("result")(result)
    if (_detail != null) __obj.updateDynamic("_detail")(_detail)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_message != null) __obj.updateDynamic("_message")(_message)
    if (_result != null) __obj.updateDynamic("_result")(_result)
    if (detail != null) __obj.updateDynamic("detail")(detail)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (message != null) __obj.updateDynamic("message")(message)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    __obj.asInstanceOf[TestReportSetupActionAssert]
  }
}

