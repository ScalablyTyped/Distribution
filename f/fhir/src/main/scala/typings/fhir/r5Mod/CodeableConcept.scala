package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeableConcept
  extends StObject
     with Element {
  
  var _text: js.UndefOr[Element] = js.undefined
  
  /**
    * Codes may be defined very casually in enumerations, or code lists, up to very formal definitions such as SNOMED CT - see the HL7 v3 Core Principles for more information.  Ordering of codings is undefined and SHALL NOT be used to infer meaning. Generally, at most only one of the coding values will be labeled as UserSelected = true.
    */
  var coding: js.UndefOr[js.Array[Coding]] = js.undefined
  
  /**
    * Very often the text is the same as a displayName of one of the codings.
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
