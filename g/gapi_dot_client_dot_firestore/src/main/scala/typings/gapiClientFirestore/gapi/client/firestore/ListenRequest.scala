package typings.gapiClientFirestore.gapi.client.firestore

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListenRequest extends js.Object {
  /** A target to add to this stream. */
  var addTarget: js.UndefOr[Target] = js.undefined
  /** Labels associated with this target change. */
  var labels: js.UndefOr[Record[String, String]] = js.undefined
  /** The ID of a target to remove from this stream. */
  var removeTarget: js.UndefOr[Double] = js.undefined
}

object ListenRequest {
  @scala.inline
  def apply(
    addTarget: Target = null,
    labels: Record[String, String] = null,
    removeTarget: js.UndefOr[Double] = js.undefined
  ): ListenRequest = {
    val __obj = js.Dynamic.literal()
    if (addTarget != null) __obj.updateDynamic("addTarget")(addTarget.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (!js.isUndefined(removeTarget)) __obj.updateDynamic("removeTarget")(removeTarget.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenRequest]
  }
}

