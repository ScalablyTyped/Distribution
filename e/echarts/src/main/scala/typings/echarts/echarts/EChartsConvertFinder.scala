package typings.echarts.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EChartsConvertFinder extends js.Object {
  var geoId: js.UndefOr[String] = js.undefined
  var geoIndex: js.UndefOr[Double] = js.undefined
  var geoName: js.UndefOr[String] = js.undefined
  var gridId: js.UndefOr[String] = js.undefined
  var gridIndex: js.UndefOr[Double] = js.undefined
  var gridName: js.UndefOr[String] = js.undefined
  var seriesId: js.UndefOr[String] = js.undefined
  var seriesIndex: js.UndefOr[Double] = js.undefined
  var seriesName: js.UndefOr[String] = js.undefined
  var xAxisId: js.UndefOr[String] = js.undefined
  var xAxisIndex: js.UndefOr[Double] = js.undefined
  var xAxisName: js.UndefOr[String] = js.undefined
  var yAxisId: js.UndefOr[String] = js.undefined
  var yAxisIndex: js.UndefOr[Double] = js.undefined
  var yAxisName: js.UndefOr[String] = js.undefined
}

object EChartsConvertFinder {
  @scala.inline
  def apply(
    geoId: String = null,
    geoIndex: Int | Double = null,
    geoName: String = null,
    gridId: String = null,
    gridIndex: Int | Double = null,
    gridName: String = null,
    seriesId: String = null,
    seriesIndex: Int | Double = null,
    seriesName: String = null,
    xAxisId: String = null,
    xAxisIndex: Int | Double = null,
    xAxisName: String = null,
    yAxisId: String = null,
    yAxisIndex: Int | Double = null,
    yAxisName: String = null
  ): EChartsConvertFinder = {
    val __obj = js.Dynamic.literal()
    if (geoId != null) __obj.updateDynamic("geoId")(geoId.asInstanceOf[js.Any])
    if (geoIndex != null) __obj.updateDynamic("geoIndex")(geoIndex.asInstanceOf[js.Any])
    if (geoName != null) __obj.updateDynamic("geoName")(geoName.asInstanceOf[js.Any])
    if (gridId != null) __obj.updateDynamic("gridId")(gridId.asInstanceOf[js.Any])
    if (gridIndex != null) __obj.updateDynamic("gridIndex")(gridIndex.asInstanceOf[js.Any])
    if (gridName != null) __obj.updateDynamic("gridName")(gridName.asInstanceOf[js.Any])
    if (seriesId != null) __obj.updateDynamic("seriesId")(seriesId.asInstanceOf[js.Any])
    if (seriesIndex != null) __obj.updateDynamic("seriesIndex")(seriesIndex.asInstanceOf[js.Any])
    if (seriesName != null) __obj.updateDynamic("seriesName")(seriesName.asInstanceOf[js.Any])
    if (xAxisId != null) __obj.updateDynamic("xAxisId")(xAxisId.asInstanceOf[js.Any])
    if (xAxisIndex != null) __obj.updateDynamic("xAxisIndex")(xAxisIndex.asInstanceOf[js.Any])
    if (xAxisName != null) __obj.updateDynamic("xAxisName")(xAxisName.asInstanceOf[js.Any])
    if (yAxisId != null) __obj.updateDynamic("yAxisId")(yAxisId.asInstanceOf[js.Any])
    if (yAxisIndex != null) __obj.updateDynamic("yAxisIndex")(yAxisIndex.asInstanceOf[js.Any])
    if (yAxisName != null) __obj.updateDynamic("yAxisName")(yAxisName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EChartsConvertFinder]
  }
}

