package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Concept - reference to a terminology or just  text
  */
trait CodeableConcept
  extends StObject
     with Element {
  
  /**
    * Contains extended information for property 'text'.
    */
  var _text: js.UndefOr[Element] = js.undefined
  
  /**
    * Code defined by a terminology system
    */
  var coding: js.UndefOr[js.Array[Coding]] = js.undefined
  
  /**
    * Plain text representation of the concept
    */
  var text: js.UndefOr[String] = js.undefined
}
object CodeableConcept {
  
  inline def apply(): CodeableConcept = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeableConcept]
  }
  
  extension [Self <: CodeableConcept](x: Self) {
    
    inline def setCoding(value: js.Array[Coding]): Self = StObject.set(x, "coding", value.asInstanceOf[js.Any])
    
    inline def setCodingUndefined: Self = StObject.set(x, "coding", js.undefined)
    
    inline def setCodingVarargs(value: Coding*): Self = StObject.set(x, "coding", js.Array(value :_*))
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def set_text(value: Element): Self = StObject.set(x, "_text", value.asInstanceOf[js.Any])
    
    inline def set_textUndefined: Self = StObject.set(x, "_text", js.undefined)
  }
}
