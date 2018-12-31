package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamingComputationConfig extends js.Object {
  /** Unique identifier for this computation. */
  var computationId: js.UndefOr[java.lang.String] = js.undefined
  /** Instructions that comprise the computation. */
  var instructions: js.UndefOr[js.Array[ParallelInstruction]] = js.undefined
  /** Stage name of this computation. */
  var stageName: js.UndefOr[java.lang.String] = js.undefined
  /** System defined name for this computation. */
  var systemName: js.UndefOr[java.lang.String] = js.undefined
}

