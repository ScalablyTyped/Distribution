package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHighlightCaseSensitive extends js.Object {
  var highlightCaseSensitive: js.UndefOr[Boolean] = js.undefined
  var highlightSearchText: js.UndefOr[Boolean] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var searchVisibleColumnsOnly: js.UndefOr[Boolean] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object AnonHighlightCaseSensitive {
  @scala.inline
  def apply(
    highlightCaseSensitive: js.UndefOr[Boolean] = js.undefined,
    highlightSearchText: js.UndefOr[Boolean] = js.undefined,
    placeholder: String = null,
    searchVisibleColumnsOnly: js.UndefOr[Boolean] = js.undefined,
    text: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): AnonHighlightCaseSensitive = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(highlightCaseSensitive)) __obj.updateDynamic("highlightCaseSensitive")(highlightCaseSensitive.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightSearchText)) __obj.updateDynamic("highlightSearchText")(highlightSearchText.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(searchVisibleColumnsOnly)) __obj.updateDynamic("searchVisibleColumnsOnly")(searchVisibleColumnsOnly.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHighlightCaseSensitive]
  }
}

