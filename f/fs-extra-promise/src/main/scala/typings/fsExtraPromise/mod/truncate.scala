package typings.fsExtraPromise.mod

import typings.node.Buffer
import typings.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-extra-promise", "truncate")
@js.native
object truncate extends js.Object {
  def apply(path: String): js.Promise[Unit] = js.native
  def apply(path: String, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(path: String, len: Double): js.Promise[Unit] = js.native
  def apply(path: String, len: Double, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(path: Buffer): js.Promise[Unit] = js.native
  def apply(path: Buffer, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(path: Buffer, len: Double): js.Promise[Unit] = js.native
  def apply(path: Buffer, len: Double, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
}

