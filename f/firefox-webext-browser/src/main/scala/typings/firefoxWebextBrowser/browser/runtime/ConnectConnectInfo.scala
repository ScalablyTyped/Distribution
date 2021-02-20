package typings.firefoxWebextBrowser.browser.runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectConnectInfo extends StObject {
  
  /**
    * Whether the TLS channel ID will be passed into onConnectExternal for processes that are listening for the connection event.
    */
  var includeTlsChannelId: js.UndefOr[Boolean] = js.native
  
  /** Will be passed into onConnect for processes that are listening for the connection event. */
  var name: js.UndefOr[String] = js.native
}
object ConnectConnectInfo {
  
  @scala.inline
  def apply(): ConnectConnectInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectConnectInfo]
  }
  
  @scala.inline
  implicit class ConnectConnectInfoMutableBuilder[Self <: ConnectConnectInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeTlsChannelId(value: Boolean): Self = StObject.set(x, "includeTlsChannelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeTlsChannelIdUndefined: Self = StObject.set(x, "includeTlsChannelId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
