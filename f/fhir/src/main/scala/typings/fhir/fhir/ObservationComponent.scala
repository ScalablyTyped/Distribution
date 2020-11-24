package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Component results
  */
@js.native
trait ObservationComponent extends BackboneElement {
  
  /**
    * Contains extended information for property 'valueDateTime'.
    */
  var _valueDateTime: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'valueString'.
    */
  var _valueString: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'valueTime'.
    */
  var _valueTime: js.UndefOr[Element] = js.native
  
  /**
    * Type of component observation (code / type)
    */
  var code: CodeableConcept = js.native
  
  /**
    * Why the component result is missing
    */
  var dataAbsentReason: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * High, low, normal, etc.
    */
  var interpretation: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Provides guide for interpretation of component result
    */
  var referenceRange: js.UndefOr[js.Array[ObservationReferenceRange]] = js.native
  
  /**
    * Actual component result
    */
  var valueAttachment: js.UndefOr[Attachment] = js.native
  
  /**
    * Actual component result
    */
  var valueCodeableConcept: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Actual component result
    */
  var valueDateTime: js.UndefOr[dateTime] = js.native
  
  /**
    * Actual component result
    */
  var valuePeriod: js.UndefOr[Period] = js.native
  
  /**
    * Actual component result
    */
  var valueQuantity: js.UndefOr[Quantity] = js.native
  
  /**
    * Actual component result
    */
  var valueRange: js.UndefOr[Range] = js.native
  
  /**
    * Actual component result
    */
  var valueRatio: js.UndefOr[Ratio] = js.native
  
  /**
    * Actual component result
    */
  var valueSampledData: js.UndefOr[SampledData] = js.native
  
  /**
    * Actual component result
    */
  var valueString: js.UndefOr[String] = js.native
  
  /**
    * Actual component result
    */
  var valueTime: js.UndefOr[time] = js.native
}
object ObservationComponent {
  
  @scala.inline
  def apply(code: CodeableConcept): ObservationComponent = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObservationComponent]
  }
  
  @scala.inline
  implicit class ObservationComponentOps[Self <: ObservationComponent] (val x: Self) extends AnyVal {
    
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
    def set_valueDateTime(value: Element): Self = this.set("_valueDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_valueDateTime: Self = this.set("_valueDateTime", js.undefined)
    
    @scala.inline
    def set_valueString(value: Element): Self = this.set("_valueString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_valueString: Self = this.set("_valueString", js.undefined)
    
    @scala.inline
    def set_valueTime(value: Element): Self = this.set("_valueTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_valueTime: Self = this.set("_valueTime", js.undefined)
    
    @scala.inline
    def setDataAbsentReason(value: CodeableConcept): Self = this.set("dataAbsentReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataAbsentReason: Self = this.set("dataAbsentReason", js.undefined)
    
    @scala.inline
    def setInterpretation(value: CodeableConcept): Self = this.set("interpretation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterpretation: Self = this.set("interpretation", js.undefined)
    
    @scala.inline
    def setReferenceRangeVarargs(value: ObservationReferenceRange*): Self = this.set("referenceRange", js.Array(value :_*))
    
    @scala.inline
    def setReferenceRange(value: js.Array[ObservationReferenceRange]): Self = this.set("referenceRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferenceRange: Self = this.set("referenceRange", js.undefined)
    
    @scala.inline
    def setValueAttachment(value: Attachment): Self = this.set("valueAttachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueAttachment: Self = this.set("valueAttachment", js.undefined)
    
    @scala.inline
    def setValueCodeableConcept(value: CodeableConcept): Self = this.set("valueCodeableConcept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueCodeableConcept: Self = this.set("valueCodeableConcept", js.undefined)
    
    @scala.inline
    def setValueDateTime(value: dateTime): Self = this.set("valueDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueDateTime: Self = this.set("valueDateTime", js.undefined)
    
    @scala.inline
    def setValuePeriod(value: Period): Self = this.set("valuePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValuePeriod: Self = this.set("valuePeriod", js.undefined)
    
    @scala.inline
    def setValueQuantity(value: Quantity): Self = this.set("valueQuantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueQuantity: Self = this.set("valueQuantity", js.undefined)
    
    @scala.inline
    def setValueRange(value: Range): Self = this.set("valueRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueRange: Self = this.set("valueRange", js.undefined)
    
    @scala.inline
    def setValueRatio(value: Ratio): Self = this.set("valueRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueRatio: Self = this.set("valueRatio", js.undefined)
    
    @scala.inline
    def setValueSampledData(value: SampledData): Self = this.set("valueSampledData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueSampledData: Self = this.set("valueSampledData", js.undefined)
    
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
