package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Messages supported by this system
  */
@js.native
trait CapabilityStatementMessagingSupportedMessage extends BackboneElement {
  
  /**
    * Contains extended information for property 'mode'.
    */
  var _mode: js.UndefOr[Element] = js.native
  
  /**
    * Message supported by this system
    */
  var definition: Reference = js.native
  
  /**
    * sender | receiver
    */
  var mode: code = js.native
}
object CapabilityStatementMessagingSupportedMessage {
  
  @scala.inline
  def apply(definition: Reference, mode: code): CapabilityStatementMessagingSupportedMessage = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapabilityStatementMessagingSupportedMessage]
  }
  
  @scala.inline
  implicit class CapabilityStatementMessagingSupportedMessageMutableBuilder[Self <: CapabilityStatementMessagingSupportedMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefinition(value: Reference): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: code): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_mode(value: Element): Self = StObject.set(x, "_mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_modeUndefined: Self = StObject.set(x, "_mode", js.undefined)
  }
}
