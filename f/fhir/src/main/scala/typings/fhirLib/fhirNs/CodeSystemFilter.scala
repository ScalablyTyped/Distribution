package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Filter that can be used in a value set
  */
trait CodeSystemFilter extends BackboneElement {
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'operator'.
    */
  var _operator: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Contains extended information for property 'value'.
    */
  var _value: js.UndefOr[Element] = js.undefined
  /**
    * Code that identifies the filter
    */
  var code: fhirLib.fhirNs.code
  /**
    * How or why the filter is used
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Operators that can be used with filter
    */
  var operator: js.Array[code]
  /**
    * What to use for the value
    */
  var value: java.lang.String
}

object CodeSystemFilter {
  @scala.inline
  def apply(
    code: code,
    operator: js.Array[code],
    value: java.lang.String,
    _code: Element = null,
    _description: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _operator: js.Array[Element] = null,
    _value: Element = null,
    description: java.lang.String = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null
  ): CodeSystemFilter = {
    val __obj = js.Dynamic.literal(code = code, operator = operator, value = value)
    if (_code != null) __obj.updateDynamic("_code")(_code)
    if (_description != null) __obj.updateDynamic("_description")(_description)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_operator != null) __obj.updateDynamic("_operator")(_operator)
    if (_value != null) __obj.updateDynamic("_value")(_value)
    if (description != null) __obj.updateDynamic("description")(description)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    __obj.asInstanceOf[CodeSystemFilter]
  }
}

