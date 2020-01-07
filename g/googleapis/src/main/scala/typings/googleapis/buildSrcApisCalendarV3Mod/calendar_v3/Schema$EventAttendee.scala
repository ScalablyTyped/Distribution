package typings.googleapis.buildSrcApisCalendarV3Mod.calendar_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$EventAttendee extends js.Object {
  /**
    * Number of additional guests. Optional. The default is 0.
    */
  var additionalGuests: js.UndefOr[Double] = js.native
  /**
    * The attendee&#39;s response comment. Optional.
    */
  var comment: js.UndefOr[String] = js.native
  /**
    * The attendee&#39;s name, if available. Optional.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The attendee&#39;s email address, if available. This field must be
    * present when adding an attendee. It must be a valid email address as per
    * RFC5322. Required when adding an attendee.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * The attendee&#39;s Profile ID, if available. It corresponds to the id
    * field in the People collection of the Google+ API
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Whether this is an optional attendee. Optional. The default is False.
    */
  var optional: js.UndefOr[Boolean] = js.native
  /**
    * Whether the attendee is the organizer of the event. Read-only. The
    * default is False.
    */
  var organizer: js.UndefOr[Boolean] = js.native
  /**
    * Whether the attendee is a resource. Can only be set when the attendee is
    * added to the event for the first time. Subsequent modifications are
    * ignored. Optional. The default is False.
    */
  var resource: js.UndefOr[Boolean] = js.native
  /**
    * The attendee&#39;s response status. Possible values are:   -
    * &quot;needsAction&quot; - The attendee has not responded to the
    * invitation.  - &quot;declined&quot; - The attendee has declined the
    * invitation.  - &quot;tentative&quot; - The attendee has tentatively
    * accepted the invitation.  - &quot;accepted&quot; - The attendee has
    * accepted the invitation.
    */
  var responseStatus: js.UndefOr[String] = js.native
  /**
    * Whether this entry represents the calendar on which this copy of the
    * event appears. Read-only. The default is False.
    */
  var self: js.UndefOr[Boolean] = js.native
}

object Schema$EventAttendee {
  @scala.inline
  def apply(
    additionalGuests: Int | Double = null,
    comment: String = null,
    displayName: String = null,
    email: String = null,
    id: String = null,
    optional: js.UndefOr[Boolean] = js.undefined,
    organizer: js.UndefOr[Boolean] = js.undefined,
    resource: js.UndefOr[Boolean] = js.undefined,
    responseStatus: String = null,
    self: js.UndefOr[Boolean] = js.undefined
  ): Schema$EventAttendee = {
    val __obj = js.Dynamic.literal()
    if (additionalGuests != null) __obj.updateDynamic("additionalGuests")(additionalGuests.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional.asInstanceOf[js.Any])
    if (!js.isUndefined(organizer)) __obj.updateDynamic("organizer")(organizer.asInstanceOf[js.Any])
    if (!js.isUndefined(resource)) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (responseStatus != null) __obj.updateDynamic("responseStatus")(responseStatus.asInstanceOf[js.Any])
    if (!js.isUndefined(self)) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$EventAttendee]
  }
}

