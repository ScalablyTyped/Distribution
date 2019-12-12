package typings.ejDotWebDotAll.ej.datavisualization.LinearGauge

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.LinearGauge.Direction.Clockwise
import typings.ejDotWebDotAll.ej.datavisualization.LinearGauge.Direction.CounterClockwise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Direction extends js.Object

@JSGlobal("ej.datavisualization.LinearGauge.Direction")
@js.native
object Direction extends js.Object {
  //string
  @js.native
  sealed trait Clockwise
    extends typings.ejDotWebDotAll.ej.datavisualization.LinearGauge.Direction
  
  //string
  @js.native
  sealed trait CounterClockwise
    extends typings.ejDotWebDotAll.ej.datavisualization.LinearGauge.Direction
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.ejDotWebDotAll.ej.datavisualization.LinearGauge.Direction with Double] = js.native
  /* 0 */ @js.native
  object Clockwise extends TopLevel[Clockwise with Double]
  
  /* 1 */ @js.native
  object CounterClockwise extends TopLevel[CounterClockwise with Double]
  
}

