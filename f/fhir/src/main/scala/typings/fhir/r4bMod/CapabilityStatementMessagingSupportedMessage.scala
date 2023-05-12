package typings.fhir.r4bMod

import typings.fhir.fhirStrings.receiver
import typings.fhir.fhirStrings.sender
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CapabilityStatementMessagingSupportedMessage
  extends StObject
     with BackboneElement {
  
  var _definition: js.UndefOr[Element] = js.undefined
  
  var _mode: js.UndefOr[Element] = js.undefined
  
  /**
    * Points to a message definition that identifies the messaging event, message structure, allowed responses, etc.
    */
  var definition: String
  
  /**
    * The mode of this event declaration - whether application is sender or receiver.
    */
  var mode: sender | receiver
}
object CapabilityStatementMessagingSupportedMessage {
  
  inline def apply(definition: String, mode: sender | receiver): CapabilityStatementMessagingSupportedMessage = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapabilityStatementMessagingSupportedMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CapabilityStatementMessagingSupportedMessage] (val x: Self) extends AnyVal {
    
    inline def setDefinition(value: String): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setMode(value: sender | receiver): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def set_definition(value: Element): Self = StObject.set(x, "_definition", value.asInstanceOf[js.Any])
    
    inline def set_definitionUndefined: Self = StObject.set(x, "_definition", js.undefined)
    
    inline def set_mode(value: Element): Self = StObject.set(x, "_mode", value.asInstanceOf[js.Any])
    
    inline def set_modeUndefined: Self = StObject.set(x, "_mode", js.undefined)
  }
}
