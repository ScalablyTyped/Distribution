package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Represents the client-side equivalent of the Legend class.
 */

trait ASPxClientLegend extends ASPxClientWebChartElement {
  /**
       * Returns a collection of custom legend items of the legend.
       * Value: A collection of ASPxClientCustomLegendItem objects.
       */
  var customItems: js.Array[ASPxClientCustomLegendItem]
  /**
       * Returns the name of the legend.
       * Value: The string value representing the name of the legend.
       */
  var name: java.lang.String
  /**
       * Returns a value which determines whether to use checkboxes instead of markers on a chart legend for all legend items.
       * Value: true, if legend checkboxes are shown instead of markers for all legend items; otherwise, false.
       */
  var useCheckBoxes: scala.Boolean
}

