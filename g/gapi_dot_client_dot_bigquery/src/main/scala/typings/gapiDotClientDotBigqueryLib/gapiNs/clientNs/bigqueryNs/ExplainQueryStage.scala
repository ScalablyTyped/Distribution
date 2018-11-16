package typings
package gapiDotClientDotBigqueryLib.gapiNs.clientNs.bigqueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ExplainQueryStage extends js.Object {
  /** Milliseconds the average shard spent on CPU-bound tasks. */
  var computeMsAvg: js.UndefOr[java.lang.String] = js.undefined
  /** Milliseconds the slowest shard spent on CPU-bound tasks. */
  var computeMsMax: js.UndefOr[java.lang.String] = js.undefined
  /** Relative amount of time the average shard spent on CPU-bound tasks. */
  var computeRatioAvg: js.UndefOr[scala.Double] = js.undefined
  /** Relative amount of time the slowest shard spent on CPU-bound tasks. */
  var computeRatioMax: js.UndefOr[scala.Double] = js.undefined
  /** Unique ID for stage within plan. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Human-readable name for stage. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Milliseconds the average shard spent reading input. */
  var readMsAvg: js.UndefOr[java.lang.String] = js.undefined
  /** Milliseconds the slowest shard spent reading input. */
  var readMsMax: js.UndefOr[java.lang.String] = js.undefined
  /** Relative amount of time the average shard spent reading input. */
  var readRatioAvg: js.UndefOr[scala.Double] = js.undefined
  /** Relative amount of time the slowest shard spent reading input. */
  var readRatioMax: js.UndefOr[scala.Double] = js.undefined
  /** Number of records read into the stage. */
  var recordsRead: js.UndefOr[java.lang.String] = js.undefined
  /** Number of records written by the stage. */
  var recordsWritten: js.UndefOr[java.lang.String] = js.undefined
  /** Total number of bytes written to shuffle. */
  var shuffleOutputBytes: js.UndefOr[java.lang.String] = js.undefined
  /** Total number of bytes written to shuffle and spilled to disk. */
  var shuffleOutputBytesSpilled: js.UndefOr[java.lang.String] = js.undefined
  /** Current status for the stage. */
  var status: js.UndefOr[java.lang.String] = js.undefined
  /** List of operations within the stage in dependency order (approximately chronological). */
  var steps: js.UndefOr[js.Array[ExplainQueryStep]] = js.undefined
  /** Milliseconds the average shard spent waiting to be scheduled. */
  var waitMsAvg: js.UndefOr[java.lang.String] = js.undefined
  /** Milliseconds the slowest shard spent waiting to be scheduled. */
  var waitMsMax: js.UndefOr[java.lang.String] = js.undefined
  /** Relative amount of time the average shard spent waiting to be scheduled. */
  var waitRatioAvg: js.UndefOr[scala.Double] = js.undefined
  /** Relative amount of time the slowest shard spent waiting to be scheduled. */
  var waitRatioMax: js.UndefOr[scala.Double] = js.undefined
  /** Milliseconds the average shard spent on writing output. */
  var writeMsAvg: js.UndefOr[java.lang.String] = js.undefined
  /** Milliseconds the slowest shard spent on writing output. */
  var writeMsMax: js.UndefOr[java.lang.String] = js.undefined
  /** Relative amount of time the average shard spent on writing output. */
  var writeRatioAvg: js.UndefOr[scala.Double] = js.undefined
  /** Relative amount of time the slowest shard spent on writing output. */
  var writeRatioMax: js.UndefOr[scala.Double] = js.undefined
}

