package typings.emscripten.FS

import typings.emscripten.Emscripten.FileSystemType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FS.mount")
@js.native
object mount extends js.Object {
  def apply(`type`: FileSystemType, opts: js.Any, mountpoint: String): js.Any = js.native
}

