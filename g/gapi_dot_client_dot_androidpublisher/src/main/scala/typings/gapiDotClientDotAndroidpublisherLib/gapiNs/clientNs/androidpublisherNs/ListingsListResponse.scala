package typings
package gapiDotClientDotAndroidpublisherLib.gapiNs.clientNs.androidpublisherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListingsListResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "androidpublisher#listingsListResponse". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var listings: js.UndefOr[js.Array[Listing]] = js.undefined
}

object ListingsListResponse {
  @scala.inline
  def apply(kind: java.lang.String = null, listings: js.Array[Listing] = null): ListingsListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (listings != null) __obj.updateDynamic("listings")(listings)
    __obj.asInstanceOf[ListingsListResponse]
  }
}

