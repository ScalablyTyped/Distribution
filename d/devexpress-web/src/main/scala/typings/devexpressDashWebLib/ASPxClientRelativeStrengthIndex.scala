package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Represents the client-side equivalent of the RelativeStrengthIndex class.
 */

trait ASPxClientRelativeStrengthIndex extends ASPxSeparatePaneIndicator {
  /**
       * Gets the number of data points used to calculate the indicator values.
       * Value: An integer value, specifying the number of points.
       */
  var pointsCount: scala.Double
  /**
       * Gets a value, indicating whose series point values are used to calculate the indicator's values.
       * Value: A string value, which indicates which series point value should be used to calculate indicator values.
       */
  var valueLevel: java.lang.String
}

