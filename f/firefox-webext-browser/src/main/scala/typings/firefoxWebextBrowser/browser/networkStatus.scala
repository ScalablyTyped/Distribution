package typings.firefoxWebextBrowser.browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This API provides the ability to determine the status of and detect changes in the network connection. This API can only be used in privileged extensions.
  *
  * Permissions: `networkStatus`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object networkStatus {
  
  /* networkStatus types */
  trait NetworkLinkInfo extends StObject {
    
    /** If known, the network id or name. */
    var id: js.UndefOr[String] = js.undefined
    
    /** Status of the network link, if "unknown" then link is usually assumed to be "up" */
    var status: NetworkLinkInfoStatus
    
    /** If known, the type of network connection that is avialable. */
    var `type`: NetworkLinkInfoType
  }
  object NetworkLinkInfo {
    
    inline def apply(status: NetworkLinkInfoStatus, `type`: NetworkLinkInfoType): NetworkLinkInfo = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NetworkLinkInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NetworkLinkInfo] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setStatus(value: NetworkLinkInfoStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setType(value: NetworkLinkInfoType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /** Status of the network link, if "unknown" then link is usually assumed to be "up" */
  /* Rewritten from type alias, can be one of: 
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.up
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.down
  */
  trait NetworkLinkInfoStatus extends StObject
  object NetworkLinkInfoStatus {
    
    inline def down: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.down = "down".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.down]
    
    inline def unknown: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown = "unknown".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown]
    
    inline def up: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.up = "up".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.up]
  }
  
  /** If known, the type of network connection that is avialable. */
  /* Rewritten from type alias, can be one of: 
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.ethernet
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.usb
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.wifi
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.wimax
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.mobile
  */
  trait NetworkLinkInfoType extends StObject
  object NetworkLinkInfoType {
    
    inline def ethernet: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.ethernet = "ethernet".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.ethernet]
    
    inline def mobile: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.mobile = "mobile".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.mobile]
    
    inline def unknown: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown = "unknown".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown]
    
    inline def usb: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.usb = "usb".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.usb]
    
    inline def wifi: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.wifi = "wifi".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.wifi]
    
    inline def wimax: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.wimax = "wimax".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.wimax]
  }
}
