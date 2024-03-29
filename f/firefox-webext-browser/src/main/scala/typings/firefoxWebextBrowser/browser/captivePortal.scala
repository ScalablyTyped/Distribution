package typings.firefoxWebextBrowser.browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    inline def captive: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.captive = "captive".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.captive]
    
    inline def clear: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.clear = "clear".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.clear]
  }
  
  trait OnStateChangedDetails extends StObject {
    
    /** The current captive portal state. */
    var state: OnStateChangedDetailsState
  }
  object OnStateChangedDetails {
    
    inline def apply(state: OnStateChangedDetailsState): OnStateChangedDetails = {
      val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnStateChangedDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OnStateChangedDetails] (val x: Self) extends AnyVal {
      
      inline def setState(value: OnStateChangedDetailsState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
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
    
    inline def locked_portal: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.locked_portal = "locked_portal".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.locked_portal]
    
    inline def not_captive: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.not_captive = "not_captive".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.not_captive]
    
    inline def unknown: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown = "unknown".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown]
    
    inline def unlocked_portal: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.unlocked_portal = "unlocked_portal".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.unlocked_portal]
  }
}
