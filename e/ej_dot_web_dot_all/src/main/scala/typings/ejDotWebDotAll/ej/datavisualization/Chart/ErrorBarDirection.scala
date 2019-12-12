package typings.ejDotWebDotAll.ej.datavisualization.Chart

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.Chart.ErrorBarDirection.Both
import typings.ejDotWebDotAll.ej.datavisualization.Chart.ErrorBarDirection.Minus
import typings.ejDotWebDotAll.ej.datavisualization.Chart.ErrorBarDirection.Plus
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ErrorBarDirection with Double] = js.native
  /* 0 */ @js.native
  object Both extends TopLevel[Both with Double]
  
  /* 2 */ @js.native
  object Minus extends TopLevel[Minus with Double]
  
  /* 1 */ @js.native
  object Plus extends TopLevel[Plus with Double]
  
}

