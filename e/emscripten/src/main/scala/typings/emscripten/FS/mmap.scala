package typings.emscripten.FS

import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FS.mmap")
@js.native
object mmap extends js.Object {
  def apply(
    stream: FSStream,
    buffer: ArrayBufferView,
    offset: Double,
    length: Double,
    position: Double,
    prot: Double,
    flags: Double
  ): js.Any = js.native
}

