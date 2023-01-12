package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExplanationOfBenefitInformation
  extends StObject
     with BackboneElement {
  
  var _timingDate: js.UndefOr[Element] = js.undefined
  
  var _valueString: js.UndefOr[Element] = js.undefined
  
  /**
    * This may contain the local bill type codes such as the US UB-04 bill type code.
    */
  var category: CodeableConcept
  
  /**
    * This may contain the local bill type codes such as the US UB-04 bill type code.
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * For example, provides the reason for: the additional stay, or missing tooth or any other situation where a reason code is required in addition to the content.
    */
  var reason: js.UndefOr[Coding] = js.undefined
  
  /**
    * Sequence of the information element which serves to provide a link.
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
    * Additional data or information such as resources, documents, images etc. including references to the data or the actual inclusion of the data.
    */
  var valueAttachment: js.UndefOr[Attachment] = js.undefined
  
  /**
    * Additional data or information such as resources, documents, images etc. including references to the data or the actual inclusion of the data.
    */
  var valueQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Additional data or information such as resources, documents, images etc. including references to the data or the actual inclusion of the data.
    */
  var valueReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * Additional data or information such as resources, documents, images etc. including references to the data or the actual inclusion of the data.
    */
  var valueString: js.UndefOr[String] = js.undefined
}
object ExplanationOfBenefitInformation {
  
  inline def apply(category: CodeableConcept, sequence: Double): ExplanationOfBenefitInformation = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExplanationOfBenefitInformation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExplanationOfBenefitInformation] (val x: Self) extends AnyVal {
    
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
    
    inline def setValueQuantity(value: Quantity): Self = StObject.set(x, "valueQuantity", value.asInstanceOf[js.Any])
    
    inline def setValueQuantityUndefined: Self = StObject.set(x, "valueQuantity", js.undefined)
    
    inline def setValueReference(value: Reference): Self = StObject.set(x, "valueReference", value.asInstanceOf[js.Any])
    
    inline def setValueReferenceUndefined: Self = StObject.set(x, "valueReference", js.undefined)
    
    inline def setValueString(value: String): Self = StObject.set(x, "valueString", value.asInstanceOf[js.Any])
    
    inline def setValueStringUndefined: Self = StObject.set(x, "valueString", js.undefined)
    
    inline def set_timingDate(value: Element): Self = StObject.set(x, "_timingDate", value.asInstanceOf[js.Any])
    
    inline def set_timingDateUndefined: Self = StObject.set(x, "_timingDate", js.undefined)
    
    inline def set_valueString(value: Element): Self = StObject.set(x, "_valueString", value.asInstanceOf[js.Any])
    
    inline def set_valueStringUndefined: Self = StObject.set(x, "_valueString", js.undefined)
  }
}
