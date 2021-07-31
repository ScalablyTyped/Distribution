package typings.firefoxWebextBrowser.browser.runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendMessageOptions extends StObject {
  
  /**
    * Whether the TLS channel ID will be passed into onMessageExternal for processes that are listening for the connection event.
    * @deprecated Unsupported on Firefox at this time.
    */
  var includeTlsChannelId: js.UndefOr[Boolean] = js.undefined
}
object SendMessageOptions {
  
  @scala.inline
  def apply(): SendMessageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendMessageOptions]
  }
  
  @scala.inline
  implicit class SendMessageOptionsMutableBuilder[Self <: SendMessageOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeTlsChannelId(value: Boolean): Self = StObject.set(x, "includeTlsChannelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeTlsChannelIdUndefined: Self = StObject.set(x, "includeTlsChannelId", js.undefined)
  }
}
