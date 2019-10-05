package typings.emscripten.FS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FS.open")
@js.native
object open extends js.Object {
  def apply(path: String, flags: String): FSStream = js.native
  def apply(path: String, flags: String, mode: Double): FSStream = js.native
  def apply(path: String, flags: String, mode: Double, fd_start: Double): FSStream = js.native
  def apply(path: String, flags: String, mode: Double, fd_start: Double, fd_end: Double): FSStream = js.native
}

