package typings
package devexpressDashWebLib

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
  var alignment: java.lang.String
  /**
    * Returns the pane title's text.
    * Value: The pane title's text.
    */
  var text: java.lang.String
}

object ASPxClientPaneTitle {
  @scala.inline
  def apply(alignment: java.lang.String, chart: ASPxClientWebChart, text: java.lang.String): ASPxClientPaneTitle = {
    val __obj = js.Dynamic.literal(alignment = alignment, chart = chart, text = text)
  
    __obj.asInstanceOf[ASPxClientPaneTitle]
  }
}

