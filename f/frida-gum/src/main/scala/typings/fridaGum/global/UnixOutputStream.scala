package typings.fridaGum.global

import typings.fridaGum.UnixStreamOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Output stream backed by a file descriptor.
  *
  * Only available on UNIX-like OSes.
  */
@JSGlobal("UnixOutputStream")
@js.native
class UnixOutputStream protected ()
  extends StObject
     with typings.fridaGum.OutputStream {
  /**
    * Creates a new output stream from the specified file descriptor `fd`.
    *
    * @param fd File descriptor to write to.
    * @param options Options to customize the stream.
    */
  def this(fd: Double) = this()
  def this(fd: Double, options: UnixStreamOptions) = this()
}
