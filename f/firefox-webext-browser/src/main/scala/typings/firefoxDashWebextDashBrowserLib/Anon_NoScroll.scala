package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NoScroll extends js.Object {
  /** Don't scroll to highlighted item. */
  var noScroll: js.UndefOr[scala.Boolean] = js.undefined
  /** Found range to be highlighted. Default highlights all ranges. */
  var rangeIndex: js.UndefOr[scala.Double] = js.undefined
  /** Tab to highlight. Defaults to the active tab. */
  var tabId: js.UndefOr[scala.Double] = js.undefined
}

object Anon_NoScroll {
  @scala.inline
  def apply(
    noScroll: js.UndefOr[scala.Boolean] = js.undefined,
    rangeIndex: scala.Int | scala.Double = null,
    tabId: scala.Int | scala.Double = null
  ): Anon_NoScroll = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(noScroll)) __obj.updateDynamic("noScroll")(noScroll)
    if (rangeIndex != null) __obj.updateDynamic("rangeIndex")(rangeIndex.asInstanceOf[js.Any])
    if (tabId != null) __obj.updateDynamic("tabId")(tabId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_NoScroll]
  }
}

