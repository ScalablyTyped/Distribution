package typings.ejWebAll.ej.datavisualization.Chart

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LabelPlacement extends js.Object

@JSGlobal("ej.datavisualization.Chart.LabelPlacement")
@js.native
object LabelPlacement extends js.Object {
  //string
  @js.native
  sealed trait BetweenTicks extends LabelPlacement
  
  //string
  @js.native
  sealed trait OnTicks extends LabelPlacement
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LabelPlacement with Double] = js.native
  /* 1 */ @js.native
  object BetweenTicks extends TopLevel[BetweenTicks with Double]
  
  /* 0 */ @js.native
  object OnTicks extends TopLevel[OnTicks with Double]
  
}

