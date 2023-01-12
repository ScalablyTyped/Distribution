package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CitationCitedArtifactTitle
  extends StObject
     with BackboneElement {
  
  var _text: js.UndefOr[Element] = js.undefined
  
  /**
    * Used to express the specific language.
    */
  var language: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The title of the article or artifact.
    */
  var text: String
  
  /**
    * Used to express the reason or specific aspect for the title.
    */
  var `type`: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}
object CitationCitedArtifactTitle {
  
  inline def apply(text: String): CitationCitedArtifactTitle = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[CitationCitedArtifactTitle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CitationCitedArtifactTitle] (val x: Self) extends AnyVal {
    
    inline def setLanguage(value: CodeableConcept): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setType(value: js.Array[CodeableConcept]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setTypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "type", js.Array(value*))
    
    inline def set_text(value: Element): Self = StObject.set(x, "_text", value.asInstanceOf[js.Any])
    
    inline def set_textUndefined: Self = StObject.set(x, "_text", js.undefined)
  }
}
