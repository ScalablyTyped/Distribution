package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Mode extends js.Object

@JSGlobal("ej.datavisualization.Chart.Mode")
@js.native
object Mode extends js.Object {
  //string
  @js.native
  sealed trait Cluster extends Mode
  
  //string
  @js.native
  sealed trait Point extends Mode
  
  //string
  @js.native
  sealed trait Range extends Mode
  
  //string
  @js.native
  sealed trait Series extends Mode
  
}

