package typings.googleDashAppsDashScript.GoogleAppsScript.Calendar

import org.scalablytyped.runtime.TopLevel
import typings.googleDashAppsDashScript.GoogleAppsScript.Calendar.EventColor.BLUE
import typings.googleDashAppsDashScript.GoogleAppsScript.Calendar.EventColor.CYAN
import typings.googleDashAppsDashScript.GoogleAppsScript.Calendar.EventColor.GRAY
import typings.googleDashAppsDashScript.GoogleAppsScript.Calendar.EventColor.GREEN
import typings.googleDashAppsDashScript.GoogleAppsScript.Calendar.EventColor.MAUVE
import typings.googleDashAppsDashScript.GoogleAppsScript.Calendar.EventColor.ORANGE
import typings.googleDashAppsDashScript.GoogleAppsScript.Calendar.EventColor.PALE_BLUE
import typings.googleDashAppsDashScript.GoogleAppsScript.Calendar.EventColor.PALE_GREEN
import typings.googleDashAppsDashScript.GoogleAppsScript.Calendar.EventColor.PALE_RED
import typings.googleDashAppsDashScript.GoogleAppsScript.Calendar.EventColor.RED
import typings.googleDashAppsDashScript.GoogleAppsScript.Calendar.EventColor.YELLOW
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EventColor with Double] = js.native
  /* 8 */ @js.native
  object BLUE extends TopLevel[BLUE with Double]
  
  /* 6 */ @js.native
  object CYAN extends TopLevel[CYAN with Double]
  
  /* 7 */ @js.native
  object GRAY extends TopLevel[GRAY with Double]
  
  /* 9 */ @js.native
  object GREEN extends TopLevel[GREEN with Double]
  
  /* 2 */ @js.native
  object MAUVE extends TopLevel[MAUVE with Double]
  
  /* 5 */ @js.native
  object ORANGE extends TopLevel[ORANGE with Double]
  
  /* 0 */ @js.native
  object PALE_BLUE extends TopLevel[PALE_BLUE with Double]
  
  /* 1 */ @js.native
  object PALE_GREEN extends TopLevel[PALE_GREEN with Double]
  
  /* 3 */ @js.native
  object PALE_RED extends TopLevel[PALE_RED with Double]
  
  /* 10 */ @js.native
  object RED extends TopLevel[RED with Double]
  
  /* 4 */ @js.native
  object YELLOW extends TopLevel[YELLOW with Double]
  
}

