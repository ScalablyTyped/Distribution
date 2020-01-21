package typings.gapiClientGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchReadGroupSetsRequest extends js.Object {
  /**
    * Restricts this query to read group sets within the given datasets. At least
    * one ID must be provided.
    */
  var datasetIds: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Only return read group sets for which a substring of the name matches this
    * string.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The maximum number of results to return in a single page. If unspecified,
    * defaults to 256. The maximum value is 1024.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  /**
    * The continuation token, which is used to page through large result sets.
    * To get the next page of results, set this parameter to the value of
    * `nextPageToken` from the previous response.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}

object SearchReadGroupSetsRequest {
  @scala.inline
  def apply(
    datasetIds: js.Array[String] = null,
    name: String = null,
    pageSize: Int | Double = null,
    pageToken: String = null
  ): SearchReadGroupSetsRequest = {
    val __obj = js.Dynamic.literal()
    if (datasetIds != null) __obj.updateDynamic("datasetIds")(datasetIds.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchReadGroupSetsRequest]
  }
}

