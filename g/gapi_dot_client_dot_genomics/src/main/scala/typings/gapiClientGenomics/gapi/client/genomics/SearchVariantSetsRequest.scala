package typings.gapiClientGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchVariantSetsRequest extends js.Object {
  /**
    * Exactly one dataset ID must be provided here. Only variant sets which
    * belong to this dataset will be returned.
    */
  var datasetIds: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The maximum number of results to return in a single page. If unspecified,
    * defaults to 1024.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  /**
    * The continuation token, which is used to page through large result sets.
    * To get the next page of results, set this parameter to the value of
    * `nextPageToken` from the previous response.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}

object SearchVariantSetsRequest {
  @scala.inline
  def apply(
    datasetIds: js.Array[String] = null,
    pageSize: js.UndefOr[Double] = js.undefined,
    pageToken: String = null
  ): SearchVariantSetsRequest = {
    val __obj = js.Dynamic.literal()
    if (datasetIds != null) __obj.updateDynamic("datasetIds")(datasetIds.asInstanceOf[js.Any])
    if (!js.isUndefined(pageSize)) __obj.updateDynamic("pageSize")(pageSize.get.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchVariantSetsRequest]
  }
}

