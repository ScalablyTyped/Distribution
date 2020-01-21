package typings.electron.originalFsMod

import typings.electron.electronStrings.buffer
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("original-fs", "mkdtempSync")
@js.native
object mkdtempSync_buffer extends js.Object {
  def apply(prefix: String, options: buffer): Buffer = js.native
}

