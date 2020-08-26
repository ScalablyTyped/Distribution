package typings.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipelineDescription extends js.Object {
  /** Pipeline level display data. */
  var displayData: js.UndefOr[js.Array[DisplayData]] = js.native
  /** Description of each stage of execution of the pipeline. */
  var executionPipelineStage: js.UndefOr[js.Array[ExecutionStageSummary]] = js.native
  /** Description of each transform in the pipeline and collections between them. */
  var originalPipelineTransform: js.UndefOr[js.Array[TransformSummary]] = js.native
}

object PipelineDescription {
  @scala.inline
  def apply(): PipelineDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PipelineDescription]
  }
  @scala.inline
  implicit class PipelineDescriptionOps[Self <: PipelineDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDisplayDataVarargs(value: DisplayData*): Self = this.set("displayData", js.Array(value :_*))
    @scala.inline
    def setDisplayData(value: js.Array[DisplayData]): Self = this.set("displayData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayData: Self = this.set("displayData", js.undefined)
    @scala.inline
    def setExecutionPipelineStageVarargs(value: ExecutionStageSummary*): Self = this.set("executionPipelineStage", js.Array(value :_*))
    @scala.inline
    def setExecutionPipelineStage(value: js.Array[ExecutionStageSummary]): Self = this.set("executionPipelineStage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutionPipelineStage: Self = this.set("executionPipelineStage", js.undefined)
    @scala.inline
    def setOriginalPipelineTransformVarargs(value: TransformSummary*): Self = this.set("originalPipelineTransform", js.Array(value :_*))
    @scala.inline
    def setOriginalPipelineTransform(value: js.Array[TransformSummary]): Self = this.set("originalPipelineTransform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalPipelineTransform: Self = this.set("originalPipelineTransform", js.undefined)
  }
  
}

