package typings.devtoolsProtocol.mod.Protocol.Preload

import typings.devtoolsProtocol.mod.Protocol.Network.LoaderId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreloadingAttemptSourcesUpdatedEvent extends StObject {
  
  var loaderId: LoaderId
  
  var preloadingAttemptSources: js.Array[PreloadingAttemptSource]
}
object PreloadingAttemptSourcesUpdatedEvent {
  
  inline def apply(loaderId: LoaderId, preloadingAttemptSources: js.Array[PreloadingAttemptSource]): PreloadingAttemptSourcesUpdatedEvent = {
    val __obj = js.Dynamic.literal(loaderId = loaderId.asInstanceOf[js.Any], preloadingAttemptSources = preloadingAttemptSources.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreloadingAttemptSourcesUpdatedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PreloadingAttemptSourcesUpdatedEvent] (val x: Self) extends AnyVal {
    
    inline def setLoaderId(value: LoaderId): Self = StObject.set(x, "loaderId", value.asInstanceOf[js.Any])
    
    inline def setPreloadingAttemptSources(value: js.Array[PreloadingAttemptSource]): Self = StObject.set(x, "preloadingAttemptSources", value.asInstanceOf[js.Any])
    
    inline def setPreloadingAttemptSourcesVarargs(value: PreloadingAttemptSource*): Self = StObject.set(x, "preloadingAttemptSources", js.Array(value*))
  }
}
