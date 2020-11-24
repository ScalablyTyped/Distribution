package typings.fsExtra.mod

import typings.fsExtra.fsExtraStrings.buffer
import typings.node.Buffer
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-extra", "readdir")
@js.native
object readdir_buffer extends js.Object {
  
  def apply(path: PathLike, options: buffer): js.Promise[js.Array[Buffer]] = js.native
}
