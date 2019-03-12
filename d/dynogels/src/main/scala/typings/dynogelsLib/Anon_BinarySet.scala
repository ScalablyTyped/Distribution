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
    binarySet: () => joiLib.joiMod.AnySchema,
    numberSet: () => joiLib.joiMod.AnySchema,
    stringSet: () => joiLib.joiMod.AnySchema,
    timeUUID: () => joiLib.joiMod.AnySchema,
    uuid: () => joiLib.joiMod.AnySchema
  ): Anon_BinarySet = {
    val __obj = js.Dynamic.literal(binarySet = js.Any.fromFunction0(binarySet), numberSet = js.Any.fromFunction0(numberSet), stringSet = js.Any.fromFunction0(stringSet), timeUUID = js.Any.fromFunction0(timeUUID), uuid = js.Any.fromFunction0(uuid))
  
    __obj.asInstanceOf[Anon_BinarySet]
  }
}

