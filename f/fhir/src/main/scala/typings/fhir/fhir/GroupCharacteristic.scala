package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
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
  implicit class GroupCharacteristicMutableBuilder[Self <: GroupCharacteristic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclude(value: Boolean): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    @scala.inline
    def setValueBoolean(value: Boolean): Self = StObject.set(x, "valueBoolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueBooleanUndefined: Self = StObject.set(x, "valueBoolean", js.undefined)
    
    @scala.inline
    def setValueCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "valueCodeableConcept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueCodeableConceptUndefined: Self = StObject.set(x, "valueCodeableConcept", js.undefined)
    
    @scala.inline
    def setValueQuantity(value: Quantity): Self = StObject.set(x, "valueQuantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueQuantityUndefined: Self = StObject.set(x, "valueQuantity", js.undefined)
    
    @scala.inline
    def setValueRange(value: Range): Self = StObject.set(x, "valueRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueRangeUndefined: Self = StObject.set(x, "valueRange", js.undefined)
    
    @scala.inline
    def set_exclude(value: Element): Self = StObject.set(x, "_exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_excludeUndefined: Self = StObject.set(x, "_exclude", js.undefined)
    
    @scala.inline
    def set_valueBoolean(value: Element): Self = StObject.set(x, "_valueBoolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_valueBooleanUndefined: Self = StObject.set(x, "_valueBoolean", js.undefined)
  }
}
