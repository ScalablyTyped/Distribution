package typings.googleapis.buildSrcApisGenomicsV2alpha1Mod.genomics_v2alpha1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The arguments to the `RunPipeline` method. The requesting user must have
  * the `iam.serviceAccounts.actAs` permission for the Cloud Genomics service
  * account or the request will fail.
  */
@js.native
trait Schema$RunPipelineRequest extends js.Object {
  /**
    * User-defined labels to associate with the returned operation. These
    * labels are not propagated to any Google Cloud Platform resources used by
    * the operation, and can be modified at any time.  To associate labels with
    * resources created while executing the operation, see the appropriate
    * resource message (for example, `VirtualMachine`).
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The description of the pipeline to run.
    */
  var pipeline: js.UndefOr[Schema$Pipeline] = js.native
}

object Schema$RunPipelineRequest {
  @scala.inline
  def apply(labels: StringDictionary[String] = null, pipeline: Schema$Pipeline = null): Schema$RunPipelineRequest = {
    val __obj = js.Dynamic.literal()
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (pipeline != null) __obj.updateDynamic("pipeline")(pipeline.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RunPipelineRequest]
  }
}

