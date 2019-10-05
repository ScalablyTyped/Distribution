package typings.ejDotWebDotAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ZIndex extends js.Object

@JSGlobal("ej.datavisualization.Chart.ZIndex")
@js.native
object ZIndex extends js.Object {
  //string
  @js.native
  sealed trait Inside extends ZIndex
  
  //string
  @js.native
  sealed trait Over extends ZIndex
  
  /* 0 */ val Inside: typings.ejDotWebDotAll.ej.datavisualization.Chart.ZIndex.Inside with Double = js.native
  /* 1 */ val Over: typings.ejDotWebDotAll.ej.datavisualization.Chart.ZIndex.Over with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ZIndex with Double] = js.native
}

