package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The base class for all Crosshair Cursor's elements.
  */
@JSGlobal("ASPxClientCrosshairElementBase")
@js.native
class ASPxClientCrosshairElementBase () extends js.Object {
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

