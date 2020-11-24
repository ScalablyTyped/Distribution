package typings.electron.originalFsMod

import typings.node.fsMod.NoParamCallback
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("original-fs", "lchown")
@js.native
object lchown extends js.Object {
  
  def apply(path: PathLike, uid: Double, gid: Double, callback: NoParamCallback): Unit = js.native
}
