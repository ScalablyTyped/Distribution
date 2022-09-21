package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageDefinitionAllowedResponse
  extends StObject
     with BackboneElement {
  
  var _message: js.UndefOr[Element] = js.undefined
  
  var _situation: js.UndefOr[Element] = js.undefined
  
  /**
    * A reference to the message definition that must be adhered to by this supported response.
    */
  var message: String
  
  /**
    * Provides a description of the circumstances in which this response should be used (as opposed to one of the alternative responses).
    */
  var situation: js.UndefOr[String] = js.undefined
}
object MessageDefinitionAllowedResponse {
  
  inline def apply(message: String): MessageDefinitionAllowedResponse = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageDefinitionAllowedResponse]
  }
  
  extension [Self <: MessageDefinitionAllowedResponse](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setSituation(value: String): Self = StObject.set(x, "situation", value.asInstanceOf[js.Any])
    
    inline def setSituationUndefined: Self = StObject.set(x, "situation", js.undefined)
    
    inline def set_message(value: Element): Self = StObject.set(x, "_message", value.asInstanceOf[js.Any])
    
    inline def set_messageUndefined: Self = StObject.set(x, "_message", js.undefined)
    
    inline def set_situation(value: Element): Self = StObject.set(x, "_situation", value.asInstanceOf[js.Any])
    
    inline def set_situationUndefined: Self = StObject.set(x, "_situation", js.undefined)
  }
}
