package typings.ethereumProtocol.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StructLog extends StObject {
  
  var depth: Double
  
  var error: String
  
  var gas: Double
  
  var gasCost: Double
  
  var memory: js.Array[String]
  
  var op: OpCode
  
  var pc: Double
  
  var stack: js.Array[String]
  
  var storage: StringDictionary[String]
}
object StructLog {
  
  inline def apply(
    depth: Double,
    error: String,
    gas: Double,
    gasCost: Double,
    memory: js.Array[String],
    op: OpCode,
    pc: Double,
    stack: js.Array[String],
    storage: StringDictionary[String]
  ): StructLog = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], gas = gas.asInstanceOf[js.Any], gasCost = gasCost.asInstanceOf[js.Any], memory = memory.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], pc = pc.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructLog]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StructLog] (val x: Self) extends AnyVal {
    
    inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setGas(value: Double): Self = StObject.set(x, "gas", value.asInstanceOf[js.Any])
    
    inline def setGasCost(value: Double): Self = StObject.set(x, "gasCost", value.asInstanceOf[js.Any])
    
    inline def setMemory(value: js.Array[String]): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
    
    inline def setMemoryVarargs(value: String*): Self = StObject.set(x, "memory", js.Array(value*))
    
    inline def setOp(value: OpCode): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    inline def setPc(value: Double): Self = StObject.set(x, "pc", value.asInstanceOf[js.Any])
    
    inline def setStack(value: js.Array[String]): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setStackVarargs(value: String*): Self = StObject.set(x, "stack", js.Array(value*))
    
    inline def setStorage(value: StringDictionary[String]): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
  }
}
