package typings.gapiDotClientDotCloudbilling.gapi.client.cloudbilling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListSkusResponse extends js.Object {
  /**
    * A token to retrieve the next page of results. To retrieve the next page,
    * call `ListSkus` again with the `page_token` field set to this
    * value. This field is empty if there are no more results to retrieve.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** The list of public SKUs of the given service. */
  var skus: js.UndefOr[js.Array[Sku]] = js.undefined
}

object ListSkusResponse {
  @scala.inline
  def apply(nextPageToken: String = null, skus: js.Array[Sku] = null): ListSkusResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (skus != null) __obj.updateDynamic("skus")(skus)
    __obj.asInstanceOf[ListSkusResponse]
  }
}

