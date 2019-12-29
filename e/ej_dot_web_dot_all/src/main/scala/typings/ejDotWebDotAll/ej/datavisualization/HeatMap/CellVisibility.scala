package typings.ejDotWebDotAll.ej.datavisualization.HeatMap

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CellVisibility with Double] = js.native
  /* 1 */ @js.native
  object Hidden extends TopLevel[Hidden with Double]
  
  /* 0 */ @js.native
  object Visible extends TopLevel[Visible with Double]
  
}

