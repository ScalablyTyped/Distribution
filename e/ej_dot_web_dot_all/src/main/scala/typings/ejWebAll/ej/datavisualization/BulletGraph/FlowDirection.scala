package typings.ejWebAll.ej.datavisualization.BulletGraph

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
  
}

