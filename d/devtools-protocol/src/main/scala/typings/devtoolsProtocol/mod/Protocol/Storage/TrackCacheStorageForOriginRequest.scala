package typings.devtoolsProtocol.mod.Protocol.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrackCacheStorageForOriginRequest extends StObject {
  
  /**
    * Security origin.
    */
  var origin: String = js.native
}
object TrackCacheStorageForOriginRequest {
  
  @scala.inline
  def apply(origin: String): TrackCacheStorageForOriginRequest = {
    val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackCacheStorageForOriginRequest]
  }
  
  @scala.inline
  implicit class TrackCacheStorageForOriginRequestMutableBuilder[Self <: TrackCacheStorageForOriginRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
  }
}
