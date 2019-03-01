package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A setup operation or assert to perform
  */
trait TestScriptSetupAction extends BackboneElement {
  /**
    * The assertion to perform
    */
  var assert: js.UndefOr[TestScriptSetupActionAssert] = js.undefined
  /**
    * The setup operation to perform
    */
  var operation: js.UndefOr[TestScriptSetupActionOperation] = js.undefined
}

object TestScriptSetupAction {
  @scala.inline
  def apply(
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    assert: TestScriptSetupActionAssert = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null,
    operation: TestScriptSetupActionOperation = null
  ): TestScriptSetupAction = {
    val __obj = js.Dynamic.literal()
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (assert != null) __obj.updateDynamic("assert")(assert)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (operation != null) __obj.updateDynamic("operation")(operation)
    __obj.asInstanceOf[TestScriptSetupAction]
  }
}

