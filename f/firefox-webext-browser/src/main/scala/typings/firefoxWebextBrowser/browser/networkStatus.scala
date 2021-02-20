package typings.firefoxWebextBrowser.browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  @js.native
  trait NetworkLinkInfo extends StObject {
    
    /** If known, the network id or name. */
    var id: js.UndefOr[String] = js.native
    
    /** Status of the network link, if "unknown" then link is usually assumed to be "up" */
    var status: NetworkLinkInfoStatus = js.native
    
    /** If known, the type of network connection that is avialable. */
    var `type`: NetworkLinkInfoType = js.native
  }
  object NetworkLinkInfo {
    
    @scala.inline
    def apply(status: NetworkLinkInfoStatus, `type`: NetworkLinkInfoType): NetworkLinkInfo = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NetworkLinkInfo]
    }
    
    @scala.inline
    implicit class NetworkLinkInfoMutableBuilder[Self <: NetworkLinkInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setStatus(value: NetworkLinkInfoStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: NetworkLinkInfoType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def down: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.down = "down".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.down]
    
    @scala.inline
    def unknown: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown = "unknown".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown]
    
    @scala.inline
    def up: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.up = "up".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.up]
  }
  
  /** If known, the type of network connection that is avialable. */
  /* Rewritten from type alias, can be one of: 
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.ethernet
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.usb
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.wifi
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.wimax
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.`2g`
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.`3g`
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.`4g`
  */
  trait NetworkLinkInfoType extends StObject
  object NetworkLinkInfoType {
    
    @scala.inline
    def `2g`: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.`2g` = "2g".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.`2g`]
    
    @scala.inline
    def `3g`: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.`3g` = "3g".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.`3g`]
    
    @scala.inline
    def `4g`: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.`4g` = "4g".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.`4g`]
    
    @scala.inline
    def ethernet: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.ethernet = "ethernet".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.ethernet]
    
    @scala.inline
    def unknown: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown = "unknown".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown]
    
    @scala.inline
    def usb: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.usb = "usb".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.usb]
    
    @scala.inline
    def wifi: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.wifi = "wifi".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.wifi]
    
    @scala.inline
    def wimax: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.wimax = "wimax".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.wimax]
  }
}
