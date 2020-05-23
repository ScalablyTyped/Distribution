package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the XYDiagramPane class.
  */
@JSGlobal("ASPxClientXYDiagramPane")
@js.native
class ASPxClientXYDiagramPane ()
  extends typings.devexpressWeb.ASPxClientXYDiagramPane {
  /**
    * Gets the chart that owns the current chart element.
    */
  /* CompleteClass */
  override var chart: typings.devexpressWeb.ASPxClientWebChart = js.native
  /**
    * Gets the diagram that owns the current pane object.
    */
  /* CompleteClass */
  override var diagram: typings.devexpressWeb.ASPxClientXYDiagram = js.native
  /**
    * Gets the name of the chart element.
    */
  /* CompleteClass */
  override var name: String = js.native
  /**
    * Returns the pane title's settings.
    */
  /* CompleteClass */
  override var title: typings.devexpressWeb.ASPxClientPaneTitle = js.native
}

