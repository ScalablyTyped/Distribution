package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Property value for the concept
  */
@js.native
trait CodeSystemConceptProperty extends BackboneElement {
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueBoolean'.
    */
  var _valueBoolean: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueCode'.
    */
  var _valueCode: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueDateTime'.
    */
  var _valueDateTime: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueInteger'.
    */
  var _valueInteger: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueString'.
    */
  var _valueString: js.UndefOr[Element] = js.native
  /**
    * Reference to CodeSystem.property.code
    */
  var code: typings.fhir.fhir.code = js.native
  /**
    * Value of the property for this concept
    */
  var valueBoolean: js.UndefOr[Boolean] = js.native
  /**
    * Value of the property for this concept
    */
  var valueCode: js.UndefOr[code] = js.native
  /**
    * Value of the property for this concept
    */
  var valueCoding: js.UndefOr[Coding] = js.native
  /**
    * Value of the property for this concept
    */
  var valueDateTime: js.UndefOr[dateTime] = js.native
  /**
    * Value of the property for this concept
    */
  var valueInteger: js.UndefOr[integer] = js.native
  /**
    * Value of the property for this concept
    */
  var valueString: js.UndefOr[String] = js.native
}

object CodeSystemConceptProperty {
  @scala.inline
  def apply(code: code): CodeSystemConceptProperty = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeSystemConceptProperty]
  }
  @scala.inline
  implicit class CodeSystemConceptPropertyOps[Self <: CodeSystemConceptProperty] (val x: Self) extends AnyVal {
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
    def setCode(value: code): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def set_code(value: Element): Self = this.set("_code", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_code: Self = this.set("_code", js.undefined)
    @scala.inline
    def set_valueBoolean(value: Element): Self = this.set("_valueBoolean", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_valueBoolean: Self = this.set("_valueBoolean", js.undefined)
    @scala.inline
    def set_valueCode(value: Element): Self = this.set("_valueCode", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_valueCode: Self = this.set("_valueCode", js.undefined)
    @scala.inline
    def set_valueDateTime(value: Element): Self = this.set("_valueDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_valueDateTime: Self = this.set("_valueDateTime", js.undefined)
    @scala.inline
    def set_valueInteger(value: Element): Self = this.set("_valueInteger", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_valueInteger: Self = this.set("_valueInteger", js.undefined)
    @scala.inline
    def set_valueString(value: Element): Self = this.set("_valueString", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_valueString: Self = this.set("_valueString", js.undefined)
    @scala.inline
    def setValueBoolean(value: Boolean): Self = this.set("valueBoolean", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueBoolean: Self = this.set("valueBoolean", js.undefined)
    @scala.inline
    def setValueCode(value: code): Self = this.set("valueCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueCode: Self = this.set("valueCode", js.undefined)
    @scala.inline
    def setValueCoding(value: Coding): Self = this.set("valueCoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueCoding: Self = this.set("valueCoding", js.undefined)
    @scala.inline
    def setValueDateTime(value: dateTime): Self = this.set("valueDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueDateTime: Self = this.set("valueDateTime", js.undefined)
    @scala.inline
    def setValueInteger(value: integer): Self = this.set("valueInteger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueInteger: Self = this.set("valueInteger", js.undefined)
    @scala.inline
    def setValueString(value: String): Self = this.set("valueString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueString: Self = this.set("valueString", js.undefined)
  }
  
}

