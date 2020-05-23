package typings.fsExtraPromise.mod

import typings.node.Buffer
import typings.node.NodeJS.ErrnoException
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-extra-promise", "utimes")
@js.native
object utimes extends js.Object {
  def apply(path: String, atime: Double, mtime: Double): js.Promise[Unit] = js.native
  def apply(path: String, atime: Double, mtime: Double, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(path: String, atime: Date, mtime: Date): js.Promise[Unit] = js.native
  def apply(path: String, atime: Date, mtime: Date, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(path: Buffer, atime: Double, mtime: Double): js.Promise[Unit] = js.native
  def apply(path: Buffer, atime: Double, mtime: Double, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(path: Buffer, atime: Date, mtime: Date): js.Promise[Unit] = js.native
  def apply(path: Buffer, atime: Date, mtime: Date, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
}

