package typings.fsPromise.mod

import typings.node.Buffer
import typings.node.NodeJS.ErrnoException
import typings.node.fsMod.MakeDirectoryOptions
import typings.node.fsMod.NoParamCallback
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-promise", "mkdir")
@js.native
object mkdir extends js.Object {
  def apply(path: String): js.Promise[Unit] = js.native
  def apply(path: String, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(path: String, mode: String, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(path: String, mode: Double, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(path: Buffer): js.Promise[Unit] = js.native
  def apply(path: Buffer, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(path: Buffer, mode: String, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(path: Buffer, mode: Double, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(path: PathLike): js.Promise[Unit] = js.native
  def apply(path: PathLike, callback: NoParamCallback): Unit = js.native
  def apply(
    path: PathLike,
    options: js.UndefOr[Double | MakeDirectoryOptions | Null | String],
    callback: NoParamCallback
  ): Unit = js.native
  def apply(path: PathLike, options: String): js.Promise[Unit] = js.native
  def apply(path: PathLike, options: Double): js.Promise[Unit] = js.native
  def apply(path: PathLike, options: MakeDirectoryOptions): js.Promise[Unit] = js.native
}

