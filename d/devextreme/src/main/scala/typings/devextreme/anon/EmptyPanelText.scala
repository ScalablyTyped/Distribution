package typings.devextreme.anon

import typings.devextreme.devextremeStrings.dragAndDrop
import typings.devextreme.devextremeStrings.select
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmptyPanelText extends js.Object {
  var allowSearch: js.UndefOr[Boolean] = js.undefined
  var emptyPanelText: js.UndefOr[String] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var mode: js.UndefOr[dragAndDrop | select] = js.undefined
  var searchTimeout: js.UndefOr[Double] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object EmptyPanelText {
  @scala.inline
  def apply(
    allowSearch: js.UndefOr[Boolean] = js.undefined,
    emptyPanelText: String = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    mode: dragAndDrop | select = null,
    searchTimeout: js.UndefOr[Double] = js.undefined,
    title: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): EmptyPanelText = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowSearch)) __obj.updateDynamic("allowSearch")(allowSearch.get.asInstanceOf[js.Any])
    if (emptyPanelText != null) __obj.updateDynamic("emptyPanelText")(emptyPanelText.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(searchTimeout)) __obj.updateDynamic("searchTimeout")(searchTimeout.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmptyPanelText]
  }
}

