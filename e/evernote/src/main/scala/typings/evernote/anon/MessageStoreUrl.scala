package typings.evernote.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageStoreUrl extends StObject {
  
  var messageStoreUrl: js.UndefOr[String] = js.undefined
  
  var noteStoreUrl: js.UndefOr[String] = js.undefined
  
  var userStoreUrl: js.UndefOr[String] = js.undefined
  
  var userWebSocketUrl: js.UndefOr[String] = js.undefined
  
  var utilityUrl: js.UndefOr[String] = js.undefined
  
  var webApiUrlPrefix: js.UndefOr[String] = js.undefined
}
object MessageStoreUrl {
  
  @scala.inline
  def apply(): MessageStoreUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageStoreUrl]
  }
  
  @scala.inline
  implicit class MessageStoreUrlMutableBuilder[Self <: MessageStoreUrl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessageStoreUrl(value: String): Self = StObject.set(x, "messageStoreUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageStoreUrlUndefined: Self = StObject.set(x, "messageStoreUrl", js.undefined)
    
    @scala.inline
    def setNoteStoreUrl(value: String): Self = StObject.set(x, "noteStoreUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteStoreUrlUndefined: Self = StObject.set(x, "noteStoreUrl", js.undefined)
    
    @scala.inline
    def setUserStoreUrl(value: String): Self = StObject.set(x, "userStoreUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserStoreUrlUndefined: Self = StObject.set(x, "userStoreUrl", js.undefined)
    
    @scala.inline
    def setUserWebSocketUrl(value: String): Self = StObject.set(x, "userWebSocketUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserWebSocketUrlUndefined: Self = StObject.set(x, "userWebSocketUrl", js.undefined)
    
    @scala.inline
    def setUtilityUrl(value: String): Self = StObject.set(x, "utilityUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtilityUrlUndefined: Self = StObject.set(x, "utilityUrl", js.undefined)
    
    @scala.inline
    def setWebApiUrlPrefix(value: String): Self = StObject.set(x, "webApiUrlPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebApiUrlPrefixUndefined: Self = StObject.set(x, "webApiUrlPrefix", js.undefined)
  }
}
