package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response(s) to the question
  */
@js.native
trait QuestionnaireResponseItemAnswer extends BackboneElement {
  /**
    * Contains extended information for property 'valueBoolean'.
    */
  var _valueBoolean: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueDate'.
    */
  var _valueDate: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueDateTime'.
    */
  var _valueDateTime: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueDecimal'.
    */
  var _valueDecimal: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueInteger'.
    */
  var _valueInteger: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueString'.
    */
  var _valueString: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueTime'.
    */
  var _valueTime: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueUri'.
    */
  var _valueUri: js.UndefOr[Element] = js.native
  /**
    * Nested groups and questions
    */
  var item: js.UndefOr[js.Array[QuestionnaireResponseItem]] = js.native
  /**
    * Single-valued answer to the question
    */
  var valueAttachment: js.UndefOr[Attachment] = js.native
  /**
    * Single-valued answer to the question
    */
  var valueBoolean: js.UndefOr[Boolean] = js.native
  /**
    * Single-valued answer to the question
    */
  var valueCoding: js.UndefOr[Coding] = js.native
  /**
    * Single-valued answer to the question
    */
  var valueDate: js.UndefOr[date] = js.native
  /**
    * Single-valued answer to the question
    */
  var valueDateTime: js.UndefOr[dateTime] = js.native
  /**
    * Single-valued answer to the question
    */
  var valueDecimal: js.UndefOr[decimal] = js.native
  /**
    * Single-valued answer to the question
    */
  var valueInteger: js.UndefOr[integer] = js.native
  /**
    * Single-valued answer to the question
    */
  var valueQuantity: js.UndefOr[Quantity] = js.native
  /**
    * Single-valued answer to the question
    */
  var valueReference: js.UndefOr[Reference] = js.native
  /**
    * Single-valued answer to the question
    */
  var valueString: js.UndefOr[String] = js.native
  /**
    * Single-valued answer to the question
    */
  var valueTime: js.UndefOr[time] = js.native
  /**
    * Single-valued answer to the question
    */
  var valueUri: js.UndefOr[uri] = js.native
}

object QuestionnaireResponseItemAnswer {
  @scala.inline
  def apply(): QuestionnaireResponseItemAnswer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuestionnaireResponseItemAnswer]
  }
  @scala.inline
  implicit class QuestionnaireResponseItemAnswerOps[Self <: QuestionnaireResponseItemAnswer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_valueBoolean(value: Element): Self = this.set("_valueBoolean", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_valueBoolean: Self = this.set("_valueBoolean", js.undefined)
    @scala.inline
    def set_valueDate(value: Element): Self = this.set("_valueDate", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_valueDate: Self = this.set("_valueDate", js.undefined)
    @scala.inline
    def set_valueDateTime(value: Element): Self = this.set("_valueDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_valueDateTime: Self = this.set("_valueDateTime", js.undefined)
    @scala.inline
    def set_valueDecimal(value: Element): Self = this.set("_valueDecimal", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_valueDecimal: Self = this.set("_valueDecimal", js.undefined)
    @scala.inline
    def set_valueInteger(value: Element): Self = this.set("_valueInteger", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_valueInteger: Self = this.set("_valueInteger", js.undefined)
    @scala.inline
    def set_valueString(value: Element): Self = this.set("_valueString", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_valueString: Self = this.set("_valueString", js.undefined)
    @scala.inline
    def set_valueTime(value: Element): Self = this.set("_valueTime", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_valueTime: Self = this.set("_valueTime", js.undefined)
    @scala.inline
    def set_valueUri(value: Element): Self = this.set("_valueUri", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_valueUri: Self = this.set("_valueUri", js.undefined)
    @scala.inline
    def setItemVarargs(value: QuestionnaireResponseItem*): Self = this.set("item", js.Array(value :_*))
    @scala.inline
    def setItem(value: js.Array[QuestionnaireResponseItem]): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
    @scala.inline
    def setValueAttachment(value: Attachment): Self = this.set("valueAttachment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueAttachment: Self = this.set("valueAttachment", js.undefined)
    @scala.inline
    def setValueBoolean(value: Boolean): Self = this.set("valueBoolean", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueBoolean: Self = this.set("valueBoolean", js.undefined)
    @scala.inline
    def setValueCoding(value: Coding): Self = this.set("valueCoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueCoding: Self = this.set("valueCoding", js.undefined)
    @scala.inline
    def setValueDate(value: date): Self = this.set("valueDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueDate: Self = this.set("valueDate", js.undefined)
    @scala.inline
    def setValueDateTime(value: dateTime): Self = this.set("valueDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueDateTime: Self = this.set("valueDateTime", js.undefined)
    @scala.inline
    def setValueDecimal(value: decimal): Self = this.set("valueDecimal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueDecimal: Self = this.set("valueDecimal", js.undefined)
    @scala.inline
    def setValueInteger(value: integer): Self = this.set("valueInteger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueInteger: Self = this.set("valueInteger", js.undefined)
    @scala.inline
    def setValueQuantity(value: Quantity): Self = this.set("valueQuantity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueQuantity: Self = this.set("valueQuantity", js.undefined)
    @scala.inline
    def setValueReference(value: Reference): Self = this.set("valueReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueReference: Self = this.set("valueReference", js.undefined)
    @scala.inline
    def setValueString(value: String): Self = this.set("valueString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueString: Self = this.set("valueString", js.undefined)
    @scala.inline
    def setValueTime(value: time): Self = this.set("valueTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueTime: Self = this.set("valueTime", js.undefined)
    @scala.inline
    def setValueUri(value: uri): Self = this.set("valueUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueUri: Self = this.set("valueUri", js.undefined)
  }
  
}

