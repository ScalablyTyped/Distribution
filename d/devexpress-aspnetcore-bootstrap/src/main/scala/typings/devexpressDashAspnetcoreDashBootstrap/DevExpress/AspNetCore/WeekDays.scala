package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WeekDays with Double] = js.native
  /* 127 */ @js.native
  object EveryDay extends TopLevel[EveryDay with Double]
  
  /* 32 */ @js.native
  object Friday extends TopLevel[Friday with Double]
  
  /* 2 */ @js.native
  object Monday extends TopLevel[Monday with Double]
  
  /* 64 */ @js.native
  object Saturday extends TopLevel[Saturday with Double]
  
  /* 1 */ @js.native
  object Sunday extends TopLevel[Sunday with Double]
  
  /* 16 */ @js.native
  object Thursday extends TopLevel[Thursday with Double]
  
  /* 4 */ @js.native
  object Tuesday extends TopLevel[Tuesday with Double]
  
  /* 8 */ @js.native
  object Wednesday extends TopLevel[Wednesday with Double]
  
  /* 65 */ @js.native
  object WeekendDays extends TopLevel[WeekendDays with Double]
  
  /* 62 */ @js.native
  object WorkDays extends TopLevel[WorkDays with Double]
  
}

