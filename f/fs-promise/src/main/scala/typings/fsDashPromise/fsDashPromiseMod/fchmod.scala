package typings.fsDashPromise.fsDashPromiseMod

import typings.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("fs-promise", "fchmod")
@js.native
object fchmod extends js.Object {
  def apply(fd: Double, mode: String): js.Promise[Unit] = js.native
  /**
    * Asynchronous fchmod(2) - Change permissions of a file.
    * @param fd A file descriptor.
    * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
    */
  def apply(fd: Double, mode: String, callback: js.Function1[js.UndefOr[ErrnoException | Null], Unit]): Unit = js.native
  def apply(fd: Double, mode: Double): js.Promise[Unit] = js.native
  def apply(fd: Double, mode: Double, callback: js.Function1[js.UndefOr[ErrnoException | Null], Unit]): Unit = js.native
  /**
    * Asynchronous fchmod(2) - Change permissions of a file.
    * @param fd A file descriptor.
    * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
    */
  def __promisify__(fd: Double, mode: String): js.Promise[Unit] = js.native
  def __promisify__(fd: Double, mode: Double): js.Promise[Unit] = js.native
}

