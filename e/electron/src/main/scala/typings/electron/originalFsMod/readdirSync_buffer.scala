package typings.electron.originalFsMod

import typings.electron.electronStrings.buffer
import typings.node.Buffer
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("original-fs", "readdirSync")
@js.native
object readdirSync_buffer extends js.Object {
  
  def apply(path: PathLike, options: buffer): js.Array[Buffer] = js.native
}
