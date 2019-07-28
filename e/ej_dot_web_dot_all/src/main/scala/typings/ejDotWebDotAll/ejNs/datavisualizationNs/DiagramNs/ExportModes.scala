package typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ExportModes extends js.Object

@JSGlobal("ej.datavisualization.Diagram.ExportModes")
@js.native
object ExportModes extends js.Object {
  //Used to export the diagram as raw data.
  @js.native
  sealed trait Data extends ExportModes
  
  //Used to export the diagram as a file.
  @js.native
  sealed trait Download extends ExportModes
  
  /* 1 */ val Data: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.ExportModes.Data with Double = js.native
  /* 0 */ val Download: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.ExportModes.Download with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExportModes with Double] = js.native
}

