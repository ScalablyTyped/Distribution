package typings.ejDotWebDotAll.ej.Schedule

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.Schedule.TimeMode.Hour12
import typings.ejDotWebDotAll.ej.Schedule.TimeMode.Hour24
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TimeMode extends js.Object

@JSGlobal("ej.Schedule.TimeMode")
@js.native
object TimeMode extends js.Object {
  ///Sets 12 hour time mode to Scheduler
  @js.native
  sealed trait Hour12 extends TimeMode
  
  ///Sets 24 hour time mode to Scheduler
  @js.native
  sealed trait Hour24 extends TimeMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TimeMode with Double] = js.native
  /* 0 */ @js.native
  object Hour12 extends TopLevel[Hour12 with Double]
  
  /* 1 */ @js.native
  object Hour24 extends TopLevel[Hour24 with Double]
  
}

