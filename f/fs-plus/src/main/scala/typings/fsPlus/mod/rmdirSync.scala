package typings.fsPlus.mod

import typings.node.fsMod.PathLike
import typings.node.fsMod.RmDirOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-plus", "rmdirSync")
@js.native
object rmdirSync extends js.Object {
  def apply(path: PathLike): Unit = js.native
  def apply(path: PathLike, options: RmDirOptions): Unit = js.native
}

