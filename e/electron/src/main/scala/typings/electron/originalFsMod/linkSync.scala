package typings.electron.originalFsMod

import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("original-fs", "linkSync")
@js.native
object linkSync extends js.Object {
  def apply(existingPath: PathLike, newPath: PathLike): Unit = js.native
}

