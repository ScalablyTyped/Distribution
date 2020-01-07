package typings.googleapis.buildSrcApisJobsV2Mod.jobs_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Input only.  Update job request.
  */
@js.native
trait Schema$UpdateJobRequest extends js.Object {
  /**
    * Deprecated. Please use processing_options. This flag is ignored if
    * processing_options is set.  Optional.  If set to `true`, the service does
    * not attempt resolve a more precise address for the job.
    */
  var disableStreetAddressResolution: js.UndefOr[Boolean] = js.native
  /**
    * Required.  The Job to be updated.
    */
  var job: js.UndefOr[Schema$Job] = js.native
  /**
    * Optional.  Options for job processing.
    * UpdateJobRequest.disable_street_address_resolution is ignored if this
    * flag is set.
    */
  var processingOptions: js.UndefOr[Schema$JobProcessingOptions] = js.native
  /**
    * Optional but strongly recommended to be provided for the best service
    * experience.  If update_job_fields is provided, only the specified fields
    * in job are updated. Otherwise all the fields are updated.  A field mask
    * to restrict the fields that are updated. Valid values are:  * jobTitle *
    * employmentTypes * description * applicationUrls * applicationEmailList *
    * applicationInstruction * responsibilities * qualifications *
    * educationLevels * level * department * startDate * endDate *
    * compensationInfo * incentives * languageCode * benefits * expireTime *
    * customAttributes * visibility * publishDate * promotionValue * locations
    * * region * expiryDate (deprecated) * filterableCustomFields (deprecated)
    * * unindexedCustomFields (deprecated)
    */
  var updateJobFields: js.UndefOr[String] = js.native
}

object Schema$UpdateJobRequest {
  @scala.inline
  def apply(
    disableStreetAddressResolution: js.UndefOr[Boolean] = js.undefined,
    job: Schema$Job = null,
    processingOptions: Schema$JobProcessingOptions = null,
    updateJobFields: String = null
  ): Schema$UpdateJobRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableStreetAddressResolution)) __obj.updateDynamic("disableStreetAddressResolution")(disableStreetAddressResolution.asInstanceOf[js.Any])
    if (job != null) __obj.updateDynamic("job")(job.asInstanceOf[js.Any])
    if (processingOptions != null) __obj.updateDynamic("processingOptions")(processingOptions.asInstanceOf[js.Any])
    if (updateJobFields != null) __obj.updateDynamic("updateJobFields")(updateJobFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UpdateJobRequest]
  }
}

