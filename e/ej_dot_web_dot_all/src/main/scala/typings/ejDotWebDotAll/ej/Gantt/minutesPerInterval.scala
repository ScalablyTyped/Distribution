package typings.ejDotWebDotAll.ej.Gantt

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.Gantt.minutesPerInterval.Auto
import typings.ejDotWebDotAll.ej.Gantt.minutesPerInterval.FifteenMinutes
import typings.ejDotWebDotAll.ej.Gantt.minutesPerInterval.FiveMinutes
import typings.ejDotWebDotAll.ej.Gantt.minutesPerInterval.OneMinute
import typings.ejDotWebDotAll.ej.Gantt.minutesPerInterval.ThirtyMinutes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait minutesPerInterval extends js.Object

@JSGlobal("ej.Gantt.minutesPerInterval")
@js.native
object minutesPerInterval extends js.Object {
  ///Sets the interval automatically according with schedule start and end date.
  @js.native
  sealed trait Auto extends minutesPerInterval
  
  ///Sets fifteen minute intervals per hour.
  @js.native
  sealed trait FifteenMinutes extends minutesPerInterval
  
  ///Sets Five minute intervals per hour.
  @js.native
  sealed trait FiveMinutes extends minutesPerInterval
  
  ///Sets one minute intervals per hour.
  @js.native
  sealed trait OneMinute extends minutesPerInterval
  
  ///Sets thirty minute intervals per hour.
  @js.native
  sealed trait ThirtyMinutes extends minutesPerInterval
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[minutesPerInterval with Double] = js.native
  /* 0 */ @js.native
  object Auto extends TopLevel[Auto with Double]
  
  /* 3 */ @js.native
  object FifteenMinutes extends TopLevel[FifteenMinutes with Double]
  
  /* 2 */ @js.native
  object FiveMinutes extends TopLevel[FiveMinutes with Double]
  
  /* 1 */ @js.native
  object OneMinute extends TopLevel[OneMinute with Double]
  
  /* 4 */ @js.native
  object ThirtyMinutes extends TopLevel[ThirtyMinutes with Double]
  
}

