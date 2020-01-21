package typings.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListLeadsResponse extends js.Object {
  /** The list of leads. */
  var leads: js.UndefOr[js.Array[Lead]] = js.undefined
  /**
    * A token to retrieve next page of results.
    * Pass this value in the `ListLeadsRequest.page_token` field in the
    * subsequent call to
    * ListLeads to retrieve the
    * next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** Current response metadata. */
  var responseMetadata: js.UndefOr[ResponseMetadata] = js.undefined
  /** The total count of leads for the given company. */
  var totalSize: js.UndefOr[Double] = js.undefined
}

object ListLeadsResponse {
  @scala.inline
  def apply(
    leads: js.Array[Lead] = null,
    nextPageToken: String = null,
    responseMetadata: ResponseMetadata = null,
    totalSize: Int | Double = null
  ): ListLeadsResponse = {
    val __obj = js.Dynamic.literal()
    if (leads != null) __obj.updateDynamic("leads")(leads.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (responseMetadata != null) __obj.updateDynamic("responseMetadata")(responseMetadata.asInstanceOf[js.Any])
    if (totalSize != null) __obj.updateDynamic("totalSize")(totalSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLeadsResponse]
  }
}

