package typings.emscripten.FS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FS.llseek")
@js.native
object llseek extends js.Object {
  def apply(stream: FSStream, offset: Double, whence: Double): js.Any = js.native
}

