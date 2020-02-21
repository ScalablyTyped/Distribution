package typings.emscripten

import typings.emscripten.Emscripten.CType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("getValue")
@js.native
object getValue extends js.Object {
  def apply(ptr: Double, `type`: CType): Double = js.native
  def apply(ptr: Double, `type`: CType, noSafe: Boolean): Double = js.native
}

