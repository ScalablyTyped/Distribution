package typings.ejDotWebDotAll.ej.datavisualization.CircularGauge

import org.scalablytyped.runtime.TopLevel
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
  sealed trait Clockwise extends Direction
  
  //string
  @js.native
  sealed trait CounterClockwise extends Direction
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Direction with Double] = js.native
  /* 0 */ @js.native
  object Clockwise extends TopLevel[Clockwise with Double]
  
  /* 1 */ @js.native
  object CounterClockwise extends TopLevel[CounterClockwise with Double]
  
}

