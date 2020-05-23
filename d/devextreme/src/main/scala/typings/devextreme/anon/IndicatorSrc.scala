package typings.devextreme.anon

import typings.devextreme.devextremeStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndicatorSrc extends js.Object {
  var enabled: js.UndefOr[Boolean | auto] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var indicatorSrc: js.UndefOr[String] = js.undefined
  var shading: js.UndefOr[Boolean] = js.undefined
  var shadingColor: js.UndefOr[String] = js.undefined
  var showIndicator: js.UndefOr[Boolean] = js.undefined
  var showPane: js.UndefOr[Boolean] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object IndicatorSrc {
  @scala.inline
  def apply(
    enabled: Boolean | auto = null,
    height: js.UndefOr[Double] = js.undefined,
    indicatorSrc: String = null,
    shading: js.UndefOr[Boolean] = js.undefined,
    shadingColor: String = null,
    showIndicator: js.UndefOr[Boolean] = js.undefined,
    showPane: js.UndefOr[Boolean] = js.undefined,
    text: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): IndicatorSrc = {
    val __obj = js.Dynamic.literal()
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (indicatorSrc != null) __obj.updateDynamic("indicatorSrc")(indicatorSrc.asInstanceOf[js.Any])
    if (!js.isUndefined(shading)) __obj.updateDynamic("shading")(shading.get.asInstanceOf[js.Any])
    if (shadingColor != null) __obj.updateDynamic("shadingColor")(shadingColor.asInstanceOf[js.Any])
    if (!js.isUndefined(showIndicator)) __obj.updateDynamic("showIndicator")(showIndicator.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showPane)) __obj.updateDynamic("showPane")(showPane.get.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicatorSrc]
  }
}

