package typings.fsExt.mod

import typings.fsExt.fsExtStrings.shnb
import typings.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-ext", "flock")
@js.native
object flock_shnb extends js.Object {
  
  def apply(fd: Double, flags: shnb, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = js.native
}
