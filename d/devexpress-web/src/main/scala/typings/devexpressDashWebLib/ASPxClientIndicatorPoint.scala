package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ASPxClientIndicatorPoint extends ASPxClientWebChartElement {
  /**
       * Returns the indicator point's argument.
       * Value: An indicator point's argument.
       */
  var argument: js.Object
  /**
       * Returns the series to which the indicator and its point belong.
       * Value: The series that stores the indicator to which the point belongs.
       */
  var series: ASPxClientSeries
  /**
       * Returns the values for the indicator point that the Crosshair Cursor highlights.
       * Value: The indicator point's values.
       */
  var values: js.Array[js.Object]
}

