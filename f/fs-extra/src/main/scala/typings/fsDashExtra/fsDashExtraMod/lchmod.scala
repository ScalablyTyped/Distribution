package typings.fsDashExtra.fsDashExtraMod

import typings.node.NodeJS.ErrnoException
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("fs-extra", "lchmod")
@js.native
object lchmod extends js.Object {
  /**
    * Asynchronous lchmod(2) - Change permissions of a file. Does not dereference symbolic links.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
    */
  def apply(path: PathLike, mode: String, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = js.native
  def apply(path: PathLike, mode: Double, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = js.native
  /**
    * Asynchronous lchmod(2) - Change permissions of a file. Does not dereference symbolic links.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
    */
  def __promisify__(path: PathLike, mode: String): js.Promise[Unit] = js.native
  def __promisify__(path: PathLike, mode: Double): js.Promise[Unit] = js.native
}

