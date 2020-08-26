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
@js.native
trait ConferenceData extends js.Object {
  /**
    * Prints the JSON representation of this object. This is for debugging only.
    * https://developers.google.com/apps-script/reference/conference-data/conference-data#printJson()
    */
  def printJson(): String = js.native
}

object ConferenceData {
  @scala.inline
  def apply(printJson: () => String): ConferenceData = {
    val __obj = js.Dynamic.literal(printJson = js.Any.fromFunction0(printJson))
    __obj.asInstanceOf[ConferenceData]
  }
  @scala.inline
  implicit class ConferenceDataOps[Self <: typings.googleAppsScript.GoogleAppsScript.ConferenceData.ConferenceData] (val x: Self) extends AnyVal {
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
    def setPrintJson(value: () => String): Self = this.set("printJson", js.Any.fromFunction0(value))
  }
  
}

