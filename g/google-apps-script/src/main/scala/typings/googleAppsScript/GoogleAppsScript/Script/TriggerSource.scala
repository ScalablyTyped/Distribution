package typings.googleAppsScript.GoogleAppsScript.Script

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
