package typings.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNoScroll extends js.Object {
  /** Don't scroll to highlighted item. */
  var noScroll: js.UndefOr[Boolean] = js.undefined
  /** Found range to be highlighted. Default highlights all ranges. */
  var rangeIndex: js.UndefOr[Double] = js.undefined
  /** Tab to highlight. Defaults to the active tab. */
  var tabId: js.UndefOr[Double] = js.undefined
}

object AnonNoScroll {
  @scala.inline
  def apply(
    noScroll: js.UndefOr[Boolean] = js.undefined,
    rangeIndex: Int | Double = null,
    tabId: Int | Double = null
  ): AnonNoScroll = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(noScroll)) __obj.updateDynamic("noScroll")(noScroll.asInstanceOf[js.Any])
    if (rangeIndex != null) __obj.updateDynamic("rangeIndex")(rangeIndex.asInstanceOf[js.Any])
    if (tabId != null) __obj.updateDynamic("tabId")(tabId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNoScroll]
  }
}

