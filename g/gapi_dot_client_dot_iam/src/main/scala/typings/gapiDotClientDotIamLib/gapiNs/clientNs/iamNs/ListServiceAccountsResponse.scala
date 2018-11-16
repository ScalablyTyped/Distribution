package typings
package gapiDotClientDotIamLib.gapiNs.clientNs.iamNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ListServiceAccountsResponse extends js.Object {
  /** The list of matching service accounts. */
  var accounts: js.UndefOr[js.Array[ServiceAccount]] = js.undefined
  /**
               * To retrieve the next page of results, set
               * ListServiceAccountsRequest.page_token
               * to this value.
               */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

