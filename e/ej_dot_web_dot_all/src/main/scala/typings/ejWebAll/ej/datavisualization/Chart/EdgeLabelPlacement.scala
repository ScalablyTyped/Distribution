package typings.ejWebAll.ej.datavisualization.Chart

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
  
}

