package typings.emberUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type FunctionArgs[F] = (js.Tuple5[js.Any, js.Any, js.Any, js.Any, js.Any]) | (js.Tuple4[js.Any, js.Any, js.Any, js.Any]) | (js.Tuple3[js.Any, js.Any, js.Any]) | (js.Tuple2[js.Any, js.Any]) | js.Array[js.Any]
  type KeysOfType[Base, Condition] = /* keyof std.Pick<Base, {[ Key in keyof Base ]: Base[Key] extends Condition? Key : never}[keyof Base]> */ java.lang.String
  type TypeOf[Base, Condition] = (typings.emberUtils.typesMod.KeysOfType[Base, Condition]) | typings.emberUtils.emberUtilsStrings.`object`
}
