package typings.ejDotWebDotAll.ej.datavisualization.BulletGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FlowDirection extends js.Object

@JSGlobal("ej.datavisualization.BulletGraph.FlowDirection")
@js.native
object FlowDirection extends js.Object {
  //string
  @js.native
  sealed trait Backward extends FlowDirection
  
  //string
  @js.native
  sealed trait Forward extends FlowDirection
  
  /* 1 */ val Backward: typings.ejDotWebDotAll.ej.datavisualization.BulletGraph.FlowDirection.Backward with Double = js.native
  /* 0 */ val Forward: typings.ejDotWebDotAll.ej.datavisualization.BulletGraph.FlowDirection.Forward with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FlowDirection with Double] = js.native
}

