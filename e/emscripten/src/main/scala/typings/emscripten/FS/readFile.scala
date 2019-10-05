package typings.emscripten.FS

import typings.emscripten.Anon_Binary
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FS.readFile")
@js.native
object readFile extends js.Object {
  def apply(path: String): String | Uint8Array = js.native
  def apply(path: String, opts: Anon_Binary): String | Uint8Array = js.native
}

