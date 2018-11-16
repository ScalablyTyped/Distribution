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
  
  val HIGH: HIGH with java.lang.String = js.native
  val LOW: LOW with java.lang.String = js.native
  val NORMAL: NORMAL with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContactsNs.Priority with java.lang.String
  ] = js.native
}

