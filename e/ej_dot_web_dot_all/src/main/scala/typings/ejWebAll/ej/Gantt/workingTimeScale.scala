package typings.ejWebAll.ej.Gantt

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait workingTimeScale extends js.Object

@JSGlobal("ej.Gantt.workingTimeScale")
@js.native
object workingTimeScale extends js.Object {
  ///Sets twenty four hour timescale.
  @js.native
  sealed trait TimeScale24Hours extends workingTimeScale
  
  ///Sets eight hour timescale.
  @js.native
  sealed trait TimeScale8Hours extends workingTimeScale
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[workingTimeScale with Double] = js.native
  /* 1 */ @js.native
  object TimeScale24Hours extends TopLevel[TimeScale24Hours with Double]
  
  /* 0 */ @js.native
  object TimeScale8Hours extends TopLevel[TimeScale8Hours with Double]
  
}

