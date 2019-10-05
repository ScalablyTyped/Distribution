package typings.googleDashAppsDashScript.GoogleAppsScript.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Priority extends js.Object

@JSGlobal("GoogleAppsScript.Contacts.Priority")
@js.native
object Priority extends js.Object {
  @js.native
  sealed trait HIGH extends Priority
  
  @js.native
  sealed trait LOW extends Priority
  
  @js.native
  sealed trait NORMAL extends Priority
  
  /* 0 */ val HIGH: typings.googleDashAppsDashScript.GoogleAppsScript.Contacts.Priority.HIGH with Double = js.native
  /* 1 */ val LOW: typings.googleDashAppsDashScript.GoogleAppsScript.Contacts.Priority.LOW with Double = js.native
  /* 2 */ val NORMAL: typings.googleDashAppsDashScript.GoogleAppsScript.Contacts.Priority.NORMAL with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Priority with Double] = js.native
}

