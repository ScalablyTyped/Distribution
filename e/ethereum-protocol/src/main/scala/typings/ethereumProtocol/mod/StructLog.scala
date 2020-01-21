package typings.ethereumProtocol.mod

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
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], gas = gas.asInstanceOf[js.Any], gasCost = gasCost.asInstanceOf[js.Any], memory = memory.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], pc = pc.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StructLog]
  }
}

