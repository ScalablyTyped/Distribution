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
  
  inline def apply(anonymous: Boolean, inputs: js.Array[EventParameter], name: String, `type`: Event): EventAbi = {
    val __obj = js.Dynamic.literal(anonymous = anonymous.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventAbi]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventAbi] (val x: Self) extends AnyVal {
    
    inline def setAnonymous(value: Boolean): Self = StObject.set(x, "anonymous", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: js.Array[EventParameter]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsVarargs(value: EventParameter*): Self = StObject.set(x, "inputs", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: Event): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
