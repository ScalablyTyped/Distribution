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

object ExplainQueryStage {
  @scala.inline
  def apply(
    computeMsAvg: java.lang.String = null,
    computeMsMax: java.lang.String = null,
    computeRatioAvg: scala.Int | scala.Double = null,
    computeRatioMax: scala.Int | scala.Double = null,
    id: java.lang.String = null,
    name: java.lang.String = null,
    readMsAvg: java.lang.String = null,
    readMsMax: java.lang.String = null,
    readRatioAvg: scala.Int | scala.Double = null,
    readRatioMax: scala.Int | scala.Double = null,
    recordsRead: java.lang.String = null,
    recordsWritten: java.lang.String = null,
    shuffleOutputBytes: java.lang.String = null,
    shuffleOutputBytesSpilled: java.lang.String = null,
    status: java.lang.String = null,
    steps: js.Array[ExplainQueryStep] = null,
    waitMsAvg: java.lang.String = null,
    waitMsMax: java.lang.String = null,
    waitRatioAvg: scala.Int | scala.Double = null,
    waitRatioMax: scala.Int | scala.Double = null,
    writeMsAvg: java.lang.String = null,
    writeMsMax: java.lang.String = null,
    writeRatioAvg: scala.Int | scala.Double = null,
    writeRatioMax: scala.Int | scala.Double = null
  ): ExplainQueryStage = {
    val __obj = js.Dynamic.literal()
    if (computeMsAvg != null) __obj.updateDynamic("computeMsAvg")(computeMsAvg)
    if (computeMsMax != null) __obj.updateDynamic("computeMsMax")(computeMsMax)
    if (computeRatioAvg != null) __obj.updateDynamic("computeRatioAvg")(computeRatioAvg.asInstanceOf[js.Any])
    if (computeRatioMax != null) __obj.updateDynamic("computeRatioMax")(computeRatioMax.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (name != null) __obj.updateDynamic("name")(name)
    if (readMsAvg != null) __obj.updateDynamic("readMsAvg")(readMsAvg)
    if (readMsMax != null) __obj.updateDynamic("readMsMax")(readMsMax)
    if (readRatioAvg != null) __obj.updateDynamic("readRatioAvg")(readRatioAvg.asInstanceOf[js.Any])
    if (readRatioMax != null) __obj.updateDynamic("readRatioMax")(readRatioMax.asInstanceOf[js.Any])
    if (recordsRead != null) __obj.updateDynamic("recordsRead")(recordsRead)
    if (recordsWritten != null) __obj.updateDynamic("recordsWritten")(recordsWritten)
    if (shuffleOutputBytes != null) __obj.updateDynamic("shuffleOutputBytes")(shuffleOutputBytes)
    if (shuffleOutputBytesSpilled != null) __obj.updateDynamic("shuffleOutputBytesSpilled")(shuffleOutputBytesSpilled)
    if (status != null) __obj.updateDynamic("status")(status)
    if (steps != null) __obj.updateDynamic("steps")(steps)
    if (waitMsAvg != null) __obj.updateDynamic("waitMsAvg")(waitMsAvg)
    if (waitMsMax != null) __obj.updateDynamic("waitMsMax")(waitMsMax)
    if (waitRatioAvg != null) __obj.updateDynamic("waitRatioAvg")(waitRatioAvg.asInstanceOf[js.Any])
    if (waitRatioMax != null) __obj.updateDynamic("waitRatioMax")(waitRatioMax.asInstanceOf[js.Any])
    if (writeMsAvg != null) __obj.updateDynamic("writeMsAvg")(writeMsAvg)
    if (writeMsMax != null) __obj.updateDynamic("writeMsMax")(writeMsMax)
    if (writeRatioAvg != null) __obj.updateDynamic("writeRatioAvg")(writeRatioAvg.asInstanceOf[js.Any])
    if (writeRatioMax != null) __obj.updateDynamic("writeRatioMax")(writeRatioMax.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExplainQueryStage]
  }
}

