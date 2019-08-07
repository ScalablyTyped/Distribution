package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the XYDiagramPane class.
  */
@JSGlobal("ASPxClientXYDiagramPane")
@js.native
class ASPxClientXYDiagramPane () extends ASPxClientWebChartElementNamed {
  /**
    * Gets the diagram that owns the current pane object.
    */
  var diagram: ASPxClientXYDiagram = js.native
  /**
    * Returns the pane title's settings.
    */
  var title: ASPxClientPaneTitle = js.native
}

