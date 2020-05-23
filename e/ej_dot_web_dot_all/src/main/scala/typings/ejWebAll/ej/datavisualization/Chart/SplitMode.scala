package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SplitMode extends js.Object

@JSGlobal("ej.datavisualization.Chart.SplitMode")
@js.native
object SplitMode extends js.Object {
  //string
  @js.native
  sealed trait Indexes extends SplitMode
  
  //string
  @js.native
  sealed trait Percentage extends SplitMode
  
  //string
  @js.native
  sealed trait Position extends SplitMode
  
  //string
  @js.native
  sealed trait Value extends SplitMode
  
}

