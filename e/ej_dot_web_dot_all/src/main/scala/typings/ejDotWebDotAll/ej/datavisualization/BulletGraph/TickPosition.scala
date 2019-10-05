package typings.ejDotWebDotAll.ej.datavisualization.BulletGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TickPosition extends js.Object

@JSGlobal("ej.datavisualization.BulletGraph.TickPosition")
@js.native
object TickPosition extends js.Object {
  //string
  @js.native
  sealed trait Above extends TickPosition
  
  //string
  @js.native
  sealed trait Below extends TickPosition
  
  //string
  @js.native
  sealed trait Cross extends TickPosition
  
  /* 1 */ val Above: typings.ejDotWebDotAll.ej.datavisualization.BulletGraph.TickPosition.Above with Double = js.native
  /* 0 */ val Below: typings.ejDotWebDotAll.ej.datavisualization.BulletGraph.TickPosition.Below with Double = js.native
  /* 2 */ val Cross: typings.ejDotWebDotAll.ej.datavisualization.BulletGraph.TickPosition.Cross with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TickPosition with Double] = js.native
}

