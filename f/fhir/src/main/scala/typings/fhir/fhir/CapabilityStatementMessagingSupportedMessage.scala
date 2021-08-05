package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Messages supported by this system
  */
trait CapabilityStatementMessagingSupportedMessage
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'mode'.
    */
  var _mode: js.UndefOr[Element] = js.undefined
  
  /**
    * Message supported by this system
    */
  var definition: Reference
  
  /**
    * sender | receiver
    */
  var mode: code
}
object CapabilityStatementMessagingSupportedMessage {
  
  inline def apply(definition: Reference, mode: code): CapabilityStatementMessagingSupportedMessage = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapabilityStatementMessagingSupportedMessage]
  }
  
  extension [Self <: CapabilityStatementMessagingSupportedMessage](x: Self) {
    
    inline def setDefinition(value: Reference): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setMode(value: code): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def set_mode(value: Element): Self = StObject.set(x, "_mode", value.asInstanceOf[js.Any])
    
    inline def set_modeUndefined: Self = StObject.set(x, "_mode", js.undefined)
  }
}
