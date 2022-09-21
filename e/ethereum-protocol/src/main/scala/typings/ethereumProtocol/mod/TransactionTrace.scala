package typings.ethereumProtocol.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransactionTrace extends StObject {
  
  var gas: Double
  
  var returnValue: Any
  
  var structLogs: js.Array[StructLog]
}
object TransactionTrace {
  
  inline def apply(gas: Double, returnValue: Any, structLogs: js.Array[StructLog]): TransactionTrace = {
    val __obj = js.Dynamic.literal(gas = gas.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any], structLogs = structLogs.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionTrace]
  }
  
  extension [Self <: TransactionTrace](x: Self) {
    
    inline def setGas(value: Double): Self = StObject.set(x, "gas", value.asInstanceOf[js.Any])
    
    inline def setReturnValue(value: Any): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
    
    inline def setStructLogs(value: js.Array[StructLog]): Self = StObject.set(x, "structLogs", value.asInstanceOf[js.Any])
    
    inline def setStructLogsVarargs(value: StructLog*): Self = StObject.set(x, "structLogs", js.Array(value*))
  }
}
