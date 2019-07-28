package typings.ethereumDashProtocol.ethereumDashProtocolMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StructLog extends js.Object {
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
    val __obj = js.Dynamic.literal(depth = depth, error = error, gas = gas, gasCost = gasCost, memory = memory, op = op, pc = pc, stack = stack, storage = storage)
  
    __obj.asInstanceOf[StructLog]
  }
}

