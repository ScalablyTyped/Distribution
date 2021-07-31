package typings.googleAppsScript.GoogleAppsScript.Script

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TriggerSource extends StObject
/**
  * An enumeration denoting the source of the event that causes the trigger to fire.
  */
@JSGlobal("GoogleAppsScript.Script.TriggerSource")
@js.native
object TriggerSource extends StObject {
  
  @js.native
  sealed trait CALENDAR
    extends StObject
       with TriggerSource
  
  @js.native
  sealed trait CLOCK
    extends StObject
       with TriggerSource
  
  @js.native
  sealed trait DOCUMENTS
    extends StObject
       with TriggerSource
  
  @js.native
  sealed trait FORMS
    extends StObject
       with TriggerSource
  
  @js.native
  sealed trait SPREADSHEETS
    extends StObject
       with TriggerSource
}
