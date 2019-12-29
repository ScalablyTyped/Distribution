package typings.googleDashAppsDashScript.GoogleAppsScript.Contacts

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Gender with Double] = js.native
  /* 1 */ @js.native
  object FEMALE extends TopLevel[FEMALE with Double]
  
  /* 0 */ @js.native
  object MALE extends TopLevel[MALE with Double]
  
}

