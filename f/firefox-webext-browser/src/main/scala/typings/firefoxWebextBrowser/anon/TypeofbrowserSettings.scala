package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.browser.types.Setting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofbrowserSettings extends js.Object {
  /* browserSettings properties */
  /** Allows or disallows pop-up windows from opening in response to user events. */
  val allowPopupsForUserEvents: Setting = js.native
  /** Enables or disables the browser cache. */
  val cacheEnabled: Setting = js.native
  /** This boolean setting controls whether the selected tab can be closed with a double click. */
  val closeTabsByDoubleClick: Setting = js.native
  /**
    * Controls after which mouse event context menus popup. This setting's value is of type ContextMenuMouseEvent,
    * which has possible values of `mouseup` and `mousedown`.
    */
  val contextMenuShowEvent: Setting = js.native
  /** This boolean setting controls whether the FTP protocol is enabled. */
  val ftpProtocolEnabled: Setting = js.native
  /** Returns the value of the overridden home page. Read-only. */
  val homepageOverride: Setting = js.native
  /**
    * Controls the behaviour of image animation in the browser. This setting's value is of type
    * ImageAnimationBehavior, defaulting to `normal`.
    */
  val imageAnimationBehavior: Setting = js.native
  /** Returns the value of the overridden new tab page. Read-only. */
  val newTabPageOverride: Setting = js.native
  /**
    * Controls where new tabs are opened. `afterCurrent` will open all new tabs next to the current tab,
    * `relatedAfterCurrent` will open only related tabs next to the current tab, and `atEnd` will open all tabs at the
    * end of the tab strip. The default is `relatedAfterCurrent`.
    */
  val newTabPosition: Setting = js.native
  /** This boolean setting controls whether bookmarks are opened in the current tab or in a new tab. */
  val openBookmarksInNewTabs: Setting = js.native
  /** This boolean setting controls whether search results are opened in the current tab or in a new tab. */
  val openSearchResultsInNewTabs: Setting = js.native
  /** This boolean setting controls whether urlbar results are opened in the current tab or in a new tab. */
  val openUrlbarResultsInNewTabs: Setting = js.native
  /** This setting controls whether the user-chosen colors override the page's colors. */
  val overrideDocumentColors: Setting = js.native
  /** This setting controls whether the document's fonts are used. */
  val useDocumentFonts: Setting = js.native
  /** Disables webAPI notifications. */
  val webNotificationsDisabled: Setting = js.native
  /** This boolean setting controls whether zoom is applied to the full page or to text only. */
  val zoomFullPage: Setting = js.native
  /**
    * This boolean setting controls whether zoom is applied on a per-site basis or to the current tab only. If
    * privacy.resistFingerprinting is true, this setting has no effect and zoom is applied to the current tab only.
    */
  val zoomSiteSpecific: Setting = js.native
}

object TypeofbrowserSettings {
  @scala.inline
  def apply(
    allowPopupsForUserEvents: Setting,
    cacheEnabled: Setting,
    closeTabsByDoubleClick: Setting,
    contextMenuShowEvent: Setting,
    ftpProtocolEnabled: Setting,
    homepageOverride: Setting,
    imageAnimationBehavior: Setting,
    newTabPageOverride: Setting,
    newTabPosition: Setting,
    openBookmarksInNewTabs: Setting,
    openSearchResultsInNewTabs: Setting,
    openUrlbarResultsInNewTabs: Setting,
    overrideDocumentColors: Setting,
    useDocumentFonts: Setting,
    webNotificationsDisabled: Setting,
    zoomFullPage: Setting,
    zoomSiteSpecific: Setting
  ): TypeofbrowserSettings = {
    val __obj = js.Dynamic.literal(allowPopupsForUserEvents = allowPopupsForUserEvents.asInstanceOf[js.Any], cacheEnabled = cacheEnabled.asInstanceOf[js.Any], closeTabsByDoubleClick = closeTabsByDoubleClick.asInstanceOf[js.Any], contextMenuShowEvent = contextMenuShowEvent.asInstanceOf[js.Any], ftpProtocolEnabled = ftpProtocolEnabled.asInstanceOf[js.Any], homepageOverride = homepageOverride.asInstanceOf[js.Any], imageAnimationBehavior = imageAnimationBehavior.asInstanceOf[js.Any], newTabPageOverride = newTabPageOverride.asInstanceOf[js.Any], newTabPosition = newTabPosition.asInstanceOf[js.Any], openBookmarksInNewTabs = openBookmarksInNewTabs.asInstanceOf[js.Any], openSearchResultsInNewTabs = openSearchResultsInNewTabs.asInstanceOf[js.Any], openUrlbarResultsInNewTabs = openUrlbarResultsInNewTabs.asInstanceOf[js.Any], overrideDocumentColors = overrideDocumentColors.asInstanceOf[js.Any], useDocumentFonts = useDocumentFonts.asInstanceOf[js.Any], webNotificationsDisabled = webNotificationsDisabled.asInstanceOf[js.Any], zoomFullPage = zoomFullPage.asInstanceOf[js.Any], zoomSiteSpecific = zoomSiteSpecific.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofbrowserSettings]
  }
  @scala.inline
  implicit class TypeofbrowserSettingsOps[Self <: TypeofbrowserSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowPopupsForUserEvents(value: Setting): Self = this.set("allowPopupsForUserEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def setCacheEnabled(value: Setting): Self = this.set("cacheEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setCloseTabsByDoubleClick(value: Setting): Self = this.set("closeTabsByDoubleClick", value.asInstanceOf[js.Any])
    @scala.inline
    def setContextMenuShowEvent(value: Setting): Self = this.set("contextMenuShowEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def setFtpProtocolEnabled(value: Setting): Self = this.set("ftpProtocolEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setHomepageOverride(value: Setting): Self = this.set("homepageOverride", value.asInstanceOf[js.Any])
    @scala.inline
    def setImageAnimationBehavior(value: Setting): Self = this.set("imageAnimationBehavior", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewTabPageOverride(value: Setting): Self = this.set("newTabPageOverride", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewTabPosition(value: Setting): Self = this.set("newTabPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpenBookmarksInNewTabs(value: Setting): Self = this.set("openBookmarksInNewTabs", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpenSearchResultsInNewTabs(value: Setting): Self = this.set("openSearchResultsInNewTabs", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpenUrlbarResultsInNewTabs(value: Setting): Self = this.set("openUrlbarResultsInNewTabs", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverrideDocumentColors(value: Setting): Self = this.set("overrideDocumentColors", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseDocumentFonts(value: Setting): Self = this.set("useDocumentFonts", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebNotificationsDisabled(value: Setting): Self = this.set("webNotificationsDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setZoomFullPage(value: Setting): Self = this.set("zoomFullPage", value.asInstanceOf[js.Any])
    @scala.inline
    def setZoomSiteSpecific(value: Setting): Self = this.set("zoomSiteSpecific", value.asInstanceOf[js.Any])
  }
  
}

