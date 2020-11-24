package typings.devtoolsProtocol.mod.Protocol.Page

import typings.devtoolsProtocol.mod.Protocol.Network.ResourceType
import typings.devtoolsProtocol.mod.Protocol.Network.TimeSinceEpoch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FrameResource extends js.Object {
  
  /**
    * True if the resource was canceled during loading.
    */
  var canceled: js.UndefOr[Boolean] = js.native
  
  /**
    * Resource content size.
    */
  var contentSize: js.UndefOr[Double] = js.native
  
  /**
    * True if the resource failed to load.
    */
  var failed: js.UndefOr[Boolean] = js.native
  
  /**
    * last-modified timestamp as reported by server.
    */
  var lastModified: js.UndefOr[TimeSinceEpoch] = js.native
  
  /**
    * Resource mimeType as determined by the browser.
    */
  var mimeType: String = js.native
  
  /**
    * Type of this resource.
    */
  var `type`: ResourceType = js.native
  
  /**
    * Resource URL.
    */
  var url: String = js.native
}
object FrameResource {
  
  @scala.inline
  def apply(mimeType: String, `type`: ResourceType, url: String): FrameResource = {
    val __obj = js.Dynamic.literal(mimeType = mimeType.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameResource]
  }
  
  @scala.inline
  implicit class FrameResourceOps[Self <: FrameResource] (val x: Self) extends AnyVal {
    
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
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ResourceType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanceled(value: Boolean): Self = this.set("canceled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanceled: Self = this.set("canceled", js.undefined)
    
    @scala.inline
    def setContentSize(value: Double): Self = this.set("contentSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentSize: Self = this.set("contentSize", js.undefined)
    
    @scala.inline
    def setFailed(value: Boolean): Self = this.set("failed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailed: Self = this.set("failed", js.undefined)
    
    @scala.inline
    def setLastModified(value: TimeSinceEpoch): Self = this.set("lastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModified: Self = this.set("lastModified", js.undefined)
  }
}
