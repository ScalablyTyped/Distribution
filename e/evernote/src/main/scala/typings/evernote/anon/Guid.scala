package typings.evernote.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Guid extends js.Object {
  
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
  implicit class GuidOps[Self <: Guid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBusinessId(value: Double): Self = this.set("businessId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBusinessId: Self = this.set("businessId", js.undefined)
    
    @scala.inline
    def setGuid(value: typings.evernote.mod.Types.Guid): Self = this.set("guid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGuid: Self = this.set("guid", js.undefined)
    
    @scala.inline
    def setNoteStoreUrl(value: String): Self = this.set("noteStoreUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoteStoreUrl: Self = this.set("noteStoreUrl", js.undefined)
    
    @scala.inline
    def setShardId(value: String): Self = this.set("shardId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShardId: Self = this.set("shardId", js.undefined)
    
    @scala.inline
    def setShareKey(value: String): Self = this.set("shareKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShareKey: Self = this.set("shareKey", js.undefined)
    
    @scala.inline
    def setShareName(value: String): Self = this.set("shareName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShareName: Self = this.set("shareName", js.undefined)
    
    @scala.inline
    def setStack(value: String): Self = this.set("stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStack: Self = this.set("stack", js.undefined)
    
    @scala.inline
    def setUpdateSequenceNum(value: Double): Self = this.set("updateSequenceNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateSequenceNum: Self = this.set("updateSequenceNum", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
    
    @scala.inline
    def setWebApiUrlPrefix(value: String): Self = this.set("webApiUrlPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebApiUrlPrefix: Self = this.set("webApiUrlPrefix", js.undefined)
  }
}
