package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Processing notes
  */
trait ExplanationOfBenefitProcessNote
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'number'.
    */
  var _number: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'text'.
    */
  var _text: js.UndefOr[Element] = js.undefined
  
  /**
    * Language if different from the resource
    */
  var language: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Sequence number for this note
    */
  var number: js.UndefOr[positiveInt] = js.undefined
  
  /**
    * Note explanitory text
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * display | print | printoper
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object ExplanationOfBenefitProcessNote {
  
  @scala.inline
  def apply(): ExplanationOfBenefitProcessNote = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExplanationOfBenefitProcessNote]
  }
  
  @scala.inline
  implicit class ExplanationOfBenefitProcessNoteMutableBuilder[Self <: ExplanationOfBenefitProcessNote] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguage(value: CodeableConcept): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setNumber(value: positiveInt): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def set_number(value: Element): Self = StObject.set(x, "_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_numberUndefined: Self = StObject.set(x, "_number", js.undefined)
    
    @scala.inline
    def set_text(value: Element): Self = StObject.set(x, "_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_textUndefined: Self = StObject.set(x, "_text", js.undefined)
  }
}
