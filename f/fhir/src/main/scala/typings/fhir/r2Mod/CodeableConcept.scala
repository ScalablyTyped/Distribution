package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeableConcept
  extends StObject
     with Element {
  
  var _text: js.UndefOr[Element] = js.undefined
  
  /**
    * Allows for translations and alternate encodings within a code system.  Also supports communication of the same instance to systems requiring different encodings.
    */
  var coding: js.UndefOr[js.Array[Coding]] = js.undefined
  
  /**
    * The codes from the terminologies do not always capture the correct meaning with all the nuances of the human using them, or sometimes there is no appropriate code at all. In these cases, the text is used to capture the full meaning of the source.
    */
  var text: js.UndefOr[String] = js.undefined
}
object CodeableConcept {
  
  inline def apply(): CodeableConcept = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeableConcept]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CodeableConcept] (val x: Self) extends AnyVal {
    
    inline def setCoding(value: js.Array[Coding]): Self = StObject.set(x, "coding", value.asInstanceOf[js.Any])
    
    inline def setCodingUndefined: Self = StObject.set(x, "coding", js.undefined)
    
    inline def setCodingVarargs(value: Coding*): Self = StObject.set(x, "coding", js.Array(value*))
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def set_text(value: Element): Self = StObject.set(x, "_text", value.asInstanceOf[js.Any])
    
    inline def set_textUndefined: Self = StObject.set(x, "_text", js.undefined)
  }
}
