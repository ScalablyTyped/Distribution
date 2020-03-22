package typings.devextreme

import typings.devextreme.devextremeStrings.dragAndDrop
import typings.devextreme.devextremeStrings.select
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEmptyPanelText extends js.Object {
  var allowSearch: js.UndefOr[Boolean] = js.undefined
  var emptyPanelText: js.UndefOr[String] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var mode: js.UndefOr[dragAndDrop | select] = js.undefined
  var searchTimeout: js.UndefOr[Double] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object AnonEmptyPanelText {
  @scala.inline
  def apply(
    allowSearch: js.UndefOr[Boolean] = js.undefined,
    emptyPanelText: String = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    mode: dragAndDrop | select = null,
    searchTimeout: Int | Double = null,
    title: String = null,
    width: Int | Double = null
  ): AnonEmptyPanelText = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowSearch)) __obj.updateDynamic("allowSearch")(allowSearch.asInstanceOf[js.Any])
    if (emptyPanelText != null) __obj.updateDynamic("emptyPanelText")(emptyPanelText.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (searchTimeout != null) __obj.updateDynamic("searchTimeout")(searchTimeout.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEmptyPanelText]
  }
}

