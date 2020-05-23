package typings.electron.originalFsMod

import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("original-fs", "truncateSync")
@js.native
object truncateSync extends js.Object {
  def apply(path: PathLike): Unit = js.native
  def apply(path: PathLike, len: Double): Unit = js.native
}

