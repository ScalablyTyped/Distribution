package typings.evernote.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageStoreUrl extends js.Object {
  
  var messageStoreUrl: js.UndefOr[String] = js.native
  
  var noteStoreUrl: js.UndefOr[String] = js.native
  
  var userStoreUrl: js.UndefOr[String] = js.native
  
  var userWebSocketUrl: js.UndefOr[String] = js.native
  
  var utilityUrl: js.UndefOr[String] = js.native
  
  var webApiUrlPrefix: js.UndefOr[String] = js.native
}
object MessageStoreUrl {
  
  @scala.inline
  def apply(): MessageStoreUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageStoreUrl]
  }
  
  @scala.inline
  implicit class MessageStoreUrlOps[Self <: MessageStoreUrl] (val x: Self) extends AnyVal {
    
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
    def setMessageStoreUrl(value: String): Self = this.set("messageStoreUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageStoreUrl: Self = this.set("messageStoreUrl", js.undefined)
    
    @scala.inline
    def setNoteStoreUrl(value: String): Self = this.set("noteStoreUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoteStoreUrl: Self = this.set("noteStoreUrl", js.undefined)
    
    @scala.inline
    def setUserStoreUrl(value: String): Self = this.set("userStoreUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserStoreUrl: Self = this.set("userStoreUrl", js.undefined)
    
    @scala.inline
    def setUserWebSocketUrl(value: String): Self = this.set("userWebSocketUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserWebSocketUrl: Self = this.set("userWebSocketUrl", js.undefined)
    
    @scala.inline
    def setUtilityUrl(value: String): Self = this.set("utilityUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUtilityUrl: Self = this.set("utilityUrl", js.undefined)
    
    @scala.inline
    def setWebApiUrlPrefix(value: String): Self = this.set("webApiUrlPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebApiUrlPrefix: Self = this.set("webApiUrlPrefix", js.undefined)
  }
}
