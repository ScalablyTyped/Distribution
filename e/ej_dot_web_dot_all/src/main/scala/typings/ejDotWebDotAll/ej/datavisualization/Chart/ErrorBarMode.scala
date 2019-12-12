package typings.ejDotWebDotAll.ej.datavisualization.Chart

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.Chart.ErrorBarMode.Both
import typings.ejDotWebDotAll.ej.datavisualization.Chart.ErrorBarMode.Horizontal
import typings.ejDotWebDotAll.ej.datavisualization.Chart.ErrorBarMode.Vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ErrorBarMode extends js.Object

@JSGlobal("ej.datavisualization.Chart.ErrorBarMode")
@js.native
object ErrorBarMode extends js.Object {
  //string
  @js.native
  sealed trait Both extends ErrorBarMode
  
  //string
  @js.native
  sealed trait Horizontal extends ErrorBarMode
  
  //string
  @js.native
  sealed trait Vertical extends ErrorBarMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ErrorBarMode with Double] = js.native
  /* 0 */ @js.native
  object Both extends TopLevel[Both with Double]
  
  /* 2 */ @js.native
  object Horizontal extends TopLevel[Horizontal with Double]
  
  /* 1 */ @js.native
  object Vertical extends TopLevel[Vertical with Double]
  
}

