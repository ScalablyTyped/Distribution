package typings.fhir.r3Mod

import typings.fhir.fhirStrings.receiver
import typings.fhir.fhirStrings.sender
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CapabilityStatementMessagingSupportedMessage
  extends StObject
     with BackboneElement {
  
  var _mode: js.UndefOr[Element] = js.undefined
  
  /**
    * Points to a message definition that identifies the messaging event, message structure, allowed responses, etc.
    */
  var definition: Reference
  
  /**
    * The mode of this event declaration - whether application is sender or receiver.
    */
  var mode: sender | receiver
}
object CapabilityStatementMessagingSupportedMessage {
  
  inline def apply(definition: Reference, mode: sender | receiver): CapabilityStatementMessagingSupportedMessage = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapabilityStatementMessagingSupportedMessage]
  }
  
  extension [Self <: CapabilityStatementMessagingSupportedMessage](x: Self) {
    
    inline def setDefinition(value: Reference): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setMode(value: sender | receiver): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def set_mode(value: Element): Self = StObject.set(x, "_mode", value.asInstanceOf[js.Any])
    
    inline def set_modeUndefined: Self = StObject.set(x, "_mode", js.undefined)
  }
}
