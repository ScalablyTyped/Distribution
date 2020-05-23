package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the RadarDiagram class.
  */
@JSGlobal("ASPxClientRadarDiagram")
@js.native
class ASPxClientRadarDiagram ()
  extends typings.devexpressWeb.ASPxClientRadarDiagram {
  /**
    * Gets the X-axis.
    */
  /* CompleteClass */
  override var axisX: typings.devexpressWeb.ASPxClientAxisBase = js.native
  /**
    * Gets the Y-axis.
    */
  /* CompleteClass */
  override var axisY: typings.devexpressWeb.ASPxClientAxisBase = js.native
  /**
    * Gets the chart that owns the current chart element.
    */
  /* CompleteClass */
  override var chart: typings.devexpressWeb.ASPxClientWebChart = js.native
  /**
    * Converts the diagram coordinates of a point into screen coordinates. An ASPxClientControlCoordinates object, containing information about the point's X and Y coordinates, its visibility state, and the associated pane.
    * @param argument An object, representing the point's argument.
    * @param value An object, representing the point's value.
    */
  /* CompleteClass */
  override def DiagramToPoint(argument: js.Any, value: js.Any): typings.devexpressWeb.ASPxClientControlCoordinates = js.native
  /**
    * Converts the display coordinates into a diagram coordinates object. An ASPxClientDiagramCoordinates object, containing information about the point's argument and value, their scale types, associated axes and pane.
    * @param x An integer value, representing the X-coordinate of a point (measured in pixels relative to the top left corner of a chart).
    * @param y An integer value, representing the Y-coordinate of a point (measured in pixels relative to the top left corner of a chart).
    */
  /* CompleteClass */
  override def PointToDiagram(x: Double, y: Double): typings.devexpressWeb.ASPxClientDiagramCoordinates = js.native
}

