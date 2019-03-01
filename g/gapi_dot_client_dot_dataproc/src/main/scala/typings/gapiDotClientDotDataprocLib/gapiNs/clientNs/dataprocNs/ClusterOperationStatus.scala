package typings
package gapiDotClientDotDataprocLib.gapiNs.clientNs.dataprocNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterOperationStatus extends js.Object {
  /** Output-only.A message containing any operation metadata details. */
  var details: js.UndefOr[java.lang.String] = js.undefined
  /** Output-only. A message containing the detailed operation state. */
  var innerState: js.UndefOr[java.lang.String] = js.undefined
  /** Output-only. A message containing the operation state. */
  var state: js.UndefOr[java.lang.String] = js.undefined
  /** Output-only. The time this state was entered. */
  var stateStartTime: js.UndefOr[java.lang.String] = js.undefined
}

object ClusterOperationStatus {
  @scala.inline
  def apply(
    details: java.lang.String = null,
    innerState: java.lang.String = null,
    state: java.lang.String = null,
    stateStartTime: java.lang.String = null
  ): ClusterOperationStatus = {
    val __obj = js.Dynamic.literal()
    if (details != null) __obj.updateDynamic("details")(details)
    if (innerState != null) __obj.updateDynamic("innerState")(innerState)
    if (state != null) __obj.updateDynamic("state")(state)
    if (stateStartTime != null) __obj.updateDynamic("stateStartTime")(stateStartTime)
    __obj.asInstanceOf[ClusterOperationStatus]
  }
}

