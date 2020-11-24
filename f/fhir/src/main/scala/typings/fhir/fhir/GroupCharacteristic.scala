package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Trait of group members
  */
@js.native
trait GroupCharacteristic extends BackboneElement {
  
  /**
    * Contains extended information for property 'exclude'.
    */
  var _exclude: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'valueBoolean'.
    */
  var _valueBoolean: js.UndefOr[Element] = js.native
  
  /**
    * Kind of characteristic
    */
  var code: CodeableConcept = js.native
  
  /**
    * Group includes or excludes
    */
  var exclude: Boolean = js.native
  
  /**
    * Period over which characteristic is tested
    */
  var period: js.UndefOr[Period] = js.native
  
  /**
    * Value held by characteristic
    */
  var valueBoolean: js.UndefOr[Boolean] = js.native
  
  /**
    * Value held by characteristic
    */
  var valueCodeableConcept: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Value held by characteristic
    */
  var valueQuantity: js.UndefOr[Quantity] = js.native
  
  /**
    * Value held by characteristic
    */
  var valueRange: js.UndefOr[Range] = js.native
}
object GroupCharacteristic {
  
  @scala.inline
  def apply(code: CodeableConcept, exclude: Boolean): GroupCharacteristic = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], exclude = exclude.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupCharacteristic]
  }
  
  @scala.inline
  implicit class GroupCharacteristicOps[Self <: GroupCharacteristic] (val x: Self) extends AnyVal {
    
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
    def setCode(value: CodeableConcept): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclude(value: Boolean): Self = this.set("exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_exclude(value: Element): Self = this.set("_exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_exclude: Self = this.set("_exclude", js.undefined)
    
    @scala.inline
    def set_valueBoolean(value: Element): Self = this.set("_valueBoolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_valueBoolean: Self = this.set("_valueBoolean", js.undefined)
    
    @scala.inline
    def setPeriod(value: Period): Self = this.set("period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeriod: Self = this.set("period", js.undefined)
    
    @scala.inline
    def setValueBoolean(value: Boolean): Self = this.set("valueBoolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueBoolean: Self = this.set("valueBoolean", js.undefined)
    
    @scala.inline
    def setValueCodeableConcept(value: CodeableConcept): Self = this.set("valueCodeableConcept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueCodeableConcept: Self = this.set("valueCodeableConcept", js.undefined)
    
    @scala.inline
    def setValueQuantity(value: Quantity): Self = this.set("valueQuantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueQuantity: Self = this.set("valueQuantity", js.undefined)
    
    @scala.inline
    def setValueRange(value: Range): Self = this.set("valueRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueRange: Self = this.set("valueRange", js.undefined)
  }
}
