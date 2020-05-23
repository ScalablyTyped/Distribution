package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response(s) to the question
  */
trait QuestionnaireResponseItemAnswer extends BackboneElement {
  /**
    * Contains extended information for property 'valueBoolean'.
    */
  var _valueBoolean: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valueDate'.
    */
  var _valueDate: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valueDateTime'.
    */
  var _valueDateTime: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valueDecimal'.
    */
  var _valueDecimal: js.UndefOr[Element] = js.undefined
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
    * Contains extended information for property 'valueUri'.
    */
  var _valueUri: js.UndefOr[Element] = js.undefined
  /**
    * Nested groups and questions
    */
  var item: js.UndefOr[js.Array[QuestionnaireResponseItem]] = js.undefined
  /**
    * Single-valued answer to the question
    */
  var valueAttachment: js.UndefOr[Attachment] = js.undefined
  /**
    * Single-valued answer to the question
    */
  var valueBoolean: js.UndefOr[Boolean] = js.undefined
  /**
    * Single-valued answer to the question
    */
  var valueCoding: js.UndefOr[Coding] = js.undefined
  /**
    * Single-valued answer to the question
    */
  var valueDate: js.UndefOr[date] = js.undefined
  /**
    * Single-valued answer to the question
    */
  var valueDateTime: js.UndefOr[dateTime] = js.undefined
  /**
    * Single-valued answer to the question
    */
  var valueDecimal: js.UndefOr[decimal] = js.undefined
  /**
    * Single-valued answer to the question
    */
  var valueInteger: js.UndefOr[integer] = js.undefined
  /**
    * Single-valued answer to the question
    */
  var valueQuantity: js.UndefOr[Quantity] = js.undefined
  /**
    * Single-valued answer to the question
    */
  var valueReference: js.UndefOr[Reference] = js.undefined
  /**
    * Single-valued answer to the question
    */
  var valueString: js.UndefOr[String] = js.undefined
  /**
    * Single-valued answer to the question
    */
  var valueTime: js.UndefOr[time] = js.undefined
  /**
    * Single-valued answer to the question
    */
  var valueUri: js.UndefOr[uri] = js.undefined
}

object QuestionnaireResponseItemAnswer {
  @scala.inline
  def apply(
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _valueBoolean: Element = null,
    _valueDate: Element = null,
    _valueDateTime: Element = null,
    _valueDecimal: Element = null,
    _valueInteger: Element = null,
    _valueString: Element = null,
    _valueTime: Element = null,
    _valueUri: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    item: js.Array[QuestionnaireResponseItem] = null,
    modifierExtension: js.Array[Extension] = null,
    valueAttachment: Attachment = null,
    valueBoolean: js.UndefOr[Boolean] = js.undefined,
    valueCoding: Coding = null,
    valueDate: date = null,
    valueDateTime: dateTime = null,
    valueDecimal: js.UndefOr[decimal] = js.undefined,
    valueInteger: js.UndefOr[integer] = js.undefined,
    valueQuantity: Quantity = null,
    valueReference: Reference = null,
    valueString: String = null,
    valueTime: time = null,
    valueUri: uri = null
  ): QuestionnaireResponseItemAnswer = {
    val __obj = js.Dynamic.literal()
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_valueBoolean != null) __obj.updateDynamic("_valueBoolean")(_valueBoolean.asInstanceOf[js.Any])
    if (_valueDate != null) __obj.updateDynamic("_valueDate")(_valueDate.asInstanceOf[js.Any])
    if (_valueDateTime != null) __obj.updateDynamic("_valueDateTime")(_valueDateTime.asInstanceOf[js.Any])
    if (_valueDecimal != null) __obj.updateDynamic("_valueDecimal")(_valueDecimal.asInstanceOf[js.Any])
    if (_valueInteger != null) __obj.updateDynamic("_valueInteger")(_valueInteger.asInstanceOf[js.Any])
    if (_valueString != null) __obj.updateDynamic("_valueString")(_valueString.asInstanceOf[js.Any])
    if (_valueTime != null) __obj.updateDynamic("_valueTime")(_valueTime.asInstanceOf[js.Any])
    if (_valueUri != null) __obj.updateDynamic("_valueUri")(_valueUri.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (valueAttachment != null) __obj.updateDynamic("valueAttachment")(valueAttachment.asInstanceOf[js.Any])
    if (!js.isUndefined(valueBoolean)) __obj.updateDynamic("valueBoolean")(valueBoolean.get.asInstanceOf[js.Any])
    if (valueCoding != null) __obj.updateDynamic("valueCoding")(valueCoding.asInstanceOf[js.Any])
    if (valueDate != null) __obj.updateDynamic("valueDate")(valueDate.asInstanceOf[js.Any])
    if (valueDateTime != null) __obj.updateDynamic("valueDateTime")(valueDateTime.asInstanceOf[js.Any])
    if (!js.isUndefined(valueDecimal)) __obj.updateDynamic("valueDecimal")(valueDecimal.get.asInstanceOf[js.Any])
    if (!js.isUndefined(valueInteger)) __obj.updateDynamic("valueInteger")(valueInteger.get.asInstanceOf[js.Any])
    if (valueQuantity != null) __obj.updateDynamic("valueQuantity")(valueQuantity.asInstanceOf[js.Any])
    if (valueReference != null) __obj.updateDynamic("valueReference")(valueReference.asInstanceOf[js.Any])
    if (valueString != null) __obj.updateDynamic("valueString")(valueString.asInstanceOf[js.Any])
    if (valueTime != null) __obj.updateDynamic("valueTime")(valueTime.asInstanceOf[js.Any])
    if (valueUri != null) __obj.updateDynamic("valueUri")(valueUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuestionnaireResponseItemAnswer]
  }
}

