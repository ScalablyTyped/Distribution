package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Output stream backed by a file descriptor.
  *
  * Only available on UNIX-like OSes.
  */
@JSGlobal("UnixOutputStream")
@js.native
class UnixOutputStream protected () extends OutputStream {
  /**
    * Creates a new output stream from the specified file descriptor `fd`.
    *
    * @param fd File descriptor to write to.
    * @param options Options to customize the stream.
    */
  def this(fd: scala.Double) = this()
  def this(fd: scala.Double, options: UnixStreamOptions) = this()
}

