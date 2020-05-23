package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LineCap extends js.Object

@JSGlobal("ej.datavisualization.Chart.LineCap")
@js.native
object LineCap extends js.Object {
  //string
  @js.native
  sealed trait Butt extends LineCap
  
  //string
  @js.native
  sealed trait Round extends LineCap
  
  //string
  @js.native
  sealed trait Square extends LineCap
  
}

