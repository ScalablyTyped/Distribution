package typings.emscripten.FS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FS.utime")
@js.native
object utime extends js.Object {
  def apply(path: String, atime: Double, mtime: Double): Unit = js.native
}

