package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A descriptive representation of submitted pipeline as well as the executed
  * form.  This data is provided by the Dataflow service for ease of
  * visualizing the pipeline and interpreting Dataflow provided metrics.
  */
@js.native
trait Schema$PipelineDescription extends js.Object {
  /**
    * Pipeline level display data.
    */
  var displayData: js.UndefOr[js.Array[Schema$DisplayData]] = js.native
  /**
    * Description of each stage of execution of the pipeline.
    */
  var executionPipelineStage: js.UndefOr[js.Array[Schema$ExecutionStageSummary]] = js.native
  /**
    * Description of each transform in the pipeline and collections between
    * them.
    */
  var originalPipelineTransform: js.UndefOr[js.Array[Schema$TransformSummary]] = js.native
}

object Schema$PipelineDescription {
  @scala.inline
  def apply(
    displayData: js.Array[Schema$DisplayData] = null,
    executionPipelineStage: js.Array[Schema$ExecutionStageSummary] = null,
    originalPipelineTransform: js.Array[Schema$TransformSummary] = null
  ): Schema$PipelineDescription = {
    val __obj = js.Dynamic.literal()
    if (displayData != null) __obj.updateDynamic("displayData")(displayData.asInstanceOf[js.Any])
    if (executionPipelineStage != null) __obj.updateDynamic("executionPipelineStage")(executionPipelineStage.asInstanceOf[js.Any])
    if (originalPipelineTransform != null) __obj.updateDynamic("originalPipelineTransform")(originalPipelineTransform.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PipelineDescription]
  }
}

