package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Gender extends js.Object

@JSGlobal("GoogleAppsScript.Contacts.Gender")
@js.native
object Gender extends js.Object {
  @js.native
  sealed trait FEMALE extends Gender
  
  @js.native
  sealed trait MALE extends Gender
  
  /* 1 */ val FEMALE: typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContactsNs.Gender.FEMALE with Double = js.native
  /* 0 */ val MALE: typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContactsNs.Gender.MALE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Gender with Double] = js.native
}

