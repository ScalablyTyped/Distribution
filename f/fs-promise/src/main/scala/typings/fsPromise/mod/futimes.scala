package typings.fsPromise.mod

import typings.node.NodeJS.ErrnoException
import typings.node.fsMod.NoParamCallback
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-promise", "futimes")
@js.native
object futimes extends js.Object {
  
  def apply(fd: Double, atime: String, mtime: String): js.Promise[Unit] = js.native
  def apply(fd: Double, atime: String, mtime: String, callback: NoParamCallback): Unit = js.native
  def apply(fd: Double, atime: String, mtime: Double): js.Promise[Unit] = js.native
  def apply(fd: Double, atime: String, mtime: Double, callback: NoParamCallback): Unit = js.native
  def apply(fd: Double, atime: String, mtime: Date): js.Promise[Unit] = js.native
  def apply(fd: Double, atime: String, mtime: Date, callback: NoParamCallback): Unit = js.native
  def apply(fd: Double, atime: Double, mtime: String): js.Promise[Unit] = js.native
  def apply(fd: Double, atime: Double, mtime: String, callback: NoParamCallback): Unit = js.native
  def apply(fd: Double, atime: Double, mtime: Double): js.Promise[Unit] = js.native
  def apply(
    fd: Double,
    atime: Double,
    mtime: Double,
    callback: (js.Function1[/* err */ ErrnoException, Unit]) | NoParamCallback
  ): Unit = js.native
  def apply(fd: Double, atime: Double, mtime: Date): js.Promise[Unit] = js.native
  def apply(fd: Double, atime: Double, mtime: Date, callback: NoParamCallback): Unit = js.native
  def apply(fd: Double, atime: Date, mtime: String): js.Promise[Unit] = js.native
  def apply(fd: Double, atime: Date, mtime: String, callback: NoParamCallback): Unit = js.native
  def apply(fd: Double, atime: Date, mtime: Double): js.Promise[Unit] = js.native
  def apply(fd: Double, atime: Date, mtime: Double, callback: NoParamCallback): Unit = js.native
  def apply(fd: Double, atime: Date, mtime: Date): js.Promise[Unit] = js.native
  def apply(
    fd: Double,
    atime: Date,
    mtime: Date,
    callback: (js.Function1[/* err */ ErrnoException, Unit]) | NoParamCallback
  ): Unit = js.native
}
