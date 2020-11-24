package typings.fsPlus.mod

import typings.node.anon.EmitClose
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-plus", "createWriteStream")
@js.native
object createWriteStream extends js.Object {
  
  def apply(path: PathLike): typings.node.fsMod.WriteStream = js.native
  def apply(path: PathLike, options: String): typings.node.fsMod.WriteStream = js.native
  def apply(path: PathLike, options: EmitClose): typings.node.fsMod.WriteStream = js.native
}
