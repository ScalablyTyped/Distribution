package typings.electron.originalFsMod

import typings.node.fsMod.NoParamCallback
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("original-fs", "access")
@js.native
object access extends js.Object {
  def apply(path: PathLike, callback: NoParamCallback): Unit = js.native
  def apply(path: PathLike, mode: js.UndefOr[scala.Nothing], callback: NoParamCallback): Unit = js.native
  def apply(path: PathLike, mode: Double, callback: NoParamCallback): Unit = js.native
  /**
    * Asynchronously tests a user's permissions for the file specified by path.
    * @param path A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    */
  @JSName("__promisify__")
  def promisify(path: PathLike): js.Promise[Unit] = js.native
  @JSName("__promisify__")
  def promisify(path: PathLike, mode: Double): js.Promise[Unit] = js.native
}

