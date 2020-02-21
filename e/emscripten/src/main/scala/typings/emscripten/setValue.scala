package typings.emscripten

import typings.emscripten.Emscripten.CType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("setValue")
@js.native
object setValue extends js.Object {
  def apply(ptr: Double, value: js.Any, `type`: CType): Unit = js.native
  def apply(ptr: Double, value: js.Any, `type`: CType, noSafe: Boolean): Unit = js.native
}

