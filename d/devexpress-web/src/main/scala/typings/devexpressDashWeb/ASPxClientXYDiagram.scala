package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the XYDiagram class.
  */
trait ASPxClientXYDiagram extends ASPxClientXYDiagram2D {
  /**
    * Gets a value indicating whether the diagram is rotated.
    * Value: true if the diagram is rotated; otherwise, false.
    */
  var rotated: Boolean
}

object ASPxClientXYDiagram {
  @scala.inline
  def apply(
    DiagramToPoint: (js.Object, js.Object, ASPxClientAxis2D, ASPxClientAxis2D, ASPxClientXYDiagramPane) => ASPxClientControlCoordinates,
    PointToDiagram: (Double, Double) => ASPxClientDiagramCoordinates,
    ShowCrosshair: (Double, Double) => Unit,
    axisX: ASPxClientAxisBase,
    axisY: ASPxClientAxisBase,
    chart: ASPxClientWebChart,
    defaultPane: ASPxClientXYDiagramPane,
    panes: js.Array[ASPxClientXYDiagramPane],
    rotated: Boolean,
    secondaryAxesX: js.Array[ASPxClientAxis],
    secondaryAxesY: js.Array[ASPxClientAxis]
  ): ASPxClientXYDiagram = {
    val __obj = js.Dynamic.literal(DiagramToPoint = js.Any.fromFunction5(DiagramToPoint), PointToDiagram = js.Any.fromFunction2(PointToDiagram), ShowCrosshair = js.Any.fromFunction2(ShowCrosshair), axisX = axisX, axisY = axisY, chart = chart, defaultPane = defaultPane, panes = panes, rotated = rotated, secondaryAxesX = secondaryAxesX, secondaryAxesY = secondaryAxesY)
  
    __obj.asInstanceOf[ASPxClientXYDiagram]
  }
}

