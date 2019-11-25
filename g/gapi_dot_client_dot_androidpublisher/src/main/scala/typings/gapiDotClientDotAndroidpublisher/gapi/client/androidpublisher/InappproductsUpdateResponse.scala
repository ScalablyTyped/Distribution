package typings.gapiDotClientDotAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InappproductsUpdateResponse extends js.Object {
  var inappproduct: js.UndefOr[InAppProduct] = js.undefined
}

object InappproductsUpdateResponse {
  @scala.inline
  def apply(inappproduct: InAppProduct = null): InappproductsUpdateResponse = {
    val __obj = js.Dynamic.literal()
    if (inappproduct != null) __obj.updateDynamic("inappproduct")(inappproduct.asInstanceOf[js.Any])
    __obj.asInstanceOf[InappproductsUpdateResponse]
  }
}

