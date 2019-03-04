package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Property value for the concept
  */
trait CodeSystemConceptProperty extends BackboneElement {
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valueBoolean'.
    */
  var _valueBoolean: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valueCode'.
    */
  var _valueCode: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valueDateTime'.
    */
  var _valueDateTime: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valueInteger'.
    */
  var _valueInteger: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valueString'.
    */
  var _valueString: js.UndefOr[Element] = js.undefined
  /**
    * Reference to CodeSystem.property.code
    */
  var code: code
  /**
    * Value of the property for this concept
    */
  var valueBoolean: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Value of the property for this concept
    */
  var valueCode: js.UndefOr[code] = js.undefined
  /**
    * Value of the property for this concept
    */
  var valueCoding: js.UndefOr[Coding] = js.undefined
  /**
    * Value of the property for this concept
    */
  var valueDateTime: js.UndefOr[dateTime] = js.undefined
  /**
    * Value of the property for this concept
    */
  var valueInteger: js.UndefOr[integer] = js.undefined
  /**
    * Value of the property for this concept
    */
  var valueString: js.UndefOr[java.lang.String] = js.undefined
}

object CodeSystemConceptProperty {
  @scala.inline
  def apply(
    code: code,
    _code: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _valueBoolean: Element = null,
    _valueCode: Element = null,
    _valueDateTime: Element = null,
    _valueInteger: Element = null,
    _valueString: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null,
    valueBoolean: js.UndefOr[scala.Boolean] = js.undefined,
    valueCode: code = null,
    valueCoding: Coding = null,
    valueDateTime: dateTime = null,
    valueInteger: js.UndefOr[integer] = js.undefined,
    valueString: java.lang.String = null
  ): CodeSystemConceptProperty = {
    val __obj = js.Dynamic.literal(code = code)
    if (_code != null) __obj.updateDynamic("_code")(_code)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_valueBoolean != null) __obj.updateDynamic("_valueBoolean")(_valueBoolean)
    if (_valueCode != null) __obj.updateDynamic("_valueCode")(_valueCode)
    if (_valueDateTime != null) __obj.updateDynamic("_valueDateTime")(_valueDateTime)
    if (_valueInteger != null) __obj.updateDynamic("_valueInteger")(_valueInteger)
    if (_valueString != null) __obj.updateDynamic("_valueString")(_valueString)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (!js.isUndefined(valueBoolean)) __obj.updateDynamic("valueBoolean")(valueBoolean)
    if (valueCode != null) __obj.updateDynamic("valueCode")(valueCode)
    if (valueCoding != null) __obj.updateDynamic("valueCoding")(valueCoding)
    if (valueDateTime != null) __obj.updateDynamic("valueDateTime")(valueDateTime)
    if (!js.isUndefined(valueInteger)) __obj.updateDynamic("valueInteger")(valueInteger)
    if (valueString != null) __obj.updateDynamic("valueString")(valueString)
    __obj.asInstanceOf[CodeSystemConceptProperty]
  }
}

