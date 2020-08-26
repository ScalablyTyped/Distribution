package typings.elasticElasticsearch.connectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentOptions extends js.Object {
  var keepAlive: js.UndefOr[Boolean] = js.native
  var keepAliveMsecs: js.UndefOr[Double] = js.native
  var maxFreeSockets: js.UndefOr[Double] = js.native
  var maxSockets: js.UndefOr[Double] = js.native
}

object AgentOptions {
  @scala.inline
  def apply(): AgentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgentOptions]
  }
  @scala.inline
  implicit class AgentOptionsOps[Self <: AgentOptions] (val x: Self) extends AnyVal {
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
    def setKeepAlive(value: Boolean): Self = this.set("keepAlive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepAlive: Self = this.set("keepAlive", js.undefined)
    @scala.inline
    def setKeepAliveMsecs(value: Double): Self = this.set("keepAliveMsecs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepAliveMsecs: Self = this.set("keepAliveMsecs", js.undefined)
    @scala.inline
    def setMaxFreeSockets(value: Double): Self = this.set("maxFreeSockets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxFreeSockets: Self = this.set("maxFreeSockets", js.undefined)
    @scala.inline
    def setMaxSockets(value: Double): Self = this.set("maxSockets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxSockets: Self = this.set("maxSockets", js.undefined)
  }
  
}

