package typings.ethereumProtocol.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransactionTrace extends StObject {
  
  var gas: Double
  
  var returnValue: js.Any
  
  var structLogs: js.Array[StructLog]
}
object TransactionTrace {
  
  @scala.inline
  def apply(gas: Double, returnValue: js.Any, structLogs: js.Array[StructLog]): TransactionTrace = {
    val __obj = js.Dynamic.literal(gas = gas.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any], structLogs = structLogs.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionTrace]
  }
  
  @scala.inline
  implicit class TransactionTraceMutableBuilder[Self <: TransactionTrace] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGas(value: Double): Self = StObject.set(x, "gas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnValue(value: js.Any): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStructLogs(value: js.Array[StructLog]): Self = StObject.set(x, "structLogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStructLogsVarargs(value: StructLog*): Self = StObject.set(x, "structLogs", js.Array(value :_*))
  }
}
