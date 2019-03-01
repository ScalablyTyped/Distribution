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

object ASPxClientRadarDiagram {
  @scala.inline
  def apply(
    DiagramToPoint: js.Function2[js.Object, js.Object, ASPxClientControlCoordinates],
    PointToDiagram: js.Function2[scala.Double, scala.Double, ASPxClientDiagramCoordinates],
    axisX: ASPxClientAxisBase,
    axisY: ASPxClientAxisBase,
    chart: ASPxClientWebChart
  ): ASPxClientRadarDiagram = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DiagramToPoint")(DiagramToPoint)
    __obj.updateDynamic("PointToDiagram")(PointToDiagram)
    __obj.updateDynamic("axisX")(axisX)
    __obj.updateDynamic("axisY")(axisY)
    __obj.updateDynamic("chart")(chart)
    __obj.asInstanceOf[ASPxClientRadarDiagram]
  }
}

