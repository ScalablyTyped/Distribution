package typings.egg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpClientBaseConfig extends js.Object {
  /** Free socket after keepalive timeout */
  var freeSocketKeepAliveTimeout: js.UndefOr[Double] = js.native
  /** Free socket after request timeout */
  var freeSocketTimeout: js.UndefOr[Double] = js.native
  /** Whether use http keepalive */
  var keepAlive: js.UndefOr[Boolean] = js.native
  /** The maximum number of sockets that will be left open in the free state */
  var maxFreeSockets: js.UndefOr[Double] = js.native
  /** Determines how many concurrent sockets the agent can have open per origin */
  var maxSockets: js.UndefOr[Double] = js.native
  /** Request timeout */
  var timeout: js.UndefOr[Double] = js.native
}

object HttpClientBaseConfig {
  @scala.inline
  def apply(): HttpClientBaseConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpClientBaseConfig]
  }
  @scala.inline
  implicit class HttpClientBaseConfigOps[Self <: HttpClientBaseConfig] (val x: Self) extends AnyVal {
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
    def setFreeSocketKeepAliveTimeout(value: Double): Self = this.set("freeSocketKeepAliveTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFreeSocketKeepAliveTimeout: Self = this.set("freeSocketKeepAliveTimeout", js.undefined)
    @scala.inline
    def setFreeSocketTimeout(value: Double): Self = this.set("freeSocketTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFreeSocketTimeout: Self = this.set("freeSocketTimeout", js.undefined)
    @scala.inline
    def setKeepAlive(value: Boolean): Self = this.set("keepAlive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepAlive: Self = this.set("keepAlive", js.undefined)
    @scala.inline
    def setMaxFreeSockets(value: Double): Self = this.set("maxFreeSockets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxFreeSockets: Self = this.set("maxFreeSockets", js.undefined)
    @scala.inline
    def setMaxSockets(value: Double): Self = this.set("maxSockets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxSockets: Self = this.set("maxSockets", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

