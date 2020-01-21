package typings.ejWebAll.ej.datavisualization.CircularGauge

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RangeZOrderPlacement with Double] = js.native
  /* 1 */ @js.native
  object Front extends TopLevel[Front with Double]
  
  /* 0 */ @js.native
  object Rear extends TopLevel[Rear with Double]
  
}

