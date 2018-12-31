package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsArticle extends js.Object {
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

