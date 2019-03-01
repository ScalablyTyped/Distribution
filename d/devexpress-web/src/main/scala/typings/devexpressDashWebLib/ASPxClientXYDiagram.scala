package typings
package devexpressDashWebLib

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
  var rotated: scala.Boolean
}

object ASPxClientXYDiagram {
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
    rotated: scala.Boolean,
    secondaryAxesX: js.Array[ASPxClientAxis],
    secondaryAxesY: js.Array[ASPxClientAxis]
  ): ASPxClientXYDiagram = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DiagramToPoint")(DiagramToPoint)
    __obj.updateDynamic("PointToDiagram")(PointToDiagram)
    __obj.updateDynamic("ShowCrosshair")(ShowCrosshair)
    __obj.updateDynamic("axisX")(axisX)
    __obj.updateDynamic("axisY")(axisY)
    __obj.updateDynamic("chart")(chart)
    __obj.updateDynamic("defaultPane")(defaultPane)
    __obj.updateDynamic("panes")(panes)
    __obj.updateDynamic("rotated")(rotated)
    __obj.updateDynamic("secondaryAxesX")(secondaryAxesX)
    __obj.updateDynamic("secondaryAxesY")(secondaryAxesY)
    __obj.asInstanceOf[ASPxClientXYDiagram]
  }
}

