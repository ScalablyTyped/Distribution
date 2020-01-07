package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A task which describes what action should be performed for the specified
  * streaming computation ranges.
  */
@js.native
trait Schema$StreamingComputationTask extends js.Object {
  /**
    * Contains ranges of a streaming computation this task should apply to.
    */
  var computationRanges: js.UndefOr[js.Array[Schema$StreamingComputationRanges]] = js.native
  /**
    * Describes the set of data disks this task should apply to.
    */
  var dataDisks: js.UndefOr[js.Array[Schema$MountedDataDisk]] = js.native
  /**
    * A type of streaming computation task.
    */
  var taskType: js.UndefOr[String] = js.native
}

object Schema$StreamingComputationTask {
  @scala.inline
  def apply(
    computationRanges: js.Array[Schema$StreamingComputationRanges] = null,
    dataDisks: js.Array[Schema$MountedDataDisk] = null,
    taskType: String = null
  ): Schema$StreamingComputationTask = {
    val __obj = js.Dynamic.literal()
    if (computationRanges != null) __obj.updateDynamic("computationRanges")(computationRanges.asInstanceOf[js.Any])
    if (dataDisks != null) __obj.updateDynamic("dataDisks")(dataDisks.asInstanceOf[js.Any])
    if (taskType != null) __obj.updateDynamic("taskType")(taskType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$StreamingComputationTask]
  }
}

