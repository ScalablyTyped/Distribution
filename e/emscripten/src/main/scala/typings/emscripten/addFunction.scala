package typings.emscripten

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addFunction")
@js.native
object addFunction extends js.Object {
  def apply(func: js.Function1[/* repeated */ js.Any, _]): Double = js.native
  def apply(func: js.Function1[/* repeated */ js.Any, _], signature: String): Double = js.native
}

