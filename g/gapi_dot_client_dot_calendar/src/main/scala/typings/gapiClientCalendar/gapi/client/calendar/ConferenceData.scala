package typings.gapiClientCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConferenceData extends js.Object {
  /**
    * The ID of the conference.
    * Can be used by developers to keep track of conferences, should not be displayed to users.
    * Values for solution types:
    * - "eventHangout": unset.
    * - "eventNamedHangout": the name of the Hangout.
    * - "hangoutsMeet": the 10-letter meeting code, for example "aaa-bbbb-ccc".
    * - "addOn": defined by 3P conference provider.  Optional.
    */
  var conferenceId: js.UndefOr[String] = js.undefined
  /**
    * The conference solution, such as Hangouts or Google Meet.
    * Unset for a conference with a failed create request.
    * Either conferenceSolution and at least one entryPoint, or createRequest is required.
    */
  var conferenceSolution: js.UndefOr[ConferenceSolution] = js.undefined
  /**
    * A request to generate a new conference and attach it to the event. The data is generated asynchronously. To see whether the data is present check the
    * status field.
    * Either conferenceSolution and at least one entryPoint, or createRequest is required.
    */
  var createRequest: js.UndefOr[CreateConferenceRequest] = js.undefined
  /**
    * Information about individual conference entry points, such as URLs or phone numbers.
    * All of them must belong to the same conference.
    * Either conferenceSolution and at least one entryPoint, or createRequest is required.
    */
  var entryPoints: js.UndefOr[js.Array[EntryPoint]] = js.undefined
  /**
    * Additional notes (such as instructions from the domain administrator, legal notices) to display to the user. Can contain HTML. The maximum length is
    * 2048 characters. Optional.
    */
  var notes: js.UndefOr[String] = js.undefined
  /** Additional properties related to a conference. An example would be a solution-specific setting for enabling video streaming. */
  var parameters: js.UndefOr[ConferenceParameters] = js.undefined
  /**
    * The signature of the conference data.
    * Generated on server side. Must be preserved while copying the conference data between events, otherwise the conference data will not be copied.
    * Unset for a conference with a failed create request.
    * Optional for a conference with a pending create request.
    */
  var signature: js.UndefOr[String] = js.undefined
}

object ConferenceData {
  @scala.inline
  def apply(
    conferenceId: String = null,
    conferenceSolution: ConferenceSolution = null,
    createRequest: CreateConferenceRequest = null,
    entryPoints: js.Array[EntryPoint] = null,
    notes: String = null,
    parameters: ConferenceParameters = null,
    signature: String = null
  ): ConferenceData = {
    val __obj = js.Dynamic.literal()
    if (conferenceId != null) __obj.updateDynamic("conferenceId")(conferenceId.asInstanceOf[js.Any])
    if (conferenceSolution != null) __obj.updateDynamic("conferenceSolution")(conferenceSolution.asInstanceOf[js.Any])
    if (createRequest != null) __obj.updateDynamic("createRequest")(createRequest.asInstanceOf[js.Any])
    if (entryPoints != null) __obj.updateDynamic("entryPoints")(entryPoints.asInstanceOf[js.Any])
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (signature != null) __obj.updateDynamic("signature")(signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConferenceData]
  }
}

