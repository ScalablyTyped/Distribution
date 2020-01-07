package typings.googleapis.buildSrcApisCloudbillingV1Mod.cloudbilling_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for `ListSkus`.
  */
@js.native
trait Schema$ListSkusResponse extends js.Object {
  /**
    * A token to retrieve the next page of results. To retrieve the next page,
    * call `ListSkus` again with the `page_token` field set to this value. This
    * field is empty if there are no more results to retrieve.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The list of public SKUs of the given service.
    */
  var skus: js.UndefOr[js.Array[Schema$Sku]] = js.native
}

object Schema$ListSkusResponse {
  @scala.inline
  def apply(nextPageToken: String = null, skus: js.Array[Schema$Sku] = null): Schema$ListSkusResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (skus != null) __obj.updateDynamic("skus")(skus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListSkusResponse]
  }
}

