package typings.emscripten.FS

import typings.emscripten.AnonEncoding
import typings.emscripten.AnonFlags
import typings.emscripten.AnonFlagsString
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FS.readFile")
@js.native
object readFile extends js.Object {
  def apply(path: String): Uint8Array = js.native
  def apply(path: String, opts: AnonEncoding): Uint8Array = js.native
  def apply(path: String, opts: AnonFlags): String = js.native
  def apply(path: String, opts: AnonFlagsString): Uint8Array = js.native
}

