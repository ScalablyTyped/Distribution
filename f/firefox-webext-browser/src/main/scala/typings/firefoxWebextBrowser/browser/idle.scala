package typings.firefoxWebextBrowser.browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use the `browser.idle` API to detect when the machine's idle state changes.
  *
  * Permissions: `idle`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object idle {
  
  /* idle types */
  /* Rewritten from type alias, can be one of: 
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.active
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.idle
  */
  trait IdleState extends StObject
  object IdleState {
    
    @scala.inline
    def active: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.active = "active".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.active]
    
    @scala.inline
    def idle: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.idle = "idle".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.idle]
  }
}
