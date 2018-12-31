package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the RadarDiagram class.
  */
trait ASPxClientRadarDiagram extends ASPxClientXYDiagramBase {
  /**
    * Converts the diagram coordinates of a point into screen coordinates.
    * @param argument An object, representing the point's argument.
    * @param value An object, representing the point's value.
    */
  def DiagramToPoint(argument: js.Object, value: js.Object): ASPxClientControlCoordinates
  /**
    * Converts the display coordinates into a diagram coordinates object.
    * @param x An integer value, representing the X-coordinate of a point (measured in pixels relative to the top left corner of a chart).
    * @param y An integer value, representing the Y-coordinate of a point (measured in pixels relative to the top left corner of a chart).
    */
  def PointToDiagram(x: scala.Double, y: scala.Double): ASPxClientDiagramCoordinates
}

