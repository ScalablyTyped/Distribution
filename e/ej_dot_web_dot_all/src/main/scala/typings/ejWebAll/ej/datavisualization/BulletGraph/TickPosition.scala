package typings.ejWebAll.ej.datavisualization.BulletGraph

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
  
}

