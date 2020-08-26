package typings.elasticElasticsearch.connectionMod

import typings.elasticElasticsearch.poolMod.ApiKeyAuth
import typings.elasticElasticsearch.poolMod.BasicAuth
import typings.node.urlMod.URL_
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionOptions extends js.Object {
  var agent: js.UndefOr[AgentOptions | agentFn] = js.native
  var auth: js.UndefOr[BasicAuth | ApiKeyAuth] = js.native
  var headers: js.UndefOr[Record[String, _]] = js.native
  var id: js.UndefOr[String] = js.native
  var roles: js.UndefOr[ConnectionRoles] = js.native
  var ssl: js.UndefOr[typings.node.tlsMod.ConnectionOptions] = js.native
  var status: js.UndefOr[String] = js.native
  var url: URL_ = js.native
}

object ConnectionOptions {
  @scala.inline
  def apply(url: URL_): ConnectionOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionOptions]
  }
  @scala.inline
  implicit class ConnectionOptionsOps[Self <: ConnectionOptions] (val x: Self) extends AnyVal {
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
    def setUrl(value: URL_): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setAgentFunction0(value: () => js.Any): Self = this.set("agent", js.Any.fromFunction0(value))
    @scala.inline
    def setAgent(value: AgentOptions | agentFn): Self = this.set("agent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgent: Self = this.set("agent", js.undefined)
    @scala.inline
    def setAuth(value: BasicAuth | ApiKeyAuth): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setHeaders(value: Record[String, _]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setRoles(value: ConnectionRoles): Self = this.set("roles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoles: Self = this.set("roles", js.undefined)
    @scala.inline
    def setSsl(value: typings.node.tlsMod.ConnectionOptions): Self = this.set("ssl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSsl: Self = this.set("ssl", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

