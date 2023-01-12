package typings.devtoolsProtocol.mod.Protocol.Page

import typings.devtoolsProtocol.mod.Protocol.Network.LoaderId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackForwardCacheNotUsedEvent extends StObject {
  
  /**
    * The frame id of the associated frame.
    */
  var frameId: FrameId
  
  /**
    * The loader id for the associated navgation.
    */
  var loaderId: LoaderId
  
  /**
    * Array of reasons why the page could not be cached. This must not be empty.
    */
  var notRestoredExplanations: js.Array[BackForwardCacheNotRestoredExplanation]
  
  /**
    * Tree structure of reasons why the page could not be cached for each frame.
    */
  var notRestoredExplanationsTree: js.UndefOr[BackForwardCacheNotRestoredExplanationTree] = js.undefined
}
object BackForwardCacheNotUsedEvent {
  
  inline def apply(
    frameId: FrameId,
    loaderId: LoaderId,
    notRestoredExplanations: js.Array[BackForwardCacheNotRestoredExplanation]
  ): BackForwardCacheNotUsedEvent = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], loaderId = loaderId.asInstanceOf[js.Any], notRestoredExplanations = notRestoredExplanations.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackForwardCacheNotUsedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackForwardCacheNotUsedEvent] (val x: Self) extends AnyVal {
    
    inline def setFrameId(value: FrameId): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    inline def setLoaderId(value: LoaderId): Self = StObject.set(x, "loaderId", value.asInstanceOf[js.Any])
    
    inline def setNotRestoredExplanations(value: js.Array[BackForwardCacheNotRestoredExplanation]): Self = StObject.set(x, "notRestoredExplanations", value.asInstanceOf[js.Any])
    
    inline def setNotRestoredExplanationsTree(value: BackForwardCacheNotRestoredExplanationTree): Self = StObject.set(x, "notRestoredExplanationsTree", value.asInstanceOf[js.Any])
    
    inline def setNotRestoredExplanationsTreeUndefined: Self = StObject.set(x, "notRestoredExplanationsTree", js.undefined)
    
    inline def setNotRestoredExplanationsVarargs(value: BackForwardCacheNotRestoredExplanation*): Self = StObject.set(x, "notRestoredExplanations", js.Array(value*))
  }
}
