package typings.googleAppsScript.GoogleAppsScript.Calendar.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConferenceData extends js.Object {
  var conferenceId: js.UndefOr[String] = js.undefined
  var conferenceSolution: js.UndefOr[ConferenceSolution] = js.undefined
  var createRequest: js.UndefOr[CreateConferenceRequest] = js.undefined
  var entryPoints: js.UndefOr[js.Array[EntryPoint]] = js.undefined
  var notes: js.UndefOr[String] = js.undefined
  var parameters: js.UndefOr[ConferenceParameters] = js.undefined
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

