package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The base class for all Crosshair Cursor's elements.
  */
@js.native
trait ASPxClientCrosshairElementBase extends js.Object {
  /**
    * Returns the Crosshair Cursor's axis label element that belongs to the Crosshair element.
    */
  var AxisLabelElement: ASPxClientCrosshairAxisLabelElement = js.native
  /**
    * Returns the Crosshair Cursor's label element that belongs to the Crosshair element.
    */
  var LabelElement: ASPxClientCrosshairSeriesLabelElement = js.native
  /**
    * Returns the Crosshair Cursor's line element that belongs to the Crosshair element.
    */
  var LineElement: ASPxClientCrosshairLineElement = js.native
  /**
    * Returns the series or indicator point for which the Crosshair Cursor creates this element.
    */
  var Point: ASPxClientSeriesPoint = js.native
  /**
    * Returns a value that specifies whether the crosshair element is visible.
    */
  var visible: Boolean = js.native
}

object ASPxClientCrosshairElementBase {
  @scala.inline
  def apply(
    AxisLabelElement: ASPxClientCrosshairAxisLabelElement,
    LabelElement: ASPxClientCrosshairSeriesLabelElement,
    LineElement: ASPxClientCrosshairLineElement,
    Point: ASPxClientSeriesPoint,
    visible: Boolean
  ): ASPxClientCrosshairElementBase = {
    val __obj = js.Dynamic.literal(AxisLabelElement = AxisLabelElement.asInstanceOf[js.Any], LabelElement = LabelElement.asInstanceOf[js.Any], LineElement = LineElement.asInstanceOf[js.Any], Point = Point.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCrosshairElementBase]
  }
  @scala.inline
  implicit class ASPxClientCrosshairElementBaseOps[Self <: ASPxClientCrosshairElementBase] (val x: Self) extends AnyVal {
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
    def setLabelElement(value: ASPxClientCrosshairSeriesLabelElement): Self = this.set("LabelElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineElement(value: ASPxClientCrosshairLineElement): Self = this.set("LineElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setPoint(value: ASPxClientSeriesPoint): Self = this.set("Point", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
  }
  
}

