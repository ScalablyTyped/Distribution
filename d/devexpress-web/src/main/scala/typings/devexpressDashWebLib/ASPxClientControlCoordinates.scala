package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Represents the client-side equivalent of the ControlCoordinates class.
 */

trait ASPxClientControlCoordinates extends js.Object {
  /**
       * Gets the point's pane.
       * Value: An ASPxClientXYDiagramPane object.
       */
  var pane: ASPxClientXYDiagramPane
  /**
       * Gets the point's visibility state.
       * Value: "Visible", "Hidden", or "Undefined".
       */
  var visibility: java.lang.String
  /**
       * Gets the point's X-coordinate, in pixels.
       * Value: An integer value, specifying the X-coordinate (in pixels).
       */
  var x: scala.Double
  /**
       * Gets the point's Y-coordinate, in pixels.
       * Value: An integer value, specifying the Y-coordinate (in pixels).
       */
  var y: scala.Double
}

