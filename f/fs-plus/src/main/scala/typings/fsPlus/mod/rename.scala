package typings.fsPlus.mod

import typings.node.fsMod.NoParamCallback
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-plus", "rename")
@js.native
object rename extends js.Object {
  def apply(oldPath: PathLike, newPath: PathLike, callback: NoParamCallback): Unit = js.native
  /**
    * Asynchronous rename(2) - Change the name or location of a file or directory.
    * @param oldPath A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    * @param newPath A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    */
  @JSName("__promisify__")
  def promisify(oldPath: PathLike, newPath: PathLike): js.Promise[Unit] = js.native
}

