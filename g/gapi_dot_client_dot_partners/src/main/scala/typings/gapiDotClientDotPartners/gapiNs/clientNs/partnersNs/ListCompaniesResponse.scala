package typings.gapiDotClientDotPartners.gapiNs.clientNs.partnersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListCompaniesResponse extends js.Object {
  /** The list of companies. */
  var companies: js.UndefOr[js.Array[Company]] = js.undefined
  /**
    * A token to retrieve next page of results.
    * Pass this value in the `ListCompaniesRequest.page_token` field in the
    * subsequent call to
    * ListCompanies to retrieve the
    * next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** Current response metadata. */
  var responseMetadata: js.UndefOr[ResponseMetadata] = js.undefined
}

object ListCompaniesResponse {
  @scala.inline
  def apply(
    companies: js.Array[Company] = null,
    nextPageToken: String = null,
    responseMetadata: ResponseMetadata = null
  ): ListCompaniesResponse = {
    val __obj = js.Dynamic.literal()
    if (companies != null) __obj.updateDynamic("companies")(companies)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (responseMetadata != null) __obj.updateDynamic("responseMetadata")(responseMetadata)
    __obj.asInstanceOf[ListCompaniesResponse]
  }
}

