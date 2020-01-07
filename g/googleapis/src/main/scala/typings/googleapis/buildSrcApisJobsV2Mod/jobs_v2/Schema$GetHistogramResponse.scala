package typings.googleapis.buildSrcApisJobsV2Mod.jobs_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deprecated. Use SearchJobsRequest.histogram_facets instead to make a single
  * call with both search and histogram.  Output only.  The response of the
  * GetHistogram method.
  */
@js.native
trait Schema$GetHistogramResponse extends js.Object {
  /**
    * Additional information for the API invocation, such as the request
    * tracking id.
    */
  var metadata: js.UndefOr[Schema$ResponseMetadata] = js.native
  /**
    * The Histogram results.
    */
  var results: js.UndefOr[js.Array[Schema$HistogramResult]] = js.native
}

object Schema$GetHistogramResponse {
  @scala.inline
  def apply(metadata: Schema$ResponseMetadata = null, results: js.Array[Schema$HistogramResult] = null): Schema$GetHistogramResponse = {
    val __obj = js.Dynamic.literal()
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GetHistogramResponse]
  }
}

