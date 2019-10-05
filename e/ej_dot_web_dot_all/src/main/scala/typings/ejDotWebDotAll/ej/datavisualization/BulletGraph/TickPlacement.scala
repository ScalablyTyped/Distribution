package typings.ejDotWebDotAll.ej.datavisualization.BulletGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TickPlacement extends js.Object

@JSGlobal("ej.datavisualization.BulletGraph.TickPlacement")
@js.native
object TickPlacement extends js.Object {
  //string
  @js.native
  sealed trait Inside extends TickPlacement
  
  //string
  @js.native
  sealed trait Outside extends TickPlacement
  
  /* 0 */ val Inside: typings.ejDotWebDotAll.ej.datavisualization.BulletGraph.TickPlacement.Inside with Double = js.native
  /* 1 */ val Outside: typings.ejDotWebDotAll.ej.datavisualization.BulletGraph.TickPlacement.Outside with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TickPlacement with Double] = js.native
}

