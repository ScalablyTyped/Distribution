package typings.devtoolsProtocol.mod.Protocol.Preload

import typings.devtoolsProtocol.mod.Protocol.Network.LoaderId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreloadingAttemptKey extends StObject {
  
  var action: SpeculationAction
  
  var loaderId: LoaderId
  
  var targetHint: js.UndefOr[SpeculationTargetHint] = js.undefined
  
  var url: String
}
object PreloadingAttemptKey {
  
  inline def apply(action: SpeculationAction, loaderId: LoaderId, url: String): PreloadingAttemptKey = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], loaderId = loaderId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreloadingAttemptKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PreloadingAttemptKey] (val x: Self) extends AnyVal {
    
    inline def setAction(value: SpeculationAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setLoaderId(value: LoaderId): Self = StObject.set(x, "loaderId", value.asInstanceOf[js.Any])
    
    inline def setTargetHint(value: SpeculationTargetHint): Self = StObject.set(x, "targetHint", value.asInstanceOf[js.Any])
    
    inline def setTargetHintUndefined: Self = StObject.set(x, "targetHint", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
