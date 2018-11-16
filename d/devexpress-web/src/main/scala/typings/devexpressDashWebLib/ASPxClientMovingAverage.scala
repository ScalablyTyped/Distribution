package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * The client-side equivalent of the MovingAverage class.
 */

trait ASPxClientMovingAverage extends ASPxClientSingleLevelIndicator {
  /**
       * Gets a value specifying the Envelope percent.
       * Value: A double value which specifies the Envelope percent.
       */
  var envelopePercent: scala.Double
  /**
       * Gets a value specifying whether to display a Moving Average, Envelope, or both.
       * Value: A string value.
       */
  var kind: java.lang.String
  /**
       * Gets the number of data points used to calculate the moving average.
       * Value: An integer value, specifying the number of points.
       */
  var pointsCount: scala.Double
}

