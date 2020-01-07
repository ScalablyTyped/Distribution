package typings.googleapis.buildSrcApisJobsV3p1beta1Mod.jobs_v3p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Output only.  Compensation based histogram result.
  */
@js.native
trait Schema$CompensationHistogramResult extends js.Object {
  /**
    * Histogram result.
    */
  var result: js.UndefOr[Schema$NumericBucketingResult] = js.native
  /**
    * Type of the request, corresponding to CompensationHistogramRequest.type.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$CompensationHistogramResult {
  @scala.inline
  def apply(result: Schema$NumericBucketingResult = null, `type`: String = null): Schema$CompensationHistogramResult = {
    val __obj = js.Dynamic.literal()
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CompensationHistogramResult]
  }
}

