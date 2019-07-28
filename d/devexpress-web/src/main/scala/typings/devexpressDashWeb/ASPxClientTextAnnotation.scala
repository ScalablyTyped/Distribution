package typings.devexpressDashWeb

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
  var lines: js.Array[String]
}

object ASPxClientTextAnnotation {
  @scala.inline
  def apply(chart: ASPxClientWebChart, lines: js.Array[String], name: String): ASPxClientTextAnnotation = {
    val __obj = js.Dynamic.literal(chart = chart, lines = lines, name = name)
  
    __obj.asInstanceOf[ASPxClientTextAnnotation]
  }
}

