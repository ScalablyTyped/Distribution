package typings.ejWebAll.ej.datavisualization.Chart

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EmptyPointMode extends js.Object

@JSGlobal("ej.datavisualization.Chart.EmptyPointMode")
@js.native
object EmptyPointMode extends js.Object {
  //string
  @js.native
  sealed trait Average extends EmptyPointMode
  
  //string
  @js.native
  sealed trait Gap extends EmptyPointMode
  
  //string
  @js.native
  sealed trait Zero extends EmptyPointMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmptyPointMode with Double] = js.native
  /* 2 */ @js.native
  object Average extends TopLevel[Average with Double]
  
  /* 0 */ @js.native
  object Gap extends TopLevel[Gap with Double]
  
  /* 1 */ @js.native
  object Zero extends TopLevel[Zero with Double]
  
}

