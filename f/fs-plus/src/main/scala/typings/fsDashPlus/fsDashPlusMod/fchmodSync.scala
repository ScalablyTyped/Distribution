package typings.fsDashPlus.fsDashPlusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-plus", "fchmodSync")
@js.native
object fchmodSync extends js.Object {
  /**
    * Synchronous fchmod(2) - Change permissions of a file.
    * @param fd A file descriptor.
    * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
    */
  def apply(fd: Double, mode: String): Unit = js.native
  def apply(fd: Double, mode: Double): Unit = js.native
}

