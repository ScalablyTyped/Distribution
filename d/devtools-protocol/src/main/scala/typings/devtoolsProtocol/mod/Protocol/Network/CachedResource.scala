package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CachedResource extends StObject {
  
  /**
    * Cached response body size.
    */
  var bodySize: Double
  
  /**
    * Cached response data.
    */
  var response: js.UndefOr[Response] = js.undefined
  
  /**
    * Type of this resource.
    */
  var `type`: ResourceType
  
  /**
    * Resource URL. This is the url of the original network request.
    */
  var url: String
}
object CachedResource {
  
  inline def apply(bodySize: Double, `type`: ResourceType, url: String): CachedResource = {
    val __obj = js.Dynamic.literal(bodySize = bodySize.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CachedResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CachedResource] (val x: Self) extends AnyVal {
    
    inline def setBodySize(value: Double): Self = StObject.set(x, "bodySize", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: Response): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    inline def setType(value: ResourceType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
