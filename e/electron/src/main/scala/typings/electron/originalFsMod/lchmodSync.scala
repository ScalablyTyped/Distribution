package typings.electron.originalFsMod

import typings.node.fsMod.Mode
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("original-fs", "lchmodSync")
@js.native
object lchmodSync extends js.Object {
  def apply(path: PathLike, mode: Mode): Unit = js.native
}

