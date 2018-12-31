package typings
package gapiDotClientDotClassroomLib.gapiNs.clientNs.classroomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateHistory extends js.Object {
  /** The teacher or student who made the change */
  var actorUserId: js.UndefOr[java.lang.String] = js.undefined
  /** The workflow pipeline stage. */
  var state: js.UndefOr[java.lang.String] = js.undefined
  /** When the submission entered this state. */
  var stateTimestamp: js.UndefOr[java.lang.String] = js.undefined
}

