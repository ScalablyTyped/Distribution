package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the Strip class.
  */
trait ASPxClientStrip extends ASPxClientWebChartElementNamed {
  /**
    * Gets the axis that owns the current strip object.
    * Value: An ASPxClientAxis object, to which the strip belongs.
    */
  var axis: ASPxClientAxis
  /**
    * Gets the maximum value of the strip's range.
    * Value: An object that represents the maximum value of the strip's range.
    */
  var maxValue: js.Object
  /**
    * Gets the minimum value of the strip's range.
    * Value: An object that represents the minimum value of the strip's range.
    */
  var minValue: js.Object
}

