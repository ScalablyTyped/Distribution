package typings.ejWebAll.ej.datavisualization.HeatMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CellVisibility extends js.Object
@JSGlobal("ej.datavisualization.HeatMap.CellVisibility")
@js.native
object CellVisibility extends js.Object {
  
  //Hide the content of the cell
  @js.native
  sealed trait Hidden extends CellVisibility
  
  //Display the content of the cell
  @js.native
  sealed trait Visible extends CellVisibility
}
