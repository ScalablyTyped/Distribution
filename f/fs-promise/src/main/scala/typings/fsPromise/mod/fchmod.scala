package typings.fsPromise.mod

import typings.fsExtra.mod.Mode
import typings.node.NodeJS.ErrnoException
import typings.node.fsMod.NoParamCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-promise", "fchmod")
@js.native
object fchmod extends js.Object {
  
  def apply(fd: Double, mode: String): js.Promise[Unit] = js.native
  def apply(fd: Double, mode: String, callback: NoParamCallback): Unit = js.native
  def apply(fd: Double, mode: Double): js.Promise[Unit] = js.native
  def apply(fd: Double, mode: Double, callback: NoParamCallback): Unit = js.native
  def apply(fd: Double, mode: Mode): js.Promise[Unit] = js.native
  def apply(fd: Double, mode: Mode, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
}
