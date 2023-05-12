package typings.fhir.r4bMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvidenceStatisticAttributeEstimate
  extends StObject
     with BackboneElement {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  /**
    * A nested attribute estimate; which is the attribute estimate of an attribute estimate
    */
  var attributeEstimate: js.UndefOr[js.Array[EvidenceStatisticAttributeEstimate]] = js.undefined
  
  /**
    * Human-readable summary of the estimate.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Use 95 for a 95% confidence interval.
    */
  var level: js.UndefOr[Double] = js.undefined
  
  /**
    * Footnote or explanatory note about the estimate.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * Often the p value
    */
  var quantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Lower bound of confidence interval.
    */
  var range: js.UndefOr[Range] = js.undefined
  
  /**
    * The type of attribute estimate, eg confidence interval or p value.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object EvidenceStatisticAttributeEstimate {
  
  inline def apply(): EvidenceStatisticAttributeEstimate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EvidenceStatisticAttributeEstimate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EvidenceStatisticAttributeEstimate] (val x: Self) extends AnyVal {
    
    inline def setAttributeEstimate(value: js.Array[EvidenceStatisticAttributeEstimate]): Self = StObject.set(x, "attributeEstimate", value.asInstanceOf[js.Any])
    
    inline def setAttributeEstimateUndefined: Self = StObject.set(x, "attributeEstimate", js.undefined)
    
    inline def setAttributeEstimateVarargs(value: EvidenceStatisticAttributeEstimate*): Self = StObject.set(x, "attributeEstimate", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setQuantity(value: Quantity): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
  }
}
