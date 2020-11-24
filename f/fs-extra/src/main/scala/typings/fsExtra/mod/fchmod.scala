package typings.fsExtra.mod

import typings.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-extra", "fchmod")
@js.native
object fchmod extends js.Object {
  
  def apply(fd: Double, mode: Mode): js.Promise[Unit] = js.native
  def apply(fd: Double, mode: Mode, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
}
