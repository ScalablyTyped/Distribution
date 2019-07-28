package typings.firefoxDashWebextDashBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NoScroll extends js.Object {
  /** Don't scroll to highlighted item. */
  var noScroll: js.UndefOr[Boolean] = js.undefined
  /** Found range to be highlighted. Default highlights all ranges. */
  var rangeIndex: js.UndefOr[Double] = js.undefined
  /** Tab to highlight. Defaults to the active tab. */
  var tabId: js.UndefOr[Double] = js.undefined
}

object Anon_NoScroll {
  @scala.inline
  def apply(
    noScroll: js.UndefOr[Boolean] = js.undefined,
    rangeIndex: Int | Double = null,
    tabId: Int | Double = null
  ): Anon_NoScroll = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(noScroll)) __obj.updateDynamic("noScroll")(noScroll)
    if (rangeIndex != null) __obj.updateDynamic("rangeIndex")(rangeIndex.asInstanceOf[js.Any])
    if (tabId != null) __obj.updateDynamic("tabId")(tabId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_NoScroll]
  }
}

