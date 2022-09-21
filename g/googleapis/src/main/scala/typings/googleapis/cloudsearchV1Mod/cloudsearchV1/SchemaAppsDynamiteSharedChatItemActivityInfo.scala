package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppsDynamiteSharedChatItemActivityInfo extends StObject {
  
  var feedItemNudge: js.UndefOr[SchemaAppsDynamiteSharedChatItemActivityInfoFeedItemNudge] = js.undefined
  
  var feedItemReactions: js.UndefOr[SchemaAppsDynamiteSharedChatItemActivityInfoFeedItemReactions] = js.undefined
  
  var feedItemThreadReply: js.UndefOr[SchemaAppsDynamiteSharedChatItemActivityInfoFeedItemThreadReply] = js.undefined
  
  var feedItemUserMention: js.UndefOr[SchemaAppsDynamiteSharedChatItemActivityInfoFeedItemUserMention] = js.undefined
}
object SchemaAppsDynamiteSharedChatItemActivityInfo {
  
  inline def apply(): SchemaAppsDynamiteSharedChatItemActivityInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppsDynamiteSharedChatItemActivityInfo]
  }
  
  extension [Self <: SchemaAppsDynamiteSharedChatItemActivityInfo](x: Self) {
    
    inline def setFeedItemNudge(value: SchemaAppsDynamiteSharedChatItemActivityInfoFeedItemNudge): Self = StObject.set(x, "feedItemNudge", value.asInstanceOf[js.Any])
    
    inline def setFeedItemNudgeUndefined: Self = StObject.set(x, "feedItemNudge", js.undefined)
    
    inline def setFeedItemReactions(value: SchemaAppsDynamiteSharedChatItemActivityInfoFeedItemReactions): Self = StObject.set(x, "feedItemReactions", value.asInstanceOf[js.Any])
    
    inline def setFeedItemReactionsUndefined: Self = StObject.set(x, "feedItemReactions", js.undefined)
    
    inline def setFeedItemThreadReply(value: SchemaAppsDynamiteSharedChatItemActivityInfoFeedItemThreadReply): Self = StObject.set(x, "feedItemThreadReply", value.asInstanceOf[js.Any])
    
    inline def setFeedItemThreadReplyUndefined: Self = StObject.set(x, "feedItemThreadReply", js.undefined)
    
    inline def setFeedItemUserMention(value: SchemaAppsDynamiteSharedChatItemActivityInfoFeedItemUserMention): Self = StObject.set(x, "feedItemUserMention", value.asInstanceOf[js.Any])
    
    inline def setFeedItemUserMentionUndefined: Self = StObject.set(x, "feedItemUserMention", js.undefined)
  }
}
