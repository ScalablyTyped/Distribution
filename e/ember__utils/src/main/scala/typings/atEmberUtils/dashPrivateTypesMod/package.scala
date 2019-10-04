package typings.atEmberUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dashPrivateTypesMod {
  import typings.atEmberUtils.atEmberUtilsStrings.`object`

  type FunctionArgs[F] = (js.Tuple5[js.Any, js.Any, js.Any, js.Any, js.Any]) | (js.Tuple4[js.Any, js.Any, js.Any, js.Any]) | (js.Tuple3[js.Any, js.Any, js.Any]) | (js.Tuple2[js.Any, js.Any]) | js.Array[js.Any]
  type KeysOfType[Base, Condition] = String
  type TypeOf[Base, Condition] = (KeysOfType[Base, Condition]) | `object`
}
