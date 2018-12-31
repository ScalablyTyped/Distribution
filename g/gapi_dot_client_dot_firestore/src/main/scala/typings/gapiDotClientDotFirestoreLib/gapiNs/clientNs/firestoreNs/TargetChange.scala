package typings
package gapiDotClientDotFirestoreLib.gapiNs.clientNs.firestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetChange extends js.Object {
  /** The error that resulted in this change, if applicable. */
  var cause: js.UndefOr[Status] = js.undefined
  /**
    * The consistent `read_time` for the given `target_ids` (omitted when the
    * target_ids are not at a consistent snapshot).
    *
    * The stream is guaranteed to send a `read_time` with `target_ids` empty
    * whenever the entire stream reaches a new consistent snapshot. ADD,
    * CURRENT, and RESET messages are guaranteed to (eventually) result in a
    * new consistent snapshot (while NO_CHANGE and REMOVE messages are not).
    *
    * For a given stream, `read_time` is guaranteed to be monotonically
    * increasing.
    */
  var readTime: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A token that can be used to resume the stream for the given `target_ids`,
    * or all targets if `target_ids` is empty.
    *
    * Not set on every target change.
    */
  var resumeToken: js.UndefOr[java.lang.String] = js.undefined
  /** The type of change that occurred. */
  var targetChangeType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The target IDs of targets that have changed.
    *
    * If empty, the change applies to all targets.
    *
    * For `target_change_type=ADD`, the order of the target IDs matches the order
    * of the requests to add the targets. This allows clients to unambiguously
    * associate server-assigned target IDs with added targets.
    *
    * For other states, the order of the target IDs is not defined.
    */
  var targetIds: js.UndefOr[js.Array[scala.Double]] = js.undefined
}

