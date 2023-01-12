package typings.fhir.r4Mod

import typings.fhir.fhirStrings.display
import typings.fhir.fhirStrings.print
import typings.fhir.fhirStrings.printoper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentReconciliationProcessNote
  extends StObject
     with BackboneElement {
  
  var _text: js.UndefOr[Element] = js.undefined
  
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * The explanation or description associated with the processing.
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * The business purpose of the note text.
    */
  var `type`: js.UndefOr[display | print | printoper] = js.undefined
}
object PaymentReconciliationProcessNote {
  
  inline def apply(): PaymentReconciliationProcessNote = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaymentReconciliationProcessNote]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaymentReconciliationProcessNote] (val x: Self) extends AnyVal {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setType(value: display | print | printoper): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_text(value: Element): Self = StObject.set(x, "_text", value.asInstanceOf[js.Any])
    
    inline def set_textUndefined: Self = StObject.set(x, "_text", js.undefined)
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
