package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Priority extends js.Object

@JSGlobal("GoogleAppsScript.Contacts.Priority")
@js.native
object Priority extends js.Object {
  @js.native
  sealed trait HIGH
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContactsNs.Priority
  
  @js.native
  sealed trait LOW
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContactsNs.Priority
  
  @js.native
  sealed trait NORMAL
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContactsNs.Priority
  
  /* 0 */ val HIGH: HIGH with scala.Double = js.native
  /* 1 */ val LOW: LOW with scala.Double = js.native
  /* 2 */ val NORMAL: NORMAL with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContactsNs.Priority with scala.Double
  ] = js.native
}

