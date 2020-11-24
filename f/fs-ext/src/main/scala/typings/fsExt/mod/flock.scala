package typings.fsExt.mod

import typings.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-ext", "flock")
@js.native
object flock extends js.Object {
  
  def apply(fd: Double, flags: Double, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = js.native
}
