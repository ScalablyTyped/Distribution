package typings.electron.originalFsMod

import typings.node.fsMod.PathLike
import typings.node.fsMod.RmOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("original-fs", "rmSync")
@js.native
object rmSync extends js.Object {
  
  def apply(path: PathLike): Unit = js.native
  def apply(path: PathLike, options: RmOptions): Unit = js.native
}
