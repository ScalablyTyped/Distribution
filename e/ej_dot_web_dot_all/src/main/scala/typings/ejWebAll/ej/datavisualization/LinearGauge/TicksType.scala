package typings.ejWebAll.ej.datavisualization.LinearGauge

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TicksType extends js.Object

@JSGlobal("ej.datavisualization.LinearGauge.TicksType")
@js.native
object TicksType extends js.Object {
  //string
  @js.native
  sealed trait Majorinterval extends TicksType
  
  //string
  @js.native
  sealed trait Minorinterval extends TicksType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TicksType with Double] = js.native
  /* 0 */ @js.native
  object Majorinterval extends TopLevel[Majorinterval with Double]
  
  /* 1 */ @js.native
  object Minorinterval extends TopLevel[Minorinterval with Double]
  
}

