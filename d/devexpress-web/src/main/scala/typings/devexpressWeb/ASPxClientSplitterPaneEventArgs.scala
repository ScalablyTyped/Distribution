package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A method that will handle the splitter's client events concerning manipulations with a pane.
  */
@JSGlobal("ASPxClientSplitterPaneEventArgs")
@js.native
class ASPxClientSplitterPaneEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new instance of the ASPxClientSplitterPaneEventArgs class.
    * @param pane A ASPxClientSplitterPane object representing a splitter pane related to the generated event.
    */
  def this(pane: ASPxClientSplitterPane) = this()
  /**
    * Gets the pane object related to the event.
    */
  var pane: ASPxClientSplitterPane = js.native
}

