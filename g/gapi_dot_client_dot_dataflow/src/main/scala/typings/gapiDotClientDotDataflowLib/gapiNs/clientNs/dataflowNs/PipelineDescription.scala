package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipelineDescription extends js.Object {
  /** Pipeline level display data. */
  var displayData: js.UndefOr[js.Array[DisplayData]] = js.undefined
  /** Description of each stage of execution of the pipeline. */
  var executionPipelineStage: js.UndefOr[js.Array[ExecutionStageSummary]] = js.undefined
  /** Description of each transform in the pipeline and collections between them. */
  var originalPipelineTransform: js.UndefOr[js.Array[TransformSummary]] = js.undefined
}

object PipelineDescription {
  @scala.inline
  def apply(
    displayData: js.Array[DisplayData] = null,
    executionPipelineStage: js.Array[ExecutionStageSummary] = null,
    originalPipelineTransform: js.Array[TransformSummary] = null
  ): PipelineDescription = {
    val __obj = js.Dynamic.literal()
    if (displayData != null) __obj.updateDynamic("displayData")(displayData)
    if (executionPipelineStage != null) __obj.updateDynamic("executionPipelineStage")(executionPipelineStage)
    if (originalPipelineTransform != null) __obj.updateDynamic("originalPipelineTransform")(originalPipelineTransform)
    __obj.asInstanceOf[PipelineDescription]
  }
}

