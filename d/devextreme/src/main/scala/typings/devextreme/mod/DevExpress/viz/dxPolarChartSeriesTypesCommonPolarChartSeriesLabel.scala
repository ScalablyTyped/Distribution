package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.ColorDashStyle
import typings.devextreme.anon.ColorVisible
import typings.devextreme.devextremeStrings.inside
import typings.devextreme.devextremeStrings.outside
import typings.devextreme.mod.DevExpress.ui.format
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxPolarChartSeriesTypesCommonPolarChartSeriesLabel extends js.Object {
  /** @name dxPolarChartSeriesTypes.CommonPolarChartSeries.label.argumentFormat */
  var argumentFormat: js.UndefOr[format] = js.native
  /** @name dxPolarChartSeriesTypes.CommonPolarChartSeries.label.backgroundColor */
  var backgroundColor: js.UndefOr[String] = js.native
  /** @name dxPolarChartSeriesTypes.CommonPolarChartSeries.label.border */
  var border: js.UndefOr[ColorDashStyle] = js.native
  /** @name dxPolarChartSeriesTypes.CommonPolarChartSeries.label.connector */
  var connector: js.UndefOr[ColorVisible] = js.native
  /** @name dxPolarChartSeriesTypes.CommonPolarChartSeries.label.customizeText */
  var customizeText: js.UndefOr[js.Function1[/* pointInfo */ js.Any, String]] = js.native
  /** @name dxPolarChartSeriesTypes.CommonPolarChartSeries.label.font */
  var font: js.UndefOr[Font] = js.native
  /** @name dxPolarChartSeriesTypes.CommonPolarChartSeries.label.format */
  var format: js.UndefOr[typings.devextreme.mod.DevExpress.ui.format] = js.native
  /** @name dxPolarChartSeriesTypes.CommonPolarChartSeries.label.position */
  var position: js.UndefOr[inside | outside] = js.native
  /** @name dxPolarChartSeriesTypes.CommonPolarChartSeries.label.rotationAngle */
  var rotationAngle: js.UndefOr[Double] = js.native
  /** @name dxPolarChartSeriesTypes.CommonPolarChartSeries.label.showForZeroValues */
  var showForZeroValues: js.UndefOr[Boolean] = js.native
  /** @name dxPolarChartSeriesTypes.CommonPolarChartSeries.label.visible */
  var visible: js.UndefOr[Boolean] = js.native
}

object dxPolarChartSeriesTypesCommonPolarChartSeriesLabel {
  @scala.inline
  def apply(): dxPolarChartSeriesTypesCommonPolarChartSeriesLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPolarChartSeriesTypesCommonPolarChartSeriesLabel]
  }
  @scala.inline
  implicit class dxPolarChartSeriesTypesCommonPolarChartSeriesLabelOps[Self <: dxPolarChartSeriesTypesCommonPolarChartSeriesLabel] (val x: Self) extends AnyVal {
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
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

