package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.AnonColorVisible
import typings.devextreme.AnonSize
import typings.devextreme.AnonUrl
import typings.devextreme.devextremeStrings.allArgumentPoints
import typings.devextreme.devextremeStrings.allSeriesPoints
import typings.devextreme.devextremeStrings.circle
import typings.devextreme.devextremeStrings.cross
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.onlyPoint
import typings.devextreme.devextremeStrings.polygon
import typings.devextreme.devextremeStrings.square
import typings.devextreme.devextremeStrings.triangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxPolarChartSeriesTypesCommonPolarChartSeriesPoint extends js.Object {
  /** @name dxPolarChartSeriesTypes.CommonPolarChartSeries.point.border */
  var border: js.UndefOr[AnonColorVisible] = js.undefined
  /** @name dxPolarChartSeriesTypes.CommonPolarChartSeries.point.color */
  var color: js.UndefOr[String] = js.undefined
  /** @name dxPolarChartSeriesTypes.CommonPolarChartSeries.point.hoverMode */
  var hoverMode: js.UndefOr[allArgumentPoints | allSeriesPoints | none | onlyPoint] = js.undefined
  /** @name dxPolarChartSeriesTypes.CommonPolarChartSeries.point.hoverStyle */
  var hoverStyle: js.UndefOr[AnonSize] = js.undefined
  /** @name dxPolarChartSeriesTypes.CommonPolarChartSeries.point.image */
  var image: js.UndefOr[String | AnonUrl] = js.undefined
  /** @name dxPolarChartSeriesTypes.CommonPolarChartSeries.point.selectionMode */
  var selectionMode: js.UndefOr[allArgumentPoints | allSeriesPoints | none | onlyPoint] = js.undefined
  /** @name dxPolarChartSeriesTypes.CommonPolarChartSeries.point.selectionStyle */
  var selectionStyle: js.UndefOr[AnonSize] = js.undefined
  /** @name dxPolarChartSeriesTypes.CommonPolarChartSeries.point.size */
  var size: js.UndefOr[Double] = js.undefined
  /** @name dxPolarChartSeriesTypes.CommonPolarChartSeries.point.symbol */
  var symbol: js.UndefOr[circle | cross | polygon | square | triangle] = js.undefined
  /** @name dxPolarChartSeriesTypes.CommonPolarChartSeries.point.visible */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object dxPolarChartSeriesTypesCommonPolarChartSeriesPoint {
  @scala.inline
  def apply(
    border: AnonColorVisible = null,
    color: String = null,
    hoverMode: allArgumentPoints | allSeriesPoints | none | onlyPoint = null,
    hoverStyle: AnonSize = null,
    image: String | AnonUrl = null,
    selectionMode: allArgumentPoints | allSeriesPoints | none | onlyPoint = null,
    selectionStyle: AnonSize = null,
    size: Int | Double = null,
    symbol: circle | cross | polygon | square | triangle = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): dxPolarChartSeriesTypesCommonPolarChartSeriesPoint = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (hoverMode != null) __obj.updateDynamic("hoverMode")(hoverMode.asInstanceOf[js.Any])
    if (hoverStyle != null) __obj.updateDynamic("hoverStyle")(hoverStyle.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (selectionStyle != null) __obj.updateDynamic("selectionStyle")(selectionStyle.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (symbol != null) __obj.updateDynamic("symbol")(symbol.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxPolarChartSeriesTypesCommonPolarChartSeriesPoint]
  }
}

