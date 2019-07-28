package typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ErrorBarDirection extends js.Object

@JSGlobal("ej.datavisualization.Chart.ErrorBarDirection")
@js.native
object ErrorBarDirection extends js.Object {
  //string
  @js.native
  sealed trait Both extends ErrorBarDirection
  
  //string
  @js.native
  sealed trait Minus extends ErrorBarDirection
  
  //string
  @js.native
  sealed trait Plus extends ErrorBarDirection
  
  /* 0 */ val Both: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.ErrorBarDirection.Both with Double = js.native
  /* 2 */ val Minus: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.ErrorBarDirection.Minus with Double = js.native
  /* 1 */ val Plus: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.ErrorBarDirection.Plus with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ErrorBarDirection with Double] = js.native
}

