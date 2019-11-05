package typings.googleDashAppsDashScript.GoogleAppsScript.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Gender extends js.Object

/**
  * An enum for contact gender.
  */
@JSGlobal("GoogleAppsScript.Contacts.Gender")
@js.native
object Gender extends js.Object {
  @js.native
  sealed trait FEMALE extends Gender
  
  @js.native
  sealed trait MALE extends Gender
  
  /* 1 */ val FEMALE: typings.googleDashAppsDashScript.GoogleAppsScript.Contacts.Gender.FEMALE with Double = js.native
  /* 0 */ val MALE: typings.googleDashAppsDashScript.GoogleAppsScript.Contacts.Gender.MALE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Gender with Double] = js.native
}

