package typings.emscripten.FS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FS.stat")
@js.native
object stat extends js.Object {
  def apply(path: String): js.Any = js.native
  def apply(path: String, dontFollow: Boolean): js.Any = js.native
}

