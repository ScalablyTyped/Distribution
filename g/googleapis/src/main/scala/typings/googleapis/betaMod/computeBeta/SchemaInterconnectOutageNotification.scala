package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Description of a planned outage on this Interconnect. Next id: 9
  */
@js.native
trait SchemaInterconnectOutageNotification extends js.Object {
  /**
    * If issue_type is IT_PARTIAL_OUTAGE, a list of the Google-side circuit IDs
    * that will be affected.
    */
  var affectedCircuits: js.UndefOr[js.Array[String]] = js.native
  /**
    * A description about the purpose of the outage.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Scheduled end time for the outage (milliseconds since Unix epoch).
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * Form this outage is expected to take. Note that the &quot;IT_&quot;
    * versions of this enum have been deprecated in favor of the unprefixed
    * values.
    */
  var issueType: js.UndefOr[String] = js.native
  /**
    * Unique identifier for this outage notification.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The party that generated this notification. Note that
    * &quot;NSRC_GOOGLE&quot; has been deprecated in favor of
    * &quot;GOOGLE&quot;
    */
  var source: js.UndefOr[String] = js.native
  /**
    * Scheduled start time for the outage (milliseconds since Unix epoch).
    */
  var startTime: js.UndefOr[String] = js.native
  /**
    * State of this notification. Note that the &quot;NS_&quot; versions of
    * this enum have been deprecated in favor of the unprefixed values.
    */
  var state: js.UndefOr[String] = js.native
}

object SchemaInterconnectOutageNotification {
  @scala.inline
  def apply(
    affectedCircuits: js.Array[String] = null,
    description: String = null,
    endTime: String = null,
    issueType: String = null,
    name: String = null,
    source: String = null,
    startTime: String = null,
    state: String = null
  ): SchemaInterconnectOutageNotification = {
    val __obj = js.Dynamic.literal()
    if (affectedCircuits != null) __obj.updateDynamic("affectedCircuits")(affectedCircuits.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (issueType != null) __obj.updateDynamic("issueType")(issueType.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInterconnectOutageNotification]
  }
}

