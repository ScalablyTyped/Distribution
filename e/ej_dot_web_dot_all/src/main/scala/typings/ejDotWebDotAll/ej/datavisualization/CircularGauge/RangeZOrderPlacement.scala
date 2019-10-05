package typings.ejDotWebDotAll.ej.datavisualization.CircularGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RangeZOrderPlacement extends js.Object

@JSGlobal("ej.datavisualization.CircularGauge.RangeZOrderPlacement")
@js.native
object RangeZOrderPlacement extends js.Object {
  //string
  @js.native
  sealed trait Front extends RangeZOrderPlacement
  
  //string
  @js.native
  sealed trait Rear extends RangeZOrderPlacement
  
  /* 1 */ val Front: typings.ejDotWebDotAll.ej.datavisualization.CircularGauge.RangeZOrderPlacement.Front with Double = js.native
  /* 0 */ val Rear: typings.ejDotWebDotAll.ej.datavisualization.CircularGauge.RangeZOrderPlacement.Rear with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RangeZOrderPlacement with Double] = js.native
}

