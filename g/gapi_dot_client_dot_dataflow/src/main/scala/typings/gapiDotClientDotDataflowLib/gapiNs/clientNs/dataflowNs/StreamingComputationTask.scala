package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamingComputationTask extends js.Object {
  /** Contains ranges of a streaming computation this task should apply to. */
  var computationRanges: js.UndefOr[js.Array[StreamingComputationRanges]] = js.undefined
  /** Describes the set of data disks this task should apply to. */
  var dataDisks: js.UndefOr[js.Array[MountedDataDisk]] = js.undefined
  /** A type of streaming computation task. */
  var taskType: js.UndefOr[java.lang.String] = js.undefined
}

