package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Assert rule used within the test script
  */
trait TestScriptRule extends BackboneElement {
  /**
    * Rule parameter template
    */
  var param: js.UndefOr[js.Array[TestScriptRuleParam]] = js.undefined
  /**
    * Assert rule resource reference
    */
  var resource: Reference
}

object TestScriptRule {
  @scala.inline
  def apply(
    resource: Reference,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    param: js.Array[TestScriptRuleParam] = null
  ): TestScriptRule = {
    val __obj = js.Dynamic.literal(resource = resource)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (param != null) __obj.updateDynamic("param")(param)
    __obj.asInstanceOf[TestScriptRule]
  }
}

