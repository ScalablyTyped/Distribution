package typings.googleapis.buildSrcApisJobsV2Mod.jobs_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Custom attributes histogram request. An error will be thrown if neither
  * string_value_histogram or long_value_histogram_bucketing_option has been
  * defined.
  */
@js.native
trait Schema$CustomAttributeHistogramRequest extends js.Object {
  /**
    * Required.  Specifies the custom field key to perform a histogram on. If
    * specified without `long_value_histogram_bucketing_option`, histogram on
    * string values of the given `key` is triggered, otherwise histogram is
    * performed on long values.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * Optional.  Specifies buckets used to perform a range histogram on
    * Job&#39;s filterable long custom field values, or min/max value
    * requirements.
    */
  var longValueHistogramBucketingOption: js.UndefOr[Schema$NumericBucketingOption] = js.native
  /**
    * Optional. If set to true, the response will include the histogram value
    * for each key as a string.
    */
  var stringValueHistogram: js.UndefOr[Boolean] = js.native
}

object Schema$CustomAttributeHistogramRequest {
  @scala.inline
  def apply(
    key: String = null,
    longValueHistogramBucketingOption: Schema$NumericBucketingOption = null,
    stringValueHistogram: js.UndefOr[Boolean] = js.undefined
  ): Schema$CustomAttributeHistogramRequest = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (longValueHistogramBucketingOption != null) __obj.updateDynamic("longValueHistogramBucketingOption")(longValueHistogramBucketingOption.asInstanceOf[js.Any])
    if (!js.isUndefined(stringValueHistogram)) __obj.updateDynamic("stringValueHistogram")(stringValueHistogram.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CustomAttributeHistogramRequest]
  }
}

