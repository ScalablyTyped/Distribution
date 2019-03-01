package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the XYDiagram2D class.
  */
trait ASPxClientXYDiagram2D extends ASPxClientXYDiagramBase {
  /**
    * Provides access to a default pane object.
    * Value: An ASPxClientXYDiagramPane object which represents the default pane of a chart.
    */
  var defaultPane: ASPxClientXYDiagramPane
  /**
    * Provides access to an array of a diagram's panes.
    * Value: An array of ASPxClientXYDiagramPane objects.
    */
  var panes: js.Array[ASPxClientXYDiagramPane]
  /**
    * Provides access to a collection of secondary X-axes for a given 2D XY-diagram.
    * Value: An array of ASPxClientAxis objects, that is a collection of secondary X-axes.
    */
  var secondaryAxesX: js.Array[ASPxClientAxis]
  /**
    * Provides access to a collection of secondary Y-axes for a given 2D XY-diagram.
    * Value: An array of ASPxClientAxis objects, that is a collection of secondary X-axes.
    */
  var secondaryAxesY: js.Array[ASPxClientAxis]
  /**
    * Converts the diagram coordinates of a point into screen coordinates.
    * @param argument An object, representing the point's argument.
    * @param value An object, representing the point's value.
    * @param axisX An ASPxClientAxis2D descendant, representing the X-axis.
    * @param axisY An ASPxClientAxis2D descendant, representing the Y-axis.
    * @param pane An ASPxClientXYDiagramPane object, representing the pane.
    */
  def DiagramToPoint(
    argument: js.Object,
    value: js.Object,
    axisX: ASPxClientAxis2D,
    axisY: ASPxClientAxis2D,
    pane: ASPxClientXYDiagramPane
  ): ASPxClientControlCoordinates
  /**
    * Converts the display coordinates into a diagram coordinates object.
    * @param x An integer value, representing the X-coordinate of a point (measured in pixels relative to the top left corner of a chart).
    * @param y An integer value, representing the Y-coordinate of a point (measured in pixels relative to the top left corner of a chart).
    */
  def PointToDiagram(x: scala.Double, y: scala.Double): ASPxClientDiagramCoordinates
  /**
    * Shows the Crosshair Cursor at the point with the specified coordinates.
    * @param screenX The horizontal coordinate that is related to the top-left angle of the chart.
    * @param screenY The vertical coordinate that is related to the top-left angle of the chart.
    */
  def ShowCrosshair(screenX: scala.Double, screenY: scala.Double): scala.Unit
}

object ASPxClientXYDiagram2D {
  @scala.inline
  def apply(
    DiagramToPoint: js.Function5[
      js.Object, 
      js.Object, 
      ASPxClientAxis2D, 
      ASPxClientAxis2D, 
      ASPxClientXYDiagramPane, 
      ASPxClientControlCoordinates
    ],
    PointToDiagram: js.Function2[scala.Double, scala.Double, ASPxClientDiagramCoordinates],
    ShowCrosshair: js.Function2[scala.Double, scala.Double, scala.Unit],
    axisX: ASPxClientAxisBase,
    axisY: ASPxClientAxisBase,
    chart: ASPxClientWebChart,
    defaultPane: ASPxClientXYDiagramPane,
    panes: js.Array[ASPxClientXYDiagramPane],
    secondaryAxesX: js.Array[ASPxClientAxis],
    secondaryAxesY: js.Array[ASPxClientAxis]
  ): ASPxClientXYDiagram2D = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DiagramToPoint")(DiagramToPoint)
    __obj.updateDynamic("PointToDiagram")(PointToDiagram)
    __obj.updateDynamic("ShowCrosshair")(ShowCrosshair)
    __obj.updateDynamic("axisX")(axisX)
    __obj.updateDynamic("axisY")(axisY)
    __obj.updateDynamic("chart")(chart)
    __obj.updateDynamic("defaultPane")(defaultPane)
    __obj.updateDynamic("panes")(panes)
    __obj.updateDynamic("secondaryAxesX")(secondaryAxesX)
    __obj.updateDynamic("secondaryAxesY")(secondaryAxesY)
    __obj.asInstanceOf[ASPxClientXYDiagram2D]
  }
}

