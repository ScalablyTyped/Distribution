package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response for listing creative and deal associations
  */
@js.native
trait Schema$ListDealAssociationsResponse extends js.Object {
  /**
    * The list of associations.
    */
  var associations: js.UndefOr[js.Array[Schema$CreativeDealAssociation]] = js.native
  /**
    * A token to retrieve the next page of results. Pass this value in the
    * ListDealAssociationsRequest.page_token field in the subsequent call to
    * &#39;ListDealAssociation&#39; method to retrieve the next page of
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListDealAssociationsResponse {
  @scala.inline
  def apply(associations: js.Array[Schema$CreativeDealAssociation] = null, nextPageToken: String = null): Schema$ListDealAssociationsResponse = {
    val __obj = js.Dynamic.literal()
    if (associations != null) __obj.updateDynamic("associations")(associations.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListDealAssociationsResponse]
  }
}

