package typings.ejDotWebDotAll.ejNs.datavisualizationNs.BulletGraphNs

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
  
  /* 1 */ val Above: typings.ejDotWebDotAll.ejNs.datavisualizationNs.BulletGraphNs.TickPosition.Above with Double = js.native
  /* 0 */ val Below: typings.ejDotWebDotAll.ejNs.datavisualizationNs.BulletGraphNs.TickPosition.Below with Double = js.native
  /* 2 */ val Cross: typings.ejDotWebDotAll.ejNs.datavisualizationNs.BulletGraphNs.TickPosition.Cross with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TickPosition with Double] = js.native
}

