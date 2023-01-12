package typings.googleAppsScript.GoogleAppsScript.CardService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a response that makes changes to the calendar event that the user is currently editing in reaction to an action taken in the UI, such as a button click.
  */
trait CalendarEventActionResponse extends StObject {
  
  def printJson(): String
}
object CalendarEventActionResponse {
  
  inline def apply(printJson: () => String): CalendarEventActionResponse = {
    val __obj = js.Dynamic.literal(printJson = js.Any.fromFunction0(printJson))
    __obj.asInstanceOf[CalendarEventActionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CalendarEventActionResponse] (val x: Self) extends AnyVal {
    
    inline def setPrintJson(value: () => String): Self = StObject.set(x, "printJson", js.Any.fromFunction0(value))
  }
}
