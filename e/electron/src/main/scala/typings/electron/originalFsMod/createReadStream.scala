package typings.electron.originalFsMod

import typings.node.anon.AutoClose
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("original-fs", "createReadStream")
@js.native
object createReadStream extends js.Object {
  def apply(path: PathLike): typings.node.fsMod.ReadStream = js.native
  def apply(path: PathLike, options: String): typings.node.fsMod.ReadStream = js.native
  def apply(path: PathLike, options: AutoClose): typings.node.fsMod.ReadStream = js.native
}

