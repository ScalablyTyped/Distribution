package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Exceptions, special considerations, the condition, situation, prior or concurrent issues
  */
trait ExplanationOfBenefitInformation
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'sequence'.
    */
  var _sequence: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'timingDate'.
    */
  var _timingDate: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'valueString'.
    */
  var _valueString: js.UndefOr[Element] = js.undefined
  
  /**
    * General class of information
    */
  var category: CodeableConcept
  
  /**
    * Type of information
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Reason associated with the information
    */
  var reason: js.UndefOr[Coding] = js.undefined
  
  /**
    * Information instance identifier
    */
  var sequence: positiveInt
  
  /**
    * When it occurred
    */
  var timingDate: js.UndefOr[date] = js.undefined
  
  /**
    * When it occurred
    */
  var timingPeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * Additional Data or supporting information
    */
  var valueAttachment: js.UndefOr[Attachment] = js.undefined
  
  /**
    * Additional Data or supporting information
    */
  var valueQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Additional Data or supporting information
    */
  var valueReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * Additional Data or supporting information
    */
  var valueString: js.UndefOr[String] = js.undefined
}
object ExplanationOfBenefitInformation {
  
  inline def apply(category: CodeableConcept, sequence: positiveInt): ExplanationOfBenefitInformation = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExplanationOfBenefitInformation]
  }
  
  extension [Self <: ExplanationOfBenefitInformation](x: Self) {
    
    inline def setCategory(value: CodeableConcept): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setReason(value: Coding): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setSequence(value: positiveInt): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    inline def setTimingDate(value: date): Self = StObject.set(x, "timingDate", value.asInstanceOf[js.Any])
    
    inline def setTimingDateUndefined: Self = StObject.set(x, "timingDate", js.undefined)
    
    inline def setTimingPeriod(value: Period): Self = StObject.set(x, "timingPeriod", value.asInstanceOf[js.Any])
    
    inline def setTimingPeriodUndefined: Self = StObject.set(x, "timingPeriod", js.undefined)
    
    inline def setValueAttachment(value: Attachment): Self = StObject.set(x, "valueAttachment", value.asInstanceOf[js.Any])
    
    inline def setValueAttachmentUndefined: Self = StObject.set(x, "valueAttachment", js.undefined)
    
    inline def setValueQuantity(value: Quantity): Self = StObject.set(x, "valueQuantity", value.asInstanceOf[js.Any])
    
    inline def setValueQuantityUndefined: Self = StObject.set(x, "valueQuantity", js.undefined)
    
    inline def setValueReference(value: Reference): Self = StObject.set(x, "valueReference", value.asInstanceOf[js.Any])
    
    inline def setValueReferenceUndefined: Self = StObject.set(x, "valueReference", js.undefined)
    
    inline def setValueString(value: String): Self = StObject.set(x, "valueString", value.asInstanceOf[js.Any])
    
    inline def setValueStringUndefined: Self = StObject.set(x, "valueString", js.undefined)
    
    inline def set_sequence(value: Element): Self = StObject.set(x, "_sequence", value.asInstanceOf[js.Any])
    
    inline def set_sequenceUndefined: Self = StObject.set(x, "_sequence", js.undefined)
    
    inline def set_timingDate(value: Element): Self = StObject.set(x, "_timingDate", value.asInstanceOf[js.Any])
    
    inline def set_timingDateUndefined: Self = StObject.set(x, "_timingDate", js.undefined)
    
    inline def set_valueString(value: Element): Self = StObject.set(x, "_valueString", value.asInstanceOf[js.Any])
    
    inline def set_valueStringUndefined: Self = StObject.set(x, "_valueString", js.undefined)
  }
}
