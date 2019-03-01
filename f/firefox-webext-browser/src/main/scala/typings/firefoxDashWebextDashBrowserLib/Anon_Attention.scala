package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attention extends js.Object {
  /** The tab's new attention state. */
  var attention: js.UndefOr[scala.Boolean] = js.undefined
  /** The tab's new audible state. */
  var audible: js.UndefOr[scala.Boolean] = js.undefined
  /** True while the tab is not loaded with content. */
  var discarded: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The tab's new favicon URL. This property is only present if the extension's manifest includes the `"tabs"`
    * permission.
    */
  var favIconUrl: js.UndefOr[java.lang.String] = js.undefined
  /** The tab's new hidden state. */
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether the document in the tab can be rendered in reader mode. */
  var isArticle: js.UndefOr[scala.Boolean] = js.undefined
  /** The tab's new muted state and the reason for the change. */
  var mutedInfo: js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.tabsNs.MutedInfo] = js.undefined
  /** The tab's new pinned state. */
  var pinned: js.UndefOr[scala.Boolean] = js.undefined
  /** The tab's new sharing state for screen, microphone and camera. */
  var sharingState: js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.tabsNs.SharingState] = js.undefined
  /** The status of the tab. Can be either _loading_ or _complete_. */
  var status: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The title of the tab if it has changed. This property is only present if the extension's manifest includes
    * the `"tabs"` permission.
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The tab's URL if it has changed. This property is only present if the extension's manifest includes the
    * `"tabs"` permission.
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Attention {
  @scala.inline
  def apply(
    attention: js.UndefOr[scala.Boolean] = js.undefined,
    audible: js.UndefOr[scala.Boolean] = js.undefined,
    discarded: js.UndefOr[scala.Boolean] = js.undefined,
    favIconUrl: java.lang.String = null,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    isArticle: js.UndefOr[scala.Boolean] = js.undefined,
    mutedInfo: firefoxDashWebextDashBrowserLib.browserNs.tabsNs.MutedInfo = null,
    pinned: js.UndefOr[scala.Boolean] = js.undefined,
    sharingState: firefoxDashWebextDashBrowserLib.browserNs.tabsNs.SharingState = null,
    status: java.lang.String = null,
    title: java.lang.String = null,
    url: java.lang.String = null
  ): Anon_Attention = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(attention)) __obj.updateDynamic("attention")(attention)
    if (!js.isUndefined(audible)) __obj.updateDynamic("audible")(audible)
    if (!js.isUndefined(discarded)) __obj.updateDynamic("discarded")(discarded)
    if (favIconUrl != null) __obj.updateDynamic("favIconUrl")(favIconUrl)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (!js.isUndefined(isArticle)) __obj.updateDynamic("isArticle")(isArticle)
    if (mutedInfo != null) __obj.updateDynamic("mutedInfo")(mutedInfo)
    if (!js.isUndefined(pinned)) __obj.updateDynamic("pinned")(pinned)
    if (sharingState != null) __obj.updateDynamic("sharingState")(sharingState)
    if (status != null) __obj.updateDynamic("status")(status)
    if (title != null) __obj.updateDynamic("title")(title)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Anon_Attention]
  }
}

