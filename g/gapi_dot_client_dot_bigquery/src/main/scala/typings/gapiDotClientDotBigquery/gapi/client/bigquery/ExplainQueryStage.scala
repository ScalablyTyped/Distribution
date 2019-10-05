package typings.gapiDotClientDotBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExplainQueryStage extends js.Object {
  /** Milliseconds the average shard spent on CPU-bound tasks. */
  var computeMsAvg: js.UndefOr[String] = js.undefined
  /** Milliseconds the slowest shard spent on CPU-bound tasks. */
  var computeMsMax: js.UndefOr[String] = js.undefined
  /** Relative amount of time the average shard spent on CPU-bound tasks. */
  var computeRatioAvg: js.UndefOr[Double] = js.undefined
  /** Relative amount of time the slowest shard spent on CPU-bound tasks. */
  var computeRatioMax: js.UndefOr[Double] = js.undefined
  /** Unique ID for stage within plan. */
  var id: js.UndefOr[String] = js.undefined
  /** Human-readable name for stage. */
  var name: js.UndefOr[String] = js.undefined
  /** Milliseconds the average shard spent reading input. */
  var readMsAvg: js.UndefOr[String] = js.undefined
  /** Milliseconds the slowest shard spent reading input. */
  var readMsMax: js.UndefOr[String] = js.undefined
  /** Relative amount of time the average shard spent reading input. */
  var readRatioAvg: js.UndefOr[Double] = js.undefined
  /** Relative amount of time the slowest shard spent reading input. */
  var readRatioMax: js.UndefOr[Double] = js.undefined
  /** Number of records read into the stage. */
  var recordsRead: js.UndefOr[String] = js.undefined
  /** Number of records written by the stage. */
  var recordsWritten: js.UndefOr[String] = js.undefined
  /** Total number of bytes written to shuffle. */
  var shuffleOutputBytes: js.UndefOr[String] = js.undefined
  /** Total number of bytes written to shuffle and spilled to disk. */
  var shuffleOutputBytesSpilled: js.UndefOr[String] = js.undefined
  /** Current status for the stage. */
  var status: js.UndefOr[String] = js.undefined
  /** List of operations within the stage in dependency order (approximately chronological). */
  var steps: js.UndefOr[js.Array[ExplainQueryStep]] = js.undefined
  /** Milliseconds the average shard spent waiting to be scheduled. */
  var waitMsAvg: js.UndefOr[String] = js.undefined
  /** Milliseconds the slowest shard spent waiting to be scheduled. */
  var waitMsMax: js.UndefOr[String] = js.undefined
  /** Relative amount of time the average shard spent waiting to be scheduled. */
  var waitRatioAvg: js.UndefOr[Double] = js.undefined
  /** Relative amount of time the slowest shard spent waiting to be scheduled. */
  var waitRatioMax: js.UndefOr[Double] = js.undefined
  /** Milliseconds the average shard spent on writing output. */
  var writeMsAvg: js.UndefOr[String] = js.undefined
  /** Milliseconds the slowest shard spent on writing output. */
  var writeMsMax: js.UndefOr[String] = js.undefined
  /** Relative amount of time the average shard spent on writing output. */
  var writeRatioAvg: js.UndefOr[Double] = js.undefined
  /** Relative amount of time the slowest shard spent on writing output. */
  var writeRatioMax: js.UndefOr[Double] = js.undefined
}

object ExplainQueryStage {
  @scala.inline
  def apply(
    computeMsAvg: String = null,
    computeMsMax: String = null,
    computeRatioAvg: Int | Double = null,
    computeRatioMax: Int | Double = null,
    id: String = null,
    name: String = null,
    readMsAvg: String = null,
    readMsMax: String = null,
    readRatioAvg: Int | Double = null,
    readRatioMax: Int | Double = null,
    recordsRead: String = null,
    recordsWritten: String = null,
    shuffleOutputBytes: String = null,
    shuffleOutputBytesSpilled: String = null,
    status: String = null,
    steps: js.Array[ExplainQueryStep] = null,
    waitMsAvg: String = null,
    waitMsMax: String = null,
    waitRatioAvg: Int | Double = null,
    waitRatioMax: Int | Double = null,
    writeMsAvg: String = null,
    writeMsMax: String = null,
    writeRatioAvg: Int | Double = null,
    writeRatioMax: Int | Double = null
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

