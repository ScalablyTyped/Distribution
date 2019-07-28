package typings.devexpressDashAspnetcoreDashBootstrap.DevExpressNs.AspNetCoreNs

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
  
  /* 127 */ val EveryDay: typings.devexpressDashAspnetcoreDashBootstrap.DevExpressNs.AspNetCoreNs.WeekDays.EveryDay with Double = js.native
  /* 32 */ val Friday: typings.devexpressDashAspnetcoreDashBootstrap.DevExpressNs.AspNetCoreNs.WeekDays.Friday with Double = js.native
  /* 2 */ val Monday: typings.devexpressDashAspnetcoreDashBootstrap.DevExpressNs.AspNetCoreNs.WeekDays.Monday with Double = js.native
  /* 64 */ val Saturday: typings.devexpressDashAspnetcoreDashBootstrap.DevExpressNs.AspNetCoreNs.WeekDays.Saturday with Double = js.native
  /* 1 */ val Sunday: typings.devexpressDashAspnetcoreDashBootstrap.DevExpressNs.AspNetCoreNs.WeekDays.Sunday with Double = js.native
  /* 16 */ val Thursday: typings.devexpressDashAspnetcoreDashBootstrap.DevExpressNs.AspNetCoreNs.WeekDays.Thursday with Double = js.native
  /* 4 */ val Tuesday: typings.devexpressDashAspnetcoreDashBootstrap.DevExpressNs.AspNetCoreNs.WeekDays.Tuesday with Double = js.native
  /* 8 */ val Wednesday: typings.devexpressDashAspnetcoreDashBootstrap.DevExpressNs.AspNetCoreNs.WeekDays.Wednesday with Double = js.native
  /* 65 */ val WeekendDays: typings.devexpressDashAspnetcoreDashBootstrap.DevExpressNs.AspNetCoreNs.WeekDays.WeekendDays with Double = js.native
  /* 62 */ val WorkDays: typings.devexpressDashAspnetcoreDashBootstrap.DevExpressNs.AspNetCoreNs.WeekDays.WorkDays with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WeekDays with Double] = js.native
}

