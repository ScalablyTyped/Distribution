package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Gender extends js.Object

@JSGlobal("GoogleAppsScript.Contacts.Gender")
@js.native
object Gender extends js.Object {
  @js.native
  sealed trait FEMALE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContactsNs.Gender
  
  @js.native
  sealed trait MALE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContactsNs.Gender
  
  val FEMALE: FEMALE with java.lang.String = js.native
  val MALE: MALE with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContactsNs.Gender with java.lang.String
  ] = js.native
}

