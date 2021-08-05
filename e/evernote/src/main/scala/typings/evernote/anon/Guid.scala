package typings.evernote.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Guid extends StObject {
  
  var businessId: js.UndefOr[Double] = js.undefined
  
  var guid: js.UndefOr[typings.evernote.mod.Types.Guid] = js.undefined
  
  var noteStoreUrl: js.UndefOr[String] = js.undefined
  
  var shardId: js.UndefOr[String] = js.undefined
  
  var shareKey: js.UndefOr[String] = js.undefined
  
  var shareName: js.UndefOr[String] = js.undefined
  
  var stack: js.UndefOr[String] = js.undefined
  
  var updateSequenceNum: js.UndefOr[Double] = js.undefined
  
  var uri: js.UndefOr[String] = js.undefined
  
  var username: js.UndefOr[String] = js.undefined
  
  var webApiUrlPrefix: js.UndefOr[String] = js.undefined
}
object Guid {
  
  inline def apply(): Guid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Guid]
  }
  
  extension [Self <: Guid](x: Self) {
    
    inline def setBusinessId(value: Double): Self = StObject.set(x, "businessId", value.asInstanceOf[js.Any])
    
    inline def setBusinessIdUndefined: Self = StObject.set(x, "businessId", js.undefined)
    
    inline def setGuid(value: typings.evernote.mod.Types.Guid): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
    
    inline def setGuidUndefined: Self = StObject.set(x, "guid", js.undefined)
    
    inline def setNoteStoreUrl(value: String): Self = StObject.set(x, "noteStoreUrl", value.asInstanceOf[js.Any])
    
    inline def setNoteStoreUrlUndefined: Self = StObject.set(x, "noteStoreUrl", js.undefined)
    
    inline def setShardId(value: String): Self = StObject.set(x, "shardId", value.asInstanceOf[js.Any])
    
    inline def setShardIdUndefined: Self = StObject.set(x, "shardId", js.undefined)
    
    inline def setShareKey(value: String): Self = StObject.set(x, "shareKey", value.asInstanceOf[js.Any])
    
    inline def setShareKeyUndefined: Self = StObject.set(x, "shareKey", js.undefined)
    
    inline def setShareName(value: String): Self = StObject.set(x, "shareName", value.asInstanceOf[js.Any])
    
    inline def setShareNameUndefined: Self = StObject.set(x, "shareName", js.undefined)
    
    inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    
    inline def setUpdateSequenceNum(value: Double): Self = StObject.set(x, "updateSequenceNum", value.asInstanceOf[js.Any])
    
    inline def setUpdateSequenceNumUndefined: Self = StObject.set(x, "updateSequenceNum", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    
    inline def setWebApiUrlPrefix(value: String): Self = StObject.set(x, "webApiUrlPrefix", value.asInstanceOf[js.Any])
    
    inline def setWebApiUrlPrefixUndefined: Self = StObject.set(x, "webApiUrlPrefix", js.undefined)
  }
}
