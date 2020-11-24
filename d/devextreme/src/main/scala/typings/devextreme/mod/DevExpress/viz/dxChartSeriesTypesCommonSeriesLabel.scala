package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.ColorDashStyle
import typings.devextreme.anon.ColorVisible
import typings.devextreme.devextremeStrings.center
import typings.devextreme.devextremeStrings.inside
import typings.devextreme.devextremeStrings.left
import typings.devextreme.devextremeStrings.outside
import typings.devextreme.devextremeStrings.right
import typings.devextreme.mod.DevExpress.ui.format
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * [descr:dxChartSeriesTypes.CommonSeries.label]
  */
@js.native
trait dxChartSeriesTypesCommonSeriesLabel extends js.Object {
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.label.alignment]
    */
  var alignment: js.UndefOr[center | left | right] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.label.argumentFormat]
    */
  var argumentFormat: js.UndefOr[format] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.label.backgroundColor]
    */
  var backgroundColor: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.label.border]
    */
  var border: js.UndefOr[ColorDashStyle] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.label.connector]
    */
  var connector: js.UndefOr[ColorVisible] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.label.customizeText]
    */
  var customizeText: js.UndefOr[js.Function1[/* pointInfo */ js.Any, String]] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.label.font]
    */
  var font: js.UndefOr[Font] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.label.format]
    */
  var format: js.UndefOr[typings.devextreme.mod.DevExpress.ui.format] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.label.horizontalOffset]
    */
  var horizontalOffset: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.label.position]
    */
  var position: js.UndefOr[inside | outside] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.label.rotationAngle]
    */
  var rotationAngle: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.label.showForZeroValues]
    */
  var showForZeroValues: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.label.verticalOffset]
    */
  var verticalOffset: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.label.visible]
    */
  var visible: js.UndefOr[Boolean] = js.native
}
object dxChartSeriesTypesCommonSeriesLabel {
  
  @scala.inline
  def apply(): dxChartSeriesTypesCommonSeriesLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesCommonSeriesLabel]
  }
  
  @scala.inline
  implicit class dxChartSeriesTypesCommonSeriesLabelOps[Self <: dxChartSeriesTypesCommonSeriesLabel] (val x: Self) extends AnyVal {
    
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
    def setAlignment(value: center | left | right): Self = this.set("alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignment: Self = this.set("alignment", js.undefined)
    
    @scala.inline
    def setArgumentFormatFunction1(value: /* value */ Double | Date => String): Self = this.set("argumentFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setArgumentFormat(value: format): Self = this.set("argumentFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgumentFormat: Self = this.set("argumentFormat", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setBorder(value: ColorDashStyle): Self = this.set("border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    
    @scala.inline
    def setConnector(value: ColorVisible): Self = this.set("connector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnector: Self = this.set("connector", js.undefined)
    
    @scala.inline
    def setCustomizeText(value: /* pointInfo */ js.Any => String): Self = this.set("customizeText", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCustomizeText: Self = this.set("customizeText", js.undefined)
    
    @scala.inline
    def setFont(value: Font): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def setFormatFunction1(value: /* value */ Double | Date => String): Self = this.set("format", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormat(value: format): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setHorizontalOffset(value: Double): Self = this.set("horizontalOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontalOffset: Self = this.set("horizontalOffset", js.undefined)
    
    @scala.inline
    def setPosition(value: inside | outside): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setRotationAngle(value: Double): Self = this.set("rotationAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotationAngle: Self = this.set("rotationAngle", js.undefined)
    
    @scala.inline
    def setShowForZeroValues(value: Boolean): Self = this.set("showForZeroValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowForZeroValues: Self = this.set("showForZeroValues", js.undefined)
    
    @scala.inline
    def setVerticalOffset(value: Double): Self = this.set("verticalOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalOffset: Self = this.set("verticalOffset", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
