package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.common.charts.Palette
import typings.devextreme.mod.DevExpress.common.charts.PaletteExtensionMode
import typings.devextreme.mod.DevExpress.viz.ChartSeries
import typings.devextreme.mod.DevExpress.viz.dxChartCommonSeriesSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BarGroupPadding extends StObject {
  
  /**
    * Controls the padding and consequently the width of a group of bars with the same argument using relative units. Ignored if the barGroupWidth property is set.
    */
  var barGroupPadding: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies a fixed width for groups of bars with the same argument, measured in pixels. Takes precedence over the barGroupPadding property.
    */
  var barGroupWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies an indent from the background&apos;s bottom to the lowest chart point. Accepts values from 0 to 1.
    */
  var bottomIndent: js.UndefOr[Double] = js.undefined
  
  /**
    * An object defining the common configuration properties for the chart&apos;s series.
    */
  var commonSeriesSettings: js.UndefOr[dxChartCommonSeriesSettings] = js.undefined
  
  /**
    * An object providing properties for managing data from a data source.
    */
  var dataPrepareSettings: js.UndefOr[ConvertToAxisDataType] = js.undefined
  
  /**
    * Specifies a coefficient that determines the diameter of the largest bubble.
    */
  var maxBubbleSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the diameter of the smallest bubble measured in pixels.
    */
  var minBubbleSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Forces the UI component to treat negative values as zeroes. Applies to stacked-like series only.
    */
  var negativesAsZeroes: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets the palette to be used to colorize series in the chart.
    */
  var palette: js.UndefOr[js.Array[String] | Palette] = js.undefined
  
  /**
    * Specifies what to do with colors in the palette when their number is less than the number of series in the chart.
    */
  var paletteExtensionMode: js.UndefOr[PaletteExtensionMode] = js.undefined
  
  /**
    * An object defining the chart&apos;s series.
    */
  var series: js.UndefOr[ChartSeries | js.Array[ChartSeries]] = js.undefined
  
  /**
    * Defines properties for the series template.
    */
  var seriesTemplate: js.UndefOr[CustomizeSeries] = js.undefined
  
  /**
    * Specifies an indent from the background&apos;s top to the topmost chart point. Accepts values from 0 to 1.
    */
  var topIndent: js.UndefOr[Double] = js.undefined
  
  /**
    * Configures the chart value axis.
    */
  var valueAxis: js.UndefOr[Inverted] = js.undefined
}
object BarGroupPadding {
  
  inline def apply(): BarGroupPadding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BarGroupPadding]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BarGroupPadding] (val x: Self) extends AnyVal {
    
    inline def setBarGroupPadding(value: Double): Self = StObject.set(x, "barGroupPadding", value.asInstanceOf[js.Any])
    
    inline def setBarGroupPaddingUndefined: Self = StObject.set(x, "barGroupPadding", js.undefined)
    
    inline def setBarGroupWidth(value: Double): Self = StObject.set(x, "barGroupWidth", value.asInstanceOf[js.Any])
    
    inline def setBarGroupWidthUndefined: Self = StObject.set(x, "barGroupWidth", js.undefined)
    
    inline def setBottomIndent(value: Double): Self = StObject.set(x, "bottomIndent", value.asInstanceOf[js.Any])
    
    inline def setBottomIndentUndefined: Self = StObject.set(x, "bottomIndent", js.undefined)
    
    inline def setCommonSeriesSettings(value: dxChartCommonSeriesSettings): Self = StObject.set(x, "commonSeriesSettings", value.asInstanceOf[js.Any])
    
    inline def setCommonSeriesSettingsUndefined: Self = StObject.set(x, "commonSeriesSettings", js.undefined)
    
    inline def setDataPrepareSettings(value: ConvertToAxisDataType): Self = StObject.set(x, "dataPrepareSettings", value.asInstanceOf[js.Any])
    
    inline def setDataPrepareSettingsUndefined: Self = StObject.set(x, "dataPrepareSettings", js.undefined)
    
    inline def setMaxBubbleSize(value: Double): Self = StObject.set(x, "maxBubbleSize", value.asInstanceOf[js.Any])
    
    inline def setMaxBubbleSizeUndefined: Self = StObject.set(x, "maxBubbleSize", js.undefined)
    
    inline def setMinBubbleSize(value: Double): Self = StObject.set(x, "minBubbleSize", value.asInstanceOf[js.Any])
    
    inline def setMinBubbleSizeUndefined: Self = StObject.set(x, "minBubbleSize", js.undefined)
    
    inline def setNegativesAsZeroes(value: Boolean): Self = StObject.set(x, "negativesAsZeroes", value.asInstanceOf[js.Any])
    
    inline def setNegativesAsZeroesUndefined: Self = StObject.set(x, "negativesAsZeroes", js.undefined)
    
    inline def setPalette(value: js.Array[String] | Palette): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
    
    inline def setPaletteExtensionMode(value: PaletteExtensionMode): Self = StObject.set(x, "paletteExtensionMode", value.asInstanceOf[js.Any])
    
    inline def setPaletteExtensionModeUndefined: Self = StObject.set(x, "paletteExtensionMode", js.undefined)
    
    inline def setPaletteUndefined: Self = StObject.set(x, "palette", js.undefined)
    
    inline def setPaletteVarargs(value: String*): Self = StObject.set(x, "palette", js.Array(value*))
    
    inline def setSeries(value: ChartSeries | js.Array[ChartSeries]): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    inline def setSeriesTemplate(value: CustomizeSeries): Self = StObject.set(x, "seriesTemplate", value.asInstanceOf[js.Any])
    
    inline def setSeriesTemplateUndefined: Self = StObject.set(x, "seriesTemplate", js.undefined)
    
    inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    inline def setSeriesVarargs(value: ChartSeries*): Self = StObject.set(x, "series", js.Array(value*))
    
    inline def setTopIndent(value: Double): Self = StObject.set(x, "topIndent", value.asInstanceOf[js.Any])
    
    inline def setTopIndentUndefined: Self = StObject.set(x, "topIndent", js.undefined)
    
    inline def setValueAxis(value: Inverted): Self = StObject.set(x, "valueAxis", value.asInstanceOf[js.Any])
    
    inline def setValueAxisUndefined: Self = StObject.set(x, "valueAxis", js.undefined)
  }
}
