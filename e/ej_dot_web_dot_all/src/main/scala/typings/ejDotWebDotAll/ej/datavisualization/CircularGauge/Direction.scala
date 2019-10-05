package typings.ejDotWebDotAll.ej.datavisualization.CircularGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Direction extends js.Object

@JSGlobal("ej.datavisualization.CircularGauge.Direction")
@js.native
object Direction extends js.Object {
  //string
  @js.native
  sealed trait Clockwise
    extends typings.ejDotWebDotAll.ej.datavisualization.CircularGauge.Direction
  
  //string
  @js.native
  sealed trait CounterClockwise
    extends typings.ejDotWebDotAll.ej.datavisualization.CircularGauge.Direction
  
  /* 0 */ val Clockwise: typings.ejDotWebDotAll.ej.datavisualization.CircularGauge.Direction.Clockwise with Double = js.native
  /* 1 */ val CounterClockwise: typings.ejDotWebDotAll.ej.datavisualization.CircularGauge.Direction.CounterClockwise with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.ejDotWebDotAll.ej.datavisualization.CircularGauge.Direction with Double] = js.native
}

