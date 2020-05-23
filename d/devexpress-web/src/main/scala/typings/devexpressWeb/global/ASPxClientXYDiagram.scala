package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the XYDiagram class.
  */
@JSGlobal("ASPxClientXYDiagram")
@js.native
class ASPxClientXYDiagram ()
  extends typings.devexpressWeb.ASPxClientXYDiagram {
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
    * Provides access to a default pane object.
    */
  /* CompleteClass */
  override var defaultPane: typings.devexpressWeb.ASPxClientXYDiagramPane = js.native
  /**
    * Provides access to an array of a diagram's panes.
    */
  /* CompleteClass */
  override var panes: js.Array[typings.devexpressWeb.ASPxClientXYDiagramPane] = js.native
  /**
    * Gets a value indicating whether the diagram is rotated.
    */
  /* CompleteClass */
  override var rotated: Boolean = js.native
  /**
    * Provides access to a collection of secondary X-axes for a given 2D XY-diagram.
    */
  /* CompleteClass */
  override var secondaryAxesX: js.Array[typings.devexpressWeb.ASPxClientAxis] = js.native
  /**
    * Provides access to a collection of secondary Y-axes for a given 2D XY-diagram.
    */
  /* CompleteClass */
  override var secondaryAxesY: js.Array[typings.devexpressWeb.ASPxClientAxis] = js.native
  /**
    * Converts the diagram coordinates of a point into screen coordinates. An ASPxClientControlCoordinates object, containing information about the point's X and Y coordinates, its visibility state, and the associated pane.
    * @param argument An object, representing the point's argument.
    * @param value An object, representing the point's value.
    * @param axisX An ASPxClientAxis2D descendant, representing the X-axis.
    * @param axisY An ASPxClientAxis2D descendant, representing the Y-axis.
    * @param pane An ASPxClientXYDiagramPane object, representing the pane.
    */
  /* CompleteClass */
  override def DiagramToPoint(
    argument: js.Any,
    value: js.Any,
    axisX: typings.devexpressWeb.ASPxClientAxis2D,
    axisY: typings.devexpressWeb.ASPxClientAxis2D,
    pane: typings.devexpressWeb.ASPxClientXYDiagramPane
  ): typings.devexpressWeb.ASPxClientControlCoordinates = js.native
  /**
    * Converts the display coordinates into a diagram coordinates object. An ASPxClientDiagramCoordinates object, containing information about the point's argument and value, their scale types, associated axes and pane.
    * @param x An integer value, representing the X-coordinate of a point (measured in pixels relative to the top left corner of a chart).
    * @param y An integer value, representing the Y-coordinate of a point (measured in pixels relative to the top left corner of a chart).
    */
  /* CompleteClass */
  override def PointToDiagram(x: Double, y: Double): typings.devexpressWeb.ASPxClientDiagramCoordinates = js.native
  /**
    * Shows the Crosshair Cursor at the point with the specified coordinates.
    * @param screenX The horizontal coordinate that is related to the top-left angle of the chart.
    * @param screenY The vertical coordinate that is related to the top-left angle of the chart.
    */
  /* CompleteClass */
  override def ShowCrosshair(screenX: Double, screenY: Double): Unit = js.native
}

