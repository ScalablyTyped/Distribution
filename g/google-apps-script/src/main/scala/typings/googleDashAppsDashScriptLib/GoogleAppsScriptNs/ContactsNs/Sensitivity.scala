package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Sensitivity extends js.Object

@JSGlobal("GoogleAppsScript.Contacts.Sensitivity")
@js.native
object Sensitivity extends js.Object {
  @js.native
  sealed trait CONFIDENTIAL
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContactsNs.Sensitivity
  
  @js.native
  sealed trait NORMAL
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContactsNs.Sensitivity
  
  @js.native
  sealed trait PERSONAL
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContactsNs.Sensitivity
  
  @js.native
  sealed trait PRIVATE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContactsNs.Sensitivity
  
  /* 0 */ val CONFIDENTIAL: CONFIDENTIAL with scala.Double = js.native
  /* 1 */ val NORMAL: NORMAL with scala.Double = js.native
  /* 2 */ val PERSONAL: PERSONAL with scala.Double = js.native
  /* 3 */ val PRIVATE: PRIVATE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContactsNs.Sensitivity with scala.Double
  ] = js.native
}

