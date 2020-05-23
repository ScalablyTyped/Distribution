package typings.electron.originalFsMod

import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("original-fs", "statSync")
@js.native
object statSync extends js.Object {
  def apply(path: PathLike): typings.node.fsMod.Stats = js.native
}

