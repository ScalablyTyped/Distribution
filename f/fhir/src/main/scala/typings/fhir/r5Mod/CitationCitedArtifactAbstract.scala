package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CitationCitedArtifactAbstract
  extends StObject
     with BackboneElement {
  
  var _copyright: js.UndefOr[Element] = js.undefined
  
  var _text: js.UndefOr[Element] = js.undefined
  
  /**
    * Copyright notice for the abstract.
    */
  var copyright: js.UndefOr[String] = js.undefined
  
  /**
    * Used to express the specific language.
    */
  var language: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Abstract content.
    */
  var text: String
  
  /**
    * Used to express the reason or specific aspect for the abstract.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object CitationCitedArtifactAbstract {
  
  inline def apply(text: String): CitationCitedArtifactAbstract = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[CitationCitedArtifactAbstract]
  }
  
  extension [Self <: CitationCitedArtifactAbstract](x: Self) {
    
    inline def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    inline def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
    
    inline def setLanguage(value: CodeableConcept): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_copyright(value: Element): Self = StObject.set(x, "_copyright", value.asInstanceOf[js.Any])
    
    inline def set_copyrightUndefined: Self = StObject.set(x, "_copyright", js.undefined)
    
    inline def set_text(value: Element): Self = StObject.set(x, "_text", value.asInstanceOf[js.Any])
    
    inline def set_textUndefined: Self = StObject.set(x, "_text", js.undefined)
  }
}
