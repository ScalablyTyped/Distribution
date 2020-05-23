package typings.fsPromise.mod

import typings.node.NodeJS.ErrnoException
import typings.node.fsMod.NoParamCallback
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-promise", "rename")
@js.native
object rename extends js.Object {
  def apply(oldPath: String, newPath: String): js.Promise[Unit] = js.native
  def apply(oldPath: String, newPath: String, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(oldPath: PathLike, newPath: PathLike): js.Promise[Unit] = js.native
  def apply(oldPath: PathLike, newPath: PathLike, callback: NoParamCallback): Unit = js.native
}

