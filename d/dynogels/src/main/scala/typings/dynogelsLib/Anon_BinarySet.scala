package typings
package dynogelsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BinarySet extends js.Object {
  def binarySet(): joiLib.joiMod.AnySchema
  def numberSet(): joiLib.joiMod.AnySchema
  def stringSet(): joiLib.joiMod.AnySchema
  def timeUUID(): joiLib.joiMod.AnySchema
  def uuid(): joiLib.joiMod.AnySchema
}

object Anon_BinarySet {
  @scala.inline
  def apply(
    binarySet: js.Function0[joiLib.joiMod.AnySchema],
    numberSet: js.Function0[joiLib.joiMod.AnySchema],
    stringSet: js.Function0[joiLib.joiMod.AnySchema],
    timeUUID: js.Function0[joiLib.joiMod.AnySchema],
    uuid: js.Function0[joiLib.joiMod.AnySchema]
  ): Anon_BinarySet = {
    val __obj = js.Dynamic.literal(binarySet = binarySet, numberSet = numberSet, stringSet = stringSet, timeUUID = timeUUID, uuid = uuid)
  
    __obj.asInstanceOf[Anon_BinarySet]
  }
}

