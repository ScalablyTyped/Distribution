package typings.fsPlus.mod

import typings.node.fsMod.NoParamCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-plus", "ftruncate")
@js.native
object ftruncate extends js.Object {
  def apply(fd: Double, callback: NoParamCallback): Unit = js.native
  def apply(fd: Double, len: js.UndefOr[Double | Null], callback: NoParamCallback): Unit = js.native
  /**
    * Asynchronous ftruncate(2) - Truncate a file to a specified length.
    * @param fd A file descriptor.
    * @param len If not specified, defaults to `0`.
    */
  @JSName("__promisify__")
  def promisify(fd: Double): js.Promise[Unit] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, len: Double): js.Promise[Unit] = js.native
}

