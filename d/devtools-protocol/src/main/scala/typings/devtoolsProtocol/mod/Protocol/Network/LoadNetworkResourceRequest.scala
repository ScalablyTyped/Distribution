package typings.devtoolsProtocol.mod.Protocol.Network

import typings.devtoolsProtocol.mod.Protocol.Page.FrameId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadNetworkResourceRequest extends StObject {
  
  /**
    * Frame id to get the resource for. Mandatory for frame targets, and
    * should be omitted for worker targets.
    */
  var frameId: js.UndefOr[FrameId] = js.undefined
  
  /**
    * Options for the request.
    */
  var options: LoadNetworkResourceOptions
  
  /**
    * URL of the resource to get content for.
    */
  var url: String
}
object LoadNetworkResourceRequest {
  
  inline def apply(options: LoadNetworkResourceOptions, url: String): LoadNetworkResourceRequest = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadNetworkResourceRequest]
  }
  
  extension [Self <: LoadNetworkResourceRequest](x: Self) {
    
    inline def setFrameId(value: FrameId): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    inline def setFrameIdUndefined: Self = StObject.set(x, "frameId", js.undefined)
    
    inline def setOptions(value: LoadNetworkResourceOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
