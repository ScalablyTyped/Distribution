package typings.fsExtraPromise.mod

import typings.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-extra-promise", "fchown")
@js.native
object fchown extends js.Object {
  
  def apply(fd: Double, uid: Double, gid: Double): js.Promise[Unit] = js.native
  def apply(fd: Double, uid: Double, gid: Double, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
}
