package typings.fsExt.mod

import typings.fsExt.fsExtStrings.un
import typings.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-ext", "flock")
@js.native
object flock_un extends js.Object {
  def apply(fd: Double, flags: un, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = js.native
}

