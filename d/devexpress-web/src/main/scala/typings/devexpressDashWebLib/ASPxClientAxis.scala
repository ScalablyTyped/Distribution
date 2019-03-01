package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the Axis class.
  */
trait ASPxClientAxis extends ASPxClientAxis2D {
  /**
    * Gets a value indicating whether the axis is reversed.
    * Value: true if the axis is reversed; otherwise, false.
    */
  var reverse: scala.Boolean
}

object ASPxClientAxis {
  @scala.inline
  def apply(
    axisTitle: ASPxClientAxisTitle,
    chart: ASPxClientWebChart,
    constantLines: js.Array[ASPxClientConstantLine],
    diagram: ASPxClientXYDiagramBase,
    name: java.lang.String,
    range: ASPxClientAxisRange,
    reverse: scala.Boolean,
    strips: js.Array[ASPxClientStrip]
  ): ASPxClientAxis = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("axisTitle")(axisTitle)
    __obj.updateDynamic("chart")(chart)
    __obj.updateDynamic("constantLines")(constantLines)
    __obj.updateDynamic("diagram")(diagram)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("range")(range)
    __obj.updateDynamic("reverse")(reverse)
    __obj.updateDynamic("strips")(strips)
    __obj.asInstanceOf[ASPxClientAxis]
  }
}

