package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.area
import typings.devextreme.devextremeStrings.bar
import typings.devextreme.devextremeStrings.circle
import typings.devextreme.devextremeStrings.cross
import typings.devextreme.devextremeStrings.line
import typings.devextreme.devextremeStrings.polygon
import typings.devextreme.devextremeStrings.spline
import typings.devextreme.devextremeStrings.splinearea
import typings.devextreme.devextremeStrings.square
import typings.devextreme.devextremeStrings.steparea
import typings.devextreme.devextremeStrings.stepline
import typings.devextreme.devextremeStrings.triangle
import typings.devextreme.devextremeStrings.winloss
import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxSparklineOptions extends BaseSparklineOptions[dxSparkline] {
  
  /**
    * [descr:dxSparkline.Options.argumentField]
    */
  var argumentField: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxSparkline.Options.barNegativeColor]
    */
  var barNegativeColor: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxSparkline.Options.barPositiveColor]
    */
  var barPositiveColor: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxSparkline.Options.dataSource]
    */
  var dataSource: js.UndefOr[js.Array[_] | DataSource | DataSourceOptions | String] = js.native
  
  /**
    * [descr:dxSparkline.Options.firstLastColor]
    */
  var firstLastColor: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxSparkline.Options.ignoreEmptyPoints]
    */
  var ignoreEmptyPoints: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxSparkline.Options.lineColor]
    */
  var lineColor: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxSparkline.Options.lineWidth]
    */
  var lineWidth: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxSparkline.Options.lossColor]
    */
  var lossColor: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxSparkline.Options.maxColor]
    */
  var maxColor: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxSparkline.Options.maxValue]
    */
  var maxValue: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxSparkline.Options.minColor]
    */
  var minColor: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxSparkline.Options.minValue]
    */
  var minValue: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxSparkline.Options.pointColor]
    */
  var pointColor: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxSparkline.Options.pointSize]
    */
  var pointSize: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxSparkline.Options.pointSymbol]
    */
  var pointSymbol: js.UndefOr[circle | cross | polygon | square | triangle] = js.native
  
  /**
    * [descr:dxSparkline.Options.showFirstLast]
    */
  var showFirstLast: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxSparkline.Options.showMinMax]
    */
  var showMinMax: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxSparkline.Options.type]
    */
  var `type`: js.UndefOr[area | bar | line | spline | splinearea | steparea | stepline | winloss] = js.native
  
  /**
    * [descr:dxSparkline.Options.valueField]
    */
  var valueField: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxSparkline.Options.winColor]
    */
  var winColor: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxSparkline.Options.winlossThreshold]
    */
  var winlossThreshold: js.UndefOr[Double] = js.native
}
object dxSparklineOptions {
  
  @scala.inline
  def apply(): dxSparklineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxSparklineOptions]
  }
  
  @scala.inline
  implicit class dxSparklineOptionsOps[Self <: dxSparklineOptions] (val x: Self) extends AnyVal {
    
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
    def setArgumentField(value: String): Self = this.set("argumentField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgumentField: Self = this.set("argumentField", js.undefined)
    
    @scala.inline
    def setBarNegativeColor(value: String): Self = this.set("barNegativeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBarNegativeColor: Self = this.set("barNegativeColor", js.undefined)
    
    @scala.inline
    def setBarPositiveColor(value: String): Self = this.set("barPositiveColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBarPositiveColor: Self = this.set("barPositiveColor", js.undefined)
    
    @scala.inline
    def setDataSourceVarargs(value: js.Any*): Self = this.set("dataSource", js.Array(value :_*))
    
    @scala.inline
    def setDataSource(value: js.Array[_] | DataSource | DataSourceOptions | String): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setFirstLastColor(value: String): Self = this.set("firstLastColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstLastColor: Self = this.set("firstLastColor", js.undefined)
    
    @scala.inline
    def setIgnoreEmptyPoints(value: Boolean): Self = this.set("ignoreEmptyPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreEmptyPoints: Self = this.set("ignoreEmptyPoints", js.undefined)
    
    @scala.inline
    def setLineColor(value: String): Self = this.set("lineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineColor: Self = this.set("lineColor", js.undefined)
    
    @scala.inline
    def setLineWidth(value: Double): Self = this.set("lineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineWidth: Self = this.set("lineWidth", js.undefined)
    
    @scala.inline
    def setLossColor(value: String): Self = this.set("lossColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLossColor: Self = this.set("lossColor", js.undefined)
    
    @scala.inline
    def setMaxColor(value: String): Self = this.set("maxColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxColor: Self = this.set("maxColor", js.undefined)
    
    @scala.inline
    def setMaxValue(value: Double): Self = this.set("maxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxValue: Self = this.set("maxValue", js.undefined)
    
    @scala.inline
    def setMinColor(value: String): Self = this.set("minColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinColor: Self = this.set("minColor", js.undefined)
    
    @scala.inline
    def setMinValue(value: Double): Self = this.set("minValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinValue: Self = this.set("minValue", js.undefined)
    
    @scala.inline
    def setPointColor(value: String): Self = this.set("pointColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointColor: Self = this.set("pointColor", js.undefined)
    
    @scala.inline
    def setPointSize(value: Double): Self = this.set("pointSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointSize: Self = this.set("pointSize", js.undefined)
    
    @scala.inline
    def setPointSymbol(value: circle | cross | polygon | square | triangle): Self = this.set("pointSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointSymbol: Self = this.set("pointSymbol", js.undefined)
    
    @scala.inline
    def setShowFirstLast(value: Boolean): Self = this.set("showFirstLast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowFirstLast: Self = this.set("showFirstLast", js.undefined)
    
    @scala.inline
    def setShowMinMax(value: Boolean): Self = this.set("showMinMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowMinMax: Self = this.set("showMinMax", js.undefined)
    
    @scala.inline
    def setType(value: area | bar | line | spline | splinearea | steparea | stepline | winloss): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setValueField(value: String): Self = this.set("valueField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueField: Self = this.set("valueField", js.undefined)
    
    @scala.inline
    def setWinColor(value: String): Self = this.set("winColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWinColor: Self = this.set("winColor", js.undefined)
    
    @scala.inline
    def setWinlossThreshold(value: Double): Self = this.set("winlossThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWinlossThreshold: Self = this.set("winlossThreshold", js.undefined)
  }
}
