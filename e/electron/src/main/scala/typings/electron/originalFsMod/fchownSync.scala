package typings.electron.originalFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("original-fs", "fchownSync")
@js.native
object fchownSync extends js.Object {
  /**
    * Synchronous fchown(2) - Change ownership of a file.
    * @param fd A file descriptor.
    */
  def apply(fd: Double, uid: Double, gid: Double): Unit = js.native
}

