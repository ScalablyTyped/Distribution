package typings.gapiClientBigquery.gapi.client.bigquery

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
    computeRatioAvg: js.UndefOr[Double] = js.undefined,
    computeRatioMax: js.UndefOr[Double] = js.undefined,
    id: String = null,
    name: String = null,
    readMsAvg: String = null,
    readMsMax: String = null,
    readRatioAvg: js.UndefOr[Double] = js.undefined,
    readRatioMax: js.UndefOr[Double] = js.undefined,
    recordsRead: String = null,
    recordsWritten: String = null,
    shuffleOutputBytes: String = null,
    shuffleOutputBytesSpilled: String = null,
    status: String = null,
    steps: js.Array[ExplainQueryStep] = null,
    waitMsAvg: String = null,
    waitMsMax: String = null,
    waitRatioAvg: js.UndefOr[Double] = js.undefined,
    waitRatioMax: js.UndefOr[Double] = js.undefined,
    writeMsAvg: String = null,
    writeMsMax: String = null,
    writeRatioAvg: js.UndefOr[Double] = js.undefined,
    writeRatioMax: js.UndefOr[Double] = js.undefined
  ): ExplainQueryStage = {
    val __obj = js.Dynamic.literal()
    if (computeMsAvg != null) __obj.updateDynamic("computeMsAvg")(computeMsAvg.asInstanceOf[js.Any])
    if (computeMsMax != null) __obj.updateDynamic("computeMsMax")(computeMsMax.asInstanceOf[js.Any])
    if (!js.isUndefined(computeRatioAvg)) __obj.updateDynamic("computeRatioAvg")(computeRatioAvg.get.asInstanceOf[js.Any])
    if (!js.isUndefined(computeRatioMax)) __obj.updateDynamic("computeRatioMax")(computeRatioMax.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (readMsAvg != null) __obj.updateDynamic("readMsAvg")(readMsAvg.asInstanceOf[js.Any])
    if (readMsMax != null) __obj.updateDynamic("readMsMax")(readMsMax.asInstanceOf[js.Any])
    if (!js.isUndefined(readRatioAvg)) __obj.updateDynamic("readRatioAvg")(readRatioAvg.get.asInstanceOf[js.Any])
    if (!js.isUndefined(readRatioMax)) __obj.updateDynamic("readRatioMax")(readRatioMax.get.asInstanceOf[js.Any])
    if (recordsRead != null) __obj.updateDynamic("recordsRead")(recordsRead.asInstanceOf[js.Any])
    if (recordsWritten != null) __obj.updateDynamic("recordsWritten")(recordsWritten.asInstanceOf[js.Any])
    if (shuffleOutputBytes != null) __obj.updateDynamic("shuffleOutputBytes")(shuffleOutputBytes.asInstanceOf[js.Any])
    if (shuffleOutputBytesSpilled != null) __obj.updateDynamic("shuffleOutputBytesSpilled")(shuffleOutputBytesSpilled.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (steps != null) __obj.updateDynamic("steps")(steps.asInstanceOf[js.Any])
    if (waitMsAvg != null) __obj.updateDynamic("waitMsAvg")(waitMsAvg.asInstanceOf[js.Any])
    if (waitMsMax != null) __obj.updateDynamic("waitMsMax")(waitMsMax.asInstanceOf[js.Any])
    if (!js.isUndefined(waitRatioAvg)) __obj.updateDynamic("waitRatioAvg")(waitRatioAvg.get.asInstanceOf[js.Any])
    if (!js.isUndefined(waitRatioMax)) __obj.updateDynamic("waitRatioMax")(waitRatioMax.get.asInstanceOf[js.Any])
    if (writeMsAvg != null) __obj.updateDynamic("writeMsAvg")(writeMsAvg.asInstanceOf[js.Any])
    if (writeMsMax != null) __obj.updateDynamic("writeMsMax")(writeMsMax.asInstanceOf[js.Any])
    if (!js.isUndefined(writeRatioAvg)) __obj.updateDynamic("writeRatioAvg")(writeRatioAvg.get.asInstanceOf[js.Any])
    if (!js.isUndefined(writeRatioMax)) __obj.updateDynamic("writeRatioMax")(writeRatioMax.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExplainQueryStage]
  }
}

