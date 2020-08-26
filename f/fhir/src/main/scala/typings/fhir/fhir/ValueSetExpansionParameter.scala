package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Parameter that controlled the expansion process
  */
@js.native
trait ValueSetExpansionParameter extends BackboneElement {
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueBoolean'.
    */
  var _valueBoolean: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueCode'.
    */
  var _valueCode: js.UndefOr[Element] = js.native
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
    * Contains extended information for property 'valueUri'.
    */
  var _valueUri: js.UndefOr[Element] = js.native
  /**
    * Name as assigned by the server
    */
  var name: String = js.native
  /**
    * Value of the named parameter
    */
  var valueBoolean: js.UndefOr[Boolean] = js.native
  /**
    * Value of the named parameter
    */
  var valueCode: js.UndefOr[code] = js.native
  /**
    * Value of the named parameter
    */
  var valueDecimal: js.UndefOr[decimal] = js.native
  /**
    * Value of the named parameter
    */
  var valueInteger: js.UndefOr[integer] = js.native
  /**
    * Value of the named parameter
    */
  var valueString: js.UndefOr[String] = js.native
  /**
    * Value of the named parameter
    */
  var valueUri: js.UndefOr[uri] = js.native
}

object ValueSetExpansionParameter {
  @scala.inline
  def apply(name: String): ValueSetExpansionParameter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueSetExpansionParameter]
  }
  @scala.inline
  implicit class ValueSetExpansionParameterOps[Self <: ValueSetExpansionParameter] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def set_name(value: Element): Self = this.set("_name", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_name: Self = this.set("_name", js.undefined)
    @scala.inline
    def set_valueBoolean(value: Element): Self = this.set("_valueBoolean", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_valueBoolean: Self = this.set("_valueBoolean", js.undefined)
    @scala.inline
    def set_valueCode(value: Element): Self = this.set("_valueCode", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_valueCode: Self = this.set("_valueCode", js.undefined)
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
    def set_valueUri(value: Element): Self = this.set("_valueUri", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_valueUri: Self = this.set("_valueUri", js.undefined)
    @scala.inline
    def setValueBoolean(value: Boolean): Self = this.set("valueBoolean", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueBoolean: Self = this.set("valueBoolean", js.undefined)
    @scala.inline
    def setValueCode(value: code): Self = this.set("valueCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueCode: Self = this.set("valueCode", js.undefined)
    @scala.inline
    def setValueDecimal(value: decimal): Self = this.set("valueDecimal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueDecimal: Self = this.set("valueDecimal", js.undefined)
    @scala.inline
    def setValueInteger(value: integer): Self = this.set("valueInteger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueInteger: Self = this.set("valueInteger", js.undefined)
    @scala.inline
    def setValueString(value: String): Self = this.set("valueString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueString: Self = this.set("valueString", js.undefined)
    @scala.inline
    def setValueUri(value: uri): Self = this.set("valueUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueUri: Self = this.set("valueUri", js.undefined)
  }
  
}

