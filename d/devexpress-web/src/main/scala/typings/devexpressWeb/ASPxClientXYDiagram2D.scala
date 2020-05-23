package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the XYDiagram2D class.
  */
trait ASPxClientXYDiagram2D extends ASPxClientXYDiagramBase {
  /**
    * Provides access to a default pane object.
    */
  var defaultPane: ASPxClientXYDiagramPane
  /**
    * Provides access to an array of a diagram's panes.
    */
  var panes: js.Array[ASPxClientXYDiagramPane]
  /**
    * Provides access to a collection of secondary X-axes for a given 2D XY-diagram.
    */
  var secondaryAxesX: js.Array[ASPxClientAxis]
  /**
    * Provides access to a collection of secondary Y-axes for a given 2D XY-diagram.
    */
  var secondaryAxesY: js.Array[ASPxClientAxis]
  /**
    * Converts the diagram coordinates of a point into screen coordinates. An ASPxClientControlCoordinates object, containing information about the point's X and Y coordinates, its visibility state, and the associated pane.
    * @param argument An object, representing the point's argument.
    * @param value An object, representing the point's value.
    * @param axisX An ASPxClientAxis2D descendant, representing the X-axis.
    * @param axisY An ASPxClientAxis2D descendant, representing the Y-axis.
    * @param pane An ASPxClientXYDiagramPane object, representing the pane.
    */
  def DiagramToPoint(
    argument: js.Any,
    value: js.Any,
    axisX: ASPxClientAxis2D,
    axisY: ASPxClientAxis2D,
    pane: ASPxClientXYDiagramPane
  ): ASPxClientControlCoordinates
  /**
    * Converts the display coordinates into a diagram coordinates object. An ASPxClientDiagramCoordinates object, containing information about the point's argument and value, their scale types, associated axes and pane.
    * @param x An integer value, representing the X-coordinate of a point (measured in pixels relative to the top left corner of a chart).
    * @param y An integer value, representing the Y-coordinate of a point (measured in pixels relative to the top left corner of a chart).
    */
  def PointToDiagram(x: Double, y: Double): ASPxClientDiagramCoordinates
  /**
    * Shows the Crosshair Cursor at the point with the specified coordinates.
    * @param screenX The horizontal coordinate that is related to the top-left angle of the chart.
    * @param screenY The vertical coordinate that is related to the top-left angle of the chart.
    */
  def ShowCrosshair(screenX: Double, screenY: Double): Unit
}

object ASPxClientXYDiagram2D {
  @scala.inline
  def apply(
    DiagramToPoint: (js.Any, js.Any, ASPxClientAxis2D, ASPxClientAxis2D, ASPxClientXYDiagramPane) => ASPxClientControlCoordinates,
    PointToDiagram: (Double, Double) => ASPxClientDiagramCoordinates,
    ShowCrosshair: (Double, Double) => Unit,
    axisX: ASPxClientAxisBase,
    axisY: ASPxClientAxisBase,
    chart: ASPxClientWebChart,
    defaultPane: ASPxClientXYDiagramPane,
    panes: js.Array[ASPxClientXYDiagramPane],
    secondaryAxesX: js.Array[ASPxClientAxis],
    secondaryAxesY: js.Array[ASPxClientAxis]
  ): ASPxClientXYDiagram2D = {
    val __obj = js.Dynamic.literal(DiagramToPoint = js.Any.fromFunction5(DiagramToPoint), PointToDiagram = js.Any.fromFunction2(PointToDiagram), ShowCrosshair = js.Any.fromFunction2(ShowCrosshair), axisX = axisX.asInstanceOf[js.Any], axisY = axisY.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], defaultPane = defaultPane.asInstanceOf[js.Any], panes = panes.asInstanceOf[js.Any], secondaryAxesX = secondaryAxesX.asInstanceOf[js.Any], secondaryAxesY = secondaryAxesY.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientXYDiagram2D]
  }
}

