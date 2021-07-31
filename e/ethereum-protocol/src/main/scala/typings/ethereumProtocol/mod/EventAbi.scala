package typings.ethereumProtocol.mod

import typings.ethereumProtocol.mod.AbiType.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventAbi
  extends StObject
     with AbiDefinition {
  
  var anonymous: Boolean
  
  var inputs: js.Array[EventParameter]
  
  var name: String
  
  var `type`: Event
}
object EventAbi {
  
  @scala.inline
  def apply(anonymous: Boolean, inputs: js.Array[EventParameter], name: String, `type`: Event): EventAbi = {
    val __obj = js.Dynamic.literal(anonymous = anonymous.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventAbi]
  }
  
  @scala.inline
  implicit class EventAbiMutableBuilder[Self <: EventAbi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnonymous(value: Boolean): Self = StObject.set(x, "anonymous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: js.Array[EventParameter]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputsVarargs(value: EventParameter*): Self = StObject.set(x, "inputs", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Event): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
