package typings.ejWebAll.ej.datavisualization.HeatMap

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Trigger extends js.Object

@JSGlobal("ej.datavisualization.HeatMap.Trigger")
@js.native
object Trigger extends js.Object {
  //Tooltip can be triggered on mouse click
  @js.native
  sealed trait Click extends Trigger
  
  //Tooltip can be triggered on mouse hovers
  @js.native
  sealed trait Hover extends Trigger
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Trigger with Double] = js.native
  /* 1 */ @js.native
  object Click extends TopLevel[Click with Double]
  
  /* 0 */ @js.native
  object Hover extends TopLevel[Hover with Double]
  
}

