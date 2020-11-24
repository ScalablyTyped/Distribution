package typings.devtoolsProtocol.mod.Protocol.Network

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CachedResource extends js.Object {
  
  /**
    * Cached response body size.
    */
  var bodySize: Double = js.native
  
  /**
    * Cached response data.
    */
  var response: js.UndefOr[Response] = js.native
  
  /**
    * Type of this resource.
    */
  var `type`: ResourceType = js.native
  
  /**
    * Resource URL. This is the url of the original network request.
    */
  var url: String = js.native
}
object CachedResource {
  
  @scala.inline
  def apply(bodySize: Double, `type`: ResourceType, url: String): CachedResource = {
    val __obj = js.Dynamic.literal(bodySize = bodySize.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CachedResource]
  }
  
  @scala.inline
  implicit class CachedResourceOps[Self <: CachedResource] (val x: Self) extends AnyVal {
    
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
    def setBodySize(value: Double): Self = this.set("bodySize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ResourceType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: Response): Self = this.set("response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponse: Self = this.set("response", js.undefined)
  }
}
