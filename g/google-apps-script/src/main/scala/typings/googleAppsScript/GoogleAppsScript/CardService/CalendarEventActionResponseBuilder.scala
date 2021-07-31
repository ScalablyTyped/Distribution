package typings.googleAppsScript.GoogleAppsScript.CardService

import typings.googleAppsScript.GoogleAppsScript.ConferenceData.ConferenceData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A builder for CalendarEventActionResponse objects.
  */
trait CalendarEventActionResponseBuilder extends StObject {
  
  def addAttendees(emails: js.Array[String]): CalendarEventActionResponseBuilder
  
  def build(): CalendarEventActionResponse
  
  def setConferenceData(conferenceData: ConferenceData): CalendarEventActionResponseBuilder
}
object CalendarEventActionResponseBuilder {
  
  @scala.inline
  def apply(
    addAttendees: js.Array[String] => CalendarEventActionResponseBuilder,
    build: () => CalendarEventActionResponse,
    setConferenceData: ConferenceData => CalendarEventActionResponseBuilder
  ): CalendarEventActionResponseBuilder = {
    val __obj = js.Dynamic.literal(addAttendees = js.Any.fromFunction1(addAttendees), build = js.Any.fromFunction0(build), setConferenceData = js.Any.fromFunction1(setConferenceData))
    __obj.asInstanceOf[CalendarEventActionResponseBuilder]
  }
  
  @scala.inline
  implicit class CalendarEventActionResponseBuilderMutableBuilder[Self <: CalendarEventActionResponseBuilder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddAttendees(value: js.Array[String] => CalendarEventActionResponseBuilder): Self = StObject.set(x, "addAttendees", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBuild(value: () => CalendarEventActionResponse): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetConferenceData(value: ConferenceData => CalendarEventActionResponseBuilder): Self = StObject.set(x, "setConferenceData", js.Any.fromFunction1(value))
  }
}
