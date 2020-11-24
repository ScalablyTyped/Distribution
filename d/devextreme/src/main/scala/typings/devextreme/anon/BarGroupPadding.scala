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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BarGroupPadding extends js.Object {
  
  var barGroupPadding: js.UndefOr[Double] = js.native
  
  var barGroupWidth: js.UndefOr[Double] = js.native
  
  var bottomIndent: js.UndefOr[Double] = js.native
  
  var commonSeriesSettings: js.UndefOr[dxChartCommonSeriesSettings] = js.native
  
  var dataPrepareSettings: js.UndefOr[ConvertToAxisDataType] = js.native
  
  var maxBubbleSize: js.UndefOr[Double] = js.native
  
  var minBubbleSize: js.UndefOr[Double] = js.native
  
  var negativesAsZeroes: js.UndefOr[Boolean] = js.native
  
  var palette: js.UndefOr[
    js.Array[String] | Bright | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office
  ] = js.native
  
  var paletteExtensionMode: js.UndefOr[alternate | blend | extrapolate] = js.native
  
  var series: js.UndefOr[ChartSeries | js.Array[ChartSeries]] = js.native
  
  var seriesTemplate: js.UndefOr[CustomizeSeries] = js.native
  
  var topIndent: js.UndefOr[Double] = js.native
  
  var valueAxis: js.UndefOr[Inverted] = js.native
}
object BarGroupPadding {
  
  @scala.inline
  def apply(): BarGroupPadding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BarGroupPadding]
  }
  
  @scala.inline
  implicit class BarGroupPaddingOps[Self <: BarGroupPadding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBarGroupPadding(value: Double): Self = this.set("barGroupPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBarGroupPadding: Self = this.set("barGroupPadding", js.undefined)
    
    @scala.inline
    def setBarGroupWidth(value: Double): Self = this.set("barGroupWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBarGroupWidth: Self = this.set("barGroupWidth", js.undefined)
    
    @scala.inline
    def setBottomIndent(value: Double): Self = this.set("bottomIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottomIndent: Self = this.set("bottomIndent", js.undefined)
    
    @scala.inline
    def setCommonSeriesSettings(value: dxChartCommonSeriesSettings): Self = this.set("commonSeriesSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommonSeriesSettings: Self = this.set("commonSeriesSettings", js.undefined)
    
    @scala.inline
    def setDataPrepareSettings(value: ConvertToAxisDataType): Self = this.set("dataPrepareSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataPrepareSettings: Self = this.set("dataPrepareSettings", js.undefined)
    
    @scala.inline
    def setMaxBubbleSize(value: Double): Self = this.set("maxBubbleSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxBubbleSize: Self = this.set("maxBubbleSize", js.undefined)
    
    @scala.inline
    def setMinBubbleSize(value: Double): Self = this.set("minBubbleSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinBubbleSize: Self = this.set("minBubbleSize", js.undefined)
    
    @scala.inline
    def setNegativesAsZeroes(value: Boolean): Self = this.set("negativesAsZeroes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNegativesAsZeroes: Self = this.set("negativesAsZeroes", js.undefined)
    
    @scala.inline
    def setPaletteVarargs(value: String*): Self = this.set("palette", js.Array(value :_*))
    
    @scala.inline
    def setPalette(
      value: js.Array[String] | Bright | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office
    ): Self = this.set("palette", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePalette: Self = this.set("palette", js.undefined)
    
    @scala.inline
    def setPaletteExtensionMode(value: alternate | blend | extrapolate): Self = this.set("paletteExtensionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaletteExtensionMode: Self = this.set("paletteExtensionMode", js.undefined)
    
    @scala.inline
    def setSeriesVarargs(value: ChartSeries*): Self = this.set("series", js.Array(value :_*))
    
    @scala.inline
    def setSeries(value: ChartSeries | js.Array[ChartSeries]): Self = this.set("series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeries: Self = this.set("series", js.undefined)
    
    @scala.inline
    def setSeriesTemplate(value: CustomizeSeries): Self = this.set("seriesTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeriesTemplate: Self = this.set("seriesTemplate", js.undefined)
    
    @scala.inline
    def setTopIndent(value: Double): Self = this.set("topIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopIndent: Self = this.set("topIndent", js.undefined)
    
    @scala.inline
    def setValueAxis(value: Inverted): Self = this.set("valueAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueAxis: Self = this.set("valueAxis", js.undefined)
  }
}
