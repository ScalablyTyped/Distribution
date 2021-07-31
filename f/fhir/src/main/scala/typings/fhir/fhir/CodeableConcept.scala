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
  
  @scala.inline
  def apply(): CodeableConcept = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeableConcept]
  }
  
  @scala.inline
  implicit class CodeableConceptMutableBuilder[Self <: CodeableConcept] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoding(value: js.Array[Coding]): Self = StObject.set(x, "coding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodingUndefined: Self = StObject.set(x, "coding", js.undefined)
    
    @scala.inline
    def setCodingVarargs(value: Coding*): Self = StObject.set(x, "coding", js.Array(value :_*))
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def set_text(value: Element): Self = StObject.set(x, "_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_textUndefined: Self = StObject.set(x, "_text", js.undefined)
  }
}
