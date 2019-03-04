package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the base class for all diagram classes, which have X and Y axes.
  */
trait ASPxClientXYDiagramBase extends ASPxClientWebChartElement {
  /**
    * Gets the X-axis.
    * Value: An ASPxClientAxisBase object which represents the X-axis.
    */
  var axisX: ASPxClientAxisBase
  /**
    * Gets the Y-axis.
    * Value: An ASPxClientAxisBase object which represents the Y-axis.
    */
  var axisY: ASPxClientAxisBase
}

object ASPxClientXYDiagramBase {
  @scala.inline
  def apply(axisX: ASPxClientAxisBase, axisY: ASPxClientAxisBase, chart: ASPxClientWebChart): ASPxClientXYDiagramBase = {
    val __obj = js.Dynamic.literal(axisX = axisX, axisY = axisY, chart = chart)
  
    __obj.asInstanceOf[ASPxClientXYDiagramBase]
  }
}

