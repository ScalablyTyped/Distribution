package typings.ejWebAll.ej.datavisualization.Chart

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EdgeLabelPlacement extends js.Object

@JSGlobal("ej.datavisualization.Chart.EdgeLabelPlacement")
@js.native
object EdgeLabelPlacement extends js.Object {
  //string
  @js.native
  sealed trait Hide extends EdgeLabelPlacement
  
  //string
  @js.native
  sealed trait None extends EdgeLabelPlacement
  
  //string
  @js.native
  sealed trait Shift extends EdgeLabelPlacement
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EdgeLabelPlacement with Double] = js.native
  /* 2 */ @js.native
  object Hide extends TopLevel[Hide with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 1 */ @js.native
  object Shift extends TopLevel[Shift with Double]
  
}

