package typings.emscripten.FS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FS.createLazyFile")
@js.native
object createLazyFile extends js.Object {
  def apply(parent: String, name: String, url: String, canRead: Boolean, canWrite: Boolean): FSNode = js.native
  def apply(parent: FSNode, name: String, url: String, canRead: Boolean, canWrite: Boolean): FSNode = js.native
}

