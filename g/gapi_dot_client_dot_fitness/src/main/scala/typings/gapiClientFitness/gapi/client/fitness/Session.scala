package typings.gapiClientFitness.gapi.client.fitness

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Session extends js.Object {
  /**
    * Session active time. While start_time_millis and end_time_millis define the full session time, the active time can be shorter and specified by
    * active_time_millis. If the inactive time during the session is known, it should also be inserted via a com.google.activity.segment data point with a
    * STILL activity value
    */
  var activeTimeMillis: js.UndefOr[String] = js.undefined
  /** The type of activity this session represents. */
  var activityType: js.UndefOr[Double] = js.undefined
  /** The application that created the session. */
  var application: js.UndefOr[Application] = js.undefined
  /** A description for this session. */
  var description: js.UndefOr[String] = js.undefined
  /** An end time, in milliseconds since epoch, inclusive. */
  var endTimeMillis: js.UndefOr[String] = js.undefined
  /** A client-generated identifier that is unique across all sessions owned by this particular user. */
  var id: js.UndefOr[String] = js.undefined
  /** A timestamp that indicates when the session was last modified. */
  var modifiedTimeMillis: js.UndefOr[String] = js.undefined
  /** A human readable name of the session. */
  var name: js.UndefOr[String] = js.undefined
  /** A start time, in milliseconds since epoch, inclusive. */
  var startTimeMillis: js.UndefOr[String] = js.undefined
}

object Session {
  @scala.inline
  def apply(
    activeTimeMillis: String = null,
    activityType: Int | Double = null,
    application: Application = null,
    description: String = null,
    endTimeMillis: String = null,
    id: String = null,
    modifiedTimeMillis: String = null,
    name: String = null,
    startTimeMillis: String = null
  ): Session = {
    val __obj = js.Dynamic.literal()
    if (activeTimeMillis != null) __obj.updateDynamic("activeTimeMillis")(activeTimeMillis.asInstanceOf[js.Any])
    if (activityType != null) __obj.updateDynamic("activityType")(activityType.asInstanceOf[js.Any])
    if (application != null) __obj.updateDynamic("application")(application.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (endTimeMillis != null) __obj.updateDynamic("endTimeMillis")(endTimeMillis.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifiedTimeMillis != null) __obj.updateDynamic("modifiedTimeMillis")(modifiedTimeMillis.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (startTimeMillis != null) __obj.updateDynamic("startTimeMillis")(startTimeMillis.asInstanceOf[js.Any])
    __obj.asInstanceOf[Session]
  }
}

