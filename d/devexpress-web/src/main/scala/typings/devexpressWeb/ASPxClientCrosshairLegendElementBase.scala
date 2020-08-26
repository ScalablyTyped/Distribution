package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The base class for elements the Crosshair Cursor displays in the legend.
  */
@js.native
trait ASPxClientCrosshairLegendElementBase extends js.Object {
  /**
    * Provides access to the crosshair axis label element to custom draw the crosshair.
    */
  var AxisLabelElement: ASPxClientCrosshairAxisLabelElement = js.native
  /**
    * Returns the Crosshair Cursor's line element to custom draw the crosshair.
    */
  var LineElement: ASPxClientCrosshairLineElement = js.native
  /**
    * Returns the series or indicator point for which the Crosshair Cursor creates this element.
    */
  var Point: ASPxClientSeriesPoint = js.native
  /**
    * Returns the value that specifies whether the crosshair legend element is visible.
    */
  var visible: Boolean = js.native
}

object ASPxClientCrosshairLegendElementBase {
  @scala.inline
  def apply(
    AxisLabelElement: ASPxClientCrosshairAxisLabelElement,
    LineElement: ASPxClientCrosshairLineElement,
    Point: ASPxClientSeriesPoint,
    visible: Boolean
  ): ASPxClientCrosshairLegendElementBase = {
    val __obj = js.Dynamic.literal(AxisLabelElement = AxisLabelElement.asInstanceOf[js.Any], LineElement = LineElement.asInstanceOf[js.Any], Point = Point.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCrosshairLegendElementBase]
  }
  @scala.inline
  implicit class ASPxClientCrosshairLegendElementBaseOps[Self <: ASPxClientCrosshairLegendElementBase] (val x: Self) extends AnyVal {
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
    def setAxisLabelElement(value: ASPxClientCrosshairAxisLabelElement): Self = this.set("AxisLabelElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineElement(value: ASPxClientCrosshairLineElement): Self = this.set("LineElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setPoint(value: ASPxClientSeriesPoint): Self = this.set("Point", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
  }
  
}

