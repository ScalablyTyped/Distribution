package typings.emscripten.FS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FS.chmod")
@js.native
object chmod extends js.Object {
  def apply(path: String, mode: Double): Unit = js.native
  def apply(path: String, mode: Double, dontFollow: Boolean): Unit = js.native
}

