package typings.fsDashPromise.fsDashPromiseMod

import typings.node.Buffer
import typings.node.NodeJS.ErrnoException
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("fs-promise", "exists")
@js.native
object exists extends js.Object {
  def apply(path: String): js.Promise[Boolean] = js.native
  def apply(path: String, callback: js.Function2[/* err */ ErrnoException, /* exists */ Boolean, Unit]): Unit = js.native
  def apply(path: Buffer, callback: js.Function2[/* err */ ErrnoException, /* exists */ Boolean, Unit]): Unit = js.native
  /**
    * Asynchronously tests whether or not the given path exists by checking with the file system.
    * @deprecated
    * @param path A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    */
  def apply(path: PathLike, callback: js.Function1[/* exists */ Boolean, Unit]): Unit = js.native
  /**
    * @param path A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    */
  def __promisify__(path: PathLike): js.Promise[Boolean] = js.native
}

