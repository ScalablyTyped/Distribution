package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Processing comments
  */
@js.native
trait PaymentReconciliationProcessNote extends BackboneElement {
  
  /**
    * Contains extended information for property 'text'.
    */
  var _text: js.UndefOr[Element] = js.native
  
  /**
    * Comment on the processing
    */
  var text: js.UndefOr[String] = js.native
  
  /**
    * display | print | printoper
    */
  var `type`: js.UndefOr[CodeableConcept] = js.native
}
object PaymentReconciliationProcessNote {
  
  @scala.inline
  def apply(): PaymentReconciliationProcessNote = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaymentReconciliationProcessNote]
  }
  
  @scala.inline
  implicit class PaymentReconciliationProcessNoteMutableBuilder[Self <: PaymentReconciliationProcessNote] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def set_text(value: Element): Self = StObject.set(x, "_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_textUndefined: Self = StObject.set(x, "_text", js.undefined)
  }
}
