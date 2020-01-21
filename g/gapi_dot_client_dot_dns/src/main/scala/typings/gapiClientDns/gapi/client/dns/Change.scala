package typings.gapiClientDns.gapi.client.dns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Change extends js.Object {
  /** Which ResourceRecordSets to add? */
  var additions: js.UndefOr[js.Array[ResourceRecordSet]] = js.undefined
  /** Which ResourceRecordSets to remove? Must match existing data exactly. */
  var deletions: js.UndefOr[js.Array[ResourceRecordSet]] = js.undefined
  /** Unique identifier for the resource; defined by the server (output only). */
  var id: js.UndefOr[String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dns#change". */
  var kind: js.UndefOr[String] = js.undefined
  /** The time that this operation was started by the server (output only). This is in RFC3339 text format. */
  var startTime: js.UndefOr[String] = js.undefined
  /** Status of the operation (output only). */
  var status: js.UndefOr[String] = js.undefined
}

object Change {
  @scala.inline
  def apply(
    additions: js.Array[ResourceRecordSet] = null,
    deletions: js.Array[ResourceRecordSet] = null,
    id: String = null,
    kind: String = null,
    startTime: String = null,
    status: String = null
  ): Change = {
    val __obj = js.Dynamic.literal()
    if (additions != null) __obj.updateDynamic("additions")(additions.asInstanceOf[js.Any])
    if (deletions != null) __obj.updateDynamic("deletions")(deletions.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Change]
  }
}

