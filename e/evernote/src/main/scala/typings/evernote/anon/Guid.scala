package typings.evernote.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Guid extends StObject {
  
  var businessId: js.UndefOr[Double] = js.native
  
  var guid: js.UndefOr[typings.evernote.mod.Types.Guid] = js.native
  
  var noteStoreUrl: js.UndefOr[String] = js.native
  
  var shardId: js.UndefOr[String] = js.native
  
  var shareKey: js.UndefOr[String] = js.native
  
  var shareName: js.UndefOr[String] = js.native
  
  var stack: js.UndefOr[String] = js.native
  
  var updateSequenceNum: js.UndefOr[Double] = js.native
  
  var uri: js.UndefOr[String] = js.native
  
  var username: js.UndefOr[String] = js.native
  
  var webApiUrlPrefix: js.UndefOr[String] = js.native
}
object Guid {
  
  @scala.inline
  def apply(): Guid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Guid]
  }
  
  @scala.inline
  implicit class GuidMutableBuilder[Self <: Guid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBusinessId(value: Double): Self = StObject.set(x, "businessId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBusinessIdUndefined: Self = StObject.set(x, "businessId", js.undefined)
    
    @scala.inline
    def setGuid(value: typings.evernote.mod.Types.Guid): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuidUndefined: Self = StObject.set(x, "guid", js.undefined)
    
    @scala.inline
    def setNoteStoreUrl(value: String): Self = StObject.set(x, "noteStoreUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteStoreUrlUndefined: Self = StObject.set(x, "noteStoreUrl", js.undefined)
    
    @scala.inline
    def setShardId(value: String): Self = StObject.set(x, "shardId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShardIdUndefined: Self = StObject.set(x, "shardId", js.undefined)
    
    @scala.inline
    def setShareKey(value: String): Self = StObject.set(x, "shareKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShareKeyUndefined: Self = StObject.set(x, "shareKey", js.undefined)
    
    @scala.inline
    def setShareName(value: String): Self = StObject.set(x, "shareName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShareNameUndefined: Self = StObject.set(x, "shareName", js.undefined)
    
    @scala.inline
    def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    
    @scala.inline
    def setUpdateSequenceNum(value: Double): Self = StObject.set(x, "updateSequenceNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateSequenceNumUndefined: Self = StObject.set(x, "updateSequenceNum", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    
    @scala.inline
    def setWebApiUrlPrefix(value: String): Self = StObject.set(x, "webApiUrlPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebApiUrlPrefixUndefined: Self = StObject.set(x, "webApiUrlPrefix", js.undefined)
  }
}
