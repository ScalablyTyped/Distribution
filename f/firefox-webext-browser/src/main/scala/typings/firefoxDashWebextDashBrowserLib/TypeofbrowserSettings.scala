package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofbrowserSettings extends js.Object {
  /* browserSettings properties */
  /** Allows or disallows pop-up windows from opening in response to user events. */
  val allowPopupsForUserEvents: firefoxDashWebextDashBrowserLib.browserNs.typesNs.Setting
  /** Enables or disables the browser cache. */
  val cacheEnabled: firefoxDashWebextDashBrowserLib.browserNs.typesNs.Setting
  /** This boolean setting controls whether the selected tab can be closed with a double click. */
  val closeTabsByDoubleClick: firefoxDashWebextDashBrowserLib.browserNs.typesNs.Setting
  /**
    * Controls after which mouse event context menus popup. This setting's value is of type ContextMenuMouseEvent,
    * which has possible values of `mouseup` and `mousedown`.
    */
  val contextMenuShowEvent: firefoxDashWebextDashBrowserLib.browserNs.typesNs.Setting
  /** Returns the value of the overridden home page. Read-only. */
  val homepageOverride: firefoxDashWebextDashBrowserLib.browserNs.typesNs.Setting
  /**
    * Controls the behaviour of image animation in the browser. This setting's value is of type
    * ImageAnimationBehavior, defaulting to `normal`.
    */
  val imageAnimationBehavior: firefoxDashWebextDashBrowserLib.browserNs.typesNs.Setting
  /** Returns the value of the overridden new tab page. Read-only. */
  val newTabPageOverride: firefoxDashWebextDashBrowserLib.browserNs.typesNs.Setting
  /**
    * Controls where new tabs are opened. `afterCurrent` will open all new tabs next to the current tab,
    * `relatedAfterCurrent` will open only related tabs next to the current tab, and `atEnd` will open all tabs at the
    * end of the tab strip. The default is `relatedAfterCurrent`.
    */
  val newTabPosition: firefoxDashWebextDashBrowserLib.browserNs.typesNs.Setting
  /** This boolean setting controls whether bookmarks are opened in the current tab or in a new tab. */
  val openBookmarksInNewTabs: firefoxDashWebextDashBrowserLib.browserNs.typesNs.Setting
  /** This boolean setting controls whether search results are opened in the current tab or in a new tab. */
  val openSearchResultsInNewTabs: firefoxDashWebextDashBrowserLib.browserNs.typesNs.Setting
  /** This boolean setting controls whether urlbar results are opened in the current tab or in a new tab. */
  val openUrlbarResultsInNewTabs: firefoxDashWebextDashBrowserLib.browserNs.typesNs.Setting
  /** This setting controls whether the user-chosen colors override the page's colors. */
  val overrideDocumentColors: firefoxDashWebextDashBrowserLib.browserNs.typesNs.Setting
  /** This setting controls whether the document's fonts are used. */
  val useDocumentFonts: firefoxDashWebextDashBrowserLib.browserNs.typesNs.Setting
  /** Disables webAPI notifications. */
  val webNotificationsDisabled: firefoxDashWebextDashBrowserLib.browserNs.typesNs.Setting
}

object TypeofbrowserSettings {
  @scala.inline
  def apply(
    allowPopupsForUserEvents: firefoxDashWebextDashBrowserLib.browserNs.typesNs.Setting,
    cacheEnabled: firefoxDashWebextDashBrowserLib.browserNs.typesNs.Setting,
    closeTabsByDoubleClick: firefoxDashWebextDashBrowserLib.browserNs.typesNs.Setting,
    contextMenuShowEvent: firefoxDashWebextDashBrowserLib.browserNs.typesNs.Setting,
    homepageOverride: firefoxDashWebextDashBrowserLib.browserNs.typesNs.Setting,
    imageAnimationBehavior: firefoxDashWebextDashBrowserLib.browserNs.typesNs.Setting,
    newTabPageOverride: firefoxDashWebextDashBrowserLib.browserNs.typesNs.Setting,
    newTabPosition: firefoxDashWebextDashBrowserLib.browserNs.typesNs.Setting,
    openBookmarksInNewTabs: firefoxDashWebextDashBrowserLib.browserNs.typesNs.Setting,
    openSearchResultsInNewTabs: firefoxDashWebextDashBrowserLib.browserNs.typesNs.Setting,
    openUrlbarResultsInNewTabs: firefoxDashWebextDashBrowserLib.browserNs.typesNs.Setting,
    overrideDocumentColors: firefoxDashWebextDashBrowserLib.browserNs.typesNs.Setting,
    useDocumentFonts: firefoxDashWebextDashBrowserLib.browserNs.typesNs.Setting,
    webNotificationsDisabled: firefoxDashWebextDashBrowserLib.browserNs.typesNs.Setting
  ): TypeofbrowserSettings = {
    val __obj = js.Dynamic.literal(allowPopupsForUserEvents = allowPopupsForUserEvents, cacheEnabled = cacheEnabled, closeTabsByDoubleClick = closeTabsByDoubleClick, contextMenuShowEvent = contextMenuShowEvent, homepageOverride = homepageOverride, imageAnimationBehavior = imageAnimationBehavior, newTabPageOverride = newTabPageOverride, newTabPosition = newTabPosition, openBookmarksInNewTabs = openBookmarksInNewTabs, openSearchResultsInNewTabs = openSearchResultsInNewTabs, openUrlbarResultsInNewTabs = openUrlbarResultsInNewTabs, overrideDocumentColors = overrideDocumentColors, useDocumentFonts = useDocumentFonts, webNotificationsDisabled = webNotificationsDisabled)
  
    __obj.asInstanceOf[TypeofbrowserSettings]
  }
}

