package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AccountsListResponse extends js.Object {
  /** Account collection. */
  var accounts: js.UndefOr[js.Array[Account]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#accountsListResponse". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

