package typings.fsDashPromise.fsDashPromiseMod

import typings.node.Buffer
import typings.node.NodeJS.ErrnoException
import typings.node.fsMod.NoParamCallback
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("fs-promise", "chmod")
@js.native
object chmod extends js.Object {
  def apply(path: String, mode: String): js.Promise[Unit] = js.native
  def apply(path: String, mode: String, callback: js.Function1[js.UndefOr[ErrnoException], Unit]): Unit = js.native
  def apply(path: String, mode: Double): js.Promise[Unit] = js.native
  def apply(path: String, mode: Double, callback: js.Function1[js.UndefOr[ErrnoException], Unit]): Unit = js.native
  def apply(path: Buffer, mode: String): js.Promise[Unit] = js.native
  def apply(path: Buffer, mode: String, callback: js.Function1[js.UndefOr[ErrnoException], Unit]): Unit = js.native
  def apply(path: Buffer, mode: Double): js.Promise[Unit] = js.native
  def apply(path: Buffer, mode: Double, callback: js.Function1[js.UndefOr[ErrnoException], Unit]): Unit = js.native
  /**
    * Asynchronous chmod(2) - Change permissions of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
    */
  def apply(path: PathLike, mode: String, callback: NoParamCallback): Unit = js.native
  def apply(path: PathLike, mode: Double, callback: NoParamCallback): Unit = js.native
  /**
    * Asynchronous chmod(2) - Change permissions of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
    */
  def __promisify__(path: PathLike, mode: String): js.Promise[Unit] = js.native
  def __promisify__(path: PathLike, mode: Double): js.Promise[Unit] = js.native
}

