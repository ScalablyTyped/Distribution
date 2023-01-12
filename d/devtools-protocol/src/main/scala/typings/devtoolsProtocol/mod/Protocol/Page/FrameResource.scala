package typings.devtoolsProtocol.mod.Protocol.Page

import typings.devtoolsProtocol.mod.Protocol.Network.ResourceType
import typings.devtoolsProtocol.mod.Protocol.Network.TimeSinceEpoch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FrameResource extends StObject {
  
  /**
    * True if the resource was canceled during loading.
    */
  var canceled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Resource content size.
    */
  var contentSize: js.UndefOr[Double] = js.undefined
  
  /**
    * True if the resource failed to load.
    */
  var failed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * last-modified timestamp as reported by server.
    */
  var lastModified: js.UndefOr[TimeSinceEpoch] = js.undefined
  
  /**
    * Resource mimeType as determined by the browser.
    */
  var mimeType: String
  
  /**
    * Type of this resource.
    */
  var `type`: ResourceType
  
  /**
    * Resource URL.
    */
  var url: String
}
object FrameResource {
  
  inline def apply(mimeType: String, `type`: ResourceType, url: String): FrameResource = {
    val __obj = js.Dynamic.literal(mimeType = mimeType.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FrameResource] (val x: Self) extends AnyVal {
    
    inline def setCanceled(value: Boolean): Self = StObject.set(x, "canceled", value.asInstanceOf[js.Any])
    
    inline def setCanceledUndefined: Self = StObject.set(x, "canceled", js.undefined)
    
    inline def setContentSize(value: Double): Self = StObject.set(x, "contentSize", value.asInstanceOf[js.Any])
    
    inline def setContentSizeUndefined: Self = StObject.set(x, "contentSize", js.undefined)
    
    inline def setFailed(value: Boolean): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
    
    inline def setFailedUndefined: Self = StObject.set(x, "failed", js.undefined)
    
    inline def setLastModified(value: TimeSinceEpoch): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedUndefined: Self = StObject.set(x, "lastModified", js.undefined)
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setType(value: ResourceType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
