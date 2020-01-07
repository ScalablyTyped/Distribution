package typings.googleapis.buildSrcApisJobsV2Mod.jobs_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Output only.  Response for SearchJob method.
  */
@js.native
trait Schema$SearchJobsResponse extends js.Object {
  /**
    * The commute filter the service applied to the specified query. This
    * information is only available when query has a valid CommutePreference.
    */
  var appliedCommuteFilter: js.UndefOr[Schema$CommutePreference] = js.native
  /**
    * The location filters that the service applied to the specified query. If
    * any filters are lat-lng based, the JobLocation.location_type is
    * JobLocation.LocationType#LOCATION_TYPE_UNSPECIFIED.
    */
  var appliedJobLocationFilters: js.UndefOr[js.Array[Schema$JobLocation]] = js.native
  /**
    * An estimation of the number of jobs that match the specified query.  This
    * number is not guaranteed to be accurate. For accurate results,
    * seenenable_precise_result_size.
    */
  var estimatedTotalSize: js.UndefOr[String] = js.native
  /**
    * The histogram results that match specified
    * SearchJobsRequest.HistogramFacets.
    */
  var histogramResults: js.UndefOr[Schema$HistogramResults] = js.native
  /**
    * Corresponds to SearchJobsRequest.job_view.
    */
  var jobView: js.UndefOr[String] = js.native
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
    * If query broadening is enabled, we may append additional results from the
    * broadened query. This number indicates how many of the jobs returned in
    * the jobs field are from the broadened query. These results are always at
    * the end of the jobs list. In particular, a value of 0 means all the jobs
    * in the jobs list are from the original (without broadening) query. If
    * this field is non-zero, subsequent requests with offset after this result
    * set should contain all broadened results.
    */
  var numJobsFromBroadenedQuery: js.UndefOr[Double] = js.native
  /**
    * The spell checking result, and correction.
    */
  var spellResult: js.UndefOr[Schema$SpellingCorrection] = js.native
  /**
    * The precise result count, which is available only if the client set
    * enable_precise_result_size to `true` or if the response is the last page
    * of results. Otherwise, the value will be `-1`.
    */
  var totalSize: js.UndefOr[String] = js.native
}

object Schema$SearchJobsResponse {
  @scala.inline
  def apply(
    appliedCommuteFilter: Schema$CommutePreference = null,
    appliedJobLocationFilters: js.Array[Schema$JobLocation] = null,
    estimatedTotalSize: String = null,
    histogramResults: Schema$HistogramResults = null,
    jobView: String = null,
    matchingJobs: js.Array[Schema$MatchingJob] = null,
    metadata: Schema$ResponseMetadata = null,
    nextPageToken: String = null,
    numJobsFromBroadenedQuery: Int | Double = null,
    spellResult: Schema$SpellingCorrection = null,
    totalSize: String = null
  ): Schema$SearchJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (appliedCommuteFilter != null) __obj.updateDynamic("appliedCommuteFilter")(appliedCommuteFilter.asInstanceOf[js.Any])
    if (appliedJobLocationFilters != null) __obj.updateDynamic("appliedJobLocationFilters")(appliedJobLocationFilters.asInstanceOf[js.Any])
    if (estimatedTotalSize != null) __obj.updateDynamic("estimatedTotalSize")(estimatedTotalSize.asInstanceOf[js.Any])
    if (histogramResults != null) __obj.updateDynamic("histogramResults")(histogramResults.asInstanceOf[js.Any])
    if (jobView != null) __obj.updateDynamic("jobView")(jobView.asInstanceOf[js.Any])
    if (matchingJobs != null) __obj.updateDynamic("matchingJobs")(matchingJobs.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (numJobsFromBroadenedQuery != null) __obj.updateDynamic("numJobsFromBroadenedQuery")(numJobsFromBroadenedQuery.asInstanceOf[js.Any])
    if (spellResult != null) __obj.updateDynamic("spellResult")(spellResult.asInstanceOf[js.Any])
    if (totalSize != null) __obj.updateDynamic("totalSize")(totalSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SearchJobsResponse]
  }
}

