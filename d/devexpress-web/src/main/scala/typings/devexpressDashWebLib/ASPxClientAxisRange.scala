package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the AxisRange class.
  */
trait ASPxClientAxisRange extends ASPxClientWebChartElement {
  /**
    * Gets the axis that owns the current axis range object.
    * Value: An ASPxClientAxisBase object, to which the axis range belongs.
    */
  var axis: ASPxClientAxisBase
  /**
    * Gets the maximum value to display on an axis.
    * Value: An object representing the maximum value of the axis range.
    */
  var maxValue: js.Object
  /**
    * Gets the internal float representation of the range maximum value.
    * Value: A Double value which specifies the internal representation of the range maximum value.
    */
  var maxValueInternal: scala.Double
  /**
    * Gets the minimum value to display on an axis.
    * Value: An object representing the minimum value of the axis range.
    */
  var minValue: js.Object
  /**
    * Gets the internal float representation of the range minimum value.
    * Value: A Double value which specifies the internal representation of the range minimum value.
    */
  var minValueInternal: scala.Double
}

