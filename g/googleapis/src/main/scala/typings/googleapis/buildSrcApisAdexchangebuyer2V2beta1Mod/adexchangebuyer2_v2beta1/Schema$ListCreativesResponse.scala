package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response for listing creatives.
  */
@js.native
trait Schema$ListCreativesResponse extends js.Object {
  /**
    * The list of creatives.
    */
  var creatives: js.UndefOr[js.Array[Schema$Creative]] = js.native
  /**
    * A token to retrieve the next page of results. Pass this value in the
    * ListCreativesRequest.page_token field in the subsequent call to
    * `ListCreatives` method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListCreativesResponse {
  @scala.inline
  def apply(creatives: js.Array[Schema$Creative] = null, nextPageToken: String = null): Schema$ListCreativesResponse = {
    val __obj = js.Dynamic.literal()
    if (creatives != null) __obj.updateDynamic("creatives")(creatives.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListCreativesResponse]
  }
}

