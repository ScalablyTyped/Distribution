package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the SeparatePaneIndicator class.
  */
@JSGlobal("ASPxSeparatePaneIndicator")
@js.native
class ASPxSeparatePaneIndicator () extends ASPxClientIndicator {
  /**
    * Returns the name of the Y-axis that is used to plot the current indicator on a ASPxClientXYDiagram.
    */
  var axisY: String = js.native
  /**
    * Returns the name of a pane, used to plot the separate pane indicator on an XYDiagram.
    */
  var pane: String = js.native
}

