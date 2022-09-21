package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppsDynamiteSharedChatItem extends StObject {
  
  /**
    * Information needed to render the specific type of feed item.
    */
  var activityInfo: js.UndefOr[js.Array[SchemaAppsDynamiteSharedChatItemActivityInfo]] = js.undefined
  
  /**
    * Only populated on read path and should not be persisted in storage.
    */
  var groupInfo: js.UndefOr[SchemaAppsDynamiteSharedChatItemGroupInfo] = js.undefined
  
  /**
    * Additional information about the original chat message that isn't captured in the top-level message proto.
    */
  var messageInfo: js.UndefOr[SchemaAppsDynamiteSharedMessageInfo] = js.undefined
}
object SchemaAppsDynamiteSharedChatItem {
  
  inline def apply(): SchemaAppsDynamiteSharedChatItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppsDynamiteSharedChatItem]
  }
  
  extension [Self <: SchemaAppsDynamiteSharedChatItem](x: Self) {
    
    inline def setActivityInfo(value: js.Array[SchemaAppsDynamiteSharedChatItemActivityInfo]): Self = StObject.set(x, "activityInfo", value.asInstanceOf[js.Any])
    
    inline def setActivityInfoUndefined: Self = StObject.set(x, "activityInfo", js.undefined)
    
    inline def setActivityInfoVarargs(value: SchemaAppsDynamiteSharedChatItemActivityInfo*): Self = StObject.set(x, "activityInfo", js.Array(value*))
    
    inline def setGroupInfo(value: SchemaAppsDynamiteSharedChatItemGroupInfo): Self = StObject.set(x, "groupInfo", value.asInstanceOf[js.Any])
    
    inline def setGroupInfoUndefined: Self = StObject.set(x, "groupInfo", js.undefined)
    
    inline def setMessageInfo(value: SchemaAppsDynamiteSharedMessageInfo): Self = StObject.set(x, "messageInfo", value.asInstanceOf[js.Any])
    
    inline def setMessageInfoUndefined: Self = StObject.set(x, "messageInfo", js.undefined)
  }
}
