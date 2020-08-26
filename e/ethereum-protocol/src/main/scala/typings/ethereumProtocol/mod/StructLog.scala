package typings.ethereumProtocol.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StructLog extends js.Object {
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
  implicit class StructLogOps[Self <: StructLog] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setGas(value: Double): Self = this.set("gas", value.asInstanceOf[js.Any])
    @scala.inline
    def setGasCost(value: Double): Self = this.set("gasCost", value.asInstanceOf[js.Any])
    @scala.inline
    def setMemoryVarargs(value: String*): Self = this.set("memory", js.Array(value :_*))
    @scala.inline
    def setMemory(value: js.Array[String]): Self = this.set("memory", value.asInstanceOf[js.Any])
    @scala.inline
    def setOp(value: OpCode): Self = this.set("op", value.asInstanceOf[js.Any])
    @scala.inline
    def setPc(value: Double): Self = this.set("pc", value.asInstanceOf[js.Any])
    @scala.inline
    def setStackVarargs(value: String*): Self = this.set("stack", js.Array(value :_*))
    @scala.inline
    def setStack(value: js.Array[String]): Self = this.set("stack", value.asInstanceOf[js.Any])
    @scala.inline
    def setStorage(value: StringDictionary[String]): Self = this.set("storage", value.asInstanceOf[js.Any])
  }
  
}

