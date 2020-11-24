package typings.devtoolsProtocol.protocolProxyApiMod.ProtocolProxyApi

import typings.devtoolsProtocol.mod.Protocol.Schema.GetDomainsResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaApi extends js.Object {
  
  /**
    * Returns supported domains.
    */
  def getDomains(): js.Promise[GetDomainsResponse] = js.native
}
object SchemaApi {
  
  @scala.inline
  def apply(getDomains: () => js.Promise[GetDomainsResponse]): SchemaApi = {
    val __obj = js.Dynamic.literal(getDomains = js.Any.fromFunction0(getDomains))
    __obj.asInstanceOf[SchemaApi]
  }
  
  @scala.inline
  implicit class SchemaApiOps[Self <: SchemaApi] (val x: Self) extends AnyVal {
    
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
    def setGetDomains(value: () => js.Promise[GetDomainsResponse]): Self = this.set("getDomains", js.Any.fromFunction0(value))
  }
}
