package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppsDynamiteSharedChatItemActivityInfoFeedItemUserMention extends StObject {
  
  /**
    * User mention type
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaAppsDynamiteSharedChatItemActivityInfoFeedItemUserMention {
  
  inline def apply(): SchemaAppsDynamiteSharedChatItemActivityInfoFeedItemUserMention = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppsDynamiteSharedChatItemActivityInfoFeedItemUserMention]
  }
  
  extension [Self <: SchemaAppsDynamiteSharedChatItemActivityInfoFeedItemUserMention](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
