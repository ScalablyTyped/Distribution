package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Sensitivity extends js.Object

@JSGlobal("GoogleAppsScript.Contacts.Sensitivity")
@js.native
object Sensitivity extends js.Object {
  @js.native
  sealed trait CONFIDENTIAL extends Sensitivity
  
  @js.native
  sealed trait NORMAL extends Sensitivity
  
  @js.native
  sealed trait PERSONAL extends Sensitivity
  
  @js.native
  sealed trait PRIVATE extends Sensitivity
  
  /* 0 */ val CONFIDENTIAL: typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContactsNs.Sensitivity.CONFIDENTIAL with Double = js.native
  /* 1 */ val NORMAL: typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContactsNs.Sensitivity.NORMAL with Double = js.native
  /* 2 */ val PERSONAL: typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContactsNs.Sensitivity.PERSONAL with Double = js.native
  /* 3 */ val PRIVATE: typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContactsNs.Sensitivity.PRIVATE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Sensitivity with Double] = js.native
}

