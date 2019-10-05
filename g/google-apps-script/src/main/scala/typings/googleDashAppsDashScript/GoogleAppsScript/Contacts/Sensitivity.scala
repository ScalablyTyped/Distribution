package typings.googleDashAppsDashScript.GoogleAppsScript.Contacts

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
  
  /* 0 */ val CONFIDENTIAL: typings.googleDashAppsDashScript.GoogleAppsScript.Contacts.Sensitivity.CONFIDENTIAL with Double = js.native
  /* 1 */ val NORMAL: typings.googleDashAppsDashScript.GoogleAppsScript.Contacts.Sensitivity.NORMAL with Double = js.native
  /* 2 */ val PERSONAL: typings.googleDashAppsDashScript.GoogleAppsScript.Contacts.Sensitivity.PERSONAL with Double = js.native
  /* 3 */ val PRIVATE: typings.googleDashAppsDashScript.GoogleAppsScript.Contacts.Sensitivity.PRIVATE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Sensitivity with Double] = js.native
}

