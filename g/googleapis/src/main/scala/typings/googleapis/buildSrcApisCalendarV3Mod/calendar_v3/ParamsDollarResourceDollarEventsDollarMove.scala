package typings.googleapis.buildSrcApisCalendarV3Mod.calendar_v3

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarEventsDollarMove extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Calendar identifier of the source calendar where the event currently is
    * on.
    */
  var calendarId: js.UndefOr[String] = js.native
  /**
    * Calendar identifier of the target calendar where the event is to be moved
    * to.
    */
  var destination: js.UndefOr[String] = js.native
  /**
    * Event identifier.
    */
  var eventId: js.UndefOr[String] = js.native
  /**
    * Deprecated. Please use sendUpdates instead.  Whether to send
    * notifications about the change of the event's organizer. Note that some
    * emails might still be sent even if you set the value to false. The
    * default is false.
    */
  var sendNotifications: js.UndefOr[Boolean] = js.native
  /**
    * Guests who should receive notifications about the change of the event's
    * organizer.
    */
  var sendUpdates: js.UndefOr[String] = js.native
}

object ParamsDollarResourceDollarEventsDollarMove {
  @scala.inline
  def apply(
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    calendarId: String = null,
    destination: String = null,
    eventId: String = null,
    fields: String = null,
    key: String = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    sendNotifications: js.UndefOr[Boolean] = js.undefined,
    sendUpdates: String = null,
    userIp: String = null
  ): ParamsDollarResourceDollarEventsDollarMove = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (calendarId != null) __obj.updateDynamic("calendarId")(calendarId.asInstanceOf[js.Any])
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (eventId != null) __obj.updateDynamic("eventId")(eventId.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (!js.isUndefined(sendNotifications)) __obj.updateDynamic("sendNotifications")(sendNotifications.asInstanceOf[js.Any])
    if (sendUpdates != null) __obj.updateDynamic("sendUpdates")(sendUpdates.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsDollarResourceDollarEventsDollarMove]
  }
}

