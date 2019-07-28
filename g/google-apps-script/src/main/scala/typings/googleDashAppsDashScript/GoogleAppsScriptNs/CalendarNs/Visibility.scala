package typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Visibility extends js.Object

@JSGlobal("GoogleAppsScript.Calendar.Visibility")
@js.native
object Visibility extends js.Object {
  @js.native
  sealed trait CONFIDENTIAL extends Visibility
  
  @js.native
  sealed trait DEFAULT extends Visibility
  
  @js.native
  sealed trait PRIVATE extends Visibility
  
  @js.native
  sealed trait PUBLIC extends Visibility
  
  /* 0 */ val CONFIDENTIAL: typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.Visibility.CONFIDENTIAL with Double = js.native
  /* 1 */ val DEFAULT: typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.Visibility.DEFAULT with Double = js.native
  /* 2 */ val PRIVATE: typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.Visibility.PRIVATE with Double = js.native
  /* 3 */ val PUBLIC: typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.Visibility.PUBLIC with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Visibility with Double] = js.native
}

