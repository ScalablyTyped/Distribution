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
  
  val CONFIDENTIAL: CONFIDENTIAL with java.lang.String = js.native
  val NORMAL: NORMAL with java.lang.String = js.native
  val PERSONAL: PERSONAL with java.lang.String = js.native
  val PRIVATE: PRIVATE with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContactsNs.Sensitivity with java.lang.String
  ] = js.native
}

