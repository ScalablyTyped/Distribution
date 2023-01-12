package typings.firefoxWebextBrowser.browser.runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectConnectInfo extends StObject {
  
  /**
    * Whether the TLS channel ID will be passed into onConnectExternal for processes that are listening for the connection event.
    */
  var includeTlsChannelId: js.UndefOr[Boolean] = js.undefined
  
  /** Will be passed into onConnect for processes that are listening for the connection event. */
  var name: js.UndefOr[String] = js.undefined
}
object ConnectConnectInfo {
  
  inline def apply(): ConnectConnectInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectConnectInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConnectConnectInfo] (val x: Self) extends AnyVal {
    
    inline def setIncludeTlsChannelId(value: Boolean): Self = StObject.set(x, "includeTlsChannelId", value.asInstanceOf[js.Any])
    
    inline def setIncludeTlsChannelIdUndefined: Self = StObject.set(x, "includeTlsChannelId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
