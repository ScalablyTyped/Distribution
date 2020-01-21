package typings.googleapis.calendarV3Mod.calendarV3

import typings.googleapis.AnonNotifications
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaCalendarListEntry extends js.Object {
  /**
    * The effective access role that the authenticated user has on the
    * calendar. Read-only. Possible values are:   - &quot;freeBusyReader&quot;
    * - Provides read access to free/busy information.  - &quot;reader&quot; -
    * Provides read access to the calendar. Private events will appear to users
    * with reader access, but event details will be hidden.  -
    * &quot;writer&quot; - Provides read and write access to the calendar.
    * Private events will appear to users with writer access, and event details
    * will be visible.  - &quot;owner&quot; - Provides ownership of the
    * calendar. This role has all of the permissions of the writer role with
    * the additional ability to see and manipulate ACLs.
    */
  var accessRole: js.UndefOr[String] = js.native
  /**
    * The main color of the calendar in the hexadecimal format
    * &quot;#0088aa&quot;. This property supersedes the index-based colorId
    * property. To set or change this property, you need to specify
    * colorRgbFormat=true in the parameters of the insert, update and patch
    * methods. Optional.
    */
  var backgroundColor: js.UndefOr[String] = js.native
  /**
    * The color of the calendar. This is an ID referring to an entry in the
    * calendar section of the colors definition (see the colors endpoint). This
    * property is superseded by the backgroundColor and foregroundColor
    * properties and can be ignored when using these properties. Optional.
    */
  var colorId: js.UndefOr[String] = js.native
  /**
    * Conferencing properties for this calendar, for example what types of
    * conferences are allowed.
    */
  var conferenceProperties: js.UndefOr[SchemaConferenceProperties] = js.native
  /**
    * The default reminders that the authenticated user has for this calendar.
    */
  var defaultReminders: js.UndefOr[js.Array[SchemaEventReminder]] = js.native
  /**
    * Whether this calendar list entry has been deleted from the calendar list.
    * Read-only. Optional. The default is False.
    */
  var deleted: js.UndefOr[Boolean] = js.native
  /**
    * Description of the calendar. Optional. Read-only.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The foreground color of the calendar in the hexadecimal format
    * &quot;#ffffff&quot;. This property supersedes the index-based colorId
    * property. To set or change this property, you need to specify
    * colorRgbFormat=true in the parameters of the insert, update and patch
    * methods. Optional.
    */
  var foregroundColor: js.UndefOr[String] = js.native
  /**
    * Whether the calendar has been hidden from the list. Optional. The default
    * is False.
    */
  var hidden: js.UndefOr[Boolean] = js.native
  /**
    * Identifier of the calendar.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Type of the resource (&quot;calendar#calendarListEntry&quot;).
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Geographic location of the calendar as free-form text. Optional.
    * Read-only.
    */
  var location: js.UndefOr[String] = js.native
  /**
    * The notifications that the authenticated user is receiving for this
    * calendar.
    */
  var notificationSettings: js.UndefOr[AnonNotifications] = js.native
  /**
    * Whether the calendar is the primary calendar of the authenticated user.
    * Read-only. Optional. The default is False.
    */
  var primary: js.UndefOr[Boolean] = js.native
  /**
    * Whether the calendar content shows up in the calendar UI. Optional. The
    * default is False.
    */
  var selected: js.UndefOr[Boolean] = js.native
  /**
    * Title of the calendar. Read-only.
    */
  var summary: js.UndefOr[String] = js.native
  /**
    * The summary that the authenticated user has set for this calendar.
    * Optional.
    */
  var summaryOverride: js.UndefOr[String] = js.native
  /**
    * The time zone of the calendar. Optional. Read-only.
    */
  var timeZone: js.UndefOr[String] = js.native
}

object SchemaCalendarListEntry {
  @scala.inline
  def apply(
    accessRole: String = null,
    backgroundColor: String = null,
    colorId: String = null,
    conferenceProperties: SchemaConferenceProperties = null,
    defaultReminders: js.Array[SchemaEventReminder] = null,
    deleted: js.UndefOr[Boolean] = js.undefined,
    description: String = null,
    etag: String = null,
    foregroundColor: String = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    kind: String = null,
    location: String = null,
    notificationSettings: AnonNotifications = null,
    primary: js.UndefOr[Boolean] = js.undefined,
    selected: js.UndefOr[Boolean] = js.undefined,
    summary: String = null,
    summaryOverride: String = null,
    timeZone: String = null
  ): SchemaCalendarListEntry = {
    val __obj = js.Dynamic.literal()
    if (accessRole != null) __obj.updateDynamic("accessRole")(accessRole.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (colorId != null) __obj.updateDynamic("colorId")(colorId.asInstanceOf[js.Any])
    if (conferenceProperties != null) __obj.updateDynamic("conferenceProperties")(conferenceProperties.asInstanceOf[js.Any])
    if (defaultReminders != null) __obj.updateDynamic("defaultReminders")(defaultReminders.asInstanceOf[js.Any])
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (foregroundColor != null) __obj.updateDynamic("foregroundColor")(foregroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (notificationSettings != null) __obj.updateDynamic("notificationSettings")(notificationSettings.asInstanceOf[js.Any])
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (summary != null) __obj.updateDynamic("summary")(summary.asInstanceOf[js.Any])
    if (summaryOverride != null) __obj.updateDynamic("summaryOverride")(summaryOverride.asInstanceOf[js.Any])
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCalendarListEntry]
  }
}

