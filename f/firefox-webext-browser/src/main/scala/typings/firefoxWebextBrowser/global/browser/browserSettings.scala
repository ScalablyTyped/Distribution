package typings.firefoxWebextBrowser.global.browser

import typings.firefoxWebextBrowser.browser.types.Setting
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
  
  /* browserSettings properties */
  /** Allows or disallows pop-up windows from opening in response to user events. */
  @JSGlobal("browser.browserSettings.allowPopupsForUserEvents")
  @js.native
  val allowPopupsForUserEvents: Setting = js.native
  
  /** Enables or disables the browser cache. */
  @JSGlobal("browser.browserSettings.cacheEnabled")
  @js.native
  val cacheEnabled: Setting = js.native
  
  /** This boolean setting controls whether the selected tab can be closed with a double click. */
  @JSGlobal("browser.browserSettings.closeTabsByDoubleClick")
  @js.native
  val closeTabsByDoubleClick: Setting = js.native
  
  /**
    * Use the `browserSettings.colorManagement` API to query and set items related to color management.
    *
    * Permissions: `browserSettings`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  object colorManagement {
    
    /* browserSettings.colorManagement properties */
    /**
      * This setting controls the mode used for color management and must be a string from `browserSettings.ColorManagementMode`
      */
    @JSGlobal("browser.browserSettings.colorManagement.mode")
    @js.native
    val mode: Setting = js.native
    
    /** This boolean setting controls whether or not native sRGB color management is used. */
    @JSGlobal("browser.browserSettings.colorManagement.useNativeSRGB")
    @js.native
    val useNativeSRGB: Setting = js.native
    
    /** This boolean setting controls whether or not the WebRender compositor is used. */
    @JSGlobal("browser.browserSettings.colorManagement.useWebRenderCompositor")
    @js.native
    val useWebRenderCompositor: Setting = js.native
  }
  
  /**
    * Controls after which mouse event context menus popup. This setting's value is of type ContextMenuMouseEvent, which has possible values of `mouseup` and `mousedown`.
    */
  @JSGlobal("browser.browserSettings.contextMenuShowEvent")
  @js.native
  val contextMenuShowEvent: Setting = js.native
  
  /**
    * Returns whether the FTP protocol is enabled. Read-only.
    * @deprecated FTP support was removed from Firefox in bug 1574475
    */
  @JSGlobal("browser.browserSettings.ftpProtocolEnabled")
  @js.native
  val ftpProtocolEnabled: Setting = js.native
  
  /** Returns the value of the overridden home page. Read-only. */
  @JSGlobal("browser.browserSettings.homepageOverride")
  @js.native
  val homepageOverride: Setting = js.native
  
  /**
    * Controls the behaviour of image animation in the browser. This setting's value is of type ImageAnimationBehavior, defaulting to `normal`.
    */
  @JSGlobal("browser.browserSettings.imageAnimationBehavior")
  @js.native
  val imageAnimationBehavior: Setting = js.native
  
  /** Returns the value of the overridden new tab page. Read-only. */
  @JSGlobal("browser.browserSettings.newTabPageOverride")
  @js.native
  val newTabPageOverride: Setting = js.native
  
  /**
    * Controls where new tabs are opened. `afterCurrent` will open all new tabs next to the current tab, `relatedAfterCurrent` will open only related tabs next to the current tab, and `atEnd` will open all tabs at the end of the tab strip. The default is `relatedAfterCurrent`.
    */
  @JSGlobal("browser.browserSettings.newTabPosition")
  @js.native
  val newTabPosition: Setting = js.native
  
  /** This boolean setting controls whether bookmarks are opened in the current tab or in a new tab. */
  @JSGlobal("browser.browserSettings.openBookmarksInNewTabs")
  @js.native
  val openBookmarksInNewTabs: Setting = js.native
  
  /** This boolean setting controls whether search results are opened in the current tab or in a new tab. */
  @JSGlobal("browser.browserSettings.openSearchResultsInNewTabs")
  @js.native
  val openSearchResultsInNewTabs: Setting = js.native
  
  /** This boolean setting controls whether urlbar results are opened in the current tab or in a new tab. */
  @JSGlobal("browser.browserSettings.openUrlbarResultsInNewTabs")
  @js.native
  val openUrlbarResultsInNewTabs: Setting = js.native
  
  /**
    * This setting controls whether a light or dark color scheme overrides the page's preferred color scheme.
    */
  @JSGlobal("browser.browserSettings.overrideContentColorScheme")
  @js.native
  val overrideContentColorScheme: Setting = js.native
  
  /** This setting controls whether the user-chosen colors override the page's colors. */
  @JSGlobal("browser.browserSettings.overrideDocumentColors")
  @js.native
  val overrideDocumentColors: Setting = js.native
  
  /** This setting controls whether the document's fonts are used. */
  @JSGlobal("browser.browserSettings.useDocumentFonts")
  @js.native
  val useDocumentFonts: Setting = js.native
  
  /** Disables webAPI notifications. */
  @JSGlobal("browser.browserSettings.webNotificationsDisabled")
  @js.native
  val webNotificationsDisabled: Setting = js.native
  
  /** This boolean setting controls whether zoom is applied to the full page or to text only. */
  @JSGlobal("browser.browserSettings.zoomFullPage")
  @js.native
  val zoomFullPage: Setting = js.native
  
  /**
    * This boolean setting controls whether zoom is applied on a per-site basis or to the current tab only. If privacy.resistFingerprinting is true, this setting has no effect and zoom is applied to the current tab only.
    */
  @JSGlobal("browser.browserSettings.zoomSiteSpecific")
  @js.native
  val zoomSiteSpecific: Setting = js.native
}
