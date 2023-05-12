package typings.fhir.r4bMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvidenceVariableCharacteristicTimeFromStart
  extends StObject
     with BackboneElement {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  /**
    * A short, natural language description.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * A human-readable string to clarify or explain concepts about the resource.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * Used to express the observation at a defined amount of time after the study start.
    */
  var quantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Used to express the observation within a period after the study start.
    */
  var range: js.UndefOr[Range] = js.undefined
}
object EvidenceVariableCharacteristicTimeFromStart {
  
  inline def apply(): EvidenceVariableCharacteristicTimeFromStart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EvidenceVariableCharacteristicTimeFromStart]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EvidenceVariableCharacteristicTimeFromStart] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setQuantity(value: Quantity): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
  }
}
