package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the TextAnnotation class.
  */
trait ASPxClientTextAnnotation extends ASPxClientWebChartElementNamed {
  /**
    * Gets the lines of text within an annotation.
    * Value: An array of string values containing the text of a title.
    */
  var lines: js.Array[java.lang.String]
}

object ASPxClientTextAnnotation {
  @scala.inline
  def apply(chart: ASPxClientWebChart, lines: js.Array[java.lang.String], name: java.lang.String): ASPxClientTextAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("chart")(chart)
    __obj.updateDynamic("lines")(lines)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ASPxClientTextAnnotation]
  }
}

