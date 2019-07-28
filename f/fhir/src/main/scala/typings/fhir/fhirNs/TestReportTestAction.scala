package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A test operation or assert that was performed
  */
trait TestReportTestAction extends BackboneElement {
  /**
    * The assertion performed
    */
  var assert: js.UndefOr[TestReportSetupActionAssert] = js.undefined
  /**
    * The operation performed
    */
  var operation: js.UndefOr[TestReportSetupActionOperation] = js.undefined
}

object TestReportTestAction {
  @scala.inline
  def apply(
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    assert: TestReportSetupActionAssert = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    operation: TestReportSetupActionOperation = null
  ): TestReportTestAction = {
    val __obj = js.Dynamic.literal()
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (assert != null) __obj.updateDynamic("assert")(assert)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (operation != null) __obj.updateDynamic("operation")(operation)
    __obj.asInstanceOf[TestReportTestAction]
  }
}

