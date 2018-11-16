package typings
package gapiDotClientDotDataprocLib.gapiNs.clientNs.dataprocNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait JobStatus extends js.Object {
  /** Output-only. Optional job state details, such as an error description if the state is <code>ERROR</code>. */
  var details: js.UndefOr[java.lang.String] = js.undefined
  /** Output-only. A state message specifying the overall job state. */
  var state: js.UndefOr[java.lang.String] = js.undefined
  /** Output-only. The time when this state was entered. */
  var stateStartTime: js.UndefOr[java.lang.String] = js.undefined
  /** Output-only. Additional state information, which includes status reported by the agent. */
  var substate: js.UndefOr[java.lang.String] = js.undefined
}

