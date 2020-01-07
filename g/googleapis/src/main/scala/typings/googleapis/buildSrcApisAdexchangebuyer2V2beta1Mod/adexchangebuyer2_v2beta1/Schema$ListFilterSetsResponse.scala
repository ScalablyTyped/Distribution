package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for listing filter sets.
  */
@js.native
trait Schema$ListFilterSetsResponse extends js.Object {
  /**
    * The filter sets belonging to the buyer.
    */
  var filterSets: js.UndefOr[js.Array[Schema$FilterSet]] = js.native
  /**
    * A token to retrieve the next page of results. Pass this value in the
    * ListFilterSetsRequest.pageToken field in the subsequent call to the
    * accounts.filterSets.list method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListFilterSetsResponse {
  @scala.inline
  def apply(filterSets: js.Array[Schema$FilterSet] = null, nextPageToken: String = null): Schema$ListFilterSetsResponse = {
    val __obj = js.Dynamic.literal()
    if (filterSets != null) __obj.updateDynamic("filterSets")(filterSets.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListFilterSetsResponse]
  }
}

