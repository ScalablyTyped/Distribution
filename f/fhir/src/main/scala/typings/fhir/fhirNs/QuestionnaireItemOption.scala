package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permitted answer
  */
trait QuestionnaireItemOption extends BackboneElement {
  /**
    * Contains extended information for property 'valueDate'.
    */
  var _valueDate: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valueInteger'.
    */
  var _valueInteger: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valueString'.
    */
  var _valueString: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valueTime'.
    */
  var _valueTime: js.UndefOr[Element] = js.undefined
  /**
    * Answer value
    */
  var valueCoding: js.UndefOr[Coding] = js.undefined
  /**
    * Answer value
    */
  var valueDate: js.UndefOr[date] = js.undefined
  /**
    * Answer value
    */
  var valueInteger: js.UndefOr[integer] = js.undefined
  /**
    * Answer value
    */
  var valueString: js.UndefOr[String] = js.undefined
  /**
    * Answer value
    */
  var valueTime: js.UndefOr[time] = js.undefined
}

object QuestionnaireItemOption {
  @scala.inline
  def apply(
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _valueDate: Element = null,
    _valueInteger: Element = null,
    _valueString: Element = null,
    _valueTime: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    valueCoding: Coding = null,
    valueDate: date = null,
    valueInteger: js.UndefOr[integer] = js.undefined,
    valueString: String = null,
    valueTime: time = null
  ): QuestionnaireItemOption = {
    val __obj = js.Dynamic.literal()
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_valueDate != null) __obj.updateDynamic("_valueDate")(_valueDate)
    if (_valueInteger != null) __obj.updateDynamic("_valueInteger")(_valueInteger)
    if (_valueString != null) __obj.updateDynamic("_valueString")(_valueString)
    if (_valueTime != null) __obj.updateDynamic("_valueTime")(_valueTime)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (valueCoding != null) __obj.updateDynamic("valueCoding")(valueCoding)
    if (valueDate != null) __obj.updateDynamic("valueDate")(valueDate)
    if (!js.isUndefined(valueInteger)) __obj.updateDynamic("valueInteger")(valueInteger)
    if (valueString != null) __obj.updateDynamic("valueString")(valueString)
    if (valueTime != null) __obj.updateDynamic("valueTime")(valueTime)
    __obj.asInstanceOf[QuestionnaireItemOption]
  }
}

