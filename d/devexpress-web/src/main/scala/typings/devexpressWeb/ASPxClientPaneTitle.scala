package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The pane title.
  */
trait ASPxClientPaneTitle extends ASPxClientWebChartElement {
  /**
    * Returns the value that defines how to align the pane title.
    */
  var alignment: String
  /**
    * Returns the pane title's text.
    */
  var text: String
}

object ASPxClientPaneTitle {
  @scala.inline
  def apply(alignment: String, chart: ASPxClientWebChart, text: String): ASPxClientPaneTitle = {
    val __obj = js.Dynamic.literal(alignment = alignment.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientPaneTitle]
  }
}

