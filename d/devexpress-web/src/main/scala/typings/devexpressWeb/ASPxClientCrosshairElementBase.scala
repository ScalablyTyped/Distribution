package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The base class for all Crosshair Cursor's elements.
  */
trait ASPxClientCrosshairElementBase extends js.Object {
  /**
    * Returns the Crosshair Cursor's axis label element that belongs to the Crosshair element.
    */
  var AxisLabelElement: ASPxClientCrosshairAxisLabelElement
  /**
    * Returns the Crosshair Cursor's label element that belongs to the Crosshair element.
    */
  var LabelElement: ASPxClientCrosshairSeriesLabelElement
  /**
    * Returns the Crosshair Cursor's line element that belongs to the Crosshair element.
    */
  var LineElement: ASPxClientCrosshairLineElement
  /**
    * Returns the series or indicator point for which the Crosshair Cursor creates this element.
    */
  var Point: ASPxClientSeriesPoint
  /**
    * Returns a value that specifies whether the crosshair element is visible.
    */
  var visible: Boolean
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
}

