package typings.devtoolsProtocol.mod.Protocol.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UntrackCacheStorageForOriginRequest extends StObject {
  
  /**
    * Security origin.
    */
  var origin: String
}
object UntrackCacheStorageForOriginRequest {
  
  @scala.inline
  def apply(origin: String): UntrackCacheStorageForOriginRequest = {
    val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntrackCacheStorageForOriginRequest]
  }
  
  @scala.inline
  implicit class UntrackCacheStorageForOriginRequestMutableBuilder[Self <: UntrackCacheStorageForOriginRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
  }
}
