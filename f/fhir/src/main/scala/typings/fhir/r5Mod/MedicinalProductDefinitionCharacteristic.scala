package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicinalProductDefinitionCharacteristic
  extends StObject
     with BackboneElement {
  
  var _valueBoolean: js.UndefOr[Element] = js.undefined
  
  var _valueDate: js.UndefOr[Element] = js.undefined
  
  var _valueMarkdown: js.UndefOr[Element] = js.undefined
  
  /**
    * A code expressing the type of characteristic.
    */
  var `type`: CodeableConcept
  
  /**
    * Text, as markdown, is intended to be used only when the item cannot ever reasonably be coded. Otherwise, for cases where a code is not available, but is feasible, use CodeableConcept.text.
    */
  var valueAttachment: js.UndefOr[Attachment] = js.undefined
  
  /**
    * Text, as markdown, is intended to be used only when the item cannot ever reasonably be coded. Otherwise, for cases where a code is not available, but is feasible, use CodeableConcept.text.
    */
  var valueBoolean: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Text, as markdown, is intended to be used only when the item cannot ever reasonably be coded. Otherwise, for cases where a code is not available, but is feasible, use CodeableConcept.text.
    */
  var valueCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Text, as markdown, is intended to be used only when the item cannot ever reasonably be coded. Otherwise, for cases where a code is not available, but is feasible, use CodeableConcept.text.
    */
  var valueDate: js.UndefOr[String] = js.undefined
  
  /**
    * Text, as markdown, is intended to be used only when the item cannot ever reasonably be coded. Otherwise, for cases where a code is not available, but is feasible, use CodeableConcept.text.
    */
  var valueInteger: js.UndefOr[Double] = js.undefined
  
  /**
    * Text, as markdown, is intended to be used only when the item cannot ever reasonably be coded. Otherwise, for cases where a code is not available, but is feasible, use CodeableConcept.text.
    */
  var valueMarkdown: js.UndefOr[String] = js.undefined
  
  /**
    * Text, as markdown, is intended to be used only when the item cannot ever reasonably be coded. Otherwise, for cases where a code is not available, but is feasible, use CodeableConcept.text.
    */
  var valueQuantity: js.UndefOr[Quantity] = js.undefined
}
object MedicinalProductDefinitionCharacteristic {
  
  inline def apply(`type`: CodeableConcept): MedicinalProductDefinitionCharacteristic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicinalProductDefinitionCharacteristic]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MedicinalProductDefinitionCharacteristic] (val x: Self) extends AnyVal {
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValueAttachment(value: Attachment): Self = StObject.set(x, "valueAttachment", value.asInstanceOf[js.Any])
    
    inline def setValueAttachmentUndefined: Self = StObject.set(x, "valueAttachment", js.undefined)
    
    inline def setValueBoolean(value: Boolean): Self = StObject.set(x, "valueBoolean", value.asInstanceOf[js.Any])
    
    inline def setValueBooleanUndefined: Self = StObject.set(x, "valueBoolean", js.undefined)
    
    inline def setValueCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "valueCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setValueCodeableConceptUndefined: Self = StObject.set(x, "valueCodeableConcept", js.undefined)
    
    inline def setValueDate(value: String): Self = StObject.set(x, "valueDate", value.asInstanceOf[js.Any])
    
    inline def setValueDateUndefined: Self = StObject.set(x, "valueDate", js.undefined)
    
    inline def setValueInteger(value: Double): Self = StObject.set(x, "valueInteger", value.asInstanceOf[js.Any])
    
    inline def setValueIntegerUndefined: Self = StObject.set(x, "valueInteger", js.undefined)
    
    inline def setValueMarkdown(value: String): Self = StObject.set(x, "valueMarkdown", value.asInstanceOf[js.Any])
    
    inline def setValueMarkdownUndefined: Self = StObject.set(x, "valueMarkdown", js.undefined)
    
    inline def setValueQuantity(value: Quantity): Self = StObject.set(x, "valueQuantity", value.asInstanceOf[js.Any])
    
    inline def setValueQuantityUndefined: Self = StObject.set(x, "valueQuantity", js.undefined)
    
    inline def set_valueBoolean(value: Element): Self = StObject.set(x, "_valueBoolean", value.asInstanceOf[js.Any])
    
    inline def set_valueBooleanUndefined: Self = StObject.set(x, "_valueBoolean", js.undefined)
    
    inline def set_valueDate(value: Element): Self = StObject.set(x, "_valueDate", value.asInstanceOf[js.Any])
    
    inline def set_valueDateUndefined: Self = StObject.set(x, "_valueDate", js.undefined)
    
    inline def set_valueMarkdown(value: Element): Self = StObject.set(x, "_valueMarkdown", value.asInstanceOf[js.Any])
    
    inline def set_valueMarkdownUndefined: Self = StObject.set(x, "_valueMarkdown", js.undefined)
  }
}
