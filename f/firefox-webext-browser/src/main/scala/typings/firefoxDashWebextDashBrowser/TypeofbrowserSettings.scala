package typings.firefoxDashWebextDashBrowser

import typings.firefoxDashWebextDashBrowser.browser.types.Setting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofbrowserSettings extends js.Object {
  /* browserSettings properties */
  /** Allows or disallows pop-up windows from opening in response to user events. */
  val allowPopupsForUserEvents: Setting
  /** Enables or disables the browser cache. */
  val cacheEnabled: Setting
  /** This boolean setting controls whether the selected tab can be closed with a double click. */
  val closeTabsByDoubleClick: Setting
  /**
    * Controls after which mouse event context menus popup. This setting's value is of type ContextMenuMouseEvent,
    * which has possible values of `mouseup` and `mousedown`.
    */
  val contextMenuShowEvent: Setting
  /** Returns the value of the overridden home page. Read-only. */
  val homepageOverride: Setting
  /**
    * Controls the behaviour of image animation in the browser. This setting's value is of type
    * ImageAnimationBehavior, defaulting to `normal`.
    */
  val imageAnimationBehavior: Setting
  /** Returns the value of the overridden new tab page. Read-only. */
  val newTabPageOverride: Setting
  /**
    * Controls where new tabs are opened. `afterCurrent` will open all new tabs next to the current tab,
    * `relatedAfterCurrent` will open only related tabs next to the current tab, and `atEnd` will open all tabs at the
    * end of the tab strip. The default is `relatedAfterCurrent`.
    */
  val newTabPosition: Setting
  /** This boolean setting controls whether bookmarks are opened in the current tab or in a new tab. */
  val openBookmarksInNewTabs: Setting
  /** This boolean setting controls whether search results are opened in the current tab or in a new tab. */
  val openSearchResultsInNewTabs: Setting
  /** This boolean setting controls whether urlbar results are opened in the current tab or in a new tab. */
  val openUrlbarResultsInNewTabs: Setting
  /** This setting controls whether the user-chosen colors override the page's colors. */
  val overrideDocumentColors: Setting
  /** This setting controls whether the document's fonts are used. */
  val useDocumentFonts: Setting
  /** Disables webAPI notifications. */
  val webNotificationsDisabled: Setting
}

object TypeofbrowserSettings {
  @scala.inline
  def apply(
    allowPopupsForUserEvents: Setting,
    cacheEnabled: Setting,
    closeTabsByDoubleClick: Setting,
    contextMenuShowEvent: Setting,
    homepageOverride: Setting,
    imageAnimationBehavior: Setting,
    newTabPageOverride: Setting,
    newTabPosition: Setting,
    openBookmarksInNewTabs: Setting,
    openSearchResultsInNewTabs: Setting,
    openUrlbarResultsInNewTabs: Setting,
    overrideDocumentColors: Setting,
    useDocumentFonts: Setting,
    webNotificationsDisabled: Setting
  ): TypeofbrowserSettings = {
    val __obj = js.Dynamic.literal(allowPopupsForUserEvents = allowPopupsForUserEvents.asInstanceOf[js.Any], cacheEnabled = cacheEnabled.asInstanceOf[js.Any], closeTabsByDoubleClick = closeTabsByDoubleClick.asInstanceOf[js.Any], contextMenuShowEvent = contextMenuShowEvent.asInstanceOf[js.Any], homepageOverride = homepageOverride.asInstanceOf[js.Any], imageAnimationBehavior = imageAnimationBehavior.asInstanceOf[js.Any], newTabPageOverride = newTabPageOverride.asInstanceOf[js.Any], newTabPosition = newTabPosition.asInstanceOf[js.Any], openBookmarksInNewTabs = openBookmarksInNewTabs.asInstanceOf[js.Any], openSearchResultsInNewTabs = openSearchResultsInNewTabs.asInstanceOf[js.Any], openUrlbarResultsInNewTabs = openUrlbarResultsInNewTabs.asInstanceOf[js.Any], overrideDocumentColors = overrideDocumentColors.asInstanceOf[js.Any], useDocumentFonts = useDocumentFonts.asInstanceOf[js.Any], webNotificationsDisabled = webNotificationsDisabled.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TypeofbrowserSettings]
  }
}

