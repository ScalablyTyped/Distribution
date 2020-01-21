package typings.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCaseSensitive extends js.Object {
  /** Find only ranges with case sensitive match. */
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  /** Find only ranges that match entire word. */
  var entireWord: js.UndefOr[Boolean] = js.undefined
  /** Return range data which provides range data in a serializable form. */
  var includeRangeData: js.UndefOr[Boolean] = js.undefined
  /** Return rectangle data which describes visual position of search results. */
  var includeRectData: js.UndefOr[Boolean] = js.undefined
  /** Tab to query. Defaults to the active tab. */
  var tabId: js.UndefOr[Double] = js.undefined
}

object AnonCaseSensitive {
  @scala.inline
  def apply(
    caseSensitive: js.UndefOr[Boolean] = js.undefined,
    entireWord: js.UndefOr[Boolean] = js.undefined,
    includeRangeData: js.UndefOr[Boolean] = js.undefined,
    includeRectData: js.UndefOr[Boolean] = js.undefined,
    tabId: Int | Double = null
  ): AnonCaseSensitive = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive.asInstanceOf[js.Any])
    if (!js.isUndefined(entireWord)) __obj.updateDynamic("entireWord")(entireWord.asInstanceOf[js.Any])
    if (!js.isUndefined(includeRangeData)) __obj.updateDynamic("includeRangeData")(includeRangeData.asInstanceOf[js.Any])
    if (!js.isUndefined(includeRectData)) __obj.updateDynamic("includeRectData")(includeRectData.asInstanceOf[js.Any])
    if (tabId != null) __obj.updateDynamic("tabId")(tabId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCaseSensitive]
  }
}

