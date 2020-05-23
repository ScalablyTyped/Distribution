package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Position extends js.Object

@JSGlobal("ej.datavisualization.Chart.Position")
@js.native
object Position extends js.Object {
  //string
  @js.native
  sealed trait Bottom extends Position
  
  //string
  @js.native
  sealed trait Left extends Position
  
  //string
  @js.native
  sealed trait Right extends Position
  
  //string
  @js.native
  sealed trait Top extends Position
  
}

