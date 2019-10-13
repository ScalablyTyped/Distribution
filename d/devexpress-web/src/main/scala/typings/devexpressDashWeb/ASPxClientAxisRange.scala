package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the AxisRange class.
  */
@JSGlobal("ASPxClientAxisRange")
@js.native
class ASPxClientAxisRange () extends ASPxClientWebChartElement {
  /**
    * Gets the axis that owns the current axis range object.
    */
  var axis: ASPxClientAxisBase = js.native
  /**
    * Gets the maximum value to display on an axis.
    */
  var maxValue: js.Any = js.native
  /**
    * Gets the internal float representation of the range maximum value.
    */
  var maxValueInternal: Double = js.native
  /**
    * Gets the minimum value to display on an axis.
    */
  var minValue: js.Any = js.native
  /**
    * Gets the internal float representation of the range minimum value.
    */
  var minValueInternal: Double = js.native
}

