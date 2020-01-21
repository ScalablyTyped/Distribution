package typings.ejWebAll.ej.datavisualization.Chart

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[boxPlotMode with Double] = js.native
  /* 0 */ @js.native
  object Exclusive extends TopLevel[Exclusive with Double]
  
  /* 1 */ @js.native
  object Inclusive extends TopLevel[Inclusive with Double]
  
  /* 2 */ @js.native
  object Normal extends TopLevel[Normal with Double]
  
}

