package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShowIndicator extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var indicatorSrc: js.UndefOr[String] = js.undefined
  var showIndicator: js.UndefOr[Boolean] = js.undefined
  var showPane: js.UndefOr[Boolean] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object ShowIndicator {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    indicatorSrc: String = null,
    showIndicator: js.UndefOr[Boolean] = js.undefined,
    showPane: js.UndefOr[Boolean] = js.undefined,
    text: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): ShowIndicator = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (indicatorSrc != null) __obj.updateDynamic("indicatorSrc")(indicatorSrc.asInstanceOf[js.Any])
    if (!js.isUndefined(showIndicator)) __obj.updateDynamic("showIndicator")(showIndicator.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showPane)) __obj.updateDynamic("showPane")(showPane.get.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowIndicator]
  }
}

