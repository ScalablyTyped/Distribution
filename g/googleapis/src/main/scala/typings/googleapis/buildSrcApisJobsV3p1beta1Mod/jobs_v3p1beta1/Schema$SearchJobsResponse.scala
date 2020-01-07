package typings.googleapis.buildSrcApisJobsV3p1beta1Mod.jobs_v3p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Output only.  Response for SearchJob method.
  */
@js.native
trait Schema$SearchJobsResponse extends js.Object {
  /**
    * If query broadening is enabled, we may append additional results from the
    * broadened query. This number indicates how many of the jobs returned in
    * the jobs field are from the broadened query. These results are always at
    * the end of the jobs list. In particular, a value of 0, or if the field
    * isn&#39;t set, all the jobs in the jobs list are from the original
    * (without broadening) query. If this field is non-zero, subsequent
    * requests with offset after this result set should contain all broadened
    * results.
    */
  var broadenedQueryJobsCount: js.UndefOr[Double] = js.native
  /**
    * An estimation of the number of jobs that match the specified query.  This
    * number is not guaranteed to be accurate. For accurate results, see
    * enable_precise_result_size.
    */
  var estimatedTotalSize: js.UndefOr[Double] = js.native
  /**
    * The histogram results that match with specified
    * SearchJobsRequest.histogram_queries.
    */
  var histogramQueryResults: js.UndefOr[js.Array[Schema$HistogramQueryResult]] = js.native
  /**
    * The histogram results that match specified
    * SearchJobsRequest.histogram_facets.
    */
  var histogramResults: js.UndefOr[Schema$HistogramResults] = js.native
  /**
    * The location filters that the service applied to the specified query. If
    * any filters are lat-lng based, the JobLocation.location_type is
    * JobLocation.LocationType#LOCATION_TYPE_UNSPECIFIED.
    */
  var locationFilters: js.UndefOr[js.Array[Schema$Location]] = js.native
  /**
    * The Job entities that match the specified SearchJobsRequest.
    */
  var matchingJobs: js.UndefOr[js.Array[Schema$MatchingJob]] = js.native
  /**
    * Additional information for the API invocation, such as the request
    * tracking id.
    */
  var metadata: js.UndefOr[Schema$ResponseMetadata] = js.native
  /**
    * The token that specifies the starting position of the next page of
    * results. This field is empty if there are no more results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The spell checking result, and correction.
    */
  var spellCorrection: js.UndefOr[Schema$SpellingCorrection] = js.native
  /**
    * The precise result count, which is available only if the client set
    * enable_precise_result_size to `true`, or if the response is the last page
    * of results. Otherwise, the value is `-1`.
    */
  var totalSize: js.UndefOr[Double] = js.native
}

object Schema$SearchJobsResponse {
  @scala.inline
  def apply(
    broadenedQueryJobsCount: Int | Double = null,
    estimatedTotalSize: Int | Double = null,
    histogramQueryResults: js.Array[Schema$HistogramQueryResult] = null,
    histogramResults: Schema$HistogramResults = null,
    locationFilters: js.Array[Schema$Location] = null,
    matchingJobs: js.Array[Schema$MatchingJob] = null,
    metadata: Schema$ResponseMetadata = null,
    nextPageToken: String = null,
    spellCorrection: Schema$SpellingCorrection = null,
    totalSize: Int | Double = null
  ): Schema$SearchJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (broadenedQueryJobsCount != null) __obj.updateDynamic("broadenedQueryJobsCount")(broadenedQueryJobsCount.asInstanceOf[js.Any])
    if (estimatedTotalSize != null) __obj.updateDynamic("estimatedTotalSize")(estimatedTotalSize.asInstanceOf[js.Any])
    if (histogramQueryResults != null) __obj.updateDynamic("histogramQueryResults")(histogramQueryResults.asInstanceOf[js.Any])
    if (histogramResults != null) __obj.updateDynamic("histogramResults")(histogramResults.asInstanceOf[js.Any])
    if (locationFilters != null) __obj.updateDynamic("locationFilters")(locationFilters.asInstanceOf[js.Any])
    if (matchingJobs != null) __obj.updateDynamic("matchingJobs")(matchingJobs.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (spellCorrection != null) __obj.updateDynamic("spellCorrection")(spellCorrection.asInstanceOf[js.Any])
    if (totalSize != null) __obj.updateDynamic("totalSize")(totalSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SearchJobsResponse]
  }
}

