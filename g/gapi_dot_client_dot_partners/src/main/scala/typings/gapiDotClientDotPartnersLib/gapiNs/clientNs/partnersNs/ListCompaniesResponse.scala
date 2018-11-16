package typings
package gapiDotClientDotPartnersLib.gapiNs.clientNs.partnersNs

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
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Current response metadata. */
  var responseMetadata: js.UndefOr[ResponseMetadata] = js.undefined
}

