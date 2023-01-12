package typings.ethereumProtocol.mod

import typings.ethereumProtocol.mod.AbiType.Fallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FallbackAbi
  extends StObject
     with FunctionAbi {
  
  var payable: Boolean
  
  var `type`: Fallback
}
object FallbackAbi {
  
  inline def apply(payable: Boolean, `type`: Fallback): FallbackAbi = {
    val __obj = js.Dynamic.literal(payable = payable.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FallbackAbi]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FallbackAbi] (val x: Self) extends AnyVal {
    
    inline def setPayable(value: Boolean): Self = StObject.set(x, "payable", value.asInstanceOf[js.Any])
    
    inline def setType(value: Fallback): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
