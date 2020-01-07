package typings.googleapis.buildSrcApisJobsV3Mod.jobs_v3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Output only.  Custom attribute histogram result.
  */
@js.native
trait Schema$CustomAttributeHistogramResult extends js.Object {
  /**
    * Stores the key of custom attribute the histogram is performed on.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * Stores bucketed histogram counting result or min/max values for custom
    * attribute long values associated with `key`.
    */
  var longValueHistogramResult: js.UndefOr[Schema$NumericBucketingResult] = js.native
  /**
    * Stores a map from the values of string custom field associated with `key`
    * to the number of jobs with that value in this histogram result.
    */
  var stringValueHistogramResult: js.UndefOr[StringDictionary[Double]] = js.native
}

object Schema$CustomAttributeHistogramResult {
  @scala.inline
  def apply(
    key: String = null,
    longValueHistogramResult: Schema$NumericBucketingResult = null,
    stringValueHistogramResult: StringDictionary[Double] = null
  ): Schema$CustomAttributeHistogramResult = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (longValueHistogramResult != null) __obj.updateDynamic("longValueHistogramResult")(longValueHistogramResult.asInstanceOf[js.Any])
    if (stringValueHistogramResult != null) __obj.updateDynamic("stringValueHistogramResult")(stringValueHistogramResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CustomAttributeHistogramResult]
  }
}

