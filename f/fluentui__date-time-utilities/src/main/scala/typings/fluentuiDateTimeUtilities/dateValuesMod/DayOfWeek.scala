package typings.fluentuiDateTimeUtilities.dateValuesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DayOfWeek extends js.Object
@JSImport("@fluentui/date-time-utilities/lib/dateValues/dateValues", "DayOfWeek")
@js.native
object DayOfWeek extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DayOfWeek with Double] = js.native
  
  @js.native
  sealed trait Friday extends DayOfWeek
  /* 5 */ @js.native
  object Friday extends TopLevel[Friday with Double]
  
  @js.native
  sealed trait Monday extends DayOfWeek
  /* 1 */ @js.native
  object Monday extends TopLevel[Monday with Double]
  
  @js.native
  sealed trait Saturday extends DayOfWeek
  /* 6 */ @js.native
  object Saturday extends TopLevel[Saturday with Double]
  
  @js.native
  sealed trait Sunday extends DayOfWeek
  /* 0 */ @js.native
  object Sunday extends TopLevel[Sunday with Double]
  
  @js.native
  sealed trait Thursday extends DayOfWeek
  /* 4 */ @js.native
  object Thursday extends TopLevel[Thursday with Double]
  
  @js.native
  sealed trait Tuesday extends DayOfWeek
  /* 2 */ @js.native
  object Tuesday extends TopLevel[Tuesday with Double]
  
  @js.native
  sealed trait Wednesday extends DayOfWeek
  /* 3 */ @js.native
  object Wednesday extends TopLevel[Wednesday with Double]
}
