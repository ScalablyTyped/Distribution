package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the base for ASPxClientChartTitle and ASPxClientSeriesTitle classes.
  */
trait ASPxClientTitleBase extends ASPxClientWebChartElement {
  /**
    * Gets the alignment of the title.
    */
  var alignment: String
  /**
    * Gets a value that specifies to which edges of a parent element the title should be docked.
    */
  var dock: String
  /**
    * Gets the lines of text within a title.
    */
  var lines: js.Array[String]
}

object ASPxClientTitleBase {
  @scala.inline
  def apply(alignment: String, chart: ASPxClientWebChart, dock: String, lines: js.Array[String]): ASPxClientTitleBase = {
    val __obj = js.Dynamic.literal(alignment = alignment.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], dock = dock.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTitleBase]
  }
}

