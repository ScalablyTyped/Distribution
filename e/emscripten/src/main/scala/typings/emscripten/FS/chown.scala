package typings.emscripten.FS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FS.chown")
@js.native
object chown extends js.Object {
  def apply(path: String, uid: Double, gid: Double): Unit = js.native
  def apply(path: String, uid: Double, gid: Double, dontFollow: Boolean): Unit = js.native
}

