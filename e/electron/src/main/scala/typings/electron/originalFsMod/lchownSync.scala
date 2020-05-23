package typings.electron.originalFsMod

import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("original-fs", "lchownSync")
@js.native
object lchownSync extends js.Object {
  def apply(path: PathLike, uid: Double, gid: Double): Unit = js.native
}

