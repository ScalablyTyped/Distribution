package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Input stream backed by a file descriptor.
  *
  * Only available on UNIX-like OSes.
  */
@JSGlobal("UnixInputStream")
@js.native
class UnixInputStream protected () extends InputStream {
  /**
    * Creates a new input stream from the specified file descriptor `fd`.
    *
    * @param fd File descriptor to read from.
    * @param options Options to customize the stream.
    */
  def this(fd: Double) = this()
  def this(fd: Double, options: UnixStreamOptions) = this()
}

