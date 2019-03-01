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

object ListKeyRingsResponse {
  @scala.inline
  def apply(
    keyRings: js.Array[KeyRing] = null,
    nextPageToken: java.lang.String = null,
    totalSize: scala.Int | scala.Double = null
  ): ListKeyRingsResponse = {
    val __obj = js.Dynamic.literal()
    if (keyRings != null) __obj.updateDynamic("keyRings")(keyRings)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (totalSize != null) __obj.updateDynamic("totalSize")(totalSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListKeyRingsResponse]
  }
}

