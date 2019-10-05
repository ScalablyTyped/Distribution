package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WeekOfMonth extends js.Object

@JSGlobal("DevExpress.AspNetCore.WeekOfMonth")
@js.native
object WeekOfMonth extends js.Object {
  @js.native
  sealed trait First extends WeekOfMonth
  
  @js.native
  sealed trait Fourth extends WeekOfMonth
  
  @js.native
  sealed trait Last extends WeekOfMonth
  
  @js.native
  sealed trait None extends WeekOfMonth
  
  @js.native
  sealed trait Second extends WeekOfMonth
  
  @js.native
  sealed trait Third extends WeekOfMonth
  
  /* 1 */ val First: typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore.WeekOfMonth.First with Double = js.native
  /* 4 */ val Fourth: typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore.WeekOfMonth.Fourth with Double = js.native
  /* 5 */ val Last: typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore.WeekOfMonth.Last with Double = js.native
  /* 0 */ val None: typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore.WeekOfMonth.None with Double = js.native
  /* 2 */ val Second: typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore.WeekOfMonth.Second with Double = js.native
  /* 3 */ val Third: typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore.WeekOfMonth.Third with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WeekOfMonth with Double] = js.native
}

