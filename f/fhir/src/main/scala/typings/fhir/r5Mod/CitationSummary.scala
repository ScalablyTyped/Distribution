package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CitationSummary
  extends StObject
     with BackboneElement {
  
  var _text: js.UndefOr[Element] = js.undefined
  
  /**
    * Format for display of the citation.
    */
  var style: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The human-readable display of the citation.
    */
  var text: String
}
object CitationSummary {
  
  inline def apply(text: String): CitationSummary = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[CitationSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CitationSummary] (val x: Self) extends AnyVal {
    
    inline def setStyle(value: CodeableConcept): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def set_text(value: Element): Self = StObject.set(x, "_text", value.asInstanceOf[js.Any])
    
    inline def set_textUndefined: Self = StObject.set(x, "_text", js.undefined)
  }
}
