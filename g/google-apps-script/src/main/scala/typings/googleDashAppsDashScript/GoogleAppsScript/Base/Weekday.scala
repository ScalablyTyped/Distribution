package typings.googleDashAppsDashScript.GoogleAppsScript.Base

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Weekday extends js.Object

/**
  * An enum representing the days of the week.
  */
@JSGlobal("GoogleAppsScript.Base.Weekday")
@js.native
object Weekday extends js.Object {
  @js.native
  sealed trait FRIDAY extends Weekday
  
  @js.native
  sealed trait MONDAY extends Weekday
  
  @js.native
  sealed trait SATURDAY extends Weekday
  
  @js.native
  sealed trait SUNDAY extends Weekday
  
  @js.native
  sealed trait THURSDAY extends Weekday
  
  @js.native
  sealed trait TUESDAY extends Weekday
  
  @js.native
  sealed trait WEDNESDAY extends Weekday
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Weekday with Double] = js.native
  /* 5 */ @js.native
  object FRIDAY extends TopLevel[FRIDAY with Double]
  
  /* 1 */ @js.native
  object MONDAY extends TopLevel[MONDAY with Double]
  
  /* 6 */ @js.native
  object SATURDAY extends TopLevel[SATURDAY with Double]
  
  /* 0 */ @js.native
  object SUNDAY extends TopLevel[SUNDAY with Double]
  
  /* 4 */ @js.native
  object THURSDAY extends TopLevel[THURSDAY with Double]
  
  /* 2 */ @js.native
  object TUESDAY extends TopLevel[TUESDAY with Double]
  
  /* 3 */ @js.native
  object WEDNESDAY extends TopLevel[WEDNESDAY with Double]
  
}

