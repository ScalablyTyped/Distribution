package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the TextAnnotation class.
  */
trait ASPxClientTextAnnotation extends ASPxClientWebChartElementNamed {
  /**
    * Gets the lines of text within an annotation.
    */
  var lines: js.Array[String]
}

object ASPxClientTextAnnotation {
  @scala.inline
  def apply(chart: ASPxClientWebChart, lines: js.Array[String], name: String): ASPxClientTextAnnotation = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTextAnnotation]
  }
}

