package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PreconnectOptions extends js.Object {
  /**
    * number of sockets to preconnect. Must be between 1 and 6. Defaults to 1.
    */
  var numSockets: js.UndefOr[Double] = js.native
  /**
    * URL for preconnect. Only the origin is relevant for opening the socket.
    */
  var url: String = js.native
}

object PreconnectOptions {
  @scala.inline
  def apply(url: String): PreconnectOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreconnectOptions]
  }
  @scala.inline
  implicit class PreconnectOptionsOps[Self <: PreconnectOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumSockets(value: Double): Self = this.set("numSockets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumSockets: Self = this.set("numSockets", js.undefined)
  }
  
}

