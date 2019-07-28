package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The pane title.
  */
trait ASPxClientPaneTitle extends ASPxClientWebChartElement {
  /**
    * Returns the value that defines how to align the pane title.
    * Value: The string that defines alignment.
    */
  var alignment: String
  /**
    * Returns the pane title's text.
    * Value: The pane title's text.
    */
  var text: String
}

object ASPxClientPaneTitle {
  @scala.inline
  def apply(alignment: String, chart: ASPxClientWebChart, text: String): ASPxClientPaneTitle = {
    val __obj = js.Dynamic.literal(alignment = alignment, chart = chart, text = text)
  
    __obj.asInstanceOf[ASPxClientPaneTitle]
  }
}

