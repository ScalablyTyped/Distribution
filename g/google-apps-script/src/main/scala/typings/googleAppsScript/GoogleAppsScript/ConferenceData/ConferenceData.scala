package typings.googleAppsScript.GoogleAppsScript.ConferenceData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Container for all conference-related information.
  *
  *     var conferenceId;
  *     // Set the conference ID, that is, the identifier your system creates for the meeting.
  *
  *     var entryPoint = ConferenceDataService.newEntryPoint();
  *     // Finish building the entry point ...
  *
  *     var conferenceParameter = ConferenceDataService.newConferenceParameter();
  *     // Finish building the parameter ...
  *
  *     var conferenceData = ConferenceDataService.newConferenceDataBuilder()
  *         .setConferenceId(conferenceId);
  *         .addEntryPoint(entryPoint)
  *         .addConferenceParameter(conferenceParameter)
  *         .build();
  */
trait ConferenceData extends js.Object {
  /**
    * Prints the JSON representation of this object. This is for debugging only.
    * https://developers.google.com/apps-script/reference/conference-data/conference-data#printJson()
    */
  def printJson(): String
}

object ConferenceData {
  @scala.inline
  def apply(printJson: () => String): ConferenceData = {
    val __obj = js.Dynamic.literal(printJson = js.Any.fromFunction0(printJson))
    __obj.asInstanceOf[ConferenceData]
  }
}

