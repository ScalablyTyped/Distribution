package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppsDynamiteSharedChatItemActivityInfoFeedItemThreadReply extends StObject {
  
  /**
    * Reply type of the thread reply feed item. The field is not persisted in storage. It's populated when constructing Activity Feed payload.
    */
  var replyType: js.UndefOr[String | Null] = js.undefined
}
object SchemaAppsDynamiteSharedChatItemActivityInfoFeedItemThreadReply {
  
  inline def apply(): SchemaAppsDynamiteSharedChatItemActivityInfoFeedItemThreadReply = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppsDynamiteSharedChatItemActivityInfoFeedItemThreadReply]
  }
  
  extension [Self <: SchemaAppsDynamiteSharedChatItemActivityInfoFeedItemThreadReply](x: Self) {
    
    inline def setReplyType(value: String): Self = StObject.set(x, "replyType", value.asInstanceOf[js.Any])
    
    inline def setReplyTypeNull: Self = StObject.set(x, "replyType", null)
    
    inline def setReplyTypeUndefined: Self = StObject.set(x, "replyType", js.undefined)
  }
}
