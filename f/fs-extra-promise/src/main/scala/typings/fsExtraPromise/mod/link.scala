package typings.fsExtraPromise.mod

import typings.node.Buffer
import typings.node.NodeJS.ErrnoException
import typings.node.fsMod.NoParamCallback
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("fs-extra-promise", "link")
@js.native
object link extends js.Object {
  /**
    * Asynchronous link(2) - Create a new link (also known as a hard link) to an existing file.
    * @param existingPath A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param newPath A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def apply(existingPath: PathLike, newPath: PathLike, callback: NoParamCallback): Unit = js.native
  def apply(srcpath: String, dstpath: String): js.Promise[Unit] = js.native
  def apply(srcpath: String, dstpath: String, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(srcpath: String, dstpath: Buffer): js.Promise[Unit] = js.native
  def apply(srcpath: String, dstpath: Buffer, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(srcpath: Buffer, dstpath: String): js.Promise[Unit] = js.native
  def apply(srcpath: Buffer, dstpath: String, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(srcpath: Buffer, dstpath: Buffer): js.Promise[Unit] = js.native
  def apply(srcpath: Buffer, dstpath: Buffer, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  /**
    * Asynchronous link(2) - Create a new link (also known as a hard link) to an existing file.
    * @param existingPath A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param newPath A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  @JSName("__promisify__")
  def promisify(existingPath: PathLike, newPath: PathLike): js.Promise[Unit] = js.native
}

