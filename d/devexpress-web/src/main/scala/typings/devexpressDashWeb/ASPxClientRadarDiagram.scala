package typings.devexpressDashWeb

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
  def PointToDiagram(x: Double, y: Double): ASPxClientDiagramCoordinates
}

object ASPxClientRadarDiagram {
  @scala.inline
  def apply(
    DiagramToPoint: (js.Object, js.Object) => ASPxClientControlCoordinates,
    PointToDiagram: (Double, Double) => ASPxClientDiagramCoordinates,
    axisX: ASPxClientAxisBase,
    axisY: ASPxClientAxisBase,
    chart: ASPxClientWebChart
  ): ASPxClientRadarDiagram = {
    val __obj = js.Dynamic.literal(DiagramToPoint = js.Any.fromFunction2(DiagramToPoint), PointToDiagram = js.Any.fromFunction2(PointToDiagram), axisX = axisX, axisY = axisY, chart = chart)
  
    __obj.asInstanceOf[ASPxClientRadarDiagram]
  }
}

