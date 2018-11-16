package typings
package gapiDotClientDotIdentitytoolkitLib.gapiNs.clientNs.identitytoolkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DownloadAccountResponse extends js.Object {
  /** The fixed string "identitytoolkit#DownloadAccountResponse". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The next page token. To be used in a subsequent request to return the next page of results. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** The user accounts data. */
  var users: js.UndefOr[js.Array[UserInfo]] = js.undefined
}

