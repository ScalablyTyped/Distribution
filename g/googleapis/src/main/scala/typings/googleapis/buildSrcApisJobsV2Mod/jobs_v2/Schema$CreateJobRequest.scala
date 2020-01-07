package typings.googleapis.buildSrcApisJobsV2Mod.jobs_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Input only.  Create job request.
  */
@js.native
trait Schema$CreateJobRequest extends js.Object {
  /**
    * Deprecated. Please use processing_options. This flag is ignored if
    * processing_options is set.  Optional.  If set to `true`, the service does
    * not attempt to resolve a more precise address for the job.
    */
  var disableStreetAddressResolution: js.UndefOr[Boolean] = js.native
  /**
    * Required.  The Job to be created.
    */
  var job: js.UndefOr[Schema$Job] = js.native
  /**
    * Optional.  Options for job processing.
    */
  var processingOptions: js.UndefOr[Schema$JobProcessingOptions] = js.native
}

object Schema$CreateJobRequest {
  @scala.inline
  def apply(
    disableStreetAddressResolution: js.UndefOr[Boolean] = js.undefined,
    job: Schema$Job = null,
    processingOptions: Schema$JobProcessingOptions = null
  ): Schema$CreateJobRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableStreetAddressResolution)) __obj.updateDynamic("disableStreetAddressResolution")(disableStreetAddressResolution.asInstanceOf[js.Any])
    if (job != null) __obj.updateDynamic("job")(job.asInstanceOf[js.Any])
    if (processingOptions != null) __obj.updateDynamic("processingOptions")(processingOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CreateJobRequest]
  }
}

