package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Responses to this message
  */
trait MessageDefinitionAllowedResponse
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'situation'.
    */
  var _situation: js.UndefOr[Element] = js.undefined
  
  /**
    * Reference to allowed message definition response
    */
  var message: Reference
  
  /**
    * When should this response be used
    */
  var situation: js.UndefOr[markdown] = js.undefined
}
object MessageDefinitionAllowedResponse {
  
  @scala.inline
  def apply(message: Reference): MessageDefinitionAllowedResponse = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageDefinitionAllowedResponse]
  }
  
  @scala.inline
  implicit class MessageDefinitionAllowedResponseMutableBuilder[Self <: MessageDefinitionAllowedResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: Reference): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSituation(value: markdown): Self = StObject.set(x, "situation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSituationUndefined: Self = StObject.set(x, "situation", js.undefined)
    
    @scala.inline
    def set_situation(value: Element): Self = StObject.set(x, "_situation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_situationUndefined: Self = StObject.set(x, "_situation", js.undefined)
  }
}
