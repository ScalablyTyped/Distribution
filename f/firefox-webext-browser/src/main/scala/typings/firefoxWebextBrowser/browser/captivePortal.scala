package typings.firefoxWebextBrowser.browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This API provides the ability detect the captive portal state of the users connection.
  *
  * Permissions: `captivePortal`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object captivePortal {
  
  /* Rewritten from type alias, can be one of: 
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.captive
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.clear
  */
  trait OnConnectivityAvailableStatus extends StObject
  object OnConnectivityAvailableStatus {
    
    @scala.inline
    def captive: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.captive = "captive".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.captive]
    
    @scala.inline
    def clear: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.clear = "clear".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.clear]
  }
  
  @js.native
  trait OnStateChangedDetails extends StObject {
    
    /** The current captive portal state. */
    var state: OnStateChangedDetailsState = js.native
  }
  object OnStateChangedDetails {
    
    @scala.inline
    def apply(state: OnStateChangedDetailsState): OnStateChangedDetails = {
      val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnStateChangedDetails]
    }
    
    @scala.inline
    implicit class OnStateChangedDetailsMutableBuilder[Self <: OnStateChangedDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setState(value: OnStateChangedDetailsState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  /** The current captive portal state. */
  /* Rewritten from type alias, can be one of: 
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.not_captive
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.unlocked_portal
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.locked_portal
  */
  trait OnStateChangedDetailsState extends StObject
  object OnStateChangedDetailsState {
    
    @scala.inline
    def locked_portal: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.locked_portal = "locked_portal".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.locked_portal]
    
    @scala.inline
    def not_captive: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.not_captive = "not_captive".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.not_captive]
    
    @scala.inline
    def unknown: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown = "unknown".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown]
    
    @scala.inline
    def unlocked_portal: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.unlocked_portal = "unlocked_portal".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.unlocked_portal]
  }
}
