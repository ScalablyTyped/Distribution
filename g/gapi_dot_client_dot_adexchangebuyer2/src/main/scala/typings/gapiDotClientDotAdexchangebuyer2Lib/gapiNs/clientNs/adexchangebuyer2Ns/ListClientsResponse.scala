package typings
package gapiDotClientDotAdexchangebuyer2Lib.gapiNs.clientNs.adexchangebuyer2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ListClientsResponse extends js.Object {
  /** The returned list of clients. */
  var clients: js.UndefOr[js.Array[Client]] = js.undefined
  /**
               * A token to retrieve the next page of results.
               * Pass this value in the
               * ListClientsRequest.pageToken
               * field in the subsequent call to the
               * accounts.clients.list method
               * to retrieve the next page of results.
               */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

