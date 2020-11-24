package typings.fsExtraPromise.mod

import typings.node.NodeJS.ErrnoException
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-extra-promise", "futimes")
@js.native
object futimes extends js.Object {
  
  def apply(fd: Double, atime: Double, mtime: Double): js.Promise[Unit] = js.native
  def apply(fd: Double, atime: Double, mtime: Double, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(fd: Double, atime: Date, mtime: Date): js.Promise[Unit] = js.native
  def apply(fd: Double, atime: Date, mtime: Date, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
}
