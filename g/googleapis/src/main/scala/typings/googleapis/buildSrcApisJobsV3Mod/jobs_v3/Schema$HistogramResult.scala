package typings.googleapis.buildSrcApisJobsV3Mod.jobs_v3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Output only.  Result of a histogram call. The response contains the
  * histogram map for the search type specified by HistogramResult.field. The
  * response is a map of each filter value to the corresponding count of jobs
  * for that filter.
  */
@js.native
trait Schema$HistogramResult extends js.Object {
  /**
    * The Histogram search filters.
    */
  var searchType: js.UndefOr[String] = js.native
  /**
    * A map from the values of field to the number of jobs with that value in
    * this search result.  Key: search type (filter names, such as the
    * companyName).  Values: the count of jobs that match the filter for this
    * search.
    */
  var values: js.UndefOr[StringDictionary[Double]] = js.native
}

object Schema$HistogramResult {
  @scala.inline
  def apply(searchType: String = null, values: StringDictionary[Double] = null): Schema$HistogramResult = {
    val __obj = js.Dynamic.literal()
    if (searchType != null) __obj.updateDynamic("searchType")(searchType.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$HistogramResult]
  }
}

