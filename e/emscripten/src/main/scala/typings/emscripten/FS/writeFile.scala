package typings.emscripten.FS

import typings.emscripten.Anon_Flags
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FS.writeFile")
@js.native
object writeFile extends js.Object {
  def apply(path: String, data: String): Unit = js.native
  def apply(path: String, data: String, opts: Anon_Flags): Unit = js.native
  def apply(path: String, data: ArrayBufferView): Unit = js.native
  def apply(path: String, data: ArrayBufferView, opts: Anon_Flags): Unit = js.native
}

