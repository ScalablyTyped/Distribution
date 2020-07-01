package typings.googleapis.calendarV3Mod.calendarV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceEventsInsert extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Calendar identifier. To retrieve calendar IDs call the calendarList.list
    * method. If you want to access the primary calendar of the currently
    * logged in user, use the "primary" keyword.
    */
  var calendarId: js.UndefOr[String] = js.native
  /**
    * Version number of conference data supported by the API client. Version 0
    * assumes no conference data support and ignores conference data in the
    * event's body. Version 1 enables support for copying of ConferenceData as
    * well as for creating new conferences using the createRequest field of
    * conferenceData. The default is 0.
    */
  var conferenceDataVersion: js.UndefOr[Double] = js.native
  /**
    * The maximum number of attendees to include in the response. If there are
    * more than the specified number of attendees, only the participant is
    * returned. Optional.
    */
  var maxAttendees: js.UndefOr[Double] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaEvent] = js.native
  /**
    * Deprecated. Please use sendUpdates instead.  Whether to send
    * notifications about the creation of the new event. Note that some emails
    * might still be sent even if you set the value to false. The default is
    * false.
    */
  var sendNotifications: js.UndefOr[Boolean] = js.native
  /**
    * Whether to send notifications about the creation of the new event. Note
    * that some emails might still be sent. The default is false.
    */
  var sendUpdates: js.UndefOr[String] = js.native
  /**
    * Whether API client performing operation supports event attachments.
    * Optional. The default is False.
    */
  var supportsAttachments: js.UndefOr[Boolean] = js.native
}

object ParamsResourceEventsInsert {
  @scala.inline
  def apply(
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    calendarId: String = null,
    conferenceDataVersion: js.UndefOr[Double] = js.undefined,
    fields: String = null,
    key: String = null,
    maxAttendees: js.UndefOr[Double] = js.undefined,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    requestBody: SchemaEvent = null,
    sendNotifications: js.UndefOr[Boolean] = js.undefined,
    sendUpdates: String = null,
    supportsAttachments: js.UndefOr[Boolean] = js.undefined,
    userIp: String = null
  ): ParamsResourceEventsInsert = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (calendarId != null) __obj.updateDynamic("calendarId")(calendarId.asInstanceOf[js.Any])
    if (!js.isUndefined(conferenceDataVersion)) __obj.updateDynamic("conferenceDataVersion")(conferenceDataVersion.get.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(maxAttendees)) __obj.updateDynamic("maxAttendees")(maxAttendees.get.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.get.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (requestBody != null) __obj.updateDynamic("requestBody")(requestBody.asInstanceOf[js.Any])
    if (!js.isUndefined(sendNotifications)) __obj.updateDynamic("sendNotifications")(sendNotifications.get.asInstanceOf[js.Any])
    if (sendUpdates != null) __obj.updateDynamic("sendUpdates")(sendUpdates.asInstanceOf[js.Any])
    if (!js.isUndefined(supportsAttachments)) __obj.updateDynamic("supportsAttachments")(supportsAttachments.get.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourceEventsInsert]
  }
}

