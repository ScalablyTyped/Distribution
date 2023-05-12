package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExplanationOfBenefitProcessNote
  extends StObject
     with BackboneElement {
  
  var _text: js.UndefOr[Element] = js.undefined
  
  /**
    * Only required if the language is different from the resource language.
    */
  var language: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * A number to uniquely identify a note entry.
    */
  var number: js.UndefOr[Double] = js.undefined
  
  /**
    * The explanation or description associated with the processing.
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * The business purpose of the note text.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object ExplanationOfBenefitProcessNote {
  
  inline def apply(): ExplanationOfBenefitProcessNote = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExplanationOfBenefitProcessNote]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExplanationOfBenefitProcessNote] (val x: Self) extends AnyVal {
    
    inline def setLanguage(value: CodeableConcept): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_text(value: Element): Self = StObject.set(x, "_text", value.asInstanceOf[js.Any])
    
    inline def set_textUndefined: Self = StObject.set(x, "_text", js.undefined)
  }
}
