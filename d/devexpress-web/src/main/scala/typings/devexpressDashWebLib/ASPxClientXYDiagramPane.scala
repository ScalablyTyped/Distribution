package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the XYDiagramPane class.
  */
trait ASPxClientXYDiagramPane extends ASPxClientWebChartElementNamed {
  /**
    * Gets the diagram that owns the current pane object.
    * Value: An ASPxClientXYDiagram object, to which the pane belongs.
    */
  var diagram: ASPxClientXYDiagram
  var title: ASPxClientPaneTitle
}

object ASPxClientXYDiagramPane {
  @scala.inline
  def apply(
    chart: ASPxClientWebChart,
    diagram: ASPxClientXYDiagram,
    name: java.lang.String,
    title: ASPxClientPaneTitle
  ): ASPxClientXYDiagramPane = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("chart")(chart)
    __obj.updateDynamic("diagram")(diagram)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[ASPxClientXYDiagramPane]
  }
}

