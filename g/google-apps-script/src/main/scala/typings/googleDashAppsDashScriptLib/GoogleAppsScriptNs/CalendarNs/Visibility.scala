package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Visibility extends js.Object

@JSGlobal("GoogleAppsScript.Calendar.Visibility")
@js.native
object Visibility extends js.Object {
  @js.native
  sealed trait CONFIDENTIAL
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.Visibility
  
  @js.native
  sealed trait DEFAULT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.Visibility
  
  @js.native
  sealed trait PRIVATE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.Visibility
  
  @js.native
  sealed trait PUBLIC
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.Visibility
  
  /* 0 */ val CONFIDENTIAL: CONFIDENTIAL with scala.Double = js.native
  /* 1 */ val DEFAULT: DEFAULT with scala.Double = js.native
  /* 2 */ val PRIVATE: PRIVATE with scala.Double = js.native
  /* 3 */ val PUBLIC: PUBLIC with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.Visibility with scala.Double
  ] = js.native
}

