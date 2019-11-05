package typings.googleDashAppsDashScript.GoogleAppsScript.Calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EventColor extends js.Object

/**
  * An enum representing the named event colors available in the Calendar service.
  */
@JSGlobal("GoogleAppsScript.Calendar.EventColor")
@js.native
object EventColor extends js.Object {
  @js.native
  sealed trait BLUE extends EventColor
  
  @js.native
  sealed trait CYAN extends EventColor
  
  @js.native
  sealed trait GRAY extends EventColor
  
  @js.native
  sealed trait GREEN extends EventColor
  
  @js.native
  sealed trait MAUVE extends EventColor
  
  @js.native
  sealed trait ORANGE extends EventColor
  
  @js.native
  sealed trait PALE_BLUE extends EventColor
  
  @js.native
  sealed trait PALE_GREEN extends EventColor
  
  @js.native
  sealed trait PALE_RED extends EventColor
  
  @js.native
  sealed trait RED extends EventColor
  
  @js.native
  sealed trait YELLOW extends EventColor
  
  /* 8 */ val BLUE: typings.googleDashAppsDashScript.GoogleAppsScript.Calendar.EventColor.BLUE with Double = js.native
  /* 6 */ val CYAN: typings.googleDashAppsDashScript.GoogleAppsScript.Calendar.EventColor.CYAN with Double = js.native
  /* 7 */ val GRAY: typings.googleDashAppsDashScript.GoogleAppsScript.Calendar.EventColor.GRAY with Double = js.native
  /* 9 */ val GREEN: typings.googleDashAppsDashScript.GoogleAppsScript.Calendar.EventColor.GREEN with Double = js.native
  /* 2 */ val MAUVE: typings.googleDashAppsDashScript.GoogleAppsScript.Calendar.EventColor.MAUVE with Double = js.native
  /* 5 */ val ORANGE: typings.googleDashAppsDashScript.GoogleAppsScript.Calendar.EventColor.ORANGE with Double = js.native
  /* 0 */ val PALE_BLUE: typings.googleDashAppsDashScript.GoogleAppsScript.Calendar.EventColor.PALE_BLUE with Double = js.native
  /* 1 */ val PALE_GREEN: typings.googleDashAppsDashScript.GoogleAppsScript.Calendar.EventColor.PALE_GREEN with Double = js.native
  /* 3 */ val PALE_RED: typings.googleDashAppsDashScript.GoogleAppsScript.Calendar.EventColor.PALE_RED with Double = js.native
  /* 10 */ val RED: typings.googleDashAppsDashScript.GoogleAppsScript.Calendar.EventColor.RED with Double = js.native
  /* 4 */ val YELLOW: typings.googleDashAppsDashScript.GoogleAppsScript.Calendar.EventColor.YELLOW with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EventColor with Double] = js.native
}

