package typings
package gapiDotClientDotCloudkmsLib.gapiNs.clientNs.cloudkmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListKeyRingsResponse extends js.Object {
  /** The list of KeyRings. */
  var keyRings: js.UndefOr[js.Array[KeyRing]] = js.undefined
  /**
    * A token to retrieve next page of results. Pass this value in
    * ListKeyRingsRequest.page_token to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** The total number of KeyRings that matched the query. */
  var totalSize: js.UndefOr[scala.Double] = js.undefined
}

