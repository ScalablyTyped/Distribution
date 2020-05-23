package typings.electron.originalFsMod

import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("original-fs", "accessSync")
@js.native
object accessSync extends js.Object {
  def apply(path: PathLike): Unit = js.native
  def apply(path: PathLike, mode: Double): Unit = js.native
}

