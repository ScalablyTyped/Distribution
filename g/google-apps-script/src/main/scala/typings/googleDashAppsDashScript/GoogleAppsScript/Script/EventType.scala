package typings.googleDashAppsDashScript.GoogleAppsScript.Script

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EventType extends js.Object

@JSGlobal("GoogleAppsScript.Script.EventType")
@js.native
object EventType extends js.Object {
  @js.native
  sealed trait CLOCK extends EventType
  
  @js.native
  sealed trait ON_CHANGE extends EventType
  
  @js.native
  sealed trait ON_EDIT extends EventType
  
  @js.native
  sealed trait ON_EVENT_UPDATED extends EventType
  
  @js.native
  sealed trait ON_FORM_SUBMIT extends EventType
  
  @js.native
  sealed trait ON_OPEN extends EventType
  
  /* 0 */ val CLOCK: typings.googleDashAppsDashScript.GoogleAppsScript.Script.EventType.CLOCK with Double = js.native
  /* 4 */ val ON_CHANGE: typings.googleDashAppsDashScript.GoogleAppsScript.Script.EventType.ON_CHANGE with Double = js.native
  /* 2 */ val ON_EDIT: typings.googleDashAppsDashScript.GoogleAppsScript.Script.EventType.ON_EDIT with Double = js.native
  /* 5 */ val ON_EVENT_UPDATED: typings.googleDashAppsDashScript.GoogleAppsScript.Script.EventType.ON_EVENT_UPDATED with Double = js.native
  /* 3 */ val ON_FORM_SUBMIT: typings.googleDashAppsDashScript.GoogleAppsScript.Script.EventType.ON_FORM_SUBMIT with Double = js.native
  /* 1 */ val ON_OPEN: typings.googleDashAppsDashScript.GoogleAppsScript.Script.EventType.ON_OPEN with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EventType with Double] = js.native
}

