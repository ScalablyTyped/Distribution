package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarAppNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Visibility extends js.Object

@JSGlobal("GoogleAppsScript.CalendarApp.Visibility")
@js.native
object Visibility extends js.Object {
  @js.native
  sealed trait CONFIDENTIAL
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarAppNs.Visibility
  
  @js.native
  sealed trait DEFAULT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarAppNs.Visibility
  
  @js.native
  sealed trait PRIVATE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarAppNs.Visibility
  
  @js.native
  sealed trait PUBLIC
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarAppNs.Visibility
  
  val CONFIDENTIAL: CONFIDENTIAL with java.lang.String = js.native
  val DEFAULT: DEFAULT with java.lang.String = js.native
  val PRIVATE: PRIVATE with java.lang.String = js.native
  val PUBLIC: PUBLIC with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarAppNs.Visibility with java.lang.String
  ] = js.native
}

