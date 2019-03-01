package typings
package echartsLib.echartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EChartsConvertFinder extends js.Object {
  var geoId: js.UndefOr[java.lang.String] = js.undefined
  var geoIndex: js.UndefOr[scala.Double] = js.undefined
  var geoName: js.UndefOr[java.lang.String] = js.undefined
  var gridId: js.UndefOr[java.lang.String] = js.undefined
  var gridIndex: js.UndefOr[scala.Double] = js.undefined
  var gridName: js.UndefOr[java.lang.String] = js.undefined
  var seriesId: js.UndefOr[java.lang.String] = js.undefined
  var seriesIndex: js.UndefOr[scala.Double] = js.undefined
  var seriesName: js.UndefOr[java.lang.String] = js.undefined
  var xAxisId: js.UndefOr[java.lang.String] = js.undefined
  var xAxisIndex: js.UndefOr[scala.Double] = js.undefined
  var xAxisName: js.UndefOr[java.lang.String] = js.undefined
  var yAxisId: js.UndefOr[java.lang.String] = js.undefined
  var yAxisIndex: js.UndefOr[scala.Double] = js.undefined
  var yAxisName: js.UndefOr[java.lang.String] = js.undefined
}

object EChartsConvertFinder {
  @scala.inline
  def apply(
    geoId: java.lang.String = null,
    geoIndex: scala.Int | scala.Double = null,
    geoName: java.lang.String = null,
    gridId: java.lang.String = null,
    gridIndex: scala.Int | scala.Double = null,
    gridName: java.lang.String = null,
    seriesId: java.lang.String = null,
    seriesIndex: scala.Int | scala.Double = null,
    seriesName: java.lang.String = null,
    xAxisId: java.lang.String = null,
    xAxisIndex: scala.Int | scala.Double = null,
    xAxisName: java.lang.String = null,
    yAxisId: java.lang.String = null,
    yAxisIndex: scala.Int | scala.Double = null,
    yAxisName: java.lang.String = null
  ): EChartsConvertFinder = {
    val __obj = js.Dynamic.literal()
    if (geoId != null) __obj.updateDynamic("geoId")(geoId)
    if (geoIndex != null) __obj.updateDynamic("geoIndex")(geoIndex.asInstanceOf[js.Any])
    if (geoName != null) __obj.updateDynamic("geoName")(geoName)
    if (gridId != null) __obj.updateDynamic("gridId")(gridId)
    if (gridIndex != null) __obj.updateDynamic("gridIndex")(gridIndex.asInstanceOf[js.Any])
    if (gridName != null) __obj.updateDynamic("gridName")(gridName)
    if (seriesId != null) __obj.updateDynamic("seriesId")(seriesId)
    if (seriesIndex != null) __obj.updateDynamic("seriesIndex")(seriesIndex.asInstanceOf[js.Any])
    if (seriesName != null) __obj.updateDynamic("seriesName")(seriesName)
    if (xAxisId != null) __obj.updateDynamic("xAxisId")(xAxisId)
    if (xAxisIndex != null) __obj.updateDynamic("xAxisIndex")(xAxisIndex.asInstanceOf[js.Any])
    if (xAxisName != null) __obj.updateDynamic("xAxisName")(xAxisName)
    if (yAxisId != null) __obj.updateDynamic("yAxisId")(yAxisId)
    if (yAxisIndex != null) __obj.updateDynamic("yAxisIndex")(yAxisIndex.asInstanceOf[js.Any])
    if (yAxisName != null) __obj.updateDynamic("yAxisName")(yAxisName)
    __obj.asInstanceOf[EChartsConvertFinder]
  }
}

