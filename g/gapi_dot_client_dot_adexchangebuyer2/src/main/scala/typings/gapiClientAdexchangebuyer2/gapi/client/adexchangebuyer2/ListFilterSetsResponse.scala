package typings.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListFilterSetsResponse extends js.Object {
  /** The filter sets belonging to the buyer. */
  var filterSets: js.UndefOr[js.Array[FilterSet]] = js.undefined
  /**
    * A token to retrieve the next page of results.
    * Pass this value in the
    * ListFilterSetsRequest.pageToken
    * field in the subsequent call to the
    * accounts.filterSets.list
    * method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object ListFilterSetsResponse {
  @scala.inline
  def apply(filterSets: js.Array[FilterSet] = null, nextPageToken: String = null): ListFilterSetsResponse = {
    val __obj = js.Dynamic.literal()
    if (filterSets != null) __obj.updateDynamic("filterSets")(filterSets.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFilterSetsResponse]
  }
}

