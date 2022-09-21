package typings.firefoxWebextBrowser.browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use the `browser.browserSettings` API to control global settings of the browser.
  *
  * Permissions: `browserSettings`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object browserSettings {
  
  /** Color management mode. */
  /* Rewritten from type alias, can be one of: 
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.off
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.full
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.tagged_only
  */
  trait ColorManagementMode extends StObject
  object ColorManagementMode {
    
    inline def full: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.full = "full".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.full]
    
    inline def off: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.off = "off".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.off]
    
    inline def tagged_only: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.tagged_only = "tagged_only".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.tagged_only]
  }
  
  /** After which mouse event context menus should popup. */
  /* Rewritten from type alias, can be one of: 
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.mouseup
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.mousedown
  */
  trait ContextMenuMouseEvent extends StObject
  object ContextMenuMouseEvent {
    
    inline def mousedown: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.mousedown = "mousedown".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.mousedown]
    
    inline def mouseup: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.mouseup = "mouseup".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.mouseup]
  }
  
  /* browserSettings types */
  /** How images should be animated in the browser. */
  /* Rewritten from type alias, can be one of: 
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.none
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.once
  */
  trait ImageAnimationBehavior extends StObject
  object ImageAnimationBehavior {
    
    inline def none: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.none = "none".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.none]
    
    inline def normal: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal = "normal".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal]
    
    inline def once: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.once = "once".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.once]
  }
}
