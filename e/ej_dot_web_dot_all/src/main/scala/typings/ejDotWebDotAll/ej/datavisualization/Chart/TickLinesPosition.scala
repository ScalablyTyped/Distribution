package typings.ejDotWebDotAll.ej.datavisualization.Chart

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TickLinesPosition extends js.Object

@JSGlobal("ej.datavisualization.Chart.TickLinesPosition")
@js.native
object TickLinesPosition extends js.Object {
  //string
  @js.native
  sealed trait Inside extends TickLinesPosition
  
  //string
  @js.native
  sealed trait Outside extends TickLinesPosition
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TickLinesPosition with Double] = js.native
  /* 0 */ @js.native
  object Inside extends TopLevel[Inside with Double]
  
  /* 1 */ @js.native
  object Outside extends TopLevel[Outside with Double]
  
}

