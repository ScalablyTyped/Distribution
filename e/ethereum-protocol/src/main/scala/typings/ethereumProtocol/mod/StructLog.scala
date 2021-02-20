package typings.ethereumProtocol.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StructLog extends StObject {
  
  var depth: Double = js.native
  
  var error: String = js.native
  
  var gas: Double = js.native
  
  var gasCost: Double = js.native
  
  var memory: js.Array[String] = js.native
  
  var op: OpCode = js.native
  
  var pc: Double = js.native
  
  var stack: js.Array[String] = js.native
  
  var storage: StringDictionary[String] = js.native
}
object StructLog {
  
  @scala.inline
  def apply(
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
  implicit class StructLogMutableBuilder[Self <: StructLog] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGas(value: Double): Self = StObject.set(x, "gas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGasCost(value: Double): Self = StObject.set(x, "gasCost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemory(value: js.Array[String]): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemoryVarargs(value: String*): Self = StObject.set(x, "memory", js.Array(value :_*))
    
    @scala.inline
    def setOp(value: OpCode): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPc(value: Double): Self = StObject.set(x, "pc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStack(value: js.Array[String]): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackVarargs(value: String*): Self = StObject.set(x, "stack", js.Array(value :_*))
    
    @scala.inline
    def setStorage(value: StringDictionary[String]): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
  }
}
