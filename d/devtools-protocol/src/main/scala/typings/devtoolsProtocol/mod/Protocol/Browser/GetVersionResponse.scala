package typings.devtoolsProtocol.mod.Protocol.Browser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetVersionResponse extends js.Object {
  
  /**
    * V8 version.
    */
  var jsVersion: String = js.native
  
  /**
    * Product name.
    */
  var product: String = js.native
  
  /**
    * Protocol version.
    */
  var protocolVersion: String = js.native
  
  /**
    * Product revision.
    */
  var revision: String = js.native
  
  /**
    * User-Agent.
    */
  var userAgent: String = js.native
}
object GetVersionResponse {
  
  @scala.inline
  def apply(jsVersion: String, product: String, protocolVersion: String, revision: String, userAgent: String): GetVersionResponse = {
    val __obj = js.Dynamic.literal(jsVersion = jsVersion.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any], protocolVersion = protocolVersion.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], userAgent = userAgent.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVersionResponse]
  }
  
  @scala.inline
  implicit class GetVersionResponseOps[Self <: GetVersionResponse] (val x: Self) extends AnyVal {
    
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
    def setJsVersion(value: String): Self = this.set("jsVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProduct(value: String): Self = this.set("product", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolVersion(value: String): Self = this.set("protocolVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevision(value: String): Self = this.set("revision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserAgent(value: String): Self = this.set("userAgent", value.asInstanceOf[js.Any])
  }
}
