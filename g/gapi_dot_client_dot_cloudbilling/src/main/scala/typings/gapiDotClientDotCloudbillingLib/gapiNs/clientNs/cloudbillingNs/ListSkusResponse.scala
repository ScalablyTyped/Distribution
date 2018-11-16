package typings
package gapiDotClientDotCloudbillingLib.gapiNs.clientNs.cloudbillingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ListSkusResponse extends js.Object {
  /**
               * A token to retrieve the next page of results. To retrieve the next page,
               * call `ListSkus` again with the `page_token` field set to this
               * value. This field is empty if there are no more results to retrieve.
               */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** The list of public SKUs of the given service. */
  var skus: js.UndefOr[js.Array[Sku]] = js.undefined
}

