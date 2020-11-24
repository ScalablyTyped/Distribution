package typings.fsPromise.mod

import typings.node.fsMod.Mode
import typings.node.fsMod.NoParamCallback
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-promise", "lchmod")
@js.native
object lchmod extends js.Object {
  
  def apply(path: PathLike, mode: String): js.Promise[Unit] = js.native
  def apply(path: PathLike, mode: String, callback: NoParamCallback): Unit = js.native
  def apply(path: PathLike, mode: Double): js.Promise[Unit] = js.native
  def apply(path: PathLike, mode: Double, callback: NoParamCallback): Unit = js.native
  def apply(path: PathLike, mode: Mode, callback: NoParamCallback): Unit = js.native
}
