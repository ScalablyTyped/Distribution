package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A method that will handle the splitter's client events concerning manipulations with a pane.
  */
trait ASPxClientSplitterPaneEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the pane object related to the event.
    */
  var pane: ASPxClientSplitterPane
}

object ASPxClientSplitterPaneEventArgs {
  @scala.inline
  def apply(pane: ASPxClientSplitterPane): ASPxClientSplitterPaneEventArgs = {
    val __obj = js.Dynamic.literal(pane = pane.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSplitterPaneEventArgs]
  }
}

