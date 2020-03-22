package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreconnectOptions extends js.Object {
  /**
    * number of sockets to preconnect. Must be between 1 and 6. Defaults to 1.
    */
  var numSockets: js.UndefOr[Double] = js.undefined
  /**
    * URL for preconnect. Only the origin is relevant for opening the socket.
    */
  var url: String
}

object PreconnectOptions {
  @scala.inline
  def apply(url: String, numSockets: Int | Double = null): PreconnectOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (numSockets != null) __obj.updateDynamic("numSockets")(numSockets.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreconnectOptions]
  }
}

