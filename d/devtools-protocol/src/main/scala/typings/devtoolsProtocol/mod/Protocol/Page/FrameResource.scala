package typings.devtoolsProtocol.mod.Protocol.Page

import typings.devtoolsProtocol.mod.Protocol.Network.ResourceType
import typings.devtoolsProtocol.mod.Protocol.Network.TimeSinceEpoch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FrameResource extends StObject {
  
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
  implicit class FrameResourceMutableBuilder[Self <: FrameResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanceled(value: Boolean): Self = StObject.set(x, "canceled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanceledUndefined: Self = StObject.set(x, "canceled", js.undefined)
    
    @scala.inline
    def setContentSize(value: Double): Self = StObject.set(x, "contentSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentSizeUndefined: Self = StObject.set(x, "contentSize", js.undefined)
    
    @scala.inline
    def setFailed(value: Boolean): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedUndefined: Self = StObject.set(x, "failed", js.undefined)
    
    @scala.inline
    def setLastModified(value: TimeSinceEpoch): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedUndefined: Self = StObject.set(x, "lastModified", js.undefined)
    
    @scala.inline
    def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ResourceType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
