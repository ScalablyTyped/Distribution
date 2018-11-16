package typings
package gapiDotClientDotAdexchangebuyer2Lib.gapiNs.clientNs.adexchangebuyer2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ListClientUsersResponse extends js.Object {
  /**
               * A token to retrieve the next page of results.
               * Pass this value in the
               * ListClientUsersRequest.pageToken
               * field in the subsequent call to the
               * clients.invitations.list
               * method to retrieve the next
               * page of results.
               */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** The returned list of client users. */
  var users: js.UndefOr[js.Array[ClientUser]] = js.undefined
}

