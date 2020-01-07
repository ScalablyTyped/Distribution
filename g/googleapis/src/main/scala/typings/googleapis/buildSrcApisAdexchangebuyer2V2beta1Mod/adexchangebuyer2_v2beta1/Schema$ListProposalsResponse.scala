package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for listing proposals.
  */
@js.native
trait Schema$ListProposalsResponse extends js.Object {
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The list of proposals.
    */
  var proposals: js.UndefOr[js.Array[Schema$Proposal]] = js.native
}

object Schema$ListProposalsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, proposals: js.Array[Schema$Proposal] = null): Schema$ListProposalsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (proposals != null) __obj.updateDynamic("proposals")(proposals.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListProposalsResponse]
  }
}

