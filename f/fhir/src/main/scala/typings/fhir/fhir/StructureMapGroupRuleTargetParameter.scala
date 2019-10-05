package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Parameters to the transform
  */
trait StructureMapGroupRuleTargetParameter extends BackboneElement {
  /**
    * Contains extended information for property 'valueBoolean'.
    */
  var _valueBoolean: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valueDecimal'.
    */
  var _valueDecimal: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valueId'.
    */
  var _valueId: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valueInteger'.
    */
  var _valueInteger: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valueString'.
    */
  var _valueString: js.UndefOr[Element] = js.undefined
  /**
    * Parameter value - variable or literal
    */
  var valueBoolean: js.UndefOr[Boolean] = js.undefined
  /**
    * Parameter value - variable or literal
    */
  var valueDecimal: js.UndefOr[decimal] = js.undefined
  /**
    * Parameter value - variable or literal
    */
  var valueId: js.UndefOr[id] = js.undefined
  /**
    * Parameter value - variable or literal
    */
  var valueInteger: js.UndefOr[integer] = js.undefined
  /**
    * Parameter value - variable or literal
    */
  var valueString: js.UndefOr[String] = js.undefined
}

object StructureMapGroupRuleTargetParameter {
  @scala.inline
  def apply(
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _valueBoolean: Element = null,
    _valueDecimal: Element = null,
    _valueId: Element = null,
    _valueInteger: Element = null,
    _valueString: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    valueBoolean: js.UndefOr[Boolean] = js.undefined,
    valueDecimal: Int | Double = null,
    valueId: id = null,
    valueInteger: Int | Double = null,
    valueString: String = null
  ): StructureMapGroupRuleTargetParameter = {
    val __obj = js.Dynamic.literal()
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_valueBoolean != null) __obj.updateDynamic("_valueBoolean")(_valueBoolean)
    if (_valueDecimal != null) __obj.updateDynamic("_valueDecimal")(_valueDecimal)
    if (_valueId != null) __obj.updateDynamic("_valueId")(_valueId)
    if (_valueInteger != null) __obj.updateDynamic("_valueInteger")(_valueInteger)
    if (_valueString != null) __obj.updateDynamic("_valueString")(_valueString)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (!js.isUndefined(valueBoolean)) __obj.updateDynamic("valueBoolean")(valueBoolean)
    if (valueDecimal != null) __obj.updateDynamic("valueDecimal")(valueDecimal.asInstanceOf[js.Any])
    if (valueId != null) __obj.updateDynamic("valueId")(valueId)
    if (valueInteger != null) __obj.updateDynamic("valueInteger")(valueInteger.asInstanceOf[js.Any])
    if (valueString != null) __obj.updateDynamic("valueString")(valueString)
    __obj.asInstanceOf[StructureMapGroupRuleTargetParameter]
  }
}

