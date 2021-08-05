package typings.devextreme.anon

import typings.devextreme.devextremeStrings.Bright
import typings.devextreme.devextremeStrings.Carmine
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BarGroupPadding extends StObject {
  
  var barGroupPadding: js.UndefOr[Double] = js.undefined
  
  var barGroupWidth: js.UndefOr[Double] = js.undefined
  
  var bottomIndent: js.UndefOr[Double] = js.undefined
  
  var commonSeriesSettings: js.UndefOr[dxChartCommonSeriesSettings] = js.undefined
  
  var dataPrepareSettings: js.UndefOr[ConvertToAxisDataType] = js.undefined
  
  var maxBubbleSize: js.UndefOr[Double] = js.undefined
  
  var minBubbleSize: js.UndefOr[Double] = js.undefined
  
  var negativesAsZeroes: js.UndefOr[Boolean] = js.undefined
  
  var palette: js.UndefOr[
    js.Array[String] | Bright | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office
  ] = js.undefined
  
  var paletteExtensionMode: js.UndefOr[alternate | blend | extrapolate] = js.undefined
  
  var series: js.UndefOr[ChartSeries | js.Array[ChartSeries]] = js.undefined
  
  var seriesTemplate: js.UndefOr[CustomizeSeries] = js.undefined
  
  var topIndent: js.UndefOr[Double] = js.undefined
  
  var valueAxis: js.UndefOr[Inverted] = js.undefined
}
object BarGroupPadding {
  
  inline def apply(): BarGroupPadding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BarGroupPadding]
  }
  
  extension [Self <: BarGroupPadding](x: Self) {
    
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
    
    inline def setPalette(
      value: js.Array[String] | Bright | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office
    ): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
    
    inline def setPaletteExtensionMode(value: alternate | blend | extrapolate): Self = StObject.set(x, "paletteExtensionMode", value.asInstanceOf[js.Any])
    
    inline def setPaletteExtensionModeUndefined: Self = StObject.set(x, "paletteExtensionMode", js.undefined)
    
    inline def setPaletteUndefined: Self = StObject.set(x, "palette", js.undefined)
    
    inline def setPaletteVarargs(value: String*): Self = StObject.set(x, "palette", js.Array(value :_*))
    
    inline def setSeries(value: ChartSeries | js.Array[ChartSeries]): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    inline def setSeriesTemplate(value: CustomizeSeries): Self = StObject.set(x, "seriesTemplate", value.asInstanceOf[js.Any])
    
    inline def setSeriesTemplateUndefined: Self = StObject.set(x, "seriesTemplate", js.undefined)
    
    inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    inline def setSeriesVarargs(value: ChartSeries*): Self = StObject.set(x, "series", js.Array(value :_*))
    
    inline def setTopIndent(value: Double): Self = StObject.set(x, "topIndent", value.asInstanceOf[js.Any])
    
    inline def setTopIndentUndefined: Self = StObject.set(x, "topIndent", js.undefined)
    
    inline def setValueAxis(value: Inverted): Self = StObject.set(x, "valueAxis", value.asInstanceOf[js.Any])
    
    inline def setValueAxisUndefined: Self = StObject.set(x, "valueAxis", js.undefined)
  }
}
