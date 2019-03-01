package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Each operation can have one or more header elements
  */
trait TestScriptSetupActionOperationRequestHeader extends BackboneElement {
  /**
    * Contains extended information for property 'field'.
    */
  var _field: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'value'.
    */
  var _value: js.UndefOr[Element] = js.undefined
  /**
    * HTTP header field name
    */
  var field: java.lang.String
  /**
    * HTTP headerfield value
    */
  var value: java.lang.String
}

object TestScriptSetupActionOperationRequestHeader {
  @scala.inline
  def apply(
    field: java.lang.String,
    value: java.lang.String,
    _fhir_comments: js.Array[Element] = null,
    _field: Element = null,
    _id: Element = null,
    _value: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null
  ): TestScriptSetupActionOperationRequestHeader = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("field")(field)
    __obj.updateDynamic("value")(value)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_field != null) __obj.updateDynamic("_field")(_field)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_value != null) __obj.updateDynamic("_value")(_value)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    __obj.asInstanceOf[TestScriptSetupActionOperationRequestHeader]
  }
}

