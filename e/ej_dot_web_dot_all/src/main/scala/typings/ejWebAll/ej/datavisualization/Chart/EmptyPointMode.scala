package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EmptyPointMode extends js.Object

@JSGlobal("ej.datavisualization.Chart.EmptyPointMode")
@js.native
object EmptyPointMode extends js.Object {
  //string
  @js.native
  sealed trait Average extends EmptyPointMode
  
  //string
  @js.native
  sealed trait Gap extends EmptyPointMode
  
  //string
  @js.native
  sealed trait Zero extends EmptyPointMode
  
}

