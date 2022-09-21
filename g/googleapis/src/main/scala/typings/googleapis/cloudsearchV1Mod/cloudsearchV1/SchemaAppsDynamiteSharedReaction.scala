package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppsDynamiteSharedReaction extends StObject {
  
  /**
    * The total number of users who have reacted.
    */
  var count: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * When the first emoji of this type was added.
    */
  var createTimestamp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether the current user reacted using this emoji. Note: Unlike most properties of messages, this is different per-user.
    */
  var currentUserParticipated: js.UndefOr[Boolean | Null] = js.undefined
  
  var emoji: js.UndefOr[SchemaAppsDynamiteSharedEmoji] = js.undefined
}
object SchemaAppsDynamiteSharedReaction {
  
  inline def apply(): SchemaAppsDynamiteSharedReaction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppsDynamiteSharedReaction]
  }
  
  extension [Self <: SchemaAppsDynamiteSharedReaction](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountNull: Self = StObject.set(x, "count", null)
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setCreateTimestamp(value: String): Self = StObject.set(x, "createTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreateTimestampNull: Self = StObject.set(x, "createTimestamp", null)
    
    inline def setCreateTimestampUndefined: Self = StObject.set(x, "createTimestamp", js.undefined)
    
    inline def setCurrentUserParticipated(value: Boolean): Self = StObject.set(x, "currentUserParticipated", value.asInstanceOf[js.Any])
    
    inline def setCurrentUserParticipatedNull: Self = StObject.set(x, "currentUserParticipated", null)
    
    inline def setCurrentUserParticipatedUndefined: Self = StObject.set(x, "currentUserParticipated", js.undefined)
    
    inline def setEmoji(value: SchemaAppsDynamiteSharedEmoji): Self = StObject.set(x, "emoji", value.asInstanceOf[js.Any])
    
    inline def setEmojiUndefined: Self = StObject.set(x, "emoji", js.undefined)
  }
}
