package typings.ejWebAll.ej.Gantt

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
  
}

