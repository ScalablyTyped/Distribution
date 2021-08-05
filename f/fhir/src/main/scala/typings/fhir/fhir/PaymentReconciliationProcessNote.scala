package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Processing comments
  */
trait PaymentReconciliationProcessNote
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'text'.
    */
  var _text: js.UndefOr[Element] = js.undefined
  
  /**
    * Comment on the processing
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * display | print | printoper
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object PaymentReconciliationProcessNote {
  
  inline def apply(): PaymentReconciliationProcessNote = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaymentReconciliationProcessNote]
  }
  
  extension [Self <: PaymentReconciliationProcessNote](x: Self) {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_text(value: Element): Self = StObject.set(x, "_text", value.asInstanceOf[js.Any])
    
    inline def set_textUndefined: Self = StObject.set(x, "_text", js.undefined)
  }
}
