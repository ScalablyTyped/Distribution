package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines line style settings.
  */
trait ASPxClientLineStyle extends ASPxClientWebChartElement {
  /**
    * Gets the dash style used to paint the line.
    * Value: A string value that contains information about the style used to paint the line.
    */
  var dashStyle: java.lang.String
  /**
    * Returns the join style for the ends of consecutive lines.
    * Value: A string representing the name of the line join type.
    */
  var lineJoin: java.lang.String
  /**
    * Gets the thickness that corresponds to the value of the current ASPxClientLineStyle object.
    * Value: An integer value which specifies the thickness, in pixels.
    */
  var thickness: scala.Double
}

