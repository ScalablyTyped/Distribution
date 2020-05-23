package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoScroll extends js.Object {
  /** Don't scroll to highlighted item. */
  var noScroll: js.UndefOr[Boolean] = js.undefined
  /** Found range to be highlighted. Default highlights all ranges. */
  var rangeIndex: js.UndefOr[Double] = js.undefined
  /** Tab to highlight. Defaults to the active tab. */
  var tabId: js.UndefOr[Double] = js.undefined
}

object NoScroll {
  @scala.inline
  def apply(
    noScroll: js.UndefOr[Boolean] = js.undefined,
    rangeIndex: js.UndefOr[Double] = js.undefined,
    tabId: js.UndefOr[Double] = js.undefined
  ): NoScroll = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(noScroll)) __obj.updateDynamic("noScroll")(noScroll.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rangeIndex)) __obj.updateDynamic("rangeIndex")(rangeIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tabId)) __obj.updateDynamic("tabId")(tabId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoScroll]
  }
}

