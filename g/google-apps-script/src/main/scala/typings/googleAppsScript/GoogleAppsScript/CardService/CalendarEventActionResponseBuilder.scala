package typings.googleAppsScript.GoogleAppsScript.CardService

import typings.googleAppsScript.GoogleAppsScript.ConferenceData.ConferenceData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A builder for CalendarEventActionResponse objects.
  */
@js.native
trait CalendarEventActionResponseBuilder extends js.Object {
  
  def addAttendees(emails: js.Array[String]): CalendarEventActionResponseBuilder = js.native
  
  def build(): CalendarEventActionResponse = js.native
  
  def setConferenceData(conferenceData: ConferenceData): CalendarEventActionResponseBuilder = js.native
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
  implicit class CalendarEventActionResponseBuilderOps[Self <: CalendarEventActionResponseBuilder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddAttendees(value: js.Array[String] => CalendarEventActionResponseBuilder): Self = this.set("addAttendees", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBuild(value: () => CalendarEventActionResponse): Self = this.set("build", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetConferenceData(value: ConferenceData => CalendarEventActionResponseBuilder): Self = this.set("setConferenceData", js.Any.fromFunction1(value))
  }
}
