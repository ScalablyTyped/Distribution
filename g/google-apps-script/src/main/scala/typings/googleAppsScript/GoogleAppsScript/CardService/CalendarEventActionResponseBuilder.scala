package typings.googleAppsScript.GoogleAppsScript.CardService

import typings.googleAppsScript.GoogleAppsScript.ConferenceData.ConferenceData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A builder for CalendarEventActionResponse objects.
  */
trait CalendarEventActionResponseBuilder extends js.Object {
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
}

