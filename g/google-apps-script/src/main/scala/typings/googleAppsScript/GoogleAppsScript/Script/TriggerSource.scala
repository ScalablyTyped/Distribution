package typings.googleAppsScript.GoogleAppsScript.Script

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TriggerSource extends js.Object

/**
  * An enumeration denoting the source of the event that causes the trigger to fire.
  */
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TriggerSource with Double] = js.native
  /* 4 */ @js.native
  object CALENDAR extends TopLevel[CALENDAR with Double]
  
  /* 1 */ @js.native
  object CLOCK extends TopLevel[CLOCK with Double]
  
  /* 3 */ @js.native
  object DOCUMENTS extends TopLevel[DOCUMENTS with Double]
  
  /* 2 */ @js.native
  object FORMS extends TopLevel[FORMS with Double]
  
  /* 0 */ @js.native
  object SPREADSHEETS extends TopLevel[SPREADSHEETS with Double]
  
}

