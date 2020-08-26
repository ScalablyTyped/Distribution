package typings.googleAppsScript.GoogleAppsScript.ConferenceData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Builder for creating for ConferenceData objects.
  */
@js.native
trait ConferenceDataBuilder extends js.Object {
  /**
    * Adds a ConferenceParameter to this ConferenceData. The maximum number of
    * parameters per ConferenceData is 300.
    * https://developers.google.com/apps-script/reference/conference-data/conference-data-builder#addConferenceParameter(ConferenceParameter)
    * @param conferenceParameter The parameter to add.
    */
  def addConferenceParameter(conferenceParameter: ConferenceParameter): ConferenceDataBuilder = js.native
  /**
    * Adds an EntryPoint to this ConferenceData. The maximum number of entry points
    * per ConferenceData is 300.
    * https://developers.google.com/apps-script/reference/conference-data/conference-data-builder#addEntryPoint(EntryPoint)
    * @param entryPoint The entry point to add.
    */
  def addEntryPoint(entryPoint: EntryPoint): ConferenceDataBuilder = js.native
  /**
    * Builds and validates the ConferenceData.
    * https://developers.google.com/apps-script/reference/conference-data/conference-data-builder#build()
    */
  def build(): typings.googleAppsScript.GoogleAppsScript.ConferenceData.ConferenceData = js.native
  /**
    * Sets the conference ID of this ConferenceData. The maximum length for this field is 512
    * characters.
    * https://developers.google.com/apps-script/reference/conference-data/conference-data-builder#setConferenceId(String)
    * @param conferenceId The ID to set.
    */
  def setConferenceId(conferenceId: String): ConferenceDataBuilder = js.native
  /**
    * Sets the conference solution ID defined in the addon's manifest. The value must be specified
    * and populates conference's name and iconUrl values.
    *
    *
    * Note that the field is required for GSuite add-ons whereas it's ignored for Conferencing
    * add-ons
    * https://developers.google.com/apps-script/reference/conference-data/conference-data-builder#setConferenceSolutionId(String)
    * @param conferenceSolutionId The ID matching the manifest.
    */
  def setConferenceSolutionId(conferenceSolutionId: String): ConferenceDataBuilder = js.native
  /**
    * Sets the ConferenceError of this ConferenceData, indicating that the conference
    * was not successfully created.
    * https://developers.google.com/apps-script/reference/conference-data/conference-data-builder#setError(ConferenceError)
    * @param conferenceError The error to set.
    */
  def setError(conferenceError: ConferenceError): ConferenceDataBuilder = js.native
  /**
    * Sets the additional notes of this ConferenceData, such as instructions from the
    * administrator or legal notices. Can contain HTML. The maximum length for this field is 2048
    * characters.
    * https://developers.google.com/apps-script/reference/conference-data/conference-data-builder#setNotes(String)
    * @param notes The additional notes to set.
    */
  def setNotes(notes: String): ConferenceDataBuilder = js.native
}

object ConferenceDataBuilder {
  @scala.inline
  def apply(
    addConferenceParameter: ConferenceParameter => ConferenceDataBuilder,
    addEntryPoint: EntryPoint => ConferenceDataBuilder,
    build: () => typings.googleAppsScript.GoogleAppsScript.ConferenceData.ConferenceData,
    setConferenceId: String => ConferenceDataBuilder,
    setConferenceSolutionId: String => ConferenceDataBuilder,
    setError: ConferenceError => ConferenceDataBuilder,
    setNotes: String => ConferenceDataBuilder
  ): ConferenceDataBuilder = {
    val __obj = js.Dynamic.literal(addConferenceParameter = js.Any.fromFunction1(addConferenceParameter), addEntryPoint = js.Any.fromFunction1(addEntryPoint), build = js.Any.fromFunction0(build), setConferenceId = js.Any.fromFunction1(setConferenceId), setConferenceSolutionId = js.Any.fromFunction1(setConferenceSolutionId), setError = js.Any.fromFunction1(setError), setNotes = js.Any.fromFunction1(setNotes))
    __obj.asInstanceOf[ConferenceDataBuilder]
  }
  @scala.inline
  implicit class ConferenceDataBuilderOps[Self <: ConferenceDataBuilder] (val x: Self) extends AnyVal {
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
    def setAddConferenceParameter(value: ConferenceParameter => ConferenceDataBuilder): Self = this.set("addConferenceParameter", js.Any.fromFunction1(value))
    @scala.inline
    def setAddEntryPoint(value: EntryPoint => ConferenceDataBuilder): Self = this.set("addEntryPoint", js.Any.fromFunction1(value))
    @scala.inline
    def setBuild(value: () => typings.googleAppsScript.GoogleAppsScript.ConferenceData.ConferenceData): Self = this.set("build", js.Any.fromFunction0(value))
    @scala.inline
    def setSetConferenceId(value: String => ConferenceDataBuilder): Self = this.set("setConferenceId", js.Any.fromFunction1(value))
    @scala.inline
    def setSetConferenceSolutionId(value: String => ConferenceDataBuilder): Self = this.set("setConferenceSolutionId", js.Any.fromFunction1(value))
    @scala.inline
    def setSetError(value: ConferenceError => ConferenceDataBuilder): Self = this.set("setError", js.Any.fromFunction1(value))
    @scala.inline
    def setSetNotes(value: String => ConferenceDataBuilder): Self = this.set("setNotes", js.Any.fromFunction1(value))
  }
  
}

