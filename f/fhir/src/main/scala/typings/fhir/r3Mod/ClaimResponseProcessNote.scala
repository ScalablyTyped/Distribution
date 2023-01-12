package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClaimResponseProcessNote
  extends StObject
     with BackboneElement {
  
  var _text: js.UndefOr[Element] = js.undefined
  
  /**
    * The ISO-639-1 alpha 2 code in lower case for the language, optionally followed by a hyphen and the ISO-3166-1 alpha 2 code for the region in upper case; e.g. "en" for English, or "en-US" for American English versus "en-EN" for England English.
    */
  var language: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * An integer associated with each note which may be referred to from each service line item.
    */
  var number: js.UndefOr[Double] = js.undefined
  
  /**
    * The note text.
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * The note purpose: Print/Display.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object ClaimResponseProcessNote {
  
  inline def apply(): ClaimResponseProcessNote = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClaimResponseProcessNote]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClaimResponseProcessNote] (val x: Self) extends AnyVal {
    
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
