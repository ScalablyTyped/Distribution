package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.TopLevel
import typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore.WeekOfMonth.First
import typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore.WeekOfMonth.Fourth
import typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore.WeekOfMonth.Last
import typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore.WeekOfMonth.None
import typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore.WeekOfMonth.Second
import typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore.WeekOfMonth.Third
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WeekOfMonth with Double] = js.native
  /* 1 */ @js.native
  object First extends TopLevel[First with Double]
  
  /* 4 */ @js.native
  object Fourth extends TopLevel[Fourth with Double]
  
  /* 5 */ @js.native
  object Last extends TopLevel[Last with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 2 */ @js.native
  object Second extends TopLevel[Second with Double]
  
  /* 3 */ @js.native
  object Third extends TopLevel[Third with Double]
  
}

