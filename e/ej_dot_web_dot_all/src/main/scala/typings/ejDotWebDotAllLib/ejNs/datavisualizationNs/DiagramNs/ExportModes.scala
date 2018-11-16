package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

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
  sealed trait Data
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.ExportModes
  
  //Used to export the diagram as a file.
  @js.native
  sealed trait Download
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.ExportModes
  
  val Data: Data with java.lang.String = js.native
  val Download: Download with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.ExportModes with java.lang.String
  ] = js.native
}

