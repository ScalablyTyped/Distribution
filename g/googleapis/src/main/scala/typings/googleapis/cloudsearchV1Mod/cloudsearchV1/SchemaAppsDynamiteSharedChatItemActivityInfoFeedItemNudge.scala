package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppsDynamiteSharedChatItemActivityInfoFeedItemNudge extends StObject {
  
  /**
    * Nudge type of the nudge feed item.
    */
  var nudgeType: js.UndefOr[String | Null] = js.undefined
}
object SchemaAppsDynamiteSharedChatItemActivityInfoFeedItemNudge {
  
  inline def apply(): SchemaAppsDynamiteSharedChatItemActivityInfoFeedItemNudge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppsDynamiteSharedChatItemActivityInfoFeedItemNudge]
  }
  
  extension [Self <: SchemaAppsDynamiteSharedChatItemActivityInfoFeedItemNudge](x: Self) {
    
    inline def setNudgeType(value: String): Self = StObject.set(x, "nudgeType", value.asInstanceOf[js.Any])
    
    inline def setNudgeTypeNull: Self = StObject.set(x, "nudgeType", null)
    
    inline def setNudgeTypeUndefined: Self = StObject.set(x, "nudgeType", js.undefined)
  }
}
