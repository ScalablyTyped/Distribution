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
  
  /* 1 */ val FEMALE: FEMALE with scala.Double = js.native
  /* 0 */ val MALE: MALE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContactsNs.Gender with scala.Double
  ] = js.native
}

