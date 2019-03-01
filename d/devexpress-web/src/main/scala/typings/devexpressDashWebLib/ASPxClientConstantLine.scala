package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the ConstantLine class.
  */
trait ASPxClientConstantLine extends ASPxClientWebChartElementNamed {
  /**
    * Gets the axis that owns the current constant line object.
    * Value: An ASPxClientAxis object, to which the constant line belongs.
    */
  var axis: ASPxClientAxis
  /**
    * Gets the constant line title.
    * Value: A string object, representing the title's text.
    */
  var title: java.lang.String
  /**
    * Gets the constant line's position along the axis.
    * Value: An object that specifies the constant line's position.
    */
  var value: js.Object
}

object ASPxClientConstantLine {
  @scala.inline
  def apply(
    axis: ASPxClientAxis,
    chart: ASPxClientWebChart,
    name: java.lang.String,
    title: java.lang.String,
    value: js.Object
  ): ASPxClientConstantLine = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("axis")(axis)
    __obj.updateDynamic("chart")(chart)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("title")(title)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ASPxClientConstantLine]
  }
}

