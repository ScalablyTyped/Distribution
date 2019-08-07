package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The base class for elements the Crosshair Cursor displays in the legend.
  */
@JSGlobal("ASPxClientCrosshairLegendElementBase")
@js.native
class ASPxClientCrosshairLegendElementBase () extends js.Object {
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

