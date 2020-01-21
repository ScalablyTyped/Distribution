package typings.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaExplainQueryStage extends js.Object {
  /**
    * Number of parallel input segments completed.
    */
  var completedParallelInputs: js.UndefOr[String] = js.native
  /**
    * Milliseconds the average shard spent on CPU-bound tasks.
    */
  var computeMsAvg: js.UndefOr[String] = js.native
  /**
    * Milliseconds the slowest shard spent on CPU-bound tasks.
    */
  var computeMsMax: js.UndefOr[String] = js.native
  /**
    * Relative amount of time the average shard spent on CPU-bound tasks.
    */
  var computeRatioAvg: js.UndefOr[Double] = js.native
  /**
    * Relative amount of time the slowest shard spent on CPU-bound tasks.
    */
  var computeRatioMax: js.UndefOr[Double] = js.native
  /**
    * Stage end time represented as milliseconds since epoch.
    */
  var endMs: js.UndefOr[String] = js.native
  /**
    * Unique ID for stage within plan.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * IDs for stages that are inputs to this stage.
    */
  var inputStages: js.UndefOr[js.Array[String]] = js.native
  /**
    * Human-readable name for stage.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Number of parallel input segments to be processed.
    */
  var parallelInputs: js.UndefOr[String] = js.native
  /**
    * Milliseconds the average shard spent reading input.
    */
  var readMsAvg: js.UndefOr[String] = js.native
  /**
    * Milliseconds the slowest shard spent reading input.
    */
  var readMsMax: js.UndefOr[String] = js.native
  /**
    * Relative amount of time the average shard spent reading input.
    */
  var readRatioAvg: js.UndefOr[Double] = js.native
  /**
    * Relative amount of time the slowest shard spent reading input.
    */
  var readRatioMax: js.UndefOr[Double] = js.native
  /**
    * Number of records read into the stage.
    */
  var recordsRead: js.UndefOr[String] = js.native
  /**
    * Number of records written by the stage.
    */
  var recordsWritten: js.UndefOr[String] = js.native
  /**
    * Total number of bytes written to shuffle.
    */
  var shuffleOutputBytes: js.UndefOr[String] = js.native
  /**
    * Total number of bytes written to shuffle and spilled to disk.
    */
  var shuffleOutputBytesSpilled: js.UndefOr[String] = js.native
  /**
    * Stage start time represented as milliseconds since epoch.
    */
  var startMs: js.UndefOr[String] = js.native
  /**
    * Current status for the stage.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * List of operations within the stage in dependency order (approximately
    * chronological).
    */
  var steps: js.UndefOr[js.Array[SchemaExplainQueryStep]] = js.native
  /**
    * Milliseconds the average shard spent waiting to be scheduled.
    */
  var waitMsAvg: js.UndefOr[String] = js.native
  /**
    * Milliseconds the slowest shard spent waiting to be scheduled.
    */
  var waitMsMax: js.UndefOr[String] = js.native
  /**
    * Relative amount of time the average shard spent waiting to be scheduled.
    */
  var waitRatioAvg: js.UndefOr[Double] = js.native
  /**
    * Relative amount of time the slowest shard spent waiting to be scheduled.
    */
  var waitRatioMax: js.UndefOr[Double] = js.native
  /**
    * Milliseconds the average shard spent on writing output.
    */
  var writeMsAvg: js.UndefOr[String] = js.native
  /**
    * Milliseconds the slowest shard spent on writing output.
    */
  var writeMsMax: js.UndefOr[String] = js.native
  /**
    * Relative amount of time the average shard spent on writing output.
    */
  var writeRatioAvg: js.UndefOr[Double] = js.native
  /**
    * Relative amount of time the slowest shard spent on writing output.
    */
  var writeRatioMax: js.UndefOr[Double] = js.native
}

object SchemaExplainQueryStage {
  @scala.inline
  def apply(
    completedParallelInputs: String = null,
    computeMsAvg: String = null,
    computeMsMax: String = null,
    computeRatioAvg: Int | Double = null,
    computeRatioMax: Int | Double = null,
    endMs: String = null,
    id: String = null,
    inputStages: js.Array[String] = null,
    name: String = null,
    parallelInputs: String = null,
    readMsAvg: String = null,
    readMsMax: String = null,
    readRatioAvg: Int | Double = null,
    readRatioMax: Int | Double = null,
    recordsRead: String = null,
    recordsWritten: String = null,
    shuffleOutputBytes: String = null,
    shuffleOutputBytesSpilled: String = null,
    startMs: String = null,
    status: String = null,
    steps: js.Array[SchemaExplainQueryStep] = null,
    waitMsAvg: String = null,
    waitMsMax: String = null,
    waitRatioAvg: Int | Double = null,
    waitRatioMax: Int | Double = null,
    writeMsAvg: String = null,
    writeMsMax: String = null,
    writeRatioAvg: Int | Double = null,
    writeRatioMax: Int | Double = null
  ): SchemaExplainQueryStage = {
    val __obj = js.Dynamic.literal()
    if (completedParallelInputs != null) __obj.updateDynamic("completedParallelInputs")(completedParallelInputs.asInstanceOf[js.Any])
    if (computeMsAvg != null) __obj.updateDynamic("computeMsAvg")(computeMsAvg.asInstanceOf[js.Any])
    if (computeMsMax != null) __obj.updateDynamic("computeMsMax")(computeMsMax.asInstanceOf[js.Any])
    if (computeRatioAvg != null) __obj.updateDynamic("computeRatioAvg")(computeRatioAvg.asInstanceOf[js.Any])
    if (computeRatioMax != null) __obj.updateDynamic("computeRatioMax")(computeRatioMax.asInstanceOf[js.Any])
    if (endMs != null) __obj.updateDynamic("endMs")(endMs.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inputStages != null) __obj.updateDynamic("inputStages")(inputStages.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parallelInputs != null) __obj.updateDynamic("parallelInputs")(parallelInputs.asInstanceOf[js.Any])
    if (readMsAvg != null) __obj.updateDynamic("readMsAvg")(readMsAvg.asInstanceOf[js.Any])
    if (readMsMax != null) __obj.updateDynamic("readMsMax")(readMsMax.asInstanceOf[js.Any])
    if (readRatioAvg != null) __obj.updateDynamic("readRatioAvg")(readRatioAvg.asInstanceOf[js.Any])
    if (readRatioMax != null) __obj.updateDynamic("readRatioMax")(readRatioMax.asInstanceOf[js.Any])
    if (recordsRead != null) __obj.updateDynamic("recordsRead")(recordsRead.asInstanceOf[js.Any])
    if (recordsWritten != null) __obj.updateDynamic("recordsWritten")(recordsWritten.asInstanceOf[js.Any])
    if (shuffleOutputBytes != null) __obj.updateDynamic("shuffleOutputBytes")(shuffleOutputBytes.asInstanceOf[js.Any])
    if (shuffleOutputBytesSpilled != null) __obj.updateDynamic("shuffleOutputBytesSpilled")(shuffleOutputBytesSpilled.asInstanceOf[js.Any])
    if (startMs != null) __obj.updateDynamic("startMs")(startMs.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (steps != null) __obj.updateDynamic("steps")(steps.asInstanceOf[js.Any])
    if (waitMsAvg != null) __obj.updateDynamic("waitMsAvg")(waitMsAvg.asInstanceOf[js.Any])
    if (waitMsMax != null) __obj.updateDynamic("waitMsMax")(waitMsMax.asInstanceOf[js.Any])
    if (waitRatioAvg != null) __obj.updateDynamic("waitRatioAvg")(waitRatioAvg.asInstanceOf[js.Any])
    if (waitRatioMax != null) __obj.updateDynamic("waitRatioMax")(waitRatioMax.asInstanceOf[js.Any])
    if (writeMsAvg != null) __obj.updateDynamic("writeMsAvg")(writeMsAvg.asInstanceOf[js.Any])
    if (writeMsMax != null) __obj.updateDynamic("writeMsMax")(writeMsMax.asInstanceOf[js.Any])
    if (writeRatioAvg != null) __obj.updateDynamic("writeRatioAvg")(writeRatioAvg.asInstanceOf[js.Any])
    if (writeRatioMax != null) __obj.updateDynamic("writeRatioMax")(writeRatioMax.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaExplainQueryStage]
  }
}

