package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait boxPlotMode extends js.Object

@JSGlobal("ej.datavisualization.Chart.boxPlotMode")
@js.native
object boxPlotMode extends js.Object {
  //string
  @js.native
  sealed trait Exclusive extends boxPlotMode
  
  //string
  @js.native
  sealed trait Inclusive extends boxPlotMode
  
  //string
  @js.native
  sealed trait Normal extends boxPlotMode
  
}

