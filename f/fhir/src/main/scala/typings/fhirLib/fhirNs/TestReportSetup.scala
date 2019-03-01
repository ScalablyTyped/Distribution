package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The results of the series of required setup operations before the tests were executed
  */
trait TestReportSetup extends BackboneElement {
  /**
    * A setup operation or assert that was executed
    */
  var action: js.Array[TestReportSetupAction]
}

object TestReportSetup {
  @scala.inline
  def apply(
    action: js.Array[TestReportSetupAction],
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null
  ): TestReportSetup = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("action")(action)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    __obj.asInstanceOf[TestReportSetup]
  }
}

