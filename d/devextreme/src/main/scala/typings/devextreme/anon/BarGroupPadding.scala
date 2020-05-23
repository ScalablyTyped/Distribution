package typings.devextreme.anon

import typings.devextreme.devextremeStrings.Bright
import typings.devextreme.devextremeStrings.Carmine
import typings.devextreme.devextremeStrings.Default
import typings.devextreme.devextremeStrings.Material
import typings.devextreme.devextremeStrings.Ocean
import typings.devextreme.devextremeStrings.Office
import typings.devextreme.devextremeStrings.Pastel
import typings.devextreme.devextremeStrings.Soft
import typings.devextreme.devextremeStrings.Vintage
import typings.devextreme.devextremeStrings.Violet
import typings.devextreme.devextremeStrings.`Dark Moon`
import typings.devextreme.devextremeStrings.`Dark Violet`
import typings.devextreme.devextremeStrings.`Green Mist`
import typings.devextreme.devextremeStrings.`Harmony Light`
import typings.devextreme.devextremeStrings.`Soft Blue`
import typings.devextreme.devextremeStrings.`Soft Pastel`
import typings.devextreme.devextremeStrings.alternate
import typings.devextreme.devextremeStrings.blend
import typings.devextreme.devextremeStrings.extrapolate
import typings.devextreme.mod.DevExpress.viz.ChartSeries
import typings.devextreme.mod.DevExpress.viz.dxChartCommonSeriesSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BarGroupPadding extends js.Object {
  var barGroupPadding: js.UndefOr[Double] = js.undefined
  var barGroupWidth: js.UndefOr[Double] = js.undefined
  var barWidth: js.UndefOr[Double] = js.undefined
  var bottomIndent: js.UndefOr[Double] = js.undefined
  var commonSeriesSettings: js.UndefOr[dxChartCommonSeriesSettings] = js.undefined
  var dataPrepareSettings: js.UndefOr[ConvertToAxisDataType] = js.undefined
  var equalBarWidth: js.UndefOr[Boolean] = js.undefined
  var maxBubbleSize: js.UndefOr[Double] = js.undefined
  var minBubbleSize: js.UndefOr[Double] = js.undefined
  var negativesAsZeroes: js.UndefOr[Boolean] = js.undefined
  var palette: js.UndefOr[
    js.Array[String] | Bright | Default | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office
  ] = js.undefined
  var paletteExtensionMode: js.UndefOr[alternate | blend | extrapolate] = js.undefined
  var series: js.UndefOr[ChartSeries | js.Array[ChartSeries]] = js.undefined
  var seriesTemplate: js.UndefOr[CustomizeSeries] = js.undefined
  var topIndent: js.UndefOr[Double] = js.undefined
  var useAggregation: js.UndefOr[Boolean] = js.undefined
  var valueAxis: js.UndefOr[Inverted] = js.undefined
}

object BarGroupPadding {
  @scala.inline
  def apply(
    barGroupPadding: js.UndefOr[Double] = js.undefined,
    barGroupWidth: js.UndefOr[Double] = js.undefined,
    barWidth: js.UndefOr[Double] = js.undefined,
    bottomIndent: js.UndefOr[Double] = js.undefined,
    commonSeriesSettings: dxChartCommonSeriesSettings = null,
    dataPrepareSettings: ConvertToAxisDataType = null,
    equalBarWidth: js.UndefOr[Boolean] = js.undefined,
    maxBubbleSize: js.UndefOr[Double] = js.undefined,
    minBubbleSize: js.UndefOr[Double] = js.undefined,
    negativesAsZeroes: js.UndefOr[Boolean] = js.undefined,
    palette: js.Array[String] | Bright | Default | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office = null,
    paletteExtensionMode: alternate | blend | extrapolate = null,
    series: ChartSeries | js.Array[ChartSeries] = null,
    seriesTemplate: CustomizeSeries = null,
    topIndent: js.UndefOr[Double] = js.undefined,
    useAggregation: js.UndefOr[Boolean] = js.undefined,
    valueAxis: Inverted = null
  ): BarGroupPadding = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(barGroupPadding)) __obj.updateDynamic("barGroupPadding")(barGroupPadding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(barGroupWidth)) __obj.updateDynamic("barGroupWidth")(barGroupWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(barWidth)) __obj.updateDynamic("barWidth")(barWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bottomIndent)) __obj.updateDynamic("bottomIndent")(bottomIndent.get.asInstanceOf[js.Any])
    if (commonSeriesSettings != null) __obj.updateDynamic("commonSeriesSettings")(commonSeriesSettings.asInstanceOf[js.Any])
    if (dataPrepareSettings != null) __obj.updateDynamic("dataPrepareSettings")(dataPrepareSettings.asInstanceOf[js.Any])
    if (!js.isUndefined(equalBarWidth)) __obj.updateDynamic("equalBarWidth")(equalBarWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxBubbleSize)) __obj.updateDynamic("maxBubbleSize")(maxBubbleSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minBubbleSize)) __obj.updateDynamic("minBubbleSize")(minBubbleSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(negativesAsZeroes)) __obj.updateDynamic("negativesAsZeroes")(negativesAsZeroes.get.asInstanceOf[js.Any])
    if (palette != null) __obj.updateDynamic("palette")(palette.asInstanceOf[js.Any])
    if (paletteExtensionMode != null) __obj.updateDynamic("paletteExtensionMode")(paletteExtensionMode.asInstanceOf[js.Any])
    if (series != null) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    if (seriesTemplate != null) __obj.updateDynamic("seriesTemplate")(seriesTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(topIndent)) __obj.updateDynamic("topIndent")(topIndent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useAggregation)) __obj.updateDynamic("useAggregation")(useAggregation.get.asInstanceOf[js.Any])
    if (valueAxis != null) __obj.updateDynamic("valueAxis")(valueAxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarGroupPadding]
  }
}

