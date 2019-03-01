package typings
package ethereumDashProtocolLib.ethereumDashProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StructLog extends js.Object {
  var depth: scala.Double
  var error: java.lang.String
  var gas: scala.Double
  var gasCost: scala.Double
  var memory: js.Array[java.lang.String]
  var op: OpCode
  var pc: scala.Double
  var stack: js.Array[java.lang.String]
  var storage: org.scalablytyped.runtime.StringDictionary[java.lang.String]
}

object StructLog {
  @scala.inline
  def apply(
    depth: scala.Double,
    error: java.lang.String,
    gas: scala.Double,
    gasCost: scala.Double,
    memory: js.Array[java.lang.String],
    op: OpCode,
    pc: scala.Double,
    stack: js.Array[java.lang.String],
    storage: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  ): StructLog = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("depth")(depth)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("gas")(gas)
    __obj.updateDynamic("gasCost")(gasCost)
    __obj.updateDynamic("memory")(memory)
    __obj.updateDynamic("op")(op)
    __obj.updateDynamic("pc")(pc)
    __obj.updateDynamic("stack")(stack)
    __obj.updateDynamic("storage")(storage)
    __obj.asInstanceOf[StructLog]
  }
}

