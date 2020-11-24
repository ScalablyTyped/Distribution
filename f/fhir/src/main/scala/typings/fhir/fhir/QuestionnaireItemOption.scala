package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Permitted answer
  */
@js.native
trait QuestionnaireItemOption extends BackboneElement {
  
  /**
    * Contains extended information for property 'valueDate'.
    */
  var _valueDate: js.UndefOr[Element] = js.native
  
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
    * Answer value
    */
  var valueCoding: js.UndefOr[Coding] = js.native
  
  /**
    * Answer value
    */
  var valueDate: js.UndefOr[date] = js.native
  
  /**
    * Answer value
    */
  var valueInteger: js.UndefOr[integer] = js.native
  
  /**
    * Answer value
    */
  var valueString: js.UndefOr[String] = js.native
  
  /**
    * Answer value
    */
  var valueTime: js.UndefOr[time] = js.native
}
object QuestionnaireItemOption {
  
  @scala.inline
  def apply(): QuestionnaireItemOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuestionnaireItemOption]
  }
  
  @scala.inline
  implicit class QuestionnaireItemOptionOps[Self <: QuestionnaireItemOption] (val x: Self) extends AnyVal {
    
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
    def set_valueDate(value: Element): Self = this.set("_valueDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_valueDate: Self = this.set("_valueDate", js.undefined)
    
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
    def setValueCoding(value: Coding): Self = this.set("valueCoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueCoding: Self = this.set("valueCoding", js.undefined)
    
    @scala.inline
    def setValueDate(value: date): Self = this.set("valueDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueDate: Self = this.set("valueDate", js.undefined)
    
    @scala.inline
    def setValueInteger(value: integer): Self = this.set("valueInteger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueInteger: Self = this.set("valueInteger", js.undefined)
    
    @scala.inline
    def setValueString(value: String): Self = this.set("valueString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueString: Self = this.set("valueString", js.undefined)
    
    @scala.inline
    def setValueTime(value: time): Self = this.set("valueTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueTime: Self = this.set("valueTime", js.undefined)
  }
}
