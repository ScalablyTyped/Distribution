package typings.googleapis.buildSrcApisGenomicsV1alpha2Mod.genomics_v1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request to run a pipeline. If `pipelineId` is specified, it refers to a
  * saved pipeline created with CreatePipeline and set as the `pipelineId` of
  * the returned Pipeline object. If `ephemeralPipeline` is specified, that
  * pipeline is run once with the given args and not saved. It is an error to
  * specify both `pipelineId` and `ephemeralPipeline`. `pipelineArgs` must be
  * specified.
  */
@js.native
trait Schema$RunPipelineRequest extends js.Object {
  /**
    * A new pipeline object to run once and then delete.
    */
  var ephemeralPipeline: js.UndefOr[Schema$Pipeline] = js.native
  /**
    * The arguments to use when running this pipeline.
    */
  var pipelineArgs: js.UndefOr[Schema$RunPipelineArgs] = js.native
  /**
    * The already created pipeline to run.
    */
  var pipelineId: js.UndefOr[String] = js.native
}

object Schema$RunPipelineRequest {
  @scala.inline
  def apply(
    ephemeralPipeline: Schema$Pipeline = null,
    pipelineArgs: Schema$RunPipelineArgs = null,
    pipelineId: String = null
  ): Schema$RunPipelineRequest = {
    val __obj = js.Dynamic.literal()
    if (ephemeralPipeline != null) __obj.updateDynamic("ephemeralPipeline")(ephemeralPipeline.asInstanceOf[js.Any])
    if (pipelineArgs != null) __obj.updateDynamic("pipelineArgs")(pipelineArgs.asInstanceOf[js.Any])
    if (pipelineId != null) __obj.updateDynamic("pipelineId")(pipelineId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RunPipelineRequest]
  }
}

