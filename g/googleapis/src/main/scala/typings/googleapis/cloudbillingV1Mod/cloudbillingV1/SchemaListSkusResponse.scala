package typings.googleapis.cloudbillingV1Mod.cloudbillingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for `ListSkus`.
  */
@js.native
trait SchemaListSkusResponse extends js.Object {
  /**
    * A token to retrieve the next page of results. To retrieve the next page,
    * call `ListSkus` again with the `page_token` field set to this value. This
    * field is empty if there are no more results to retrieve.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The list of public SKUs of the given service.
    */
  var skus: js.UndefOr[js.Array[SchemaSku]] = js.native
}

object SchemaListSkusResponse {
  @scala.inline
  def apply(nextPageToken: String = null, skus: js.Array[SchemaSku] = null): SchemaListSkusResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (skus != null) __obj.updateDynamic("skus")(skus.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListSkusResponse]
  }
}

