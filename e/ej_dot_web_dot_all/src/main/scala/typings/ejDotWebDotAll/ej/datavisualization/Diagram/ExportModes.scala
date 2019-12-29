package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExportModes with Double] = js.native
  /* 1 */ @js.native
  object Data extends TopLevel[Data with Double]
  
  /* 0 */ @js.native
  object Download extends TopLevel[Download with Double]
  
}

