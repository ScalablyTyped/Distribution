package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WeekDays extends js.Object

@JSGlobal("DevExpress.AspNetCore.WeekDays")
@js.native
object WeekDays extends js.Object {
  @js.native
  sealed trait EveryDay extends WeekDays
  
  @js.native
  sealed trait Friday extends WeekDays
  
  @js.native
  sealed trait Monday extends WeekDays
  
  @js.native
  sealed trait Saturday extends WeekDays
  
  @js.native
  sealed trait Sunday extends WeekDays
  
  @js.native
  sealed trait Thursday extends WeekDays
  
  @js.native
  sealed trait Tuesday extends WeekDays
  
  @js.native
  sealed trait Wednesday extends WeekDays
  
  @js.native
  sealed trait WeekendDays extends WeekDays
  
  @js.native
  sealed trait WorkDays extends WeekDays
  
}

