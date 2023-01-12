package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackForwardCacheNotRestoredExplanation extends StObject {
  
  /**
    * Context associated with the reason. The meaning of this context is
    * dependent on the reason:
    * - EmbedderExtensionSentMessageToCachedFrame: the extension ID.
    */
  var context: js.UndefOr[String] = js.undefined
  
  /**
    * Not restored reason
    */
  var reason: BackForwardCacheNotRestoredReason
  
  /**
    * Type of the reason
    */
  var `type`: BackForwardCacheNotRestoredReasonType
}
object BackForwardCacheNotRestoredExplanation {
  
  inline def apply(reason: BackForwardCacheNotRestoredReason, `type`: BackForwardCacheNotRestoredReasonType): BackForwardCacheNotRestoredExplanation = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackForwardCacheNotRestoredExplanation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackForwardCacheNotRestoredExplanation] (val x: Self) extends AnyVal {
    
    inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setReason(value: BackForwardCacheNotRestoredReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setType(value: BackForwardCacheNotRestoredReasonType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
