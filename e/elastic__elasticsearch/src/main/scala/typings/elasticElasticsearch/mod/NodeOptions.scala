package typings.elasticElasticsearch.mod

import typings.elasticElasticsearch.anon.Data
import typings.elasticElasticsearch.connectionMod.AgentOptions
import typings.node.tlsMod.ConnectionOptions
import typings.node.urlMod.URL_
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// /Extend API
@js.native
trait NodeOptions extends js.Object {
  
  var agent: js.UndefOr[AgentOptions] = js.native
  
  var headers: js.UndefOr[Record[String, _]] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var roles: js.UndefOr[Data] = js.native
  
  var ssl: js.UndefOr[ConnectionOptions] = js.native
  
  var url: URL_ = js.native
}
object NodeOptions {
  
  @scala.inline
  def apply(url: URL_): NodeOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeOptions]
  }
  
  @scala.inline
  implicit class NodeOptionsOps[Self <: NodeOptions] (val x: Self) extends AnyVal {
    
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
    def setAgent(value: AgentOptions): Self = this.set("agent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgent: Self = this.set("agent", js.undefined)
    
    @scala.inline
    def setHeaders(value: Record[String, _]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setRoles(value: Data): Self = this.set("roles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoles: Self = this.set("roles", js.undefined)
    
    @scala.inline
    def setSsl(value: ConnectionOptions): Self = this.set("ssl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSsl: Self = this.set("ssl", js.undefined)
  }
}
