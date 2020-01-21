package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SocketConnection")
@js.native
abstract class SocketConnection () extends IOStream {
  /**
    * Disables the Nagle algorithm if `noDelay` is `true`, otherwise enables it. The Nagle algorithm is enabled
    * by default, so it is only necessary to call this method if you wish to optimize for low delay instead of
    * high throughput.
    */
  def setNoDelay(noDelay: Boolean): js.Promise[Unit] = js.native
}

