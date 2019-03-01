package typings
package gapiDotClientDotAndroidpublisherLib.gapiNs.clientNs.androidpublisherNs

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
    if (inappproduct != null) __obj.updateDynamic("inappproduct")(inappproduct)
    __obj.asInstanceOf[InappproductsUpdateResponse]
  }
}

