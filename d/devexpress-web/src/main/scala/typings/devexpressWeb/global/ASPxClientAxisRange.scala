package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the AxisRange class.
  */
@JSGlobal("ASPxClientAxisRange")
@js.native
class ASPxClientAxisRange ()
  extends typings.devexpressWeb.ASPxClientAxisRange {
  /**
    * Gets the axis that owns the current axis range object.
    */
  /* CompleteClass */
  override var axis: typings.devexpressWeb.ASPxClientAxisBase = js.native
  /**
    * Gets the chart that owns the current chart element.
    */
  /* CompleteClass */
  override var chart: typings.devexpressWeb.ASPxClientWebChart = js.native
  /**
    * Gets the maximum value to display on an axis.
    */
  /* CompleteClass */
  override var maxValue: js.Any = js.native
  /**
    * Gets the internal float representation of the range maximum value.
    */
  /* CompleteClass */
  override var maxValueInternal: Double = js.native
  /**
    * Gets the minimum value to display on an axis.
    */
  /* CompleteClass */
  override var minValue: js.Any = js.native
  /**
    * Gets the internal float representation of the range minimum value.
    */
  /* CompleteClass */
  override var minValueInternal: Double = js.native
}

