package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExplanationOfBenefitSupportingInfo
  extends StObject
     with BackboneElement {
  
  var _timingDate: js.UndefOr[Element] = js.undefined
  
  var _valueBoolean: js.UndefOr[Element] = js.undefined
  
  var _valueString: js.UndefOr[Element] = js.undefined
  
  /**
    * This may contain a category for the local bill type codes.
    */
  var category: CodeableConcept
  
  /**
    * This may contain the local bill type codes such as the US UB-04 bill type code.
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * For example: the reason for the additional stay, or why a tooth is  missing.
    */
  var reason: js.UndefOr[Coding] = js.undefined
  
  /**
    * A number to uniquely identify supporting information entries.
    */
  var sequence: Double
  
  /**
    * The date when or period to which this information refers.
    */
  var timingDate: js.UndefOr[String] = js.undefined
  
  /**
    * The date when or period to which this information refers.
    */
  var timingPeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * Could be used to provide references to other resources, document. For example, could contain a PDF in an Attachment of the Police Report for an Accident.
    */
  var valueAttachment: js.UndefOr[Attachment] = js.undefined
  
  /**
    * Could be used to provide references to other resources, document. For example, could contain a PDF in an Attachment of the Police Report for an Accident.
    */
  var valueBoolean: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Could be used to provide references to other resources, document. For example, could contain a PDF in an Attachment of the Police Report for an Accident.
    */
  var valueQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Could be used to provide references to other resources, document. For example, could contain a PDF in an Attachment of the Police Report for an Accident.
    */
  var valueReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * Could be used to provide references to other resources, document. For example, could contain a PDF in an Attachment of the Police Report for an Accident.
    */
  var valueString: js.UndefOr[String] = js.undefined
}
object ExplanationOfBenefitSupportingInfo {
  
  inline def apply(category: CodeableConcept, sequence: Double): ExplanationOfBenefitSupportingInfo = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExplanationOfBenefitSupportingInfo]
  }
  
  extension [Self <: ExplanationOfBenefitSupportingInfo](x: Self) {
    
    inline def setCategory(value: CodeableConcept): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setReason(value: Coding): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setSequence(value: Double): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    inline def setTimingDate(value: String): Self = StObject.set(x, "timingDate", value.asInstanceOf[js.Any])
    
    inline def setTimingDateUndefined: Self = StObject.set(x, "timingDate", js.undefined)
    
    inline def setTimingPeriod(value: Period): Self = StObject.set(x, "timingPeriod", value.asInstanceOf[js.Any])
    
    inline def setTimingPeriodUndefined: Self = StObject.set(x, "timingPeriod", js.undefined)
    
    inline def setValueAttachment(value: Attachment): Self = StObject.set(x, "valueAttachment", value.asInstanceOf[js.Any])
    
    inline def setValueAttachmentUndefined: Self = StObject.set(x, "valueAttachment", js.undefined)
    
    inline def setValueBoolean(value: Boolean): Self = StObject.set(x, "valueBoolean", value.asInstanceOf[js.Any])
    
    inline def setValueBooleanUndefined: Self = StObject.set(x, "valueBoolean", js.undefined)
    
    inline def setValueQuantity(value: Quantity): Self = StObject.set(x, "valueQuantity", value.asInstanceOf[js.Any])
    
    inline def setValueQuantityUndefined: Self = StObject.set(x, "valueQuantity", js.undefined)
    
    inline def setValueReference(value: Reference): Self = StObject.set(x, "valueReference", value.asInstanceOf[js.Any])
    
    inline def setValueReferenceUndefined: Self = StObject.set(x, "valueReference", js.undefined)
    
    inline def setValueString(value: String): Self = StObject.set(x, "valueString", value.asInstanceOf[js.Any])
    
    inline def setValueStringUndefined: Self = StObject.set(x, "valueString", js.undefined)
    
    inline def set_timingDate(value: Element): Self = StObject.set(x, "_timingDate", value.asInstanceOf[js.Any])
    
    inline def set_timingDateUndefined: Self = StObject.set(x, "_timingDate", js.undefined)
    
    inline def set_valueBoolean(value: Element): Self = StObject.set(x, "_valueBoolean", value.asInstanceOf[js.Any])
    
    inline def set_valueBooleanUndefined: Self = StObject.set(x, "_valueBoolean", js.undefined)
    
    inline def set_valueString(value: Element): Self = StObject.set(x, "_valueString", value.asInstanceOf[js.Any])
    
    inline def set_valueStringUndefined: Self = StObject.set(x, "_valueString", js.undefined)
  }
}
