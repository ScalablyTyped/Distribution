package typings.electron.originalFsMod

import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("original-fs", "existsSync")
@js.native
object existsSync extends js.Object {
  def apply(path: PathLike): Boolean = js.native
}

