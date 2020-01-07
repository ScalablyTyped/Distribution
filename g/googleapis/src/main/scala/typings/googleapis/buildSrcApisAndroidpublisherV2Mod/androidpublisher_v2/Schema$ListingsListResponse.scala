package typings.googleapis.buildSrcApisAndroidpublisherV2Mod.androidpublisher_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ListingsListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidpublisher#listingsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  var listings: js.UndefOr[js.Array[Schema$Listing]] = js.native
}

object Schema$ListingsListResponse {
  @scala.inline
  def apply(kind: String = null, listings: js.Array[Schema$Listing] = null): Schema$ListingsListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (listings != null) __obj.updateDynamic("listings")(listings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListingsListResponse]
  }
}

