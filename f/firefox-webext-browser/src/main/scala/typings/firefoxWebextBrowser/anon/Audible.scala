package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.browser.tabs.MutedInfo
import typings.firefoxWebextBrowser.browser.tabs.SharingState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Audible extends js.Object {
  /** The tab's new attention state. */
  var attention: js.UndefOr[Boolean] = js.undefined
  /** The tab's new audible state. */
  var audible: js.UndefOr[Boolean] = js.undefined
  /** True while the tab is not loaded with content. */
  var discarded: js.UndefOr[Boolean] = js.undefined
  /**
    * The tab's new favicon URL. This property is only present if the extension's manifest includes the `"tabs"`
    * permission.
    */
  var favIconUrl: js.UndefOr[String] = js.undefined
  /** The tab's new hidden state. */
  var hidden: js.UndefOr[Boolean] = js.undefined
  /** Whether the document in the tab can be rendered in reader mode. */
  var isArticle: js.UndefOr[Boolean] = js.undefined
  /** The tab's new muted state and the reason for the change. */
  var mutedInfo: js.UndefOr[MutedInfo] = js.undefined
  /** The tab's new pinned state. */
  var pinned: js.UndefOr[Boolean] = js.undefined
  /** The tab's new sharing state for screen, microphone and camera. */
  var sharingState: js.UndefOr[SharingState] = js.undefined
  /** The status of the tab. Can be either _loading_ or _complete_. */
  var status: js.UndefOr[String] = js.undefined
  /**
    * The title of the tab if it has changed. This property is only present if the extension's manifest includes
    * the `"tabs"` permission.
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * The tab's URL if it has changed. This property is only present if the extension's manifest includes the
    * `"tabs"` permission.
    */
  var url: js.UndefOr[String] = js.undefined
}

object Audible {
  @scala.inline
  def apply(
    attention: js.UndefOr[Boolean] = js.undefined,
    audible: js.UndefOr[Boolean] = js.undefined,
    discarded: js.UndefOr[Boolean] = js.undefined,
    favIconUrl: String = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    isArticle: js.UndefOr[Boolean] = js.undefined,
    mutedInfo: MutedInfo = null,
    pinned: js.UndefOr[Boolean] = js.undefined,
    sharingState: SharingState = null,
    status: String = null,
    title: String = null,
    url: String = null
  ): Audible = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(attention)) __obj.updateDynamic("attention")(attention.get.asInstanceOf[js.Any])
    if (!js.isUndefined(audible)) __obj.updateDynamic("audible")(audible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(discarded)) __obj.updateDynamic("discarded")(discarded.get.asInstanceOf[js.Any])
    if (favIconUrl != null) __obj.updateDynamic("favIconUrl")(favIconUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isArticle)) __obj.updateDynamic("isArticle")(isArticle.get.asInstanceOf[js.Any])
    if (mutedInfo != null) __obj.updateDynamic("mutedInfo")(mutedInfo.asInstanceOf[js.Any])
    if (!js.isUndefined(pinned)) __obj.updateDynamic("pinned")(pinned.get.asInstanceOf[js.Any])
    if (sharingState != null) __obj.updateDynamic("sharingState")(sharingState.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Audible]
  }
}

