package typings.googleDashAppsDashScript.GoogleAppsScript.Script

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TriggerSource extends js.Object

@JSGlobal("GoogleAppsScript.Script.TriggerSource")
@js.native
object TriggerSource extends js.Object {
  @js.native
  sealed trait CALENDAR extends TriggerSource
  
  @js.native
  sealed trait CLOCK extends TriggerSource
  
  @js.native
  sealed trait DOCUMENTS extends TriggerSource
  
  @js.native
  sealed trait FORMS extends TriggerSource
  
  @js.native
  sealed trait SPREADSHEETS extends TriggerSource
  
  /* 4 */ val CALENDAR: typings.googleDashAppsDashScript.GoogleAppsScript.Script.TriggerSource.CALENDAR with Double = js.native
  /* 1 */ val CLOCK: typings.googleDashAppsDashScript.GoogleAppsScript.Script.TriggerSource.CLOCK with Double = js.native
  /* 3 */ val DOCUMENTS: typings.googleDashAppsDashScript.GoogleAppsScript.Script.TriggerSource.DOCUMENTS with Double = js.native
  /* 2 */ val FORMS: typings.googleDashAppsDashScript.GoogleAppsScript.Script.TriggerSource.FORMS with Double = js.native
  /* 0 */ val SPREADSHEETS: typings.googleDashAppsDashScript.GoogleAppsScript.Script.TriggerSource.SPREADSHEETS with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TriggerSource with Double] = js.native
}

