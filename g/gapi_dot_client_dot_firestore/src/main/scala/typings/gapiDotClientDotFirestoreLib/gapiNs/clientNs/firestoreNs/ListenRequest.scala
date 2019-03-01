package typings
package gapiDotClientDotFirestoreLib.gapiNs.clientNs.firestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListenRequest extends js.Object {
  /** A target to add to this stream. */
  var addTarget: js.UndefOr[Target] = js.undefined
  /** Labels associated with this target change. */
  var labels: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
  /** The ID of a target to remove from this stream. */
  var removeTarget: js.UndefOr[scala.Double] = js.undefined
}

object ListenRequest {
  @scala.inline
  def apply(
    addTarget: Target = null,
    labels: stdLib.Record[java.lang.String, java.lang.String] = null,
    removeTarget: scala.Int | scala.Double = null
  ): ListenRequest = {
    val __obj = js.Dynamic.literal()
    if (addTarget != null) __obj.updateDynamic("addTarget")(addTarget)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (removeTarget != null) __obj.updateDynamic("removeTarget")(removeTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenRequest]
  }
}

