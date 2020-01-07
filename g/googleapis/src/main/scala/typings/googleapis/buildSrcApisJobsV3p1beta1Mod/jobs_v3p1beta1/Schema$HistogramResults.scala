package typings.googleapis.buildSrcApisJobsV3p1beta1Mod.jobs_v3p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Output only.  Histogram results that match HistogramFacets specified in
  * SearchJobsRequest.
  */
@js.native
trait Schema$HistogramResults extends js.Object {
  /**
    * Specifies compensation field-based histogram results that match
    * HistogramFacets.compensation_histogram_requests.
    */
  var compensationHistogramResults: js.UndefOr[js.Array[Schema$CompensationHistogramResult]] = js.native
  /**
    * Specifies histogram results for custom attributes that match
    * HistogramFacets.custom_attribute_histogram_facets.
    */
  var customAttributeHistogramResults: js.UndefOr[js.Array[Schema$CustomAttributeHistogramResult]] = js.native
  /**
    * Specifies histogram results that matches
    * HistogramFacets.simple_histogram_facets.
    */
  var simpleHistogramResults: js.UndefOr[js.Array[Schema$HistogramResult]] = js.native
}

object Schema$HistogramResults {
  @scala.inline
  def apply(
    compensationHistogramResults: js.Array[Schema$CompensationHistogramResult] = null,
    customAttributeHistogramResults: js.Array[Schema$CustomAttributeHistogramResult] = null,
    simpleHistogramResults: js.Array[Schema$HistogramResult] = null
  ): Schema$HistogramResults = {
    val __obj = js.Dynamic.literal()
    if (compensationHistogramResults != null) __obj.updateDynamic("compensationHistogramResults")(compensationHistogramResults.asInstanceOf[js.Any])
    if (customAttributeHistogramResults != null) __obj.updateDynamic("customAttributeHistogramResults")(customAttributeHistogramResults.asInstanceOf[js.Any])
    if (simpleHistogramResults != null) __obj.updateDynamic("simpleHistogramResults")(simpleHistogramResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$HistogramResults]
  }
}

